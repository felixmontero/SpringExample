package com.esliceu.springdi.daos;

import com.esliceu.springdi.models.Person;

import java.util.List;

public interface PersonDAO {
    void save (Person p);
     List<Person> all();
}
