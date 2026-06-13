//// Package program
//package oop.soal1;
//
///*
//  Deklarasi class bernama Mahasiswa dan deklarasi variabel/attribute yang berhubungan dengan mahasiswa
//  Access modifier variabel/attribute diatur menjadi private
// */
//class Mahasiswa {
//	private String nama;	
//	private String nim;
//	private String jurusan;
//	private double ipk;
//	
//	// Constructor class Mahasiswa
//	public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
//		this.nama = nama;
//		this.nim = nim;
//		this.jurusan = jurusan;
//		this.ipk = ipk;
//	}
//	
//	// Deklarasi method tampilkanInfo()
//	public void tampilkanInfo() {
//		System.out.println("Nama    : " + nama);
//		System.out.println("NIM     : " + nim);
//		System.out.println("Jurusan : " + jurusan);
//		System.out.printf("IPK     : %.2f%n%n", ipk);
//	}
//}
//
//// Class Main
//public class Main {
//	public static void main(String[] args) {
//		
//		// Membuat object (instansiasi) dari class Mahasiswa
//		Mahasiswa mhsw1 = new Mahasiswa("Andi Pratama", "2440001", "Teknik Informatika", 3.75);
//		Mahasiswa mhsw2 = new Mahasiswa("Budi Santoso", "2440002", "Sistem Informasi", 3.40);
//		Mahasiswa mhsw3 = new Mahasiswa("Citra Lestari", "2440003", "Teknik Informatika", 3.90);
//		Mahasiswa mhsw4 = new Mahasiswa("Joni Suhartono", "2440004", "Teknik Industri", 3.00);
//		Mahasiswa mhsw5 = new Mahasiswa("Bulan Suci", "2440005", "Akuntansi", 3.20);
//
//		// Menampilkan info mahasiswa
//		System.out.println("=== Data Mahasiswa ===");
//		System.out.println();
//
//		// Memanggil method tampilkanInfo()
//		mhsw1.tampilkanInfo();
//		mhsw2.tampilkanInfo();
//		mhsw3.tampilkanInfo();
//		mhsw4.tampilkanInfo();
//		mhsw5.tampilkanInfo();
//	}
//}

// Program jika menggunakan loop (for)

//Package program
package oop.soal1;

/*
Deklarasi class bernama Mahasiswa dan deklarasi variabel/attribute yang berhubungan dengan mahasiswa
Access modifier variabel/attribute diatur menjadi private
*/
class Mahasiswa {
	private String nama;
	private String nim;
	private String jurusan;
	private double ipk;
	
	// Constructor class Mahasiswa
	public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
		this.nama = nama;
		this.nim = nim;
		this.jurusan = jurusan;
		this.ipk = ipk;
	}
	
	// Deklarasi method tampilkanInfo()
	public void tampilkanInfo() {
		System.out.println("Nama    : " + nama);
		System.out.println("NIM     : " + nim);
		System.out.println("Jurusan : " + jurusan);
		System.out.printf("IPK     : %.2f%n%n", + ipk);
	}
}

//Class Main
public class Main {
	public static void main(String[] args) {
		
		// Membuat array yang bisa menyimpan 5 nilai 
		Mahasiswa[] daftar = new Mahasiswa[5];
		
		// Pembuatan object (instansiasi) dari class Mahasiswa
		daftar[0] = new Mahasiswa("Andi Pratama", "2440001", "Teknik Informatika", 3.75);
		daftar[1] = new Mahasiswa("Budi Santoso", "2440002", "Sistem Informasi", 3.40);
		daftar[2] = new Mahasiswa("Citra Lestari", "2440003", "Teknik Informatika", 3.90);
		daftar[3] = new Mahasiswa("Joni Suhartono", "2440004", "Teknik Industri", 3.00);
		daftar[4] = new Mahasiswa("Bulan Suci", "2440005", "Akuntansi", 3.20);
		
		// Menampilkan info mahasiswa
		System.out.println("=== Data Mahasiswa ===");
		System.out.println();
		
		// Memanggil method tampilkanInfo()
		for(Mahasiswa mhs : daftar ) {
			mhs.tampilkanInfo();
		}
	}
}