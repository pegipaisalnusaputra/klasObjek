public class App {
    public static void main(String[] args) throws Exception {
        Lingkaran koin = new Lingkaran(7.0);
        
        System.out.println("Luas lingkaran: " + koin.getLuas());

        System.out.println("Keliling lingkaran: " + koin.getKeliling());
    }
}
