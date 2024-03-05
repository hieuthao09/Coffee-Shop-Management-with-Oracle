/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;
import DAL.DataAccess;
/**
 *
 * @author phatl
 */
public class CallExecute {
    
    public static void callDeleteKH(String id){       
        DataAccess.CallSql(String.format("xoaKhachHang('%s')", id));
    }
    
    public static void callDeleteKH_PKH(String id){
        DataAccess.CallSql(String.format("KH_PKG.xoa('%s')", id));
    }
}
