//// Package program
//package oop.soal3;
//
//// Import library Scanner
//import java.util.Scanner;
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
//	// Deklarasi method cekKelulusan() untuk menampilkan status kelulusan
//	public String cekKelulusan() {
//		if (ipk >= 3.00) {
//			return "Lulus";
//		} else {
//			return "Tidak Lulus";
//		}
//	}
//	
//	// Getter untuk mengambil nilai NIM
//	public String getNim() {
//		return nim;
//	}
//	
//	// Getter untuk mengambil nilai IPK
//	public double getIpk() {
//		return ipk;
//	}
//	
//	// Deklarasi method updateIpk() sebagai setter untuk memperbarui nilai IPK
//	public void updateIpk(double ipkBaru) {
//		this.ipk = ipkBaru;
//	}
//	
//	// Deklarasi method hitungPredikat() untuk menentukan predikat akademik mahasiswa
//	public String hitungPredikat() {
//		if (ipk >= 3.75) {
//			return "Dengan Pujian";
//		} else if (ipk >= 3.50) {
//			return "Sangat Memuaskan";
//		} else if (ipk >= 3.00) {
//			return "Memuaskan";
//		} else {
//			return "Perlu Perbaikan";
//		}
//	}
//	
//	// Deklarasi method tampilkanInfo()
//	public void tampilkanInfo() {
//		System.out.println("Nama     : " + nama);
//		System.out.println("NIM      : " + nim);
//		System.out.println("Jurusan  : " + jurusan);
//		System.out.printf("IPK      : %.2f%n%n", ipk);
//		System.out.println("Status   : " + cekKelulusan());
//		System.out.println("Predikat : " + hitungPredikat());
//		System.out.println("===============================");
//	}
//}
//
//// Class Main
//public class Main {
//	public static void main(String[] args) {
//		
//		// Inisialisasi Scanner
//		Scanner input = new Scanner(System.in);
//		
//		// Membuat array yang bisa menyimpan 5 nilai 
//		Mahasiswa[] daftar = new Mahasiswa[5];
//		
//		// Pembuatan object (instansiasi) dari class Mahasiswa
//		daftar[0] = new Mahasiswa("Andi Pratama", "2440001", "Teknik Informatika", 3.75);
//		daftar[1] = new Mahasiswa("Budi Santoso", "2440002", "Sistem Informasi", 3.40);
//		daftar[2] = new Mahasiswa("Citra Lestari", "2440003", "Teknik Informatika", 3.90);
//		daftar[3] = new Mahasiswa("Joni Suhartono", "2440004", "Teknik Industri", 3.00);
//		daftar[4] = new Mahasiswa("Bulan Suci", "2440005", "Akuntansi", 3.20);
//		
//		// Memasukkan NIM mahasiswa
//		System.out.print("Masukkan NIM mahasiswa yang ingin diupdate : ");
//		String updateNim = input.nextLine();
//		
//		// Memasukkan nilai IPK baru
//		System.out.print("Masukkan IPK baru : ");
//		double ipkBaru = input.nextDouble();
//		
//		// Deklarasi variabel terupdate untuk menyimpan nilai IPK baru
//		Mahasiswa ipkTerupdate = null;
//		
//		// Mengupdate nilai IPK dan status kelulusan
//		for(Mahasiswa mhsw : daftar) {
//			if (mhsw.getNim().equals(updateNim)) {
//				mhsw.updateIpk(ipkBaru);
//				ipkTerupdate = mhsw;
//				break;
//			}
//		}
//		
//		// Menampilkan info mahasiswa
//		if (ipkTerupdate != null) {
//			System.out.println("Data berhasil diperbarui!\n");
//			System.out.println("=== Data Mahasiswa ===");
//			ipkTerupdate.tampilkanInfo();
//		} else {
//			System.out.println("NIM tidak ada\n");
//		}
//		
//		// Menutup input
//		input.close();
//	}
//}

// Jika program ingin terus menerima input dari pengguna

