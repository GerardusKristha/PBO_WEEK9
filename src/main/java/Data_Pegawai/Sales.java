package Data_Pegawai;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class Sales extends Pegawai{
    private int penjualan;
    public Sales (){
        super();
    }
    public Sales (int employeeID, String name, String department){
       super(employeeID, name, department);
    }
    public void setPenjualan (int jmlJual){
        this.penjualan = jmlJual*10000;
    }
    @Override
    public int getGaji(){
        return gaji+penjualan;
    }
}
