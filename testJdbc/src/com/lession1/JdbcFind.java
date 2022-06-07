package com.lession1;

import java.sql.*;

public class JdbcFind {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try{

            conn= JdbcUtils.getConnection();  //连接数据库
            String sql = "select * from user ";  //写sql语句
            stmt = conn.prepareStatement(sql);  //预加载
           // stmt=conn.createStatement();
            //rs=stmt.executeQuery("select * from user ");
            rs=stmt.executeQuery();


            while (rs.next()){
                System.out.print(rs.getInt("id")+"   ");
                System.out.print(rs.getString("username")+"   ");
                System.out.println((rs.getString("password")));
                System.out.println("--------------");
            }


        /*   输出结果为下
            1   admin   admin
            --------------
            2   猿来入此   123456
            --------------
            8   猿来入此站长   110
            --------------
        */



        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtils.release(conn,stmt,rs);
        }




    }
}
