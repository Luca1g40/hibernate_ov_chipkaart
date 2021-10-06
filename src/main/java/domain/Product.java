package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "product")
public class Product {
    @Id
    @Column(name = "product_nummer")

    private int productNummer;

    private String naam;

    private String beschrijving;

    private double prijs;

    @ManyToMany(mappedBy = "products")
    private List<OVChipkaart> ovIdnummer = new ArrayList<>();

    public Product(int productNummer, String naam, String beschrijving, double prijs) {
        this.productNummer = productNummer;
        this.naam = naam;
        this.beschrijving = beschrijving;
        this.prijs = prijs;
    }

    public Product() {

    }


    public int getProductNummer() {
        return productNummer;
    }

    public void setProductNummer(int productNummer) {
        this.productNummer = productNummer;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(int prijs) {
        this.prijs = prijs;
    }

    public List<OVChipkaart> getOvCardnummers() {
        return ovIdnummer;
    }

    public void addOvChipkaar(OVChipkaart ov){
        ovIdnummer.add(ov);
    }

    public String toString(){
        return "productnummer " + productNummer;
    }
}
