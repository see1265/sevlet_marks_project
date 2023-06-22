package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DtoStd {
@Id
private long usn;
private String mon;

private String medium;
private String type;

private String name;
private String fname;
private String mname;

private String dob;
private String gender;

private int kan;
private int kmin;
private int ktotal;
private String kgrad;

private int eng;
private int emin;
private int etotal;
private String egrad;

private int hin;
private int hmin;
private int htotal;
private String hgrad;

private int mat;
private int mmin;
private int mtotal;
private String mgrad;

private int sci;
private int smin;
private int stotal;
private String sgrad;

private int soc;
private int ssmin;
private int sstotal;
private String ssgrad;

private int maxtotal;
private int mintotal;
private int total;
private String tgrad;

private String phygrd;
private String workgrd;
private String attgrd;
private String artgrd;

public long getUsn() {
	return usn;
}
public void setUsn(long usn) {
	this.usn = usn;
}
public String getMon() {
	return mon;
}
public void setMon(String mon) {
	this.mon = mon;
}
public String getMedium() {
	return medium;
}
public void setMedium(String medium) {
	this.medium = medium;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getMname() {
	return mname;
}
public void setMname(String mname) {
	this.mname = mname;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getKan() {
	return kan;
}
public void setKan(int kan) {
	this.kan = kan;
}
public int getKmin() {
	return kmin;
}
public void setKmin(int kmin) {
	this.kmin = kmin;
}
public int getKtotal() {
	return ktotal;
}
public void setKtotal(int ktotal) {
	this.ktotal = ktotal;
}
public String getKgrad() {
	return kgrad;
}
public void setKgrad(String kgrad) {
	this.kgrad = kgrad;
}
public int getEng() {
	return eng;
}
public void setEng(int eng) {
	this.eng = eng;
}
public int getEmin() {
	return emin;
}
public void setEmin(int emin) {
	this.emin = emin;
}
public int getEtotal() {
	return etotal;
}
public void setEtotal(int etotal) {
	this.etotal = etotal;
}
public String getEgrad() {
	return egrad;
}
public void setEgrad(String egrad) {
	this.egrad = egrad;
}
public int getHin() {
	return hin;
}
public void setHin(int hin) {
	this.hin = hin;
}
public int getHmin() {
	return hmin;
}
public void setHmin(int hmin) {
	this.hmin = hmin;
}
public int getHtotal() {
	return htotal;
}
public void setHtotal(int htotal) {
	this.htotal = htotal;
}
public String getHgrad() {
	return hgrad;
}
public void setHgrad(String hgrad) {
	this.hgrad = hgrad;
}
public int getMat() {
	return mat;
}
public void setMat(int mat) {
	this.mat = mat;
}
public int getMmin() {
	return mmin;
}
public void setMmin(int mmin) {
	this.mmin = mmin;
}
public int getMtotal() {
	return mtotal;
}
public void setMtotal(int mtotal) {
	this.mtotal = mtotal;
}
public String getMgrad() {
	return mgrad;
}
public void setMgrad(String mgrad) {
	this.mgrad = mgrad;
}
public int getSci() {
	return sci;
}
public void setSci(int sci) {
	this.sci = sci;
}
public int getSmin() {
	return smin;
}
public void setSmin(int smin) {
	this.smin = smin;
}
public int getStotal() {
	return stotal;
}
public void setStotal(int stotal) {
	this.stotal = stotal;
}
public String getSgrad() {
	return sgrad;
}
public void setSgrad(String sgrad) {
	this.sgrad = sgrad;
}
public int getSoc() {
	return soc;
}
public void setSoc(int soc) {
	this.soc = soc;
}
public int getSsmin() {
	return ssmin;
}
public void setSsmin(int ssmin) {
	this.ssmin = ssmin;
}
public int getSstotal() {
	return sstotal;
}
public void setSstotal(int sstotal) {
	this.sstotal = sstotal;
}
public String getSsgrad() {
	return ssgrad;
}
public void setSsgrad(String ssgrad) {
	this.ssgrad = ssgrad;
}
public int getMaxtotal() {
	return maxtotal;
}
public void setMaxtotal(int maxtotal) {
	this.maxtotal = maxtotal;
}
public int getMintotal() {
	return mintotal;
}
public void setMintotal(int mintotal) {
	this.mintotal = mintotal;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
public String getTgrad() {
	return tgrad;
}
public void setTgrad(String tgrad) {
	this.tgrad = tgrad;
}

public String getPhygrd() {
	return phygrd;
}
public void setPhygrd(String phygrd) {
	this.phygrd = phygrd;
}
public String getWorkgrd() {
	return workgrd;
}
public void setWorkgrd(String workgrd) {
	this.workgrd = workgrd;
}
public String getAttgrd() {
	return attgrd;
}
public void setAttgrd(String attgrd) {
	this.attgrd = attgrd;
}
public String getArtgrd() {
	return artgrd;
}
public void setArtgrd(String artgrd) {
	this.artgrd = artgrd;
}


}
