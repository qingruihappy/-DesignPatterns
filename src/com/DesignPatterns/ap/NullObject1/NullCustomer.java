package com.DesignPatterns.ap.NullObject1;


public class NullCustomer extends AbstractCustomer {
    
    @Override
    public String getName() {
       return "û�з��ָ����ֵ���";
    }
  
    @Override
    public boolean isNil() {
       return true;
    }
 }

