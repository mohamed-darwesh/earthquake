package com.example.android.quakereport;

public class earthquake {

    /** Default place for the place */
    private double mMagnitude;

    /** details for the place*/
    private String mplace;

    /** Image resource ID for the word */
    private String mdate;

    /** Website URL of the earthquake */
    private String mUrl;



    public earthquake(double muq, String place , String date , String url) {
        mMagnitude = muq;
        mplace = place;
        mdate = date;
        mUrl = url;

    }



    /**
     * Get the default translation of the word.
     */
    public double getmug() {
        return mMagnitude;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getplace() {
        return mplace;
    }
    /**
     * Return the image resource ID of the word.
     */
    public String getdate() {
        return mdate;
    }
    public String getUrl() {
        return mUrl;
    }

}

