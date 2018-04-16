package com.kstechsolutions.mvvm.modules.posts.model;

import java.io.Serializable;

/**
 * Created by muhammadumairshafique on 16/04/2018.
 */

public class Post implements Serializable {
    private int id;
    private String title;
    private String body;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}