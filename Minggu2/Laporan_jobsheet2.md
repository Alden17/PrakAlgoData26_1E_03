Percobaan 2.1

<img width="551" height="767" alt="image" src="https://github.com/user-attachments/assets/1ac1df83-e07b-40ae-bc98-ce20a2b572ba" />

**Output**

<img width="543" height="78" alt="image" src="https://github.com/user-attachments/assets/7d3470ce-6d29-4e83-a633-3d328850a98b" />

Pertanyaan 2.1.3
1. Sebutkan dua karakteristik class atau object!
2. Perhatikan class Mahasiswa pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class
Mahasiswa? Sebutkan apa saja atributnya!
3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!
4. Perhatikan method updateIpk() yang terdapat di dalam class Mahasiswa. Modifikasi isi method
tersebut sehingga IPK yang dimasukkan valid yaitu terlebih dahulu dilakukan pengecekan apakah
IPK yang dimasukkan di dalam rentang 0.0 sampai dengan 4.0 (0.0 <= IPK <= 4.0). Jika IPK tidak
pada rentang tersebut maka dikeluarkan pesan: "IPK tidak valid. Harus antara 0.0 dan 4.0".
5. Jelaskan bagaimana cara kerja method nilaiKinerja() dalam mengevaluasi kinerja mahasiswa,
kriteria apa saja yang digunakan untuk menentukan nilai kinerja tersebut, dan apa yang
dikembalikan (di-return-kan) oleh method nilaiKinerja() tersebut?

Jawaban 2.1.3
1. Dua karakteristik objek adalah Atribut dan method
2. Jumlah atribut dalam class mahasiswa03 adalah 4 yaitu nama, nim, ipk, kelas
3. Memiliki 3 method yaitu tampilData(), updateIpk(), nilaiKinerja()
4. <img width="469" height="266" alt="image" src="https://github.com/user-attachments/assets/9d03a393-0eb0-40f4-b064-0abc2ede4664" />

5. cara kerja method nilaiKinerja() yaitu akan membaca nilaiIpk yang diinputkan dan mengevaluasi sesuai kondisi if-else yang telah ada, dan akan menentukan nilai kinerja dan akan mengembalikan (return) hasil berupa string

Percobaan 2.2

<img width="440" height="349" alt="image" src="https://github.com/user-attachments/assets/49f9af06-99fc-4110-9fb1-84fba711db57" />

Output

<img width="264" height="192" alt="image" src="https://github.com/user-attachments/assets/4b9331f5-6488-40e7-8dc8-b0c7e2a1478d" />

Pertanyaan 2.2.3
1. Pada class MahasiswaMain, tunjukkan baris kode program yang digunakan untuk proses
instansiasi! Apa nama object yang dihasilkan?
2. Bagaimana cara mengakses atribut dan method dari suatu objek?
3. Mengapa hasil output pemanggilan method tampilkanInformasi() pertama dan kedua berbeda?

Jawaban 2.2.3
1. <img width="407" height="26" alt="image" src="https://github.com/user-attachments/assets/68998591-90b9-47d6-91b2-f28475be7975" />
2. Cara mengaksesnya yaitu dengan menuliskan nama object disertai titik(.) dan dilanjutkan dengan nama atribut atau method
3. karena setelah dilakukan pemanggilan pertama terdapat modifikasi pada atribut yang dilakukan oleh objek sebelum dilakukan pemanggilan kedua

Percobaan 2.3

<img width="1600" height="843" alt="image" src="https://github.com/user-attachments/assets/7dcebd79-55e2-477e-a9a9-65cecc1a1eb5" />

<img width="933" height="455" alt="image" src="https://github.com/user-attachments/assets/ab705884-91eb-46cf-b3cc-3d12b2f55211" />

Output

<img width="250" height="288" alt="image" src="https://github.com/user-attachments/assets/0b0bdc71-e76b-4c24-955a-2cba640601e9" />

Pertanyaan 2.3.3

1. Pada class Mahasiswa di Percobaan 3, tunjukkan baris kode program yang digunakan untuk
mendeklarasikan konstruktor berparameter!
2. Perhatikan class MahasiswaMain. Apa sebenarnya yang dilakukan pada baris program
berikut?
!<img width="801" height="25" alt="image" src="https://github.com/user-attachments/assets/bf27b8c5-f2e6-4134-a1d2-d2bed93dca6e" />

3. Hapus konstruktor default pada class Mahasiswa, kemudian compile dan run program.
Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian
4. Setelah melakukan instansiasi object, apakah method di dalam class Mahasiswa harus diakses
secara berurutan? Jelaskan alasannya!
5. Buat object baru dengan nama mhs<NamaMahasiswa> menggunakan konstruktor
berparameter dari class Mahasiswa!

Jawaban 2.3.3

1.<img width="544" height="118" alt="image" src="https://github.com/user-attachments/assets/cb3d7af9-5a57-428c-b556-008993d9c71f" />
  Pada baris ke 14-19
2. Pada baris berikut dilakukan instansiasi object sekaligus instalisasi atribut dan method objek tersebut 
3. Jika konstruktor default dihapus maka akan terjadi error dikarenakan pada class mahasiswaMain masih terdapat pemanggilan new Mahasiswa
4. Tidak harus diakses secara berurutan, karena semua object bisa dipanggil secara bebas
5. Code


<img width="996" height="496" alt="image" src="https://github.com/user-attachments/assets/0aa5cef7-99f7-45ea-ae52-9ff90668b3f2" />

Output
<img width="230" height="289" alt="image" src="https://github.com/user-attachments/assets/0dd692a4-47c8-4037-a8af-bd82d45c5866" />
