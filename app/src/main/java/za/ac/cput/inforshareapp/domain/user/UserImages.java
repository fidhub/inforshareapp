package za.ac.cput.inforshareapp.domain.user;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Created by Hunter on 27/01/2018.
 */
@Entity
public class UserImages implements Serializable{
    @PrimaryKey
    private final String org;
    @PrimaryKey
    private final String emailId;
    @PrimaryKey
    private final String id;
    private final String url;
    private final String description;
    private final String size;
    private final  String mime;
    private final LocalDate date;


    private UserImages(Builder builder){
        this.org=builder.org;
        this.emailId=builder.emailId;
        this.id=builder.id;
        this.url=builder.url;
        this.description=builder.description;
        this.size=builder.size;
        this.mime=builder.mime;
        this.date=builder.date;
    }

    public static class Builder {

        private String org;
        private String emailId;
        private String id;
        private String url;
        private String description;
        private String size;
        private String mime;
        private LocalDate date;


        public Builder org(String val){
            this.org =val;
            return this;
        }
        public Builder emailId(String val){
            this.emailId =val;
            return this;
        }
        public Builder id(String val){
            this.id =val;
            return this;
        }
        public Builder url(String val){
            this.url =val;
            return this;
        }
        public Builder description(String val){
            this.description =val;
            return this;
        }
        public Builder size(String val){
            this.size =val;
            return this;
        }
        public Builder mime(String val){
            this.mime=val;
            return this;
        }
        public Builder date(LocalDate val){
            this.date =val;
            return this;
        }

        public UserImages build(){
            return new UserImages(this);

        }
    }

    public String getOrg() {
        return org;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    public String getSize() {
        return size;
    }

    public String getMime() {
        return mime;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserImages that = (UserImages) o;

        if (!org.equals(that.org)) return false;
        if (!emailId.equals(that.emailId)) return false;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        int result = org.hashCode();
        result = 31 * result + emailId.hashCode();
        result = 31 * result + id.hashCode();
        return result;
    }
}
