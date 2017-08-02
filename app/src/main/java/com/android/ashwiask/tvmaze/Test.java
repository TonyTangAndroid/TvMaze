package com.android.ashwiask.tvmaze;

import com.android.ashwiask.tvmaze.home.Show;

import io.reactivex.Observable;


/**
 * @author Ashwini Kumar.
 */

public interface Test
{

    Observable<Show> showDetails(int showId);
}
