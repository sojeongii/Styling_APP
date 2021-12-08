package com.example.smartmirror;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.widget.ImageButton;

import com.bumptech.glide.Glide;
// 스타일링
public class ListItem {

    private String url; //이미지
    private String link;
    private String ID;

    public void setImage(String url)
    {
      this.url=url;
    }

    public void setLink(String link) {
        this.link = link ;
    }
    public void setID(String ID){this.ID=ID;}

    public String getImage() {
        return this.url;
    }
    public String getLink() {
        return this.link;
    }
    public String getID() {
        return this.ID;
    }

}
