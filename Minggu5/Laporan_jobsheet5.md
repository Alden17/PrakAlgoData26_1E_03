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
