package showdetail

import com.android.ashwiask.tvmaze.home.Show

/**
 * @author Ashwini Kumar.
 */
class ShowDetailResponse(val show: Show, val casts: List<Cast>)

class Cast(val person: Person, val character: Character)

class Person(
        val id: Long,
        val url: String,
        val name: String,
        val image: Map<String, String>)

class Character(
        val id: Long,
        val url: String,
        val name: String,
        val image: Map<String, String>?)