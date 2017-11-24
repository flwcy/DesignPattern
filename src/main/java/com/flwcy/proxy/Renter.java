package com.flwcy.proxy;

/**
 * 租客
 */
public class Renter {
    public static void main(String[] args) {
        // 房东
        Landlord landlord = new Landlord();
        // 中介
        Agency agency = new Agency(landlord);

        agency.tenement();//执行的是代理的方法
    }
}
