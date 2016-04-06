package com.fitApp.model;

import com.sun.javafx.beans.annotations.NonNull;
import org.hibernate.validator.constraints.Range;

/**
 * Created by vitaliiromanchenko on 26.03.16.
 */
public class Exercise {
    @Range(min = 1,max = 120)
    private int minutes;
    @NonNull
    private String activity;

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }


}
