package com.udacity.gradle.builditbigger;

import com.udacity.backend.myApi.model.JokeBean;

/**
 * Created by pawankumar on 24/01/16.
 */
public interface CallBack {

    public void getJoke(JokeBean jokeBean);
}
