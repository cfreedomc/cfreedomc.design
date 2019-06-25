package com.cfreedomc.cfreedomcfactory.domain;



/**
 * @description operator add return a+b
 * @author cfreedomc
 */
public class OperatorAdd implements  Operator {
    @Override
    public double getResult(double a, double b) {
        return a+b;
    }
}
