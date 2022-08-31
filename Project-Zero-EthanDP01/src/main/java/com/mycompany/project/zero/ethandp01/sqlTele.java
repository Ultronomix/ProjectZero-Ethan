package com.mycompany.project.zero.ethandp01;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class sqlTele {

    public static List<user> getAllUsers() {

        String sql = "SELECT id, user_name, pass_word, party_leader, party_second, party_third, party_fourth " +
                    "FROM user_party ";

        List<user> allUsers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getInstance().getConnection()) {

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                user user = new user();
                user.setId(rs.getString("id"));
                user.setUserName(rs.getString("user_name"));
                user.setPassWord(rs.getString("*****"));
                user.setPartyLead(rs.getString("party_leader"));
                user.setPartySecond(rs.getString("party_second"));
                user.setPartyThird(rs.getString("party_third"));
                user.setPartyFourth(rs.getString("party_fourth"));
                allUsers.add(user);

            }

        } catch (SQLException e) {
            System.err.println("Database communication error");
            e.printStackTrace();
        }

        return allUsers;
    }

    public static String save(user user) {

        String sql = "INSERT INTO user_party (user_name, pass_word, party_leader, party_second, party_third, party_fourth) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.getInstance().getConnection()) {

            PreparedStatement pstsmt = conn.prepareStatement(sql, new String[] {"id"});

            pstsmt.setString(1, user.getUserName());
            pstsmt.setString(2, user.getPassWord());
            pstsmt.setString(3, user.getPartyLead());
            pstsmt.setString(4, user.getPartySecond());
            pstsmt.setString(5, user.getPartyThird());
            pstsmt.setString(6, user.getPartyFourth());

            pstsmt.executeUpdate();

        }catch (SQLException e) {

            System.err.println("Communication Failure");
            e.printStackTrace();
        }

        return user.getUserName();
    }
}