//Package program
package oop.soal3;

//Import library Scanner
import java.util.Scanner;

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
	
	// Deklarasi method cekKelulusan() untuk menampilkan status kelulusan
	public String cekKelulusan() {
		if (ipk >= 3.00) {
			return "Lulus";
		} else {
			return "Tidak Lulus";
		}
	}
	
	// Getter untuk mengambil nilai NIM
	public String getNim() {
		return nim;
	}
	
	// Getter untuk mengambil nilai IPK
	public double getIpk() {
		return ipk;
	}
	
	// Deklarasi method updateIpk() sebagai setter untuk memperbarui nilai IPK
	public void updateIpk(double ipkBaru) {
		this.ipk = ipkBaru;
	}
	
	// Deklarasi method hitungPredikat() untuk menentukan predikat akademik mahasiswa
	public String hitungPredikat() {
		if (ipk >= 3.75) {
			return "Dengan Pujian";
		} else if (ipk >= 3.50) {
			return "Sangat Memuaskan";
		} else if (ipk >= 3.00) {
			return "Memuaskan";
		} else {
			return "Perlu Perbaikan";
		}
	}
	
	// Deklarasi method tampilkanInfo()
	public void tampilkanInfo() {
		System.out.println("Nama     : " + nama);
		System.out.println("NIM      : " + nim);
		System.out.println("Jurusan  : " + jurusan);
		System.out.printf("IPK      : %.2f%n%n", ipk);
		System.out.println("Status   : " + cekKelulusan());
		System.out.println("Predikat : " + hitungPredikat());
		System.out.println("===============================");
	}
}

//Class Main
public class Main {
	public static void main(String[] args) {
		
		// Inisialisasi Scanner
		Scanner input = new Scanner(System.in);
		
		// Membuat array yang bisa menyimpan 5 nilai 
		Mahasiswa[] daftar = new Mahasiswa[5];
		
		// Pembuatan object (instansiasi) dari class Mahasiswa
		daftar[0] = new Mahasiswa("Andi Pratama", "2440001", "Teknik Informatika", 3.75);
		daftar[1] = new Mahasiswa("Budi Santoso", "2440002", "Sistem Informasi", 3.40);
		daftar[2] = new Mahasiswa("Citra Lestari", "2440003", "Teknik Informatika", 3.90);
		daftar[3] = new Mahasiswa("Joni Suhartono", "2440004", "Teknik Industri", 3.00);
		daftar[4] = new Mahasiswa("Bulan Suci", "2440005", "Akuntansi", 3.20);
		
		// Loop supaya program berjalan terus untuk menerima input 
		while(true) {
			
			// Memasukkan NIM mahasiswa
			System.out.print("Masukkan NIM mahasiswa yang ingin diupdate : ");
			String updateNim = input.nextLine();
			
			// Memaksa program untuk berhenti ketika pengguna memasukkan kata EXIT
	        if (updateNim.equalsIgnoreCase("EXIT")) {
	            System.out.println("Program selesai.");
	            break;
	        }
			
			// Memasukkan nilai IPK baru
			System.out.print("Masukkan IPK baru : ");
			double ipkBaru = input.nextDouble();
			input.nextLine();
			
			// Deklarasi variabel terupdate untuk menyimpan nilai IPK baru
			Mahasiswa ipkTerupdate = null;
			
			// Mengupdate nilai IPK dan status kelulusan
			for(Mahasiswa mhsw : daftar) {
				if (mhsw.getNim().equals(updateNim)) {
					mhsw.updateIpk(ipkBaru);
					ipkTerupdate = mhsw;
					break;
				}
			}
			
			// Menampilkan info mahasiswa
			if (ipkTerupdate != null) {
				System.out.println("Data berhasil diperbarui!\n");
				System.out.println("=== Data Mahasiswa ===");
				ipkTerupdate.tampilkanInfo();
			} else {
				System.out.println("NIM tidak ada\n");
			}
			
		}
		
		// Menutup input
		input.close();
	}				
}