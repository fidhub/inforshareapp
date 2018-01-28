package za.ac.cput.inforshareapp.domain.user;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.io.Serializable;
import java.time.LocalDate;


/**
 * Created by Hunter on 27/01/2018.
 */
@Entity
public class UserDemographics implements Serializable {
    @PrimaryKey
    private final String emailId;
    @PrimaryKey
    private final String id;
    private final String genderId;
    private final String raceId;
    private final LocalDate dateOfBirth;
    private final String maritalStatusId;
    private final int numberOfDependencies;
    private final LocalDate date;
    private final String state;

    private UserDemographics(Builder builder){
        this.emailId=builder.emailId;
        this.id=builder.id;
        this.genderId=builder.genderId;
        this.raceId=builder.raceId;
        this.dateOfBirth=builder.dateOfBirth;
        this.date=builder.date;
        this.maritalStatusId=builder.maritalStatusId;
        this.numberOfDependencies=builder.numberOfDependencies;
        this.state=builder.state;
    }


    public String getEmailId() {return emailId;}
    public String getId() {return id;}
    public String getGenderId() {return genderId;}
    public String getRaceId() {return raceId;}
    public LocalDate getDateOfBirth() {return dateOfBirth;}
    public String getMaritalStatusId() {return maritalStatusId;}
    public int getNumberOfDependencies() {return numberOfDependencies;}
    public LocalDate getDate() {return date;}
    public String getState() {return state;}
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserDemographics that = (UserDemographics) o;

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
        private  String genderId;
        private  String raceId;
        private  LocalDate dateOfBirth;
        private  String maritalStatusId;
        private  int numberOfDependencies;
        private  LocalDate date;
        private  String state;

      public Builder emailID(String val){
            this.emailId=val;
            return this;
        }
        public Builder id(String val){
            this.id=val;
            return this;
        }
        public Builder genderID(String val){
            this.genderId=val;
            return this;
        }
        public Builder raceID(String val){
            this.raceId=val;
            return this;
        }
        public Builder dateofBirth(LocalDate val){
            this.dateOfBirth=val;
            return this;
        }
        public Builder maritalStatusId(String val){
            this.maritalStatusId=val;
            return this;
        }
        public Builder numberOfDependencies(int val){
            this.numberOfDependencies=val;
            return this;
        }
        public Builder date(LocalDate val){
            this.date=val;
            return this;
        }
        public Builder state(String val){
            this.state=val;
            return this;
        }

        public UserDemographics build(){
            return new UserDemographics(this);
        }
    }
}
