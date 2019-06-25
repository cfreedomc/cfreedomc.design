package com.cfreedomc.cfreedomcfactory;

import com.cfreedomc.cfreedomcfactory.domain.Operator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CfreedomcFactoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(CfreedomcFactoryApplication.class, args);

        System.out.println("result ="+OperatorFactory.getOperator("+").getResult(2, 3));


    }

}
