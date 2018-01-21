package za.ac.cput.inforshareapp.domain;

import android.app.Application;
import android.arch.persistence.room.Room;
import android.content.Context;

import za.ac.cput.inforshareapp.AppController;

/**
 * Created by Hunter on 21/01/2018.
 */
public class InfoDB {
    private static final String DATABASE_NAME = "infoshare-database";
    private static InfoDB ourInstance;
    private AppDatabase appDatabase;

    public static AppDatabase getDefaultInstance() {
        if (ourInstance == null) {
            ourInstance = new InfoDB();
        }
        return ourInstance.getAppDatabase();
    }

    private InfoDB() {
        Context context = AppController.getContext();
        //Intiliaze the room database with database name
        appDatabase = Room.databaseBuilder(context, AppDatabase.class, DATABASE_NAME)
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build();
    }

    private AppDatabase getAppDatabase() {
        return appDatabase;
    }
}

