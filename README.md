# 📘 Tugas 1 Pemrograman Berorientasi Object
```
Nama : Niki Azzuma Azra Ariyanto
Nim : 32602400010
```

### Meliputi materi :
1. **Class dan Object (Pertemuan 2)**
2. **Encapsulation (Pertemuan 3)**
3. **Constructor (Pertemuan 4)**


---

## 💻 Analisa Kode Berikut

### Kode `MakhlukHidup.java` dan `TestAccess.java` versi `ERROR`
><div style="color: blue">
><strong>Tugas:<br/>
>1. Temukan, jelaskan, dan perbaiki setiap error berkaitan dengan materi pada MakhlukHidup.java dan TestAccess.java. Ada 10+ kesalahan. Setiap kesalahan memiliki skor (lihat pada tabel skor). Skor minimal LULUS = 60.
><br/>
>2. Tuliskan output dari TestAccess jika kode sudah diperbaiki
></strong>
</div>

```java

public class MakhlukHidup {

    private string nama;       
    private String jenis;
    public double berat = -1.0;  
    private int umur;


    public MakhlukHidup() {
        this.nama = "Unknown";
        this.jenis = "Unknown";
        this.umur = 15;
        this.berat = 10.0;
    }

    public void MakhlukHidup(String nama) { 
        this.nama = nama;
        this.jenis = "Salah";
        this.umur = 12;
        this.berat = 170.0;
    }

    public makhlukHidup(String nama, String jenis, int umur, double berat) { 
        this.nama = jenis;  
        this.jenis = nama; 
        this.umur = umur;
        this.berat = berat;
    }

    public MakhlukHidup(MakhlukHidup other) {
        this.nama = nama; 
        this.jenis = other.jenis; 
        this.umur = this.umur; 
        this.berat = other.berat;
    }


    public void setUmur(String umur) { 
        this.umur = umur;
    }

    public void setNama(String nama) {
        nama = this.nama; 
    }

    public int getInfo() { 
        return "Nama=" + nama + ", Jenis=" + jenis 
        + ", Umur=" + umur + ", Berat=" + berat;
    }
}

```

```java
class TestAccess {
    public static void main(String[] args) {
        MakhlukHidup m = new MakhlukHidup();
        
        m.nama = "Kucing";  
        
        MakhlukHidup m2 = new MakhlukHidup("Harimau", "Hewan", 3, 120.0);
        
        MakhlukHidup m3 = new MakhlukHidup(m2);
 
        System.out.println(m.getInfo());
        
        System.out.println(m2.getInfo());
        
        m2.MakhlukHidup("Kuda"); 
                
        System.out.println(m2.getInfo());
        
        m3.setUmur(-10); 
        
        System.out.println(m3.getInfo());


```


## Table Score
| No | Error | Materi terkait            | Skor |
|----|-------|---------------------------|------|
| 1  | ERR1  | Class & Object (syntax)   | 10   |
| 2  | ERR2  | Class & Object (type)     | 10   |
| 3  | ERR3  | Constructor/init          | 10   |
| 4  | ERR4  | Encapsulation / Setter    | 10   |
| 5  | ERR5  | Constructor (copy)        | 10   |
| 6  | ERR6  | Constructor (copy)        | 10   |
| 7  | ERR7  | Encapsulation / Setter    | 10   |
| 8  | ERR8  | Class & Object (type)     | 10   |
| 9  | ERR9  | Class & Object (type)     | 10   |
| 10 | ERR10 | Encapsulation / Validation| 10   |
**Total skor : 100**

## Petunjuk Pengerjaan

Temukan semua ERR#, jelaskan kenapa salah dalam bentuk table dengan kolom berikut, selanjutnya tulis kode perbaikannya.

| No | Class        | Kesalahan | Perbaikan |
|----|--------------|-----------|-----------|
| 1 | MakhlukHidup | [contoh] variable `jumlah` salah penulisan akses `publik` | seharusnya `public jumlah = 10`|

2. Kompilasi dan jalankan setelah diperbaiki.
3. Upload kode pada **Github** repository anda dan **upload link nya ke dalam sinau** di topik **Tugas 1 PBO** disertai **file penjelasannya** dalam format word atau markdown

> Peringatan : Penggunaan AI tidak menjamin jawaban anda semuanya benar
>
### Jawaban ;
###### A. Hasil dari analisis kode program public class MakhlukHidup

