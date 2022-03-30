package com.example.obligatoriskoppgave3;

//public class film implements Comparable<film>
//Interfacet Comparable definerer metoden compareTo(), som film-klassen *må* inneholde; se nederst.
public class film{
        private int id;
        private String tittel;
        private String antall;
        private String fornavn;
        private String etternavn;
        private String telefonnr;
        private String epost;

    public film(int id, String antall, String fornavn, String etternavn, String telefonnr, String epost) {
            this.id = id;
            this.antall = antall;
            this.fornavn = fornavn;
            this.etternavn = etternavn;
            this.telefonnr = telefonnr;
            this.epost = epost;
        }

        public film() {

        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTittel() {
            return tittel;
        }

        public void setTittel(String tittel) {
            this.tittel = tittel;
        }

        public String getAntall() {
            return antall;
        }

        public void setAntall(String antall) {
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

        public String getTelefonnr() {
            return telefonnr;
        }

        public void setTelefonnr(String telefonnr) {
            this.telefonnr = telefonnr;
        }

        public String getEpost() {
            return epost;
        }

        public void setEpost(String epost) {
            this.epost = epost;
        }

/*compareTo() returnerer:
positivt heltall hvis dette film-objektet skal sorteres etter/under film f.
negativt heltall hvis dette film-objektet skal sorteres først/over film f.
0 hvis dette film-objektet og film f er likestilte.

Vi må få funksjonen til å returnere ønsket verdi, basert på en slags beregning på this.etternavn & f.getEtternavn().
Deretter i filmRepository, instansiér List<film> listen, og kall Collections.sort(listen), som bytter plass på
objektene i listen, basert på denne compareTo().

  @Override
  public int compareTo(film f) {
    return 0;
  }

 */
}

