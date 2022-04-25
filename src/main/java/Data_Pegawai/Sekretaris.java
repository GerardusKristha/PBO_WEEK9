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
    
    public Sekretaris(int employeeID, String name){
       super(employeeID, name);
    }
    
    public int getGaji(){
        return getGajiPokok();
    }

}


//    
//     @Override
//    public String toString() {
//        return super.toString()+ "\n-Gaji total\t: "+ getGaji(); 
//    }