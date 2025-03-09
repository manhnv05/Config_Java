package com.example.thiThat.util;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;

public class DBConnect {
    private static Connection conn;

    public static Connection getConnection() {
        try {
            if (conn == null || conn.isClosed()) {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String dbUser = "sa", dbPass = "123",
                        dbUrl = "jdbc:sqlserver://localhost:1433;" +
                                "databaseName=PTPM_FINALLY_SOF203;" +
                                "encrypt=true;trustServerCertificate=true;";
                conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
                System.out.println("Kết nối thành công");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void main(String[] args) {
        getConnection();
    }
}






//<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>









//<form action="/SP_addData" method="post">
//<label>Quản Lý Sản Phẩm</label>
//<br>
//
//<label>Mã Sản Phẩm</label>
//<input type="text" name="ma" required>
//<br>
//<label>Tên Sản Phẩm</label>
//<input type="text" name="ten" REQUIRED>
//<br>
//<label>Giá</label>
//<input type="number" min="0" name="gia" required>
//<br>
//<label>Trạng Thái</label>
//<input type="radio" name="trangThai" value="true">Còn
//<input type="radio" name="trangThai" value="false"> Hết
//<br>



//<form action="/SP_update" method="post">
//<label>Mã Sản Phẩm</label>
//<input type="text" name="ma" readonly value="${sp_sua.ma}">
//<br>
//<label>Tên Sản Phẩm</label>
//<input type="text" name="ten" REQUIRED value="${sp_sua.ten}">
//<br>
//<label>Giá</label>
//<input type="number" min="0" name="gia" required value="${sp_sua.gia}">
//<br>
//<label>Trạng Thái</label>
//<input type="radio" name="trangThai" value="true" ${sp_sua.trangThai=="true"?"checked":""}>Còn
//<input type="radio" name="trangThai" value="false" ${sp_sua.trangThai=="false"?"checked":""}> Hết
//<br>
//<button type="submit">Submit</button>
//<button type="reset">Resest</button>
//</form>


//    private Connection con = null;
//    private PreparedStatement ps = null;
//    private ResultSet rs = null;
//    private String sql = null;
//
//    public repo_sanpham() {
//        con = DBConnect.getConnection();
//    }
//    public ArrayList<SanPham> getAll(){
//        ArrayList<SanPham> list = new ArrayList<>();
//        sql = "Select ma,ten,gia_ban,trang_thai from san_pham";
//        try {
//            ps = con.prepareStatement(sql);
//            rs = ps.executeQuery();
//            while (rs.next()){
//                String m = rs.getString(1);
//                String t = rs.getString(2);
//                BigDecimal gia = rs.getBigDecimal(3);
//                boolean tt = rs.getBoolean(4);
//                list.add(new SanPham(m,t,gia,tt));
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return list;
//    }
//
//
//    public int deleteSP(String ma){
//        sql="delete from san_pham where ma = ?";
//        try {
//            ps=con.prepareStatement(sql);
//            ps.setString(1,ma);
//            return ps.executeUpdate();
//        } catch (Exception e){
//            e.printStackTrace();
//            return 0;
//        }
//    }
//
//    public int addSP(String ma,String ten, BigDecimal gia, boolean trangThai){
//        sql = "insert into san_pham(ma,ten,gia_ban,trang_thai) values(?,?,?,?)";
//        try{
//            ps = con.prepareStatement(sql);
////            ps.setInt(1,m);
//            ps.setString(1,ma);
//            ps.setString(2,ten);
//            ps.setBigDecimal(3,gia);
//            ps.setBoolean(4, trangThai);
//            return ps.executeUpdate();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return  0;
//        }
//    }
//
//    public  int updateSp(String ma, String ten_new,BigDecimal gia_new, boolean trangThai_new){
//        sql="update san_pham set ten = ?, gia_ban=?, trang_thai=? where ma = ?";
//        try {
//            ps=con.prepareStatement(sql);
//            ps.setString(1,ten_new);
//            ps.setBigDecimal(2,gia_new);
//            ps.setBoolean(3,trangThai_new);
//            ps.setString(4,ma);
//            return  ps.executeUpdate();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//            return  0;
//        }
//    }
//    // lay ra 1 doi tuong theo acount
//    public  SanPham timSPByID(String id){
//        sql="select ma,ten,gia_ban,trang_thai from san_pham where ma=?";
//        SanPham sp = null;
//        try {
//            ps=con.prepareStatement(sql);
//            ps.setString(1,id);
//            rs=ps.executeQuery();
//            if (rs.next()){
//                String m = rs.getString(1);
//                String t = rs.getString(2);
//                BigDecimal gia = rs.getBigDecimal(3);
//                boolean tt = rs.getBoolean(4);
//                sp = new SanPham(m,t,gia,tt);
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return  sp;
//    }



