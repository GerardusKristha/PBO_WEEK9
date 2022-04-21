package Data_Pegawai;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class PegawaiMain {
    public static void main(String[] args) {
        Manager manager = new Manager(210303,"Kristha");
        manager.setGajiPokok(4000000);
        manager.setTunjangan(1500000);
        Sales sales = new Sales(210402,"Bayu");
        sales.setGajiPokok(3000000);
        sales.setJumlahBarang(100);
        Sekretaris sekretaris = new Sekretaris(210503, "Indra");
        sekretaris.setGajiPokok(3500000);
        
        System.out.println("\nManager : " + manager+"\n"+
                           "\nSales : " + sales+"\n"+
                           "\nSekretaris : " + sekretaris);
        
    }
}
