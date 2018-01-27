package za.ac.cput.inforshareapp.domain.user;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by hashcode on 2018/01/24.
 */
@Entity
public class User implements Serializable {
    @PrimaryKey
    private final  String siteId;
    @PrimaryKey
    private final String email;
    private final String firstName;
    private final String lastName;
    private final String screenName;
    private final String password;
    private final String state;
    private final LocalDateTime date;

    public User(Builder builder) {
        siteId=builder.siteId;
        email= builder.email;
        firstName=builder.firstName;
        lastName=builder.lastName;
        screenName=builder.screenName;
        password=builder.password;
        state=builder.state;
        date=builder.date;
    }

    public static class Builder{
        private String siteId;
        private String email;
        private String firstName;
        private String lastName;
        private String screenName;
        private String password;
        private String state;
        private LocalDateTime date;

        public Builder siteId(String value ){
            this.siteId = value;
            return this;
        }

        public Builder email(String value ){
            this.email = value;
            return this;
        }

        public Builder firstName(String value ){
            this.firstName = value;
            return this;
        }
        public Builder lastName(String value ){
            this.lastName = value;
            return this;
        }
        public Builder screenName(String value ){
            this.screenName = value;
            return this;
        }
        public Builder state(String value ){
            this.state = value;
            return this;
        }
        public Builder passwoed(String value ){
            this.password = value;
            return this;
        }
        public Builder date(LocalDateTime value ){
            this.date = value;
            return this;
        }

        public User build(){
            return new User(this);
        }

    }

    public String getSiteId() {
        return siteId;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getScreenName() {
        return screenName;
    }

    public String getPassword() {
        return password;
    }

    public String getState() {
        return state;
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (siteId != null ? !siteId.equals(user.siteId) : user.siteId != null) return false;
        return email != null ? email.equals(user.email) : user.email == null;
    }

    @Override
    public int hashCode() {
        int result = siteId != null ? siteId.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

}
