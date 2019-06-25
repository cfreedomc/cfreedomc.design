package com.cfreedomc.cfreedomcfactory.domain;
/**
 * @description operator sub return a-b
 * @author cfreedomc
 */
public class OperatorSub implements Operator{
    @Override
    public double getResult(double a, double b) {
        return a-b;
    }
}
