package za.ac.cput.inforshareapp.domain;

/**
 * Created by Hunter on 17/01/2018.
 */

public class API_Endpoints {
    final String BASE="https://infoapi.hash-code.com";
    final String USERS=BASE+"/users";               //controllers.users.UsersRouter
    final String UTILS=BASE+"/utils";               //controllers.util.UtilRouter
    final String CONTENT=BASE+"/content";             //controllers.content.ContentRouter
    final String DEMO=BASE+"/demo";                //controllers.demographics.DemographicsRouter
    final String LOCATION=BASE+"/location";            //controllers.location.LocationRouter
    final String ORG=BASE+"/org";                 //controllers.organisation.OrganisationRouter
    final String STORAGE=BASE+"/storage";             //controllers.storage.StorageRouter
    final String EVENTS=BASE+"/events";              //controllers.syslog.SystemLogRouter
    final String LOGIN=BASE+"/login";               //controllers.login.LoginRouter


}
