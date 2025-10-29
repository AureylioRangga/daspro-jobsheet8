PERCOBAAN 1
1. jika pada perulangan for, inisialisasi i=1 di ubah menjadi 0, apa akibatnya?
    jawab : program akan mencetak bintang sebanyak N + 1 kali.
           karene perulangan dimulai dari 0 dan  berhenti saat i <= N, maka total iterasi menjadi satu lebih banyak dari seharusnya.

2. jika perulangan for, kondisi i<=N diubah menjadi i>N, apa akibatnya? dan jelaskan.
    jawab : program tidak akan mencetak apa pun, karena kondisi awal i = 1 tidak memenuhi i > N. Loop tidak dijalankan sama sekali.

3. jika pada perulangan for, kondisi step i++ diubah menjadi i-- apa akibatnya? jelaskan.
    jawab : program akan mengalami infinite loop (tidak berhenti).
    Karena nilai i akan terus berkurang dan tidak akan pernah lebih besar dari N, kondisi i <= N selalu benar.
