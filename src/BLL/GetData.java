package BLL;

import DAL.DataAccess;
import java.util.ArrayList;

public class GetData {
    
    
    //<editor-fold defaultstate="collapsed" desc=" Method Show System Oracle ">
    // hiển thị SGA trong oracle
    public ArrayList showSGA()
    {
        DataAccess da = new DataAccess("select * from v$sga");
        return da.QueryTable ();
    }
    
    // hiển thị PGA trong oracle
    public ArrayList showPGA()
    {
        DataAccess da = new DataAccess("select * from dba_hist_pgastat");
        return da.QueryTable ();
    }
    
    // hiển thị process trong oracle
    public ArrayList showProcess()
    {
        DataAccess da = new DataAccess("select * from v$process");
        return da.QueryTable ();
    }
    
    // hiển thị thông tin Instance trong oracle
    public ArrayList showInfoInstance()
    {
        DataAccess da = new DataAccess("select * from v$instance");
        return da.QueryTable ();
    }
    
    // hiển thị thông tin Database trong oracle
    public ArrayList showInfoDatabase()
    {
        DataAccess da = new DataAccess("select * from v$database");
        return da.QueryTable ();
    }
    
    // hiển thị thông tin Datafile trong oracle
    public ArrayList showDataFile()
    {
        DataAccess da = new DataAccess("select * from v$datafile");
        return da.QueryTable ();
    }
    
    // hiển thị thông tin SPFile trong oracle
    public ArrayList showSPFile()
    {
        DataAccess da = new DataAccess("select * from sys.v_$parameter where name = 'spfile'");
        return da.QueryTable ();
    }
    
    // hiển thị thông tin ControlFile trong oracle
    public ArrayList showControlFile()
    {
        DataAccess da = new DataAccess("select * from v$controlfile");
        return da.QueryTable ();
    }
     // hiển thị thông tin tablespaces
    public ArrayList showTablespaces()
    {
        DataAccess da = new DataAccess("select tablespace_name FROM dba_tablespaces");
        return da.QueryTable ();
    }
     // hiển thị thông tin dung lượng trống của table space
    public ArrayList showFreeSpace()
    {
        DataAccess da = new DataAccess("SELECT tablespace_name, SUM(bytes)/1024/1024 \"Free Size (MB)\" FROM dba_free_space GROUP BY tablespace_name");
        return da.QueryTable ();
    }
    // hiển thị thông tin tên và dung lượng
    public ArrayList showNameAndContent()
    {
        DataAccess da = new DataAccess("SELECT tablespace_name, sum(bytes)/1024/1024 AS \"Size (MB)\" FROM dba_data_files GROUP BY tablespace_name");
        return da.QueryTable ();
    }
    public ArrayList showDataFileAndTablespace()
    {
        DataAccess da = new DataAccess("SELECT tablespace_name, file_name, online_status, (bytes)\1024\1024 from dba_data_files");
        return da.QueryTable ();
    }
    
    //<editor-fold defaultstate="collapsed" desc=" Session ">
    //hiển thị thông tin các Session hiện hành
    public ArrayList showSessionCurrent()
    {
        DataAccess da = new DataAccess("Select SID, SERIAL#, USERNAME, STATUS, OSUSER, MACHINE, PORT, PROGRAM, PREV_EXEC_START  from v$session where USERNAME is not NULL");
        return da.QueryTable();
    } 
    
    public ArrayList showSessionCurrentBlocking()
    {
        DataAccess da = new DataAccess("Select SID, SERIAL#, USERNAME, STATUS, OSUSER, MACHINE, PORT, PROGRAM, PREV_EXEC_START  from v$session WHERE sid IN (SELECT blocking_session FROM v$session)");
        return da.QueryTable();
    } 
    
    //hiển thị thông tin các Session hiện hành
    public ArrayList showProcessOfSession()
    {
        DataAccess da = new DataAccess("select p.pname, s.username, p.username, s.serial#, s.machine, s.program from v$process p, v$session s where s.creator_addr = p.addr");
        return da.QueryTable();
    } 
    //</editor-fold>
    
