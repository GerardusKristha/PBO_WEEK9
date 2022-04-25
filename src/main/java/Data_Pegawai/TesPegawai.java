package Data_Pegawai;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class TesPegawai {
    public static void main(String[] args) {
        Manager manager = new Manager(210303,"Kristha");
        manager.setGajiPokok(4000000);
        manager.setTunjangan(1500000);
        
        Sales sales = new Sales(210402,"Bayu");
        sales.setGajiPokok(3000000);
        sales.setJumlahBarang(50);
        
        Sekretaris sekretaris = new Sekretaris(210503, "Indra");
        sekretaris.setGajiPokok(3500000);
        
        System.out.println("\n#Manager"+manager.toString()
                          +"\n-Gaji pokok \t: "+manager.getGajiPokok()
                          +"\n-Tunjangan \t: "+manager.getTunjangan()
                          +"\n-Gaji total\t: "+manager.getGaji());
        System.out.println("\n#Sales"+sales.toString()
                          +"\n-Gaji pokok \t: "+sales.getGajiPokok()
                          +"\n-Barang terjual\t: "+sales.getJumlahBarang()
                          +"\n-Komisi \t\t: "+sales.getKomisi()
                          +"\n-Gaji total\t: "+sales.getGaji());
        System.out.println("\n#Sekretari"+sekretaris.toString()
                          +"\n-Gaji pokok \t: "+sales.getGajiPokok()
                          +"\n-Gaji total\t: "+manager.getGaji());
    }
}

//        System.out.println("\nManager : " + manager.toString()+"\n"+
//                           "\nSales : " + sales.toString()+"\n"+
//                           "\nSekretaris : " + sekretaris.toString());