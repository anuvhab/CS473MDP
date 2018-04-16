package com.testapp.krish.week2_l7_webview;

/**
 * Created by Krishna on 4/16/2018.
 */
public class WebList {

    String siteName;
    String siteDescription;
    String image;

    public WebList(String siteName, String siteDescription, String image) {
        this.siteName = siteName;
        this.siteDescription = siteDescription;
        this.image = image;
    }

    public String getSiteName() {
        return siteName;
    }

    public String getSiteDescription() {
        return siteDescription;
    }

    public String getImage() {
        return image;
    }
}