    //</editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Lấy thông tin nhân viên"> 
    public ArrayList getDataNhanVien() {
        DataAccess da = new DataAccess("SELECT MANV, TENNV, SDT,GIOITINH, TAIKHOAN FROM datacaphe.NHANVIEN");
        return da.QueryTable();
    }
    
    public ArrayList getDataKH(){
        DataAccess da = new DataAccess( "SELECT * FROM DATACAPHE.KHACHHANG");
        return da.QueryTable();
    }
    // </editor-fold>
    
    //get User
    public ArrayList getAllUserAndProfile(){
        DataAccess da = new DataAccess("SELECT USER_ID, USERNAME, ACCOUNT_STATUS, LOCK_DATE, EXPIRY_DATE, CREATED, PROFILE FROM dba_users");
        return da.QueryTable();
    }
    
    public ArrayList getAllAccount()
    {
        DataAccess da = new DataAccess("SELECT USER_ID, username, CREATED, EXPIRY_DATE, ACCOUNT_STATUS, cast(LAST_LOGIN as date), PROFILE, TEMPORARY_TABLESPACE, EXTERNAL_NAME FROM DBA_USERS where account_status = 'OPEN'");
        return da.QueryTable ();
    }
    
    public String getCurrentUser()
    {
        DataAccess da = new DataAccess("SELECT sys_context('USERENV', 'CURRENT_SCHEMA') FROM dual");
        return da.QueryContentTable()[0][0].toString();
    }
    
    public String getLastLogin()
    {
        String user = getCurrentUser();
        String sid = new DataAccess("SELECT sys_context('USERENV', 'SID') SID FROM DUAL").QueryContentTable()[0][0].toString();
        String query = String.format("select distinct * from sec.log_on where sid = %s and name = '%s' order by LOGON_TIME desc",sid, user);
        DataAccess da = new DataAccess(query);
        String kq = "null";
        try{
            kq = da.QueryContentTable()[1][2].toString();
        }
        catch(Exception err)
        {
            kq = "First Login";
        }
        return kq;
    }
    
    public ArrayList getAllPoliciesInDB(){
        DataAccess da = new DataAccess("select * from dba_policies");
        return da.QueryTable();
    }
    
    public ArrayList getDataTableByName(String nameTable){
        DataAccess da = new DataAccess(String.format("select * from datacaphe.%s", nameTable));
        return da.QueryTable();
    }
    
    public ArrayList getAllRecordAutdit(){
        DataAccess da = new DataAccess("select * from dba_fga_audit_trail");
        return da.QueryTable();
    }
    
     public ArrayList getTableName()
    {
        try{
            //DataAccess da = new DataAccess("select distinct table_name from dba_tables where table_name='KHACHHANG' or table_name='HOADON' or table_name='CHITIETHOADON' or table_name='KHUYENMAI' or table_name='THUCDON' or table_name='PHANLOAI'");
 
            DataAccess da = new DataAccess("select table_name from DBA_TABLES where owner = 'DATACAPHE'");

            Object[][] t = da.QueryContentTable();
            ArrayList<String> arr=new ArrayList<String>();
            for(int i =0;i<t.length; i++)
            {
                arr.add(t[i][0].toString());
            }
            return arr;
        }
        catch(Exception err)
        {}
        return null;
    }
    
    public ArrayList getObjectSchema()
    {
        DataAccess da = new DataAccess("select username from dba_users where account_status = 'OPEN' and last_login not like 'null'");
        Object[][] t = da.QueryContentTable();
        ArrayList<String> arr=new ArrayList<String>();
        for(int i =0;i<t.length; i++)
        {
            arr.add(t[i][0].toString());
        }
        return arr;
    }
    public ArrayList getDataAudit()
    {
        DataAccess da = new DataAccess("select Object_schema, object_name, policy_owner , policy_name, ins, upd, del from dba_audit_policies");
        return da.QueryTable ();
    }
    public ArrayList getDataAuditPolicy()
    {
        DataAccess da = new DataAccess("select session_id, DB_user, object_name, object_schema, policy_name, timestamp,sql_text  from dba_fga_audit_trail");
        return da.QueryTable ();
    }
    
