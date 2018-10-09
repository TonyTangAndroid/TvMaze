package com.android.ashwiask.tvmaze.home;

import android.os.Parcelable;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

@AutoValue
public abstract class Country implements Parcelable {
    public static TypeAdapter<Country> typeAdapter(Gson gson) {
        return new AutoValue_Country.GsonTypeAdapter(gson);
    }

    public abstract String name();

    public abstract String code();

    public abstract String timezone();
}
