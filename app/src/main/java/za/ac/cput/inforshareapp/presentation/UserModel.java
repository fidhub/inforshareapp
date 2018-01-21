package za.ac.cput.inforshareapp.presentation;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.paging.PagedList;

import java.util.ArrayList;
import java.util.List;

import za.ac.cput.inforshareapp.domain.InfoDB;
import za.ac.cput.inforshareapp.domain.User;
import za.ac.cput.inforshareapp.domain.UserDao;

/**
 * Created by Hunter on 21/01/2018.
 */


public class UserModel extends AndroidViewModel {

    private final UserDao userDao;

    public UserModel(Application application) {
        super(application);
        userDao = InfoDB.getDefaultInstance().userDao();
    }

    public LiveData<List<User>> getAllUser() {
        return userDao.getAll();
    }


    public void insertDummyUsers() {
        List<User> usersList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            User user = new User((int)Math.random()*100,"Empty","No","Not Given");
            usersList.add(user);
        }
        userDao.insertAll(usersList);
    }


}