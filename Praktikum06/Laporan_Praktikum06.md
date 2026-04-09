
**Praktikum 1**
<img width="799" height="566" alt="image" src="https://github.com/user-attachments/assets/9c948ba9-6e6c-40cc-bfbb-92a906df41ee" />

<img width="675" height="838" alt="image" src="https://github.com/user-attachments/assets/380f3cda-080a-4627-9549-e4703dff4bf9" />

Output
<img width="709" height="903" alt="image" src="https://github.com/user-attachments/assets/59241f13-5350-4f06-a4ea-01a88f2244bb" />

**Pertanyaan Praktikum 1**
1. tampilPosisi: menampilkan letak/index data yang ditemukan, tampilDataSearch: menampilkan isi lengkap data mahasiswa (nim, nama, kelas, ipk)
2. break digunakan untuk menghentikan perulangan saat data sudah ditemukan supaya tidak lanjut mengecek data berikutnya.
3. Variabel pos digunakan untuk: Menyimpan indeks/posisi data yang ditemukan, Menentukan apakah data ketemu atau tidak
4. Data pertama yang ditemukan, Karena pencarian berhenti saat ketemu pertama kali.
5. Program akan tetap mencari sampai akhir array, Jika ada data sama:yang tersimpan adalah data terakhir, Program jadi lebih lama (tidak efisien)

**Praktikum 2**
<img width="460" height="291" alt="image" src="https://github.com/user-attachments/assets/6fa43945-3430-4400-affa-5a4638c9e88d" />

<img width="654" height="814" alt="image" src="https://github.com/user-attachments/assets/d750b20b-0c84-4a45-8df8-3ae8c5bd7664" />

Output
<img width="765" height="875" alt="image" src="https://github.com/user-attachments/assets/49af6d29-85b0-46be-a33a-dc24ac4b7a0d" />

**Pertanyaan Praktikum 2**
1. Divide terjadi saat: mid = (left + right) / 2; Ini membagi data menjadi dua bagian.
2. Conquer terjadi saat:
  if (cari < listMhs[mid].ipk) {
      right = mid - 1;
  } else {
      left = mid + 1;
  } Menentukan mau cari ke kiri atau kanan.
3. left: batas kiri pencarian, right: batas kanan pencarian, mid: posisi tengah (yang dicek)
4. Tidak bisa bekerja dengan benar, Karena binary search harus data terurut supaya bisa membagi data dengan tepat.
5. Hasilnya tidak sesuai karena kode di modul dirancang untuk data yang terurut membesar (ascending). Saat array tersusun mengecil (descending), posisi nilai yang lebih besar dan lebih kecil terbalik, sehingga pencarian akan gagal.
6. inary search mendeteksi bahwa data tidak ada ketika batas pencarian sebelah kiri (left) nilainya sudah melewati batas pencarian sebelah kanan (right), yang berarti rentang area pencarian sudah habis.
7. <img width="536" height="163" alt="image" src="https://github.com/user-attachments/assets/629c0598-9374-4b5f-a80d-bc15d8eaac46" />

   <img width="433" height="878" alt="image" src="https://github.com/user-attachments/assets/6c7cc953-0654-405d-9fba-d5f578aeab36" />
