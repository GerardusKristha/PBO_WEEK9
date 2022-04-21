package Data_Pegawai;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class Sales extends Pegawai{
    public int KOMISI_BARANG =10000;
    private int jumlahBarang;
    public Sales (){
        super();
    }
    public Sales (int employeeID, String name){
       super(employeeID, name);
    }
    
        public int getJumlahBarang(){
        return jumlahBarang;
    }
        
    public void setJumlahBarang(int jumBarang){
        this.jumlahBarang=jumBarang;
    }
    
    public int getKomisi(){
      return getJumlahBarang()*KOMISI_BARANG;
    }
    
    public int getGaji(){
        return getGajiPokok()+getKomisi();
    }

    @Override
    public String toString() {
        return super.toString()+ "\n-Gaji total\t: "+ getGaji(); 
    }
}
