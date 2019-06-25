package com.cfreedomc.cfreedomcfactory;

import com.cfreedomc.cfreedomcfactory.domain.Operator;
import com.cfreedomc.cfreedomcfactory.domain.OperatorAdd;
import com.cfreedomc.cfreedomcfactory.domain.OperatorSub;

public class OperatorFactory {

    public static Operator getOperator(String operation) {
        switch (operation) {
            case "+":
                return new OperatorAdd();
            case "-":
                return new OperatorSub();
            default:
                return null;
        }

    }
}
