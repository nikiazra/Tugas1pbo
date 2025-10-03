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