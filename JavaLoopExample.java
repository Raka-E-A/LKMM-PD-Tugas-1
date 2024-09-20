public class JavaLoopExample {

    public static void main(String[] args) {

        // Contoh 1: Perulangan "For"
        // Struktur perulangan for terdiri dari 3 bagian:
        // 1. Inisialisasi (int i = 0) - Nilai awal dari variabel perulangan.
        // 2. Kondisi (i < 5) - Selama kondisi ini benar (true), perulangan akan terus berjalan.
        // 3. Increment/Decrement (i++) - Setelah setiap iterasi, nilai i ditambah 1.
        System.out.println("Perulangan For:");
        for (int i = 0; i < 5; i++) {
            // Setiap kali perulangan berjalan, kode di dalam blok ini akan dieksekusi.
            System.out.println("Nilai i: " + i);
        }






        // Contoh 2: Perulangan "While"
        // Perulangan while mengevaluasi kondisi terlebih dahulu, jika benar, maka blok kode akan dijalankan.
        System.out.println("\nPerulangan While:");
        int j = 0; // Inisialisasi variabel j
        while (j < 5) {
            // Selama j < 5, perulangan ini akan terus berjalan.
            System.out.println("Nilai j: " + j);
            j++; // Increment nilai j setelah setiap iterasi.
        }







        // Contoh 3: Perulangan "Do-While"
        // Do-while berbeda dari while karena ia selalu menjalankan blok kode setidaknya sekali,
        // sebelum mengevaluasi kondisi.
        System.out.println("\nPerulangan Do-While:");
        int k = 0; // Inisialisasi variabel k
        do {

            // Blok kode ini dijalankan terlebih dahulu.
            System.out.println("Nilai k: " + k);
            k++; // Increment nilai k
        } while (k < 5); // Setelah blok kode dijalankan, kondisi ini dievaluasi.







        // Contoh 4: Perulangan "F"or-Each"
        // For-each digunakan untuk iterasi melalui elemen-elemen dalam array atau koleksi.
        System.out.println("\nPerulangan For-Each:");

        int[] angka = {1, 2, 3, 4, 5}; // Inisialisasi array angka
        for (int num : angka) {

            // Setiap elemen dalam array angka akan disimpan sementara dalam variabel num(0).
            System.out.println("Angka: " + num);
        }
    }
}
