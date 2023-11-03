# tukas-coding-2
tugas coding 2 
## 1. _Project Overview_
memahami suatu program adlah hal yang sangat di perlukan di waktu sekarang. oleh karena itu kita sangat perlu belajar mengenai tipe tipe data dalam program 
dan sekarang saya membuat beberapa tipe data dalam program java sebagai tugas coding.

## 2. _penjelasan program "main"_
### 2.1 _package tugasliokusnata_
adalah pernyataan yang menentukan paket (package) yang digunakan untuk mengelompokkan kelas-kelas dalam proyek Java. Dalam hal ini, program ini berada dalam 
paket "tugasliokusnata."

### 2.2 _public class main_
adalah deklarasi kelas utama (main class) dalam program. Nama kelas harus sama dengan nama file Java, dan kelas ini akan berisi metode main yang akan 
dijalankan saat program dimulai.

### 2.3 _public statis void main (String [] args)_
adalah metode utama yang akan dieksekusi saat program dijalankan. Ini adalah titik masuk utama program Java. 
Parameter args adalah argumen baris perintah yang dapat diteruskan ke program.

### 2.4 _perulangan for_
Dalam perulangan for, variabel i mulai dari 1 hingga 100. Setiap iterasi dari perulangan mencetak nilai i menggunakan System.out.println(i);. 
Ini akan mencetak angka dari 1 hingga 100 di layar.

### 2.5 _system.out.print_
Setelah perulangan selesai, program mencetak tiga baris teks "lio kusnata" menggunakan System.out.println("lio kusnata");. 
Jadi, setelah mencetak angka dari 1 hingga 100, program mencetak teks "lio kusnata" tiga kali.

### 2.6 _tipe data_
Tipe data yang digunakan dalam program ini adalah int untuk variabel i, yang digunakan untuk menghitung angka dalam perulangan. 
Tipe data String digunakan untuk mencetak teks "lio kusnata."

## 3 _perulanganwhile_
While bisa kita artikan selama. Cara kerja perulangan ini seperti percabangan, ia akan melakukan perulangan selama kondisinya bernilai true . 
Penjelasan: kondisi bisa kita isi dengan perbandingan maupun variabel boolean.
### 3.1 _penjelasan program_
Program yang saya buat adalah program Java yang menggunakan perulangan while untuk mencetak angka-angka kelipatan 5 hingga batas maksimum yang 
diinputkan oleh pengguna. 

#### a. _penjelasan lebih detail_

package tugasliokusnata; adalah deklarasi paket (package) yang digunakan untuk mengelompokkan kelas-kelas dalam proyek Java. 
Dalam hal ini, program ini berada dalam paket "tugasliokusnata."

import java.util.Scanner; adalah pernyataan yang mengimpor kelas Scanner dari pustaka (library) Java java.util. Ini digunakan untuk menerima input dari pengguna.

public class perulanganwhile adalah deklarasi kelas yang diberi nama "perulanganwhile." Kelas ini berisi metode main yang akan dieksekusi saat program dimulai.

Di dalam metode main, program pertama-tama membuat objek Scanner untuk menerima input dari pengguna dengan pernyataan Scanner scanner = new Scanner(System.in);.

Program kemudian mencetak pesan "Masukkan batas maksimum: " dan menggunakan scanner.nextInt(); untuk membaca angka yang dimasukkan oleh 
pengguna dan menyimpannya dalam variabel batas.

Variabel angka diinisialisasi dengan nilai 5. Ini adalah angka awal yang akan digunakan dalam perulangan.

Selama nilai angka kurang dari atau sama dengan batas, program masuk ke dalam perulangan while.

Di dalam perulangan, program memeriksa apakah angka adalah kelipatan 5 dengan menggunakan kondisi if (angka % 5 == 0). Jika benar, 
program mencetak nilai angka dengan System.out.println(angka);.

Setelah mencetak angka, nilai angka ditambahkan dengan 5 (angka += 5;) sehingga program akan mencetak kelipatan 5 berikutnya pada iterasi berikutnya.

Setelah perulangan selesai, program menutup objek Scanner dengan scanner.close(); untuk membersihkan sumber daya.

Program yang saya buat hanya  akan mencetak semua kelipatan 5 mulai dari 5 hingga batas maksimum yang dimasukkan oleh pengguna.


## 4. _zodiac_ 
Zodiac berasal dari bahasa latin yaitu zodiacus yang berarti lingkaran hewan. Karena hal itu, sebagian besar nama dan lambang zodiac
adalah hewan. Sedangkan, menurut Kamus Besar Bahasa Indonesia (KBBI) zodiac berarti lingkaran khayal di langit yang berpusat di ekliptika 
dan dibagi menjadi dua belas tanda perbintangan. Dan jika kita ingin membuat program yang dapat menghasilkan zodiac kita sesuai tanggal dan bulan lahir maka 

