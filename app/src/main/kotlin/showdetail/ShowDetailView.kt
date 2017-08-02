package showdetail

import com.android.ashwiask.tvmaze.home.Episode
import com.android.ashwiask.tvmaze.home.Show

/**
 * @author Ashwini Kumar.
 */
interface ShowDetailView
{
    fun showProgress()

    fun hideProgress()

    fun showInfo(showInfo: Show)

    fun showPreviousEpisodes(previousEpisodes: List<Episode>)

    fun showCasts()

}