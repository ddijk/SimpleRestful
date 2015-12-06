/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testrestful.interceptor;

import javax.annotation.PostConstruct;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 *
 * @author dick
 */
@Interceptor
@Logging
public class LoggingImpl {

    @PostConstruct
    public void init(InvocationContext ic) {
        System.out.println("in construct interceptor");
    }

    @AroundInvoke
    public Object check(InvocationContext ic) throws Exception {
        //    System.out.println("Intercepotr called for " + ic.getTarget());
        System.out.println("check...");
        return ic.proceed();
    }
}
