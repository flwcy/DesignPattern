package com.flwcy.decorator;

/**
 * 抽象构件(Component)角色
 * 装饰者和被装饰者都继承自它
 * 糕点接口
 */
public interface Pastry {

    /**
     * 制作糕点
     * @return
     */
    public String make();
}
