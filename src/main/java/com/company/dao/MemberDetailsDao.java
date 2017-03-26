/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.dao;

import com.company.dto.MemberDetails;
import java.sql.*;

/**
 *
 * @author Anumey
 */
public class MemberDetailsDao {

    public MemberDetails getMemberDetais(int memberId) {
        MemberDetails memberDetails = null;
        Connection con = null;
        Statement stmt = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "vostro3550");
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from memberdetails where memberID=" + memberId);
            if (rs.next()) {
                memberDetails = new MemberDetails();
                memberDetails.setMemberId(rs.getInt("memberId"));
                memberDetails.setPassword(rs.getString("password"));
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

        return memberDetails;
    }
}
