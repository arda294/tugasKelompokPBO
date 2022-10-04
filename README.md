# tugasKelompokPBO

Anggota :
1. Ferza Noveri 5025211097
2. Dimas Aria Pujangga 5025211212
3. Ketut Arda Putra Mahotama Sadha 5025211235

Soal Kelompok 6
Deskripsi: Seorang customer ingin membuat sistem rental mobil. Dalam rental mobil, terdapat beberapa jenis mobil seperti Innova, Brio dan Avanza dengan harga sewa yang berbeda tiap jenis. Pelanggan yang ingin menyewa mobil perlu menunjukkan nama, alamat dan NIK untuk proses transaksi. Jika customer mengembalikan mobil lebih dari waktu yang ditentukan, maka akan dikenai denda per jam.

- Casting/Conversion	: tanggal peminjaman double -> int
- Constructor	: Class : Mobil, Innova, Brio, Avanza
- Overloading	: Constructor Sewa(Pelanggan plg, String mobil, int tglPinjam, int tglPengembalian)
                            Sewa(Pelanggan plg, String mobil, int tglPinjam) untuk peminjaman satu hari
- Overriding	: printMobil() pada superclass Mobil akan return string "Mobil Generic"
                printMobil() pada subclass Innova akan return string "Toyota Kijang Innova"
                printMobil() pada subclass Brio akan return string "Honda Brio"
                printMobil() pada subclass Avanza akan return string "Toyota Avanza"
- Encapsulation	: Setiap field setiap class private.
- Inheritance	: Superclass Mobil memiliki Child class -> Innova, Brio, Avanza
- Polymorphism	: Superclass Mobil digunakan sebagai penampung Child classnya seperti Mobil = new Innova();
