package com.alexeybelyaev;

public class Main {

    public static void main(String[] args) {
        Plchat1 plchat1 = new Plchat1();
        plchat1.print(); // change 1
        plchat1.print(); // change 2
        plchat1.print(); // change 3
        plchat1.print(); // change 4

        Migration migration = new Migration();
        migration.migrate(); // some migration change

        Plchat2 plchat2 = new Plchat2();
        plchat2.print(); // change 1
        plchat2.print(); // change 2
        plchat2.print(); // change 3

        Plchat3 plchat3 = new Plchat3();
        plchat3.print(); //change 1,2

    }
}
