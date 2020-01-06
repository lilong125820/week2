package com.bw.domain;
/**
 * 
 * @ClassName: Column 
 * @Description: TODO
 * @author: lilong
 * @date: 2020年1月6日 上午8:50:04
 */

import java.math.BigInteger;
import java.util.Date;
/**
 * 
 * @ClassName: Column 
 * @Description: TODO
 * @author: lilong
 * @date: 2020年1月6日 上午11:34:52
 */
public class Column {
	private BigInteger id;
	private String gjz;
	private String ms;
	private String name;
	private String cp;
	private String dz;
	private Double zb;
	@Override
	public String toString() {
		return "Column [id=" + id + ", gjz=" + gjz + ", ms=" + ms + ", name=" + name + ", cp=" + cp + ", dz=" + dz
				+ ", zb=" + zb + ", date=" + date + ", ndate=" + ndate + ", zt=" + zt + ", bz=" + bz + "]";
	}
	private Date date;
	private Date ndate;
	private String zt;
	private String bz;
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getGjz() {
		return gjz;
	}
	public void setGjz(String gjz) {
		this.gjz = gjz;
	}
	public String getMs() {
		return ms;
	}
	public void setMs(String ms) {
		this.ms = ms;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public String getDz() {
		return dz;
	}
	public void setDz(String dz) {
		this.dz = dz;
	}
	public Double getZb() {
		return zb;
	}
	public void setZb(Double zb) {
		this.zb = zb;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getNdate() {
		return ndate;
	}
	public void setNdate(Date ndate) {
		this.ndate = ndate;
	}
	public String getZt() {
		return zt;
	}
	public void setZt(String zt) {
		this.zt = zt;
	}
	public String getBz() {
		return bz;
	}
	public void setBz(String bz) {
		this.bz = bz;
	}
	
}
