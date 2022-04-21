package Data_Pegawai;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class Sales extends Pegawai{
    public int KOMISI_BARANG =100000;
    private int jumlahBarang;
    public Sales (){
        super();
    }
    public Sales (int employeeID, String name, String department){
       super(employeeID, name, department);
    }
    
    public void setJumlahBarang(int jumBarang){
        this.jumlahBarang=jumBarang;
    }
    
    public int getKomisi(){
      return jumlahBarang*KOMISI_BARANG;
    }
    
    public int getGaji(){
        return getGajiPokok()+getKomisi();
    }

    @Override
    public String toString() {
        return super.toString()+ "\n-Gaji total\t: "+ getGaji(); 
    }
}
