package za.ac.cput.inforshareapp.domain.user;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Created by Hunter on 27/01/2018.
 */
@Entity
public class UserAddress implements Serializable{
    @PrimaryKey
    private final String emailId;
    @PrimaryKey
    private final String id;
    private final String addressTypeId;
    private final String description;
    private final String postalCode;
    private final LocalDate date;
    private final String state;

    private UserAddress(Builder builder){
        this.emailId=builder.emailId;
        this.id=builder.id;
        this.addressTypeId=builder.addressTypeId;
        this.description=builder.description;
        this.postalCode=builder.postalCode;
        this.date=builder.date;
        this.state=builder.state;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getId() {
        return id;
    }

    public String getAddressTypeId() {
        return addressTypeId;
    }

    public String getDescription() {
        return description;
    }

    public String getPostalCode() {
        return postalCode;
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

        UserAddress that = (UserAddress) o;

        if (!emailId.equals(that.emailId)) return false;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        int result = emailId.hashCode();
        result = 31 * result + id.hashCode();
        return result;
    }

    public static class  Builder{
        private  String emailId;
        private  String id;
        private  String addressTypeId;
        private  String description;
        private  String postalCode;
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
        public Builder addressTypeId(String val){
            this.addressTypeId=val;
            return this;
        }
        public Builder description(String val){
            this.description =val;
            return this;
        }
        public Builder postalCode(String val){
            this.postalCode=val;
            return this;
        }
        public Builder date(LocalDate val){
            this.date =val;
            return this;
        }
        public Builder state(String val){
            this.state=val;
            return this;
        }
        public UserAddress build(){
            return new UserAddress(this);
        }
    }

}
