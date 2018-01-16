package za.ac.cput.inforshareapp.domain

import java.time.LocalDateTime

/**
 * Created by hashcode on 1/16/18.
 */
data class User(
        var siteId: String,
        var email: String,
        var firstName: String,
        var lastName: String,
        var screenName: String,
        var password: String,
        var state: String,
        var date: LocalDateTime)