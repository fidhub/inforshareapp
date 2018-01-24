package za.ac.cput.inforshareapp.domain;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;



/**
 * Created by Hunter on 20/01/2018.
 */

@Dao
public interface UserDao {
    @Query("SELECT * FROM user")
    LiveData<List<User>> getAll();

    @Query("SELECT * FROM user WHERE email = :email")
    User findUserByEmail(String email);

    @Insert
    void insertAll(User... users);

    @Insert
    void insertAll(List<User> users);

    @Delete
    void delete(User user);

    @Update
    void updateUser(User user);
}
