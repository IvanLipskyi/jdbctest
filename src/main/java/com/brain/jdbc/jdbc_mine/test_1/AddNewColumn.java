package com.brain.jdbc.jdbc_mine.test_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddNewColumn {

    private static final String SQL_ADD_COLUMN_QUERY =
            "ALTER TABLE customer " +
            "ADD COLUMN dateTime timestamp with time zone NOT NULL DEFAULT CURRENT_TIMESTAMP; ";

    public static void main(String[] args) {
        String dbHost = "jdbc:postgresql://localhost:5432/jdbc2";
        String dbUser = "postgres";
        String dbPass = "shadow";

        try(Connection conn = DriverManager.getConnection(dbHost, dbUser, dbPass);
            PreparedStatement ps = conn.prepareStatement(SQL_ADD_COLUMN_QUERY)){
            ps.execute();
            System.out.print("");

        } catch (SQLException e) {
            System.err.format("SQL error: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
