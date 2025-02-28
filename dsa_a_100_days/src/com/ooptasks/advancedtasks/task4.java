package com.ooptasks.advancedtasks;

/*
 * 12. Singleton Pattern:
Task: Create a DatabaseConnection class that 
ensures only one instance of the database connection exists at a time using the Singleton Design Pattern.
 */

class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection() {
        // Connection initialization
    }

    public static synchronized DatabaseConnection getInstance() {
        if(instance == null){
            instance = new DatabaseConnection();
        }
        return instance;
    }
}

public class task4 {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        System.out.println(db1 == db2);
    }
}
