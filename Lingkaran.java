public class Lingkaran {
    //properti yang dibutuhkan untuk lingkaran
    private Double jariJari;

    //konstruktor untuk inisialisasi
    public Lingkaran(Double jariJari) {
        this.setProperty(jariJari);
    }

    //method atau function
    public void setProperty(Double jariJari){
        this.jariJari = jariJari;
    }

    public void setJarijari(Double jariJari){
        this.jariJari = jariJari;
    }

    public void hitungLuas(){
        System.out.println(3.14 * jariJari * jariJari);
    }

    public Double getLuas(){
        return 3.14 * jariJari * jariJari;
    }

    public void hitungKeliling(){
        System.out.println(2 * 3.14 * jariJari);
    }

    public Double getKeliling(){
        return 2 * 3.14 * jariJari;
    }


}
