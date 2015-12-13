package org.arpit.java2blog.bean;

public class Trasa{
	
	
	String przystA;
	String przystB;
	String godz;
	
	public Trasa(String przystA, String przystB, String godz) {
		this.przystA=przystA;
		this.przystB=przystB;
		this.godz=godz;
			
		}
	
	public String getPrzystA() {
		return przystA;
	}

	public void setPrzystA(String przystA) {
		this.przystA = przystA;
	}

	public String getPrzystB() {
		return przystB;
	}

	public void setPrzystB(String przystB) {
		this.przystB = przystB;
	}

	public String getGodz() {
		return godz;
	}

	public void setGodz(String godz) {
		this.godz = godz;
	}

	
}