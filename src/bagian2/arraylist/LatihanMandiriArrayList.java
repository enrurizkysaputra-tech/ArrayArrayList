
package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiriArrayList {
    public static void main(String[] args) {
        ArrayList<String> baju = new ArrayList<>();
        baju.add("Koko");
        baju.add("Flanel");
        baju.add("Polo");
        baju.add("Work Shirt");
        
        System.out.println("List Awal : " + baju);
        baju.remove("Flanel");
        System.out.println("List : " + baju);
        System.out.println("Jumlah = " + baju.size());
        
        //================================================
        System.out.println("\n");
        ArrayList<Integer> angka = new ArrayList<>();
        angka.add(80);
        angka.add(75);
        angka.add(90);
        angka.add(95);
        angka.add(85);
        
        int max = angka.get(0);
        for (int n : angka) {
            if (n > max) max = n;
        }
        System.out.println("Data  : " + angka);
        System.out.println("Terbesar : " + max);
        
        System.out.println("\n");
        ArrayList<String> nama = new ArrayList<>();
        nama.add("Andi");
        nama.add("Budi");
        nama.add("Ayu");
        nama.add("Citra");
        nama.add("Adit");
        nama.add("Doni");
 
        System.out.println("Nama berawalan A:");
        for (String n : nama) {
            if (n.startsWith("A")) {
                System.out.println("- " + n);
            }
        }
 
    }
   
    
}
