PERCOBAAN 1
1. jika pada perulangan for, inisialisasi i=1 di ubah menjadi 0, apa akibatnya?
    jawab : program akan mencetak bintang sebanyak N + 1 kali.
           karene perulangan dimulai dari 0 dan  berhenti saat i <= N, maka total iterasi menjadi satu lebih banyak dari seharusnya.

2. jika perulangan for, kondisi i<=N diubah menjadi i>N, apa akibatnya? dan jelaskan.
    jawab : program tidak akan mencetak apa pun, karena kondisi awal i = 1 tidak memenuhi i > N. Loop tidak dijalankan sama sekali.

3. jika pada perulangan for, kondisi step i++ diubah menjadi i-- apa akibatnya? jelaskan.
    jawab : program akan mengalami infinite loop (tidak berhenti).
    Karena nilai i akan terus berkurang dan tidak akan pernah lebih besar dari N, kondisi i <= N selalu benar.


PERCOBAAN 2
1. perhatikan perulangan luar. Jika pada sintaks for, inisialisasi iOuter=1 diubah menjadi iOuter=0, apa yang akibatnya? jelaskan.
    jawab : program akan mencetak N + 1 baris bintang, karena loop luar berjalan satu kali lebih banyak.

2. kembalikan program semula dimana inisialisasi iOuter=1. kemudian perhatikan perulangan dalam, jika pada sintaks for, inisialisasi i=1 diubah        
   menjadi i=0, apa akibatnya? jelaskan.
    jawab : setiap baris akan berisi N + 1 bintang, karena perulangan dalam berjalan satu kali lebih banyak.

3. jadi, apakah perbedaan kegunaan antara perulangan luar dengan perulangan yang berada didalamnya?
    jawab : 
    1. Perulangan luar (outer loop): mengatur jumlah baris yang dicetak.
    2. Perulangan dalam (inner loop): mengatur jumlah bintang per baris.

4. mengapa perlu ditambahkan sintaks System.out.println(); di bawah perulangan dalam? apa akibatnya jika sintaks tersebut dihilangkan?
    jawab : Agar setiap baris bintang berpindah ke baris baru. jika dihapus, semua bintang dari semua baris akan dicetak dalam satu baris panjang.

5. silakan commit dan push ke repository Anda.
    jawab : sudah


PERCOBAAN 3
1. Perhatikan, apakah output yang dihasilkan dengan nilai N = 5 sesuai dengan tampilan berikut?
    jawab : tidak sesuai, karena program belum menampilkan baris baru dan batas loop belum tepat.

2. Jika tidak sesuai, bagian mana saja yang harus diperbaiki/ditambahkan? Jelaskan setiap bagian yang perlu diperbaiki/ditambahkan.
    jawab : program perlu menambahkan System.out.println(); di akhir perulangan dalam (inner loop) agar berpindah baris setiap kali selesai mencetak  
            bintang pada satu baris.
            selain itu, nilai awal i sebaiknya dimulai dari 1, bukan 0, agar baris pertama hanya memiliki satu bintang.
3. Silakan commit dan push ke repository Anda.
    jawab : sudah
