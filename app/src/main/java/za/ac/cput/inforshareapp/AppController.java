package za.ac.cput.inforshareapp;

import android.app.Application;
import android.content.Context;

/**
 * Created by Hunter on 21/01/2018.
 */

public class AppController extends Application {

    private static AppController appController;

    @Override
    public void onCreate() {
        super.onCreate();
        appController = this;
    }


    public static AppController getInstance() {
        return appController;
    }

    public static Context getContext() {
        return appController.getApplicationContext();
    }
}