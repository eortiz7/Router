package com.example.myfirst;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by -- on 12/2/2017.
 */

public class Stuff implements Parcelable {

    private String message;

    public Stuff(String message)
    {
        this.message = message;
    }

    public Stuff(Parcel parcel)
    {
        message = parcel.readString();
    }

    public String getMessage()
    {
        return this.message;
    }

    @Override
    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags)
    {
        dest.writeString(message);
    }

    public static final Parcelable.Creator<Stuff> CREATOR = new Parcelable.Creator<Stuff>()
    {
        @Override
        public Stuff createFromParcel(Parcel parcel)
        {
            return new Stuff(parcel);
        }

        @Override
        public Stuff[] newArray(int size)
        {
            return new Stuff[0];
        }
    };
}
