package showdetail

import com.android.ashwiask.tvmaze.home.Show
import io.reactivex.Observable

/**
 * @author Ashwini Kumar.
 */
interface ShowDetailInteractor
{
    fun showDetails(showId: Int): Observable<Show>
}