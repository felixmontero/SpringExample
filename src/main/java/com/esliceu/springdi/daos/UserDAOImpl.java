package com.esliceu.springdi.daos;

import org.springframework.stereotype.Component;

@Component
public class UserDAOImpl implements UserDAO{
    @Override
    public String getSomething(){
        return "OK";
    }
}