```java
public class MakhlukHidup {

    private String nama; //seharusnya string "s"nya besar
    private String jenis;
    public double berat = 1.0; //berat badan tidak boleh negatif karena berat badan tidak ada negatif 
    private int umur;


    public MakhlukHidup() {
        this.nama = "Unknown";
        this.jenis = "Unknown";
        this.umur = 15;
        this.berat = 10.0;
    }

    public void makhlukHidup(String nama) { // seharusnya menghindari nama method sama dengan nama kelas karena bukan contructor
        this.nama = nama;
        this.jenis = "Salah";
        this.umur = 12;
        this.berat = 170.0;
    }

    public MakhlukHidup(String nama, String jenis, int umur, double berat) { //nama public kelas makhlukhidup seharusnya "m" nya besar sama seperti public kelas pertama 
        this.nama = nama;  // seharusnya this.nama= nama ,bukan this.nama=jenis 
        this.jenis = jenis; // seharusnya this.jenis= jenis ,bukan this.jenis=nama
        this.umur = umur;
        this.berat = berat;
    }

    public MakhlukHidup(MakhlukHidup other) {
        this.nama = other. nama; //seharusnya this.nama=other.nama karena dalam kesalahan tersebut dapat merusak untuk codingan kedepan 
        this.jenis = other.jenis; 
        this.umur = other.umur; //seharusnya this.umur=other.umur karena dalam kesalahan tersebut dapat merusak untuk codingan kedepan 
        this.berat = other.berat;
    }


    public void setUmur(int umur) { 
        this.umur = umur;
    } //seharusnya tipe datanya int bukan string karena string bukan buat angka 

    public void setNama(String nama) {
        this.nama=nama; //seharusnya penulisan this.nama=nama bukan nama=this.nama karena nanti set namanya tidak terpakai  
    }

    public String getInfo() { //seharusnya pakai tipe data string bukan int karena hasilnya outputnya nama bukan angka 
        return "Nama=" + nama + ", Jenis=" + jenis 
        + ", Umur=" + umur + ", Berat=" + berat;
    }
}
```

```java
class TestAccess {
    public static void main(String[] args) {
        MakhlukHidup m = new MakhlukHidup();
        
        m.setNama( "Kucing");//seharusnya nama atribut meggunakan setter
        
        MakhlukHidup m2 = new MakhlukHidup("Harimau", "Hewan", 3, 120.0);
        
        MakhlukHidup m3 = new MakhlukHidup(m2);
 
        System.out.println(m.getInfo());
        
        System.out.println(m2.getInfo());
        
        m2.setNama("kucing");//seharusnya mengcopy objek pertama 
                
        System.out.println(m2.getInfo());
        
        m3.setUmur(10); //seharusnya umur tidak boleh -10 
        
        System.out.println(m3.getInfo());

        
    }
}
```
##### B. Outpul dari hasil kode program di atas 
Nama=Kucing, Jenis=Unknown, Umur=15, Berat=10.0
Nama=Harimau, Jenis=Hewan, Umur=3, Berat=120.0 
Nama=kucing, Jenis=Hewan, Umur=3, Berat=120.0  
Nama=Harimau, Jenis=Hewan, Umur=10, Berat=120.0
__________
##### C. Hasil tabel dari kesalahan dan perbaikan kode program public class MakhlukHidup


| No |    Class   |Kesalahan|Perbaikan|
|----|------------|---------|---------|
| 1  |MakhlukHidup|Pada tipe data `string` yang pertama di public class MakhlukHidup `s` nya kecil         |Seharusnya tipe data string`S` nya besar         |
| 2  |MakhlukHidup|Pada akses public double berat itu tidak boleh `-1.0`       |Seharusnya berat badan positif menjadi `1`         |
| 3  |MakhlukHidup|Pada public void `MakhlukHidup`(String nama)           |Seharusnya menghindari nama method sama dengan nama kelas karena bukan contructor menjadi `makhlukHidup`         |
| 4  |MakhlukHidup|Pada bagian public `makhlukHidup`(String nama, String jenis, int umur, double berat)          |Seharusnya `makhlukHidup `m` nya besar `M karena sama pada public class pertama        |
| 5 |MakhlukHidup|Pada bagian `this.nama=jenis;`         |Seharusnya `this.nama=nama`         |
| 6 |MakhlukHidup|Pada `this.jenis=nama`         |Seharusnya di ganti `this.jenis=jenis`         |
| 7  |MakhlukHidup|Pada bagian `this.nama = nama;`          |Seharusnya di ganti dengan `this.nama = other. nama;`         |
| 8 |MakhlukHidup|Pada bagian `this.umur = this.umur;`         |Seharusnya diganti `this.umur = other.umur;`         |
| 9  |MakhlukHidup|Pada bagian `public void setUmur(String umur)`     | Seharusnya tipe data `string` di ganti dengan `int` karena tipe data `string` bukan buat angka        |
| 10  |MakhlukHidup|pada bagian public void setNama(String nama)  `nama = this.nama;`{} |Seharusnya di ganti menjadi `this.nama=nama;{}`        
| 11 |MakhlukHidup|Pada bagian `public int getInfo()`         |Seharusnya di ganti `int` di ganti dengan `String`         |
| 12 |TestAccess   |Pada bagian  `m.nama = "Kucing";`         |Seharusnya nama atribut menggunakan `setter`         |
| 13 |TestAccess     |Pada bagian `m2.MakhlukHidup("Kuda");`         |`Seharusnya mengcopy objek pertama`         |
| 14 |TestAccess    |Pada bagian `m3.setUmur(-10);`         |Seharusnya `umur tidak boleh -10 harus potsitif`       |
_____

