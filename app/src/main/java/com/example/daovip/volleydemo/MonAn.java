package com.example.daovip.volleydemo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by daovip on 3/26/2018.
 */

public class MonAn {
  @SerializedName("MaMA")
  int MaMa;
  @SerializedName("TenMa")
  String TenMa;
  @SerializedName("NguyenLieu")
  String NguyenLieu;
  @SerializedName("CachLam")
  String Cachlam;
  @SerializedName("GioiThieu")
  String gioithieu;
  @SerializedName("Dongia")
  int dongia;
  @SerializedName("Anh")
  String hinh;
  @SerializedName("MaDM")
  int maDm;

  public MonAn(int maMa, String tenMa, String nguyenLieu, String cachlam, String gioithieu, int dongia, String hinh, int maDm) {
    MaMa = maMa;
    TenMa = tenMa;
    NguyenLieu = nguyenLieu;
    Cachlam = cachlam;
    this.gioithieu = gioithieu;
    this.dongia = dongia;
    this.hinh = hinh;
    this.maDm = maDm;
  }

  public MonAn() {
  }

  public int getMaMa() {
    return MaMa;
  }

  public String getTenMa() {
    return TenMa;
  }

  public String getNguyenLieu() {
    return NguyenLieu;
  }

  public String getCachlam() {
    return Cachlam;
  }

  public String getGioithieu() {
    return gioithieu;
  }

  public int getDongia() {
    return dongia;
  }

  public String getHinh() {
    return hinh;
  }

  public int getMaDm() {
    return maDm;
  }

  public void setMaMa(int maMa) {
    MaMa = maMa;
  }

  public void setTenMa(String tenMa) {
    TenMa = tenMa;
  }

  public void setNguyenLieu(String nguyenLieu) {
    NguyenLieu = nguyenLieu;
  }

  public void setCachlam(String cachlam) {
    Cachlam = cachlam;
  }

  public void setGioithieu(String gioithieu) {
    this.gioithieu = gioithieu;
  }

  public void setDongia(int dongia) {
    this.dongia = dongia;
  }

  public void setHinh(String hinh) {
    this.hinh = hinh;
  }

  public void setMaDm(int maDm) {
    this.maDm = maDm;
  }
}
