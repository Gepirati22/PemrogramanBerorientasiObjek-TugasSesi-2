public class App {
    public static void main(String[] args) throws Exception{
        Double sisi = 11.0;
        persegi A = new persegi(sisi);
        System.out.println("luas persegi:" + A.getLuas());
        System.out.println("keliling persegi:" + A.getKeliling());

        buku buku1 = new buku("Dedi", "Budaya Indonesia", 30000, 3);
        buku buku2 = new buku("Malika", "Kesenian Sunda", 50000, 1);

        double totalPrice = buku1.buybuku(3) + buku2.buybuku(3);
        System.out.println("Total Harga yang harus dibayar Rp." + totalPrice);
    }
}