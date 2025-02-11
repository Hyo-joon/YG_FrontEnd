package com.example.test.Retrofitmanager;

import com.google.gson.annotations.SerializedName;

public class QualityRestaurantModel {

    @SerializedName("latitude")
    private Double latitude;

    @SerializedName("longitude")
    private Double longitude;

    //업소일련번호
    @SerializedName("upsoSno")
    private String upsoSno;

    //시군구 코드
    @SerializedName("cggCode")
    private String cggCode;

    //업종명
    @SerializedName("sntCobNm")
    private String sntCobNm;

    //업소명
    @SerializedName("upsoNm")
    private String upsoNm;

    //업태명
    @SerializedName("sntUptaeNm")
    private String sntUptaeNm;

    //소재지도로명
    @SerializedName("siteAddrRd")
    private String siteAddrRd;

    //지상_부터
    @SerializedName("bdngJisgFlrNum")
    private String bdngJisgFlrNum;

    //지하_부터
    @SerializedName("bdngUnderFlrNum")
    private String bdngUnderFlrNum;

    //모범음식점여부
    @SerializedName("geEnYn")
    private String geEnYn;

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public String getUpsoSno() {
        return upsoSno;
    }

    public void setUpsoSno(String upsoSno) {
        this.upsoSno = upsoSno;
    }

    public String getCggCode() {
        return cggCode;
    }

    public void setCggCode(String cggCode) {
        this.cggCode = cggCode;
    }

    public String getSntCobNm() {
        return sntCobNm;
    }

    public void setSntCobNm(String sntCobNm) {
        this.sntCobNm = sntCobNm;
    }

    public String getUpsoNm() {
        return upsoNm;
    }

    public void setUpsoNm(String upsoNm) {
        this.upsoNm = upsoNm;
    }

    public String getSntUptaeNm() {
        return sntUptaeNm;
    }

    public void setSntUptaeNm(String sntUptaeNm) {
        this.sntUptaeNm = sntUptaeNm;
    }

    public String getSiteAddrRd() {
        return siteAddrRd;
    }

    public void setSiteAddrRd(String siteAddrRd) {
        this.siteAddrRd = siteAddrRd;
    }

    public String getBdngJisgFlrNum() {
        return bdngJisgFlrNum;
    }

    public void setBdngJisgFlrNum(String bdngJisgFlrNum) {
        this.bdngJisgFlrNum = bdngJisgFlrNum;
    }

    public String getBdngUnderFlrNum() {
        return bdngUnderFlrNum;
    }

    public void setBdngUnderFlrNum(String bdngUnderFlrNum) {
        this.bdngUnderFlrNum = bdngUnderFlrNum;
    }

    public String getGeEnYn() {
        return geEnYn;
    }

    public void setGeEnYn(String geEnYn) {
        this.geEnYn = geEnYn;
    }

    @Override
    public String toString() {
        return "ResModel{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", upsoSno='" + upsoSno + '\'' +
                ", cggCode='" + cggCode + '\'' +
                ", sntCobNm='" + sntCobNm + '\'' +
                ", upsoNm='" + upsoNm + '\'' +
                ", sntUptaeNm='" + sntUptaeNm + '\'' +
                ", siteAddrRd='" + siteAddrRd + '\'' +
                ", bdngJisgFlrNum='" + bdngJisgFlrNum + '\'' +
                ", bdngUnderFlrNum='" + bdngUnderFlrNum + '\'' +
                ", geEnYn='" + geEnYn + '\'' +
                '}';
    }
}
