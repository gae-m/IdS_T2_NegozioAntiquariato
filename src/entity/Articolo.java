package entity;

public class Articolo {
    private float prezzo;
    private int quantitaMagazzino;
    private final Prodotto prodotto;

    public Articolo(float prezzo, int quantitaMagazzino, Prodotto prodotto) {
        this.prezzo = prezzo;
        this.quantitaMagazzino = quantitaMagazzino;
        this.prodotto = prodotto;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public int getQuantitaMagazzino() {
        return quantitaMagazzino;
    }

    public void setQuantitaMagazzino(int quantitaMagazzino) {
        this.quantitaMagazzino = quantitaMagazzino;
    }

    public Prodotto getProdotto() {
        return prodotto;
    }

//    public void setProdotto(Prodotto prodotto) {
//        this.prodotto = prodotto;
//    }
}
