package com.example.projekt;

public class Formularz {
    private String paliwo;
    private String etap;
    private String gwiazda;
    private String dlugosc;


    public String getPaliwo() {
        return paliwo;
    }

    public void setPaliwo(String paliwo) {
        this.paliwo = paliwo;
    }

    public String getEtap() {
        return etap;
    }

    public void setEtap(String etap) {
        this.etap = etap;
    }

    public String getGwiazda() {
        return gwiazda;
    }

    public void setGwiazda(String gwiazda) {
        this.gwiazda = gwiazda;
    }

    public String getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(String dlugosc) {
        this.dlugosc = dlugosc;
    }

    @Override
    public String toString() {
        return "Formularz{" +
                "paliwo='" + paliwo + '\'' +
                ", etap='" + etap + '\'' +
                ", gwiazda='" + gwiazda + '\'' +
                ", dlugosc='" + dlugosc + '\'' +
                '}';
    }
}

