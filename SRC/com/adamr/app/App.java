package com.adamr.app;

import com.adamr.app.database.DatabaseConnection;
import com.adamr.app.database.DatabaseUtils;
import pages.DabaseUtils;

public class App {

    public static void main(String[] args) {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        DatabaseUtils databaseUtils = new DatabaseUtils();
        pages.DabaseUtils databaseuntils1 = new DabaseUtils();
    }
}
