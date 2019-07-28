package com.nit.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.Statement;

@Repository
public class MessageDao {
    String INSERT_MESSAGE_SQL = "insert into message (message) values(?) ";

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public long insertMessage(String message){
        KeyHolder keyHolder=new GeneratedKeyHolder();

        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection
                    .prepareStatement(INSERT_MESSAGE_SQL, Statement.RETURN_GENERATED_KEYS);
                     ps.setString(1, message);
            return ps;
        }, keyHolder);

        return keyHolder.getKey().longValue();
    }
}
