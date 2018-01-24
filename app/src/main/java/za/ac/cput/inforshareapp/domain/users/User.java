package za.ac.cput.inforshareapp.domain.users;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by hashcode on 2018/01/24.
 */

public class User implements Serializable {

    private String siteId;
    private String email;
    private String firstName;
    private String lastName;
    private String screenName;
    private String password;
    private String state;
    private LocalDateTime date;

    public static class Builder{
        private String siteId;
        private String email;
        private String firstName;
        private String lastName;
        private String screenName;
        private String password;
        private String state;
        private LocalDateTime date;
    }
}
