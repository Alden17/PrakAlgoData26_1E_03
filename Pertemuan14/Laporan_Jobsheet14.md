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
