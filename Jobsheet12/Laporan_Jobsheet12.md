**Percobaan 1**
<img width="445" height="885" alt="image" src="https://github.com/user-attachments/assets/cc61d58b-3166-48bf-a4e4-389d5e671f62" />

**Jawaban Pertanyaan Percobaan 1**
1. Single Linked List hanya memiliki satu pointer yaitu next sehingga traversal hanya dapat dilakukan dari depan ke belakang, sedangkan Double Linked List memiliki dua pointer yaitu next dan prev sehingga traversal dapat dilakukan dua arah yaitu dari depan ke belakang maupun dari belakang ke depan serta lebih mudah dalam proses penyisipan dan penghapusan node.
2. Atribut next digunakan untuk menunjuk node berikutnya sehingga proses traversal maju dapat dilakukan, sedangkan atribut prev digunakan untuk menunjuk node sebelumnya sehingga traversal mundur dapat dilakukan dan mempermudah manipulasi node seperti penyisipan maupun penghapusan data.
3. Konstruktor pada class DoubleLinkedList berfungsi untuk menginisialisasi nilai head dan tail menjadi null sehingga linked list berada dalam kondisi kosong dan siap digunakan untuk proses penambahan node pertama.
4. Karena saat linked list kosong lalu ditambahkan satu node pertama, node tersebut menjadi satu-satunya data yang ada sehingga otomatis berperan sebagai node pertama (head) sekaligus node terakhir (tail).
5. Method print() dimodifikasi dengan menambahkan pengecekan menggunakan isEmpty(), sehingga ketika linked list kosong program akan menampilkan pesan "Linked List masih kosong" dan traversal tidak dijalankan.
6.!Method printReverse() dibuat dengan memulai traversal dari node tail lalu bergerak mundur menggunakan pointer prev hingga mencapai head, sehingga seluruh data dapat ditampilkan secara terbalik dari belakang ke depan.
<img width="589" height="261" alt="image" src="https://github.com/user-attachments/assets/69a1e2a9-3c02-4e01-affc-ae7a7d6e7a57" />

**Percobaan 2**
<img width="432" height="571" alt="image" src="https://github.com/user-attachments/assets/2c7c9634-94fc-4ace-950e-046221e9b8ff" />

**Jawaban Pertanyaan Percobaan 2**
1. Statement head = head.next berfungsi memindahkan posisi head ke node berikutnya setelah node pertama dihapus, sedangkan head.prev = null berfungsi memutus hubungan node baru dengan node lama agar node yang dihapus benar-benar terlepas dari linked list.
2. <img width="393" height="253" alt="image" src="https://github.com/user-attachments/assets/fce8d0df-b33b-4736-87ce-7cee673b447c" />

**Tugas**
1. <img width="462" height="556" alt="image" src="https://github.com/user-attachments/assets/ab328825-47d2-430b-bf3d-1c8d328aad5a" />

2. <img width="517" height="456" alt="image" src="https://github.com/user-attachments/assets/5fbfbba0-c4ce-4be2-974a-55b4dbe8ae14" />

3. <img width="478" height="617" alt="image" src="https://github.com/user-attachments/assets/ed043751-9257-4341-9412-37e0246a5bd5" />

4. <img width="554" height="659" alt="image" src="https://github.com/user-attachments/assets/c180b9dd-2a52-4aba-819d-59c8409347c3" />

5. <img width="261" height="230" alt="image" src="https://github.com/user-attachments/assets/cd2dd65e-5ebe-4e4e-8692-107e284dba79" />

