package com.tongji.Springtest;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by wb-cengyanyu on 2016/6/2.
 */
public class myintereptor implements MethodInterceptor{

    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object target = methodInvocation.getThis();
        if(target instanceof People&&"getName".equals(methodInvocation.getMethod().getName())){
            People people=(People)target;

            System.out.println("������");

            Object result= methodInvocation.proceed();

            System.out.println("����!");

            return result;
        }else{
            return methodInvocation.proceed();
        }
    }
}
