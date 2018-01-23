package za.ac.cput.inforshareapp.domain

import android.arch.persistence.room.Entity
import android.arch.persistence.room.Ignore
import android.arch.persistence.room.PrimaryKey
import android.graphics.Bitmap

/**
 * Created by Hunter on 21/01/2018.
 */

@Entity
class User @JvmOverloads constructor(
        @PrimaryKey val id: Int,
        val siteId: String,
        val email: String,
        val screenName: String,
        val firstName: String?="Not Available",
        val lastName: String?="Not Available",
        val password:String?="password",
        val date: String?= "Not Available")







