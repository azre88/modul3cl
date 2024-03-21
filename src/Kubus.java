import java.util.Scanner;

public class Kubus extends BangunRuang{
    Scanner scanner = new Scanner(System.in);
    private double tinggi;
    private double hasil;


    public Kubus(String name) {
        super(name);
    }

    @Override
    public void inputNilai(){
        super.inputNilai();
        System.out.println("Input tinggi: ");
        tinggi = scanner.nextDouble();
    }

    @Override
    public void luasPermukaan()  {
        double hasil = 6 * tinggi * tinggi;
        super.luasPermukaan();
        System.out.println("Hasil luas permukaan: " + hasil);
    }

    @Override
    public void volume(){
        hasil = Math.pow(tinggi, 3);
        super.volume();
        System.out.println("Hasil volume: " + hasil);
    }
}
