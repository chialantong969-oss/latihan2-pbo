
// Kelas untuk menghitung nilai mahasiswa
class StudentGrader {

    public double hitungNilaiAkhir(double tugas, double uts, double uas) {
        return (tugas * 0.3) + (uts * 0.3) + (uas * 0.4);
    }
}

// Kelas untuk mencetak laporan
class ReportPrinter {

    public void cetakLaporan(String nama, double nilai) {
        System.out.println(
            "Laporan Nilai Mahasiswa: " + nama + " = " + nilai
        );
    }
}

// Kelas untuk menyimpan data
class StudentRepository {

    public void simpanDatabase(String nama, double nilai) {
        System.out.println(
            "Menyimpan ke database: " + nama + " = " + nilai
        );
    }
}

// Program utama
public class latihan2 {

    public static void main(String[] args) {

        StudentGrader grader = new StudentGrader();
        ReportPrinter printer = new ReportPrinter();
        StudentRepository repository = new StudentRepository();

        // Menghitung nilai akhir
        double nilai = grader.hitungNilaiAkhir(80, 85, 90);

        // Mencetak laporan nilai
        printer.cetakLaporan("Andi", nilai);

        // Menyimpan data mahasiswa
        repository.simpanDatabase("Andi", nilai);
    }
}
