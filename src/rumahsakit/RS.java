/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rumahsakit;

/**
 *
 * @author ASUS
 */
public class RS {
    String pasien, ruang, dokter, durasi;
    long ttl, biayapasien;
    long  biayaruang,biayadokter, biayadurasi;
    
   
    public void setPasien(String val){
        pasien = val;
    } 
    public String getPasien(){
        return pasien;   
    }
    
    public void setSeleksiPasien (){
        if(pasien.equalsIgnoreCase("PASIEN ASURANSI")){
            biayapasien = 500000;
        } else if(pasien.equalsIgnoreCase("PASIEN UMUM")){ 
            biayapasien = 350000;
        }else if(pasien.equalsIgnoreCase("PASIEN BPJS")){ 
            biayapasien = 0;
        } else {
            biayapasien = 0;
        }
    }
    
    
    public void setRuang (String val) {
        ruang = val;
    }
    
    public String getRuang(){
    return ruang;
    }
    
    public void setSeleksiRuang(){
        if(ruang.equalsIgnoreCase("VIP 1 (Kipas Angin dan TV)")){
            biayaruang = 1000000;
        } else if(ruang.equalsIgnoreCase("VIP 2 (AC dan TV)")){ 
            biayaruang = 2000000;
        }else if(ruang.equalsIgnoreCase("VIP 3 (AC, TV dan Sofa)")){ 
            biayaruang = 3000000;
        }else if(ruang.equalsIgnoreCase("Umum 1(Kipas Angin dan TV)")){ 
            biayaruang = 150000;
        }else if(ruang.equalsIgnoreCase("Umum 2 (AC dan TV)")){ 
            biayaruang = 200000;
        }else {
            biayaruang = 0;
        }
    }
    
    public void setDokter (String val) {
        dokter = val;
    }
    
    public String getDokter() {
        return dokter;  
    }
    
    public void setSeleksiDokter(){
        if(dokter.equalsIgnoreCase("dr. Budi Herdansyah")){
            biayadokter = 50000;
        } else if(dokter.equalsIgnoreCase("dr. Selly Wijaksana")){ 
            biayadokter = 35000;
        }else if(dokter.equalsIgnoreCase("dr. Anies Simatupang")){ 
            biayadokter = 30000;
        }else if(dokter.equalsIgnoreCase("dr. Triana Apriani")){ 
            biayadokter = 40000;
        } else {
            biayadokter = 0;
        }
    }
    
    public void setDurasi (String val) {
        durasi = val;
    }
    
    public String getDurasi() {
        return durasi;  
    }
    
    public void setSeleksiDurasi(){
        if(this.durasi.equalsIgnoreCase("LEBIH DARI 1 HARI")){
            biayadurasi = biayaruang*2;
        } else if(this.durasi.equalsIgnoreCase("LEBIH DARI 4 HARI")){ 
            biayadurasi = ((int)(this.biayaruang *3));
        }else if(this.durasi.equalsIgnoreCase("LEBIH DARI 7 HARI")){ 
           biayadurasi = ((int)(this.biayaruang *4));
        } else {
            biayadurasi = 0;
        }
    }
    
    public double getBiayadurasi(){
        return biayadurasi;
    }
    
    public void setBiayadurasi(long val){
        biayadurasi = val ;
        
    }
    
    public double getBiayapasien (){
        return biayapasien;
    }
    
    public void getBiayaPasien(long val){
        biayapasien = val;
       
    }
    
    public long getBiayaRuang(){
        return biayaruang;
    }
    
    public void setBiayaRuang(long val){
        biayaruang = val;
    }
    
    
    public long getBiayaDokter(){
        return biayadokter;
    }
    
     public void setBiayaDokter(long val){
        biayadokter = val;
        
    }
    
    public int getTtl() {
        
        ttl = (long) (biayapasien + biayaruang + biayadokter + biayadurasi);
        return (int) (long) ttl;
    }      

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String toString(long biayaDokter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

