package com.flwcy.proxy;

/**
 * 代理角色（中介）
 */
public class Agency implements Tenement {

    public Agency(Tenement landlord){
        this.landlord = landlord;
    }

    /**
     * 真实角色（房东）
     */
    private Tenement landlord; //代理角色内部持有真实角色的引用

    public void tenement() {
        // 签合同（真实角色操作之前所附加的操作）
        System.out.println("签订合同");

        // 只有房东才有房子，中介只是代理
        landlord.tenement();

        // 收取中介费（真实角色操作之后所附加的操作）
        System.out.println("收取中介费");
    }
}
