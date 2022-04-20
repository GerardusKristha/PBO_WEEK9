package Data_Pegawai;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class Manager extends Pegawai{
    private int tunjangan;
    public Manager() {
        super();
    }
    public Manager(int employeeID, String name, String alamat){
       super(employeeID, name, alamat);
    }
    public void setTunjangan(int tunjangan){
        this.tunjangan = tunjangan;
    }
    @Override
    public int getGaji(){
        return gaji+tunjangan;
    }
}
