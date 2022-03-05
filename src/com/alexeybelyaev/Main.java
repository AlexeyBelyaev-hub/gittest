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
    }
}