### 4.1 _penjelasan program zodiac_
Program yang saya buat adalah program Java yang dimana akan meminta kita memasukkan tanggal lahir dalam format "hari-bulan," dan
kemudian menentukan zodiak berdasarkan tanggal lahir tersebut. 

#### a. _penjelasan lebih detail_
package tugasliokusnata; adalah pernyataan yang menunjukkan paket (package) tempat kelas ini berada.

import java.util.Scanner; adalah pernyataan untuk mengimpor kelas Scanner dari pustaka (library) Java java.util. Ini digunakan untuk menerima input dari pengguna.

Metode main adalah titik masuk utama program. Program pertama-tama membuat objek Scanner untuk menerima input dari pengguna.

Program mencetak pesan "Masukkan tanggal lahir Anda (hari-bulan): " dan menggunakan scanner.nextLine(); untuk membaca input pengguna dalam format "hari-bulan." 
Input ini disimpan dalam variabel input.

String input dipisahkan menjadi dua bagian (hari dan bulan) dengan menggunakan input.split("-");. Hasilnya disimpan dalam array parts.

Nilai day dan month diambil dari array parts dan diubah menjadi tipe data int menggunakan Integer.parseInt(parts[0]); dan Integer.parseInt(parts[1]);.

Selanjutnya, program memanggil metode getZodiac(day, month) untuk menentukan zodiak berdasarkan tanggal lahir yang telah diambil.

Metode getZodiac adalah metode yang menerima nilai day dan month dan mengembalikan zodiak yang sesuai. Ini dilakukan dengan menguji tanggal lahir 
terhadap rentang tanggal yang sesuai dengan setiap zodiak. Jika ada kecocokan, zodiak yang sesuai akan dikembalikan. Jika tidak ada kecocokan, 
metode ini mengembalikan null.

Hasil zodiak (jika ada) dicetak ke layar, dan jika tanggal lahir tidak valid (di luar rentang tanggal yang diperiksa), program mencetak "Tanggal lahir tidak valid."

Terakhir, program menutup objek Scanner untuk membersihkan sumber daya.

Program yang saya buat ini dpat  memungkinkan kita untuk memasukkan tanggal lahir kita dan mengetahui zodiak yang sesuai dengan tanggal lahir yang kita masukan tersebut.

## 5. _tipedataarray_
Tipe data array adalah tipe data terstruktur yang merujuk kepada sebuah atau sekumpulan elemen yang mempunyai tipe data yang sama melalui indeks. 
Array disimpan dengan urutan yang sesuai dengan definisi indeks secara kontigu (berurutan) dalam memori komputer.

### 5.1 _penjelasan program tipe data array_
Program yang saya buat dalam tipe data array kali ini adalah program Java yang menggunakan tipe data array untuk menyimpan dan mencetak daftar nama. 

#### a. _penjelasan lebih detail_

package tugasliokusnata; adalah pernyataan yang menunjukkan paket (package) tempat kelas ini berada.

public class tipedataarray adalah deklarasi kelas utama (main class) dalam program. Ini adalah kelas yang berisi metode main yang akan dieksekusi saat program dimulai.

Di dalam metode main, program membuat array nama yang menyimpan daftar nama dalam bentuk string. Array ini diinisialisasi dengan empat nama.

Program menggunakan perulangan for untuk mengulang sebanyak panjang array nama (jumlah elemen dalam array). Variabel i digunakan sebagai penghitung indeks array.

Pada setiap iterasi perulangan, program mencetak pesan yang berisi nomor urut nama dan nama itu sendiri. "Nama ke-" + (i + 1) digunakan untuk mencetak nomor 
urut yang dimulai dari 1, dan nama[i] digunakan untuk mencetak nama yang sesuai dengan indeks saat ini.

Hasil cetakan akan menampilkan daftar nama beserta nomor urutnya.


## Daftra Pustaka

[1] [ahmad muhardian. 2016. https://www.petanikode.com/. Belajar Java: Memahami 2 Jenis Perulangan dalam Java. tersedia di:https://www.petanikode.com/java-perulangan/])

[2] [debbbyani nurinda. 2023. https://www.sonora.id/. Apa Itu Zodiak dan Macamnya Berdasarkan Bulan dan Tanggal Lahir. tersedia di : 
https://www.sonora.id/read/423804779/apa-itu-zodiak-dan-macamnya-berdasarkan-bulan-dan-tanggal-
lahir#:~:text=Zodiak%20berasal%20dari%20bahasa%20latin,menjadi%20dua%20belas%20tanda%20perbintangan.]

[3] [murhardian ahmad. 2016. https://www.petanikode.com/. Belajar Java: Menggunakan Array untuk Menyimpan Banyak Hal. tersedia di: https://www.petanikode.com/java-array/]
