package com.brain.jdbc.jdbc_mine.test_1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NewTable {
    private static final String SQL_CREATE_QUERY =
            "CREATE TABLE customer"
            + "("
            + "id serial,"
            + "surname varchar (20) NOT NULL,"
            + "firstName varchar (20) NOT NULL,"
            + "phone numeric NOT NULL,"
            + "email text,"
            + "city varchar (30) NOT NULL,"
            + "discount numeric NOT NULL,"
            + "PRIMARY KEY (id)"
            + ")";

public static void main(String[] args) {
    String dbHost = "jdbc:postgresql://localhost:5432/jdbc2";
    String dbUser = "postgres";
    String dbPass = "shadow";
    try(Connection conn = DriverManager.getConnection(dbHost, dbUser, dbPass);
        PreparedStatement ps = conn.prepareStatement(SQL_CREATE_QUERY)){
        ps.execute();
        System.out.println();

    } catch (SQLException e) {
        System.err.format("SQL error: %s\n%s", e.getSQLState(), e.getMessage());
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}
