package za.ac.cput.inforshareapp.domain.user;

import java.io.Serializable;
import java.text.Bidi;
import java.time.LocalDateTime;

/**
 * Created by hashcode on 2018/01/24.
 */

public class UserRole implements Serializable {
    private final String iteId;
    private final String emailId;
    private final LocalDateTime date;
    private final String roleId;

    public UserRole(Builder builder) {
        this.iteId=builder.iteId;
        this.emailId=builder.emailId;
        this.date=builder.date;
        this.roleId=builder.roleId;
    }

    public String getIteId() {
        return iteId;
    }

    public String getEmailId() {
        return emailId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getRoleId() {
        return roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserRole userRole = (UserRole) o;

        if (!iteId.equals(userRole.iteId)) return false;
        return emailId.equals(userRole.emailId);
    }

    @Override
    public int hashCode() {
        int result = iteId.hashCode();
        result = 31 * result + emailId.hashCode();
        return result;
    }

    public static class Builder {

        private String iteId;
        private String emailId;
        private LocalDateTime date;
        private String roleId;

       public Builder iteId(String val){
            this.iteId=val;
            return this;
        }
        public Builder emailId(String val){
            this.emailId=val;
            return this;
        }
        public Builder date(LocalDateTime val){
            this.date=val;
            return this;
        }
        public Builder roleId(String val) {
            this.roleId = val;
            return this;
        }
        public UserRole build(){
            return new UserRole(this);
        }
    }
}
