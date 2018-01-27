package za.ac.cput.inforshareapp.domain.user;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Created by Hunter on 28/01/2018.
 */
@Entity
public class UserLanguage implements Serializable {
    @PrimaryKey
    private final String emailId;
    @PrimaryKey
    private final String id;
    private final String languageId;
    private final String reading;
    private final String  writing ;
    private final String speaking ;
    private final LocalDate date ;
    private final String  state;

    private UserLanguage(Builder builder){
        this.emailId=builder.emailId;
        this.id=builder.id;
        this.languageId=builder.languageId;
        this.reading=builder.reading;
        this.writing=builder.writing;
        this.speaking=builder.speaking;
        this.date=builder.date;
        this.state=builder.state;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getId() {
        return id;
    }

    public String getLanguageId() {
        return languageId;
    }

    public String getReading() {
        return reading;
    }

    public String getWriting() {
        return writing;
    }

    public String getSpeaking() {
        return speaking;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getState() {
        return state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserLanguage that = (UserLanguage) o;

        if (!emailId.equals(that.emailId)) return false;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        int result = emailId.hashCode();
        result = 31 * result + id.hashCode();
        return result;
    }

    public static class Builder{
        private  String emailId;
        private  String id;
        private  String languageId;
        private  String reading;
        private  String  writing ;
        private  String speaking ;
        private  LocalDate date ;
        private  String  state;

        public Builder  emailId(String val){
            this.emailId=val;
            return this;
        }
        public Builder id(String val){
            this.id=val;
            return this;
        }
        public Builder languageId(String val){
            this.languageId=val;
            return  this;
        }
        public Builder reading(String val){
            this.reading=val;
            return this;
        }
        public Builder writing(String val){
            this.writing=val;
            return this;
        }
        public Builder speaking(String val){
            this.speaking=val;
            return this;
        }
        public Builder date(LocalDate val){
            this.date=val;
            return  this;
        }
        public Builder state(String val){
            this.state=val;
            return this;
        }

        public UserLanguage build(){return new UserLanguage(this);}

    }
}
