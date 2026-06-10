**Percobaan 1**
<img width="674" height="899" alt="image" src="https://github.com/user-attachments/assets/9f8ac518-1e97-438e-950f-68ed30499530" />

**jawaban Pertanyaan Percobaan 1**
1. proses pencarian lebih efektif karena data tersusun berdasarkan aturan nilai yang lebih kecil berada di kiri dan yang lebih besar berada di kanan
2. Atribut left dan right digunakan untuk menyimpan referensi ke anak kiri dan anak kanan dari suatu node. Dengan atribut ini, node-node dalam tree dapat saling terhubung membentuk struktur pohon.
3. A. Atribut root berfungsi sebagai penunjuk ke node pertama atau node induk paling atas dalam Binary Tree. Semua proses traversal, pencarian, dan manipulasi data dimulai dari node root.
   B. Saat objek tree pertama kali dibuat, nilai root adalah null. Hal ini menunjukkan bahwa tree masih kosong dan belum memiliki node.
4. Jika tree masih kosong dan ditambahkan node baru, maka node tersebut langsung dijadikan sebagai root. Tidak diperlukan proses perbandingan karena belum ada node lain dalam tree.
5. Baris program tersebut digunakan untuk membandingkan nilai IPK mahasiswa yang akan ditambahkan dengan IPK pada node saat ini.
6. Saat menghapus node yang memiliki dua anak, sistem mencari node pengganti (successor) yang memiliki nilai terkecil pada subtree kanan. Method getSuccessor() membantu menemukan node pengganti tersebut sehingga struktur BST tetap valid setelah proses penghapusan dilakukan.

**Percobaan 2**
<img width="413" height="179" alt="image" src="https://github.com/user-attachments/assets/1228b2a6-aa86-4a51-b214-aac314d641b6" />

**Jawaban Pertanyaan Percobaan 2**
1. Atribut data digunakan untuk menyimpan node-node tree dalam array, sedangkan idxLast digunakan untuk menyimpan indeks terakhir yang berisi data.
2. Method populateData() digunakan untuk mengisi data tree ke dalam array dan menentukan indeks terakhir yang terisi.
3. Method traverseInOrder() digunakan untuk menelusuri dan menampilkan node tree dengan urutan left child, root, kemudian right child.
4. Jika suatu node berada pada indeks 2, maka left child berada pada indeks 5 dan right child berada pada indeks 6.
5. Statement int idxLast = 6 digunakan untuk menunjukkan bahwa indeks terakhir yang berisi data pada array adalah indeks ke-6.
6. Indeks 2idxStart+1 dan 2idxStart+2 digunakan karena pada representasi binary tree dalam array, anak kiri dan anak kanan suatu node selalu berada pada posisi tersebut.

**Tugas Praktikum**
1. <img width="687" height="537" alt="image" src="https://github.com/user-attachments/assets/50d44f36-5829-4cf3-8262-a0f1ab729ce3" />

2. <img width="677" height="740" alt="image" src="https://github.com/user-attachments/assets/bef41868-3fbc-4478-a0ac-09d4b9c872a1" />

3. <img width="630" height="744" alt="image" src="https://github.com/user-attachments/assets/390344fd-e3f4-4ce3-a597-ebfa7ea02791" />

4. <img width="569" height="913" alt="image" src="https://github.com/user-attachments/assets/203a5070-f81b-4e34-9c80-942cd2b6fdcb" />

**Output Binary Tree Main**
<img width="688" height="934" alt="image" src="https://github.com/user-attachments/assets/e64bdcc6-d0e6-465e-a683-d21596700b19" />

**Output Binary Tree Array Main**
<img width="441" height="175" alt="image" src="https://github.com/user-attachments/assets/95b0bcb3-9411-46d1-8997-30b0f327cf52" />





