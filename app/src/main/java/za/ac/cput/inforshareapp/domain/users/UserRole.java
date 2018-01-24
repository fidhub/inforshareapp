package za.ac.cput.inforshareapp.domain.users;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by hashcode on 2018/01/24.
 */

public class UserRole implements Serializable {
    private String iteId;
    private String emailId;
    private LocalDateTime date;
    private String roleId;

    public static class Builder {

        private String iteId;
        private String emailId;
        private LocalDateTime date;
        private String roleId;
    }
}
