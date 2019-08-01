package com.how2java.service;

import pojo.Hero;

import java.sql.*;

@Component("id")
public class InsertHero {
    public InsertHero() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8", "root",
                "admin");
    }


    public void add(Hero hero) {
        String sql = "insert into hero values(null,?,?,?)";
        try (Connection c = getConnection(); PreparedStatement ps = c.prepareStatement(sql);) {

            ps.setString(1, hero.name);
            ps.setInt(2, hero.hp);
            ps.setInt(3, hero.damage);

            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}