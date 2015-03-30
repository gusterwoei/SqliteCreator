package com.guster.sqlitecreator.sample;

import android.app.Application;

/**
 * Created by Gusterwoei on 3/17/15.
 *
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // create db
        MyDatabase dbHelper = new MyDatabase(this, "sqliteCreator.db", 1);
        dbHelper.createDatabase();

        // load dummy data
        DataContentProvider.loadDummyData(this);
    }
}