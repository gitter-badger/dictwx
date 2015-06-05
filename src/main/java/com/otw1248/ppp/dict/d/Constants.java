package com.otw1248.ppp.dict.d;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Stephen Xianwei Zhang on 6/5/2015.
 */
public class Constants {
    private String specialtechwords = "";
    private String token = "";
    private String encrypt = "";
    private String appURL = "";
    private String imgPath = "";
    private String dictwxpBig = "";
    private String wxDefaultResponseNotice = "";
    private String defaultResponseNotice = "";
    private String tuling123apikey = "";
    private String appname = "";
    private Integer wxArticleMaxCounts = 2;
    private String requestid;
    private Map<String, Object> helpCol = new HashMap<String, Object>();
    private Map<String, Object> wikiCol = new HashMap<String, Object>();

    public Map<String, Object> getWikiCol() {
        return wikiCol;
    }

    public void setWikiCol(Map<String, Object> wikiCol) {
        this.wikiCol = wikiCol;
    }

    public String getSpecialtechwords() {
        return specialtechwords;
    }

    public void setSpecialtechwords(String specialtechwords) {
        this.specialtechwords = specialtechwords;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(String encrypt) {
        this.encrypt = encrypt;
    }

    public String getAppURL() {
        return appURL;
    }

    public void setAppURL(String appURL) {
        this.appURL = appURL;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getDictwxpBig() {
        return dictwxpBig;
    }

    public void setDictwxpBig(String dictwxpBig) {
        this.dictwxpBig = dictwxpBig;
    }

    public String getWxDefaultResponseNotice() {
        return wxDefaultResponseNotice;
    }

    public void setWxDefaultResponseNotice(String wxDefaultResponseNotice) {
        this.wxDefaultResponseNotice = wxDefaultResponseNotice;
    }

    public String getDefaultResponseNotice() {
        return defaultResponseNotice;
    }

    public void setDefaultResponseNotice(String defaultResponseNotice) {
        this.defaultResponseNotice = defaultResponseNotice;
    }

    public String getTuling123apikey() {
        return tuling123apikey;
    }

    public void setTuling123apikey(String tuling123apikey) {
        this.tuling123apikey = tuling123apikey;
    }

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname;
    }

    public Integer getWxArticleMaxCounts() {
        return wxArticleMaxCounts;
    }

    public void setWxArticleMaxCounts(Integer wxArticleMaxCounts) {
        this.wxArticleMaxCounts = wxArticleMaxCounts;
    }

    public String getRequestid() {
        return requestid;
    }

    public void setRequestid(String requestid) {
        this.requestid = requestid;
    }

    public Map<String, Object> getHelpCol() {
        return helpCol;
    }

    public void setHelpCol(Map<String, Object> helpCol) {
        this.helpCol = helpCol;
    }
}
