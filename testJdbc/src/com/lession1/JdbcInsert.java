package com.lession1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcInsert {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try{

            conn= JdbcUtils.getConnection();  //连接数据库
            String sql = "insert into user values (?,?,?)";  //写sql语句
            stmt = conn.prepareStatement(sql);  //预加载
            stmt.setInt(1,120);
            stmt.setString(2,"天净沙");
            stmt.setInt(3,54);
            int i = stmt.executeUpdate();


            if (i>0){
                System.out.println("新增成功");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JdbcUtils.release(conn,stmt,rs);
        }




    }
}
