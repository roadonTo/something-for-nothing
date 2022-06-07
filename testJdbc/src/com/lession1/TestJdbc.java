package com.lession1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestJdbc {

    public static void main(String[] args) {
        try{
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接
            String url="jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=UTF8";
            String username="root";
            String password="root";
            Connection conn=DriverManager.getConnection(url,username,password);
            //3.创建statement对象
            String sql="select * from user";
            PreparedStatement stmt=conn.prepareStatement(sql);
            //4.执行sql语句
            ResultSet rs=stmt.executeQuery();
            //5.处理结果集
            while (rs.next()){
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
            }
            //6.关闭资源
            if (rs!=null){
                rs.close();
            }
            if (stmt!=null){
                stmt.close();
            }
            if (conn!=null){
                conn.close();
            }

        }catch (Exception e){
            e.printStackTrace();
        }


    }


}
