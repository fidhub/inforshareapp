package za.ac.cput.inforshareapp.domain;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;



/**
 * Created by Hunter on 20/01/2018.
 */



@Database(version = 1, entities = {User.class},exportSchema = false)
public abstract class AppDatabase extends RoomDatabase{

    abstract public UserDao userDao();

}


