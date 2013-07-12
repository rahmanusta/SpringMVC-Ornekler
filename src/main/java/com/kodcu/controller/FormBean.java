package com.kodcu.controller;

public class FormBean {
	
	private Double sayi1;
	private Double sayi2;
	private Double sonuc;

	public FormBean() {

		this.sayi1 = 0D;
		this.sayi2 = 0D;
		this.sonuc = 0D;
	}

    public Double getSonuc() {
        return sonuc;
    }

    public void setSonuc(Double sonuc) {
        this.sonuc = sonuc;
    }

    public Double getSayi1() {
		return sayi1;
	}
	public void setSayi1(Double sayi1) {
		this.sayi1 = sayi1;
	}
	public Double getSayi2() {
		return sayi2;
	}
	public void setSayi2(Double sayi2) {
		this.sayi2 = sayi2;
	}
	
	

}
