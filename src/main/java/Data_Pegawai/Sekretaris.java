package Data_Pegawai;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class Sekretaris extends Pegawai{
    public Sekretaris(){
        super();
    }
    public Sekretaris(int employeeID, String name, String alamat){
       super(employeeID, name, alamat);
    }
    @Override
    public int getGaji(){
        return gaji;
    }
}