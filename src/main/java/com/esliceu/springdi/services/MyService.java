package com.esliceu.springdi.services;

import com.esliceu.springdi.daos.PersonDAO;
import com.esliceu.springdi.daos.UserDAO;
import com.esliceu.springdi.daos.UserDAOImpl;
import com.esliceu.springdi.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {
     @Autowired
     PersonDAO personDAO;


     public int addNumbers(int num1, int num2){
          return num1+num2;
     }

     public void newPerson(String name) {
          Person p = new Person();
          p.setName(name);
          System.out.println("DINS myservice.newperson");
          System.out.println(name);
          personDAO.save(p);
     }

     public List<Person> allPersons() {
          return personDAO.all();
     }
}
