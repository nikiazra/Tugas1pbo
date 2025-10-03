public class MakhlukHidup {

    private String nama; //seharusnya string "s"nya besar
    private String jenis;
    public double berat = -1.0; //berat badan tidak boleh negatif karena berat badan tidak ada negatif 
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

