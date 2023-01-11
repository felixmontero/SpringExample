package com.esliceu.springdi.daos;

import com.esliceu.springdi.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonDAOImpl implements PersonDAO{
    @Autowired
    JdbcTemplate jdbcTemplate;
    private final RowMapper<Person> personMapper = (rs,rn) -> {
        Person p = new Person();
        p.setName(rs.getString("name"));
        p.setId(rs.getInt("id"));
        return p;
    };
    @Override
    public void save(Person p) {
        jdbcTemplate.update("insert into person (name) values (?)",p.getName());
    }

    public List<Person> all(){
       return jdbcTemplate.query("select * from person", personMapper);
    }
}
