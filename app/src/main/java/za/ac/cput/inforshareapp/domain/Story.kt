package za.ac.cput.inforshareapp.domain

import java.util.*

/**
 * Created by Hunter on 19/01/2018.
 */
data internal class Story @JvmOverloads constructor(
        val id: Int,
        val title: String,
        val author: String ?= "Unknown",
        val summary: String ?= "No Summary",
        val datePublished: String ?= "01/01/2018"
)
