# Proyek Aplikasi Android: HelloToast

Ini adalah proyek aplikasi Android sederhana yang dibuat sebagai bagian dari tugas mata kuliah **Pengembangan Aplikasi Mobile**. Proyek ini mendemonstrasikan konsep-konsep fundamental dalam pengembangan Android, dimulai dari tutorial dasar "Hello Toast" dan dikembangkan untuk mencakup lebih banyak fitur.

Aplikasi ini menampilkan pembuatan UI dengan `RelativeLayout`, penanganan event klik pada tombol, manajemen state (menyimpan data saat rotasi layar), serta navigasi antar Activity dan ke aplikasi eksternal.

## Fitur Aplikasi

-   **Tombol Toast**: Menampilkan pesan singkat (toast message) saat ditekan.
-   **Tombol Counter**: Menambah angka pada `TextView` setiap kali ditekan. Nilai hitungan akan tersimpan secara otomatis bahkan saat layar diputar.
-   **UI dengan RelativeLayout**: Layout utama aplikasi dibangun menggunakan `RelativeLayout` untuk memposisikan elemen secara fleksibel.
-   **Navigasi Antar Activity**: Terdapat tombol untuk berpindah ke halaman (Activity) kedua di dalam aplikasi.
-   **Intent Implisit**: Sebuah tombol untuk membuka browser internal ponsel dan mengakses URL yang telah ditentukan (misalnya, google.com).

## Cara Kerja & Komponen Utama

### `MainActivity.kt`

File ini berfungsi sebagai "otak" dari layar utama. Tugasnya meliputi:
-   Inisialisasi komponen UI dari file XML.
-   Mengatur `onClick` untuk tombol "Pindah Halaman" dan "Buka Browser".
-   Menyediakan fungsi `showToast()` dan `countUp()` yang dipanggil dari XML untuk menangani klik tombol.
-   Menyimpan dan memulihkan state dari *counter* saat terjadi perubahan konfigurasi (seperti rotasi layar) menggunakan `onSaveInstanceState()`.

### `activity_main.xml`

File ini mendefinisikan tampilan antarmuka (UI) untuk layar utama menggunakan `RelativeLayout`. Beberapa atribut kunci yang digunakan antara lain:
-   `android:layout_alignParentBottom="true"`: Untuk menempelkan view di bagian bawah layar.
-   `android:layout_below` dan `android:layout_above`: Untuk membuat `TextView` mengisi ruang kosong di antara dua elemen lain.
-   `android:layout_toRightOf`: Untuk menempatkan elemen di sebelah kanan elemen lain.
-   `android:onClick`: Atribut untuk menghubungkan tombol langsung ke fungsi di Activity.

### `MainActivity2.kt`

Activity kedua yang berfungsi sebagai tujuan navigasi untuk mendemonstrasikan *Intent Eksplisit*.

## Konsep yang Didemonstrasikan

1.  **Layout UI (`RelativeLayout`)**: Membangun antarmuka yang responsif.
2.  **Penanganan Event (Event Handling)**: Merespons input pengguna melalui `setOnClickListener` (programatik) dan `android:onClick` (deklaratif).
3.  **Siklus Hidup Activity (Activity Lifecycle)**: Memahami cara kerja `onCreate()` dan `onSaveInstanceState()` untuk menjaga data tetap konsisten.
4.  **Intent**:
    -   **Intent Eksplisit**: Berpindah dari satu Activity ke Activity lain di dalam aplikasi.
    -   **Intent Implisit**: Meminta sistem Android untuk melakukan aksi, seperti membuka halaman web.

## Dependensi Proyek

Proyek ini dibuat menggunakan Kotlin dan mengandalkan dependensi AndroidX standar berikut (sesuai modul `app/build.gradle.kts`):

-   `androidx.core:core-ktx:1.10.1`
-   `androidx.appcompat:appcompat:1.6.1`
-   `com.google.android.material:material:1.10.0`
-   `androidx.activity:activity:1.8.0`
-   `androidx.constraintlayout:constraintlayout:2.1.4`

## Cara Menjalankan Proyek

1.  **Clone Repository:**
    
