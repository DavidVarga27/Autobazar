package sk.upjs.ics.autobazar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InzeratOsobne {

    private Long idP;

    private Long id;

    private String znacka;

    private String model;

    private String rocnik;

    private Long objem;

    private Long km;

    public String palivo;

    public String prevodovka;

    public Long vykon;

    private Date datumPridania;

    private Long cena;

    public Long getIdP() {
        return idP;
    }

    public void setIdP(Long idP) {
        this.idP = idP;
    }

    public String getPalivo() {
        if (idP == 1) {
            return "Diesel";
        }
        return "Benzin";
    }

    public Long getKm() {
        return km;
    }

    public void setKm(Long km) {
        this.km = km;
    }

    public void setPalivo(String palivo) {
        this.palivo = palivo;
    }

    public String getPrevodovka() {
        return prevodovka;
    }

    public void setPrevodovka(String prevodovka) {
        this.prevodovka = prevodovka;
    }

    public Long getVykon() {
        return vykon;
    }

    public void setVykon(Long vykon) {
        this.vykon = vykon;
    }

    public Long getCena() {
        return cena;
    }

    public void setCena(Long cena) {
        this.cena = cena;
    }

    private SimpleDateFormat dateFormat = new SimpleDateFormat("d.M.yyyy");

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getZnacka() {
        return znacka;
    }

    public void setZnacka(String znacka) {
        this.znacka = znacka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRocnik() {
        return rocnik;
    }

    public void setRocnik(String rocnik) {
        this.rocnik = rocnik;
    }

    public Long getObjem() {
        return objem;
    }

    public void setObjem(Long objem) {
        this.objem = objem;
    }

    public Date getDatumPridania() {
        return datumPridania;
    }

    public void setDatumPridania(Date datumPridania) {
        this.datumPridania = datumPridania;
    }

    @Override
    public String toString() {
        return this.znacka + " " + this.model + ", Rok vyroby: " + this.rocnik + ", Objem: " + this.objem + "\n\n";
    }

    public String toString2() {
        return "Znacka: " + this.znacka + "\n"
                + "Model: " + this.model + "\n"
                + "Rok vyroby: " + this.rocnik + "\n"
                + "Objem: " + this.objem + "\n"
                + "Vykon: " + this.vykon + " KW\n"
                + "Pocet najazdenych kilometrov: " + this.km + "\n"
                + "Palivo: " + this.getPalivo() + "\n"
                + "Prevodovka: " + this.getPrevodovka() + "\n"
                + "Datum pridania: " + dateFormat.format(this.datumPridania);
    }

}
