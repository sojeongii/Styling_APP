package com.example.smartmirror;

import android.graphics.drawable.Drawable;

public class ListItem {

    private Drawable image;
    private String title;
    private String link;

    public void setImage(Drawable image){
        this.image = image;
    }
    public void setLink(String link) {
        this.link = link ;
    }

    public Drawable getImage() {
        return this.image;
    }
    public String getLink() {
        return this.link;
    }
}
