package main2;

import pool.Conection;
import pool.ObjectPool;

public class Main {

    public static void main(String[] args) {
        ObjectPool objectPool = new ObjectPool();

        Conection conection1 = objectPool.checkOut();
        System.out.println(conection1.toString());

        Conection conection2 = objectPool.checkOut();
        System.out.println(conection2.toString());

        Conection conection3 = objectPool.checkOut();
        System.out.println(conection3.toString());

    }
}
