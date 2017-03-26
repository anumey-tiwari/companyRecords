/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.dao;

import com.company.dto.Members;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Anumey
 */
public class MembersDao {

    public ArrayList<Members> getMembers() {
        ArrayList<Members> memberList = new ArrayList<>();
        Members members = null;
        Connection con = null;
        Statement stmt = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "vostro3550");
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from members");
            while (rs.next()) {
                members = new Members();
                members.setId(rs.getInt("id"));
                members.setCity(rs.getString("city"));
                members.setCountry(rs.getString("country"));
                members.setMemberId(rs.getInt("memberID"));
                members.setName(rs.getString("name"));
                memberList.add(members);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }

        return memberList;
    }
}
