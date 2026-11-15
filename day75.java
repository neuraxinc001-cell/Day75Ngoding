import java.util.Scanner;
public class day75 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String n = in.nextLine();
        String m = "";
        System.out.println(n.equals("Saya")); // mencari apakah sama dengan Hello
        System.out.println(n.equalsIgnoreCase("sangat")); // mencari apakah sama dengan hello tanpa memperhatikan huruf besar kecil
        System.out.println(n.contains("Ganteng")); // mencari apakah mengandung Hello 
        System.out.println(n.isEmpty()); // mencari apakah string kosong    
        System.out.println(m.isEmpty()); // mencari apakah string kosong    

    }
}
