package com.postgresql_DatabaseService.DatabaseConnectors;

import org.springframework.stereotype.Service;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.annotation.PostConstruct;
import java.io.IOException;

@Service
public class PostgresConnector {
    @PostConstruct
    public void init() throws IOException {
        String url = "jdbc:postgresql://localhost/hotelManagement";
        String user = "subramanya";
        String password = "root";

        /**
         * Connect to the PostgreSQL database
         *
         * @return a Connection object
         */
            Connection conn = null;
            try {
                conn = DriverManager.getConnection(url, user, password);
                System.out.println("Connected to the PostgreSQL server successfully.");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
    }
}
