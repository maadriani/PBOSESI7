public class App{
    public static void main(String[] args) throws Exception {
        Mahasiswa<String, Double>mhs = new Mahasiswa<String, Double>("Arul", "JawaBarat", 1234567.0);

        mhs.print();

        Libmath<Integer, Double>math = new Libmath<Integer, Double>(10, 20.0);
        System.out.println("Hasil penjumlahan: " + math.add());

        LibmathL<Double, Double>math2 = new Libmath<Double, Double>(10.0, 20.0);
        System.out.println("Hasil pengurangan: " + math2.sub());

        Triangel.hitungLuas(10, 20);
        System.out.print(Triangel.hitungKeliling(10, 20));

    }
}