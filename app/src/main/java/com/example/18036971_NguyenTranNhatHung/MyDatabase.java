package com.example.a18036971_nguyentrannhathung_roombasic;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

@Database(entities = {User.class},version = 1)
public abstract class MyDatabase extends RoomDatabase {
    public abstract UserDao userDao();

    MyDatabase db = Room.databaseBuilder(getApplicationContext(),
            MyDatabase.class, "user").build();
    @NonNull
    @Override
    protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration config) {
        return null;
    }

    @NonNull
    @Override
    protected InvalidationTracker createInvalidationTracker() {
        return null;
    }

    @Override
    public void clearAllTables() {

    }
}