    public ArrayList getUsername()
    {
        DataAccess da = new DataAccess("select tablename from dba_users where account_status = 'OPEN' and last_login  not like 'null'");
        Object[][] t = da.QueryContentTable();
        ArrayList<String> arr=new ArrayList<String>();
        for(int i =0;i<t.length; i++)
        {
            arr.add(t[i][0].toString());
        }
        return arr;
    }
    
    public ArrayList getPrivRole(String name_role, String table_name)
    {
        DataAccess da = new DataAccess( String.format ("select privilege from role_tab_privs where role='%s'  and table_name = '%s'",name_role, table_name));
        Object[][] t = da.QueryContentTable();
        ArrayList<String> arr=new ArrayList<String>();
        for(int i =0;i<t.length; i++)
        {
            arr.add(t[i][0].toString());
        }
        return arr;
    }
     public ArrayList getDataRole()
    {
        DataAccess da = new DataAccess("SELECT ROLE, PASSWORD_REQUIRED,AUTHENTICATION_TYPE, ORACLE_MAINTAINED FROM  DBA_ROLES");
        return da.QueryTable ();
    }
     
    public Object[][] getInfoAccount(){
        DataAccess da = new DataAccess(String.format("select * from scott.nhanvien where TAIKHOAN = '%s'",getCurrentUser().toLowerCase()));
        return da.QueryContentTable();
    }
    
    //<editor-fold defaultstate="collapsed" desc=" Profile Config ">
    public Object[][] getAllProfileName(){
        DataAccess da = new DataAccess("SELECT distinct PROFILE from dba_profiles");
        return da.QueryContentTable();
    }
    
    public ArrayList getDetailsProfile(String nameProfile){
        DataAccess da = new DataAccess(String.format("select * from dba_profiles where PROFILE = '%s'", nameProfile));
        return da.QueryTable();
    }
    
    public Object[][] getAllResourceOfProfile(){
        DataAccess da = new DataAccess("select RESOURCE_NAME from dba_profiles where PROFILE = 'DEFAULT'");
        return da.QueryContentTable();
    }
    //</editor-fold>    
    
    public Object[][] getAllDirectory(){
        DataAccess da = new DataAccess("select * from DBA_DIRECTORIES");
        return da.QueryContentTable();
    }
    
    
    //<editor-fold defaultstate="collapsed" desc="Backup and restore">
    public ArrayList getAllDatafileForBackupInfo(){
        DataAccess da = new DataAccess("SELECT file#, name FROM v$datafile");
        return da.QueryTable ();
    }
    //</editor-fold>
    
    
    //get data ThucDon
    public ArrayList getDataThucDon() {
        DataAccess da = new DataAccess(String.format("SELECT MAMON,TENMON,KICHCO, GIA,TRANGTHAI, HINHANH FROM datacaphe.THUCDON"));
        return da.QueryTable();
    }
    
    //get data khachhang
    public ArrayList getDataKhachHang() {
        DataAccess da = new DataAccess(String.format("SELECT * from datacaphe.KHACHHANG"));
        return da.QueryTable();
    }
     public Object[][] getNameRole(){
        DataAccess da = new DataAccess("SELECT ROLE FROM DBA_ROLES");
        return da.QueryContentTable();
    }
    public ArrayList getRoleUser(String user){
       DataAccess da = new DataAccess(String.format("SELECT * FROM DBA_ROLE_PRIVS WHERE UPPER(GRANTEE) LIKE '%s'", user));
        return da.QueryTable();
    }
    public ArrayList getData(String table){
       DataAccess da = new DataAccess(String.format("SELECT * FROM DATACAPHE.%s", table));
       return da.QueryTable();
    }
}
