set SQLFORMAT csv;
set encoding UTF-8;
SPOOL 'D:\hehe.csv'
select * from CHITIETPHIEUNHAP;
SPOOL off
exit