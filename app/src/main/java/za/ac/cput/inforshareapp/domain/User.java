package za.ac.cput.inforshareapp.domain;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.graphics.Bitmap;

/**
 * Created by Hunter on 20/01/2018.
 */

@Entity
public class User {
    @PrimaryKey
    public int id;

    public String siteId;
    public String email;
    public String firstName;
    public String lastName;
    public String screenName;
    public String password;
    public String state;
    public String date;

    public User(int id, String siteId, String email, String screenName){
              this.id=id;
              this.siteId=siteId;
              this.email=email;
              this.screenName=screenName;
              this.lastName=this.firstName=this.password=this.state=this.date="Not Available";
    }


    @Ignore
    Bitmap picture;
}
