**Praktikum 1**

<img width="512" height="404" alt="image" src="https://github.com/user-attachments/assets/ed99e548-e5da-4839-b51e-ad474f45b86e" />

<img width="912" height="324" alt="image" src="https://github.com/user-attachments/assets/82bb7386-0a9c-4687-832a-7b8decb0be9a" />

Output

<img width="336" height="84" alt="image" src="https://github.com/user-attachments/assets/fcdff0c2-ef00-4078-949b-aeca2ed43506" />

**Pertanyaan Praktikum 1**
1. if : kondisi berhenti (base case), misalnya saat n = 1
else : menjalankan rekursi untuk menghitung n × faktorial(n-1)
2. Memungkinkan, misalnya memakai while karena sama-sama melakukan pengulangan sampai n. Buktinya: int faktorialBF(int n){
    int fakto = 1;
    int i = 1;

    while(i <= n){
        fakto = fakto * i;
        i++;
    }

    return fakto;
}
3. fakto *= i; → perkalian menggunakan perulangan (Brute Force)
   n * faktorialDC(n-1); → perkalian menggunakan rekursi (Divide and Conquer)
4. BF = menghitung dengan loop.
   DC = menghitung dengan rekursi.
   
**Praktikum 2**

<img width="951" height="536" alt="image" src="https://github.com/user-attachments/assets/5f1f8afa-eb8b-4bb1-97d7-5bb5ebe277fb" />

<img width="690" height="618" alt="image" src="https://github.com/user-attachments/assets/8380864e-f887-41ee-8c01-ebefcd46c95a" />

Output

<img width="341" height="232" alt="image" src="https://github.com/user-attachments/assets/c3687b8c-c3ef-48d5-8dad-cea94d4c598f" />

**Pertanyaan Praktikum 2**
1. pangkatBF() menghitung pangkat menggunakan perulangan (loop) dengan mengalikan angka berulang kali
   pangkatDC() menghitung pangkat menggunakan rekursi Divide and Conquer dengan membagi pangkat menjadi bagian yang lebih kecil
2. Ya, sudah ada. Tahap combine terjadi saat mengalikan hasil rekursi. <img width="425" height="26" alt="image" src="https://github.com/user-attachments/assets/3aca9776-895f-40a5-bfd8-84348fbb954a" />

3. Parameter tidak selalu diperlukan, karena di dalam class sudah ada atribut nilai dan pangkat.
   Method bisa dibuat tanpa parameter
4. pangkatBF() → menghitung pangkat dengan perkalian berulang menggunakan loop.
   pangkatDC() → menghitung pangkat dengan rekursi yang membagi masalah menjadi lebih kecil lalu menggabungkan hasilnya
   
**Praktikum 3**

<img width="553" height="586" alt="image" src="https://github.com/user-attachments/assets/17bf9cde-a5d1-4dc9-83e2-d9c7916947e0" />

<img width="1006" height="479" alt="image" src="https://github.com/user-attachments/assets/8b61a090-59d8-4c6e-b358-28f3f51ae9c7" />

Output

<img width="459" height="164" alt="image" src="https://github.com/user-attachments/assets/37261bf5-339a-413d-8af0-d3aff62f6fc6" />

**Pertanyaan Praktikum 3**
1. Variabel mid digunakan untuk membagi array menjadi dua bagian, yaitu bagian kiri dan bagian kanan agar bisa diproses dengan metode Divide and Conquer.
2. Statement tersebut digunakan untuk menghitung jumlah pada bagian kiri dan bagian kanan array secara rekursif.
3. Agar mendapatkan total seluruh nilai array, keduanya harus dijumlahkan.
4. Base case dari totalDC() adalah l == r
5. Method totalDC() bekerja dengan membagi array menjadi dua bagian, menghitung jumlah masing-masing bagian secara rekursif, lalu menjumlahkan hasilnya untuk mendapatkan total keseluruhan.

**Tugas**

