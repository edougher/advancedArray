package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Taco Stand Equipment");
        String[][] equipment = new String[6][2];
        equipment[0][0] = "Flat-top Grill";
        equipment[0][1] = "1";
        equipment[1][0] = "Spatula/Tongs";
        equipment[1][1] = "3";
        equipment[2][0] = "Water/Oil/Seasoning";
        equipment[2][1] = "3,2,2";
        equipment[3][0] = "Packs of Tortilla's";
        equipment[3][1] = "10";
        equipment[4][0] = "Protien: Chicken, Beef, Pork";
        equipment[4][1] = "2,2,2";
        equipment[5][0] = "Misc. Toppings";
        equipment[5][1] = "1 set with two back ups";


        for (int i = 5; i < equipment.length; i ++) {
            System.out.println(Arrays.deepToString(equipment));



        }
    }
}
