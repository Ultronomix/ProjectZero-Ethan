package com.mycompany.project.zero.ethandp01;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;


public class ConnectionFactory {
    private static ConnectionFactory connFactory;
    private Properties dbProps = new Properties();

    public ConnectionFactory(){
        try{
            Class.forName("org.postgresql.Driver");
            dbProps.load(new FileReader("src/main/resources/application.properties"));
        }catch(IOException e){
            System.err.println("Error, File read failure");
        }
        catch(ClassNotFoundException e){
            System.err.println("Error: PostgreSQL JDBC Driver failed to load");
        }
    }

    public static ConnectionFactory getInstance(){
        if(connFactory == null){
            connFactory = new ConnectionFactory();
        }
        return connFactory;
    }


    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(dbProps.getProperty("db-url"), dbProps.getProperty("db-username"), dbProps.getProperty("db-password"));
    }
}