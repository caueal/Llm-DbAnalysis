package org.fatecsjc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FilmeDB {
    private static final String url = "jdbc:sqlite:filmes.db";

    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                System.out.println("Connected to database");
            }
        }
        catch(SQLException e){
            System.out.println("Error connceting to database");
            e.printStackTrace();
        }
    }

    public static void createTable(Connection conn) throws SQLException{
        String sqlCreateTable = "CREATE TABLE IF NOT EXISTS filmes("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "name VARCHAR(150) NOT NULL, "
                + "ano VARCHAR(150) NOT NULL, "
                + "diretor VARCHAR(150) NOT NULL, "
                + "genero VARCHAR(150) NOT NULL, "
                + "avalicao VARCHAR(150) NOT NULL"
                +  ");";
    }
}