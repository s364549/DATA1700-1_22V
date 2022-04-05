package com.example.obligatoriskoppgave3;

//public class film implements Comparable<film>
//Interfacet Comparable definerer metoden compareTo(), som film-klassen *må* inneholde; se nederst.
public class film implements Comparable<film>{
    private int id;
    private String tittel;
    private int antall;
    private String fornavn;
    private String etternavn;
    private int telefonnr;
    private String epost;

    public film(int antall, String fornavn, String etternavn, int telefonnr, String epost) {
        this.antall = antall;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.telefonnr = telefonnr;
        this.epost = epost;
    }

    public film() {

    }

    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public int getAntall() {
        return antall;
    }

    public void setAntall(int antall) {
        this.antall = antall;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public int getTelefonnr() {
        return telefonnr;
    }

    public void setTelefonnr(int telefonnr) {
        this.telefonnr = telefonnr;
    }

    public String getEpost() {
        return epost;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }

    public int compareTo(film f) {
        return this.etternavn.compareTo(f.getEtternavn());
    }
}



