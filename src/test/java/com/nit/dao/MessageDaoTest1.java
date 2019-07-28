package com.nit.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageDaoTest1 {
    @Autowired
    private MessageDao messageDao;

    @Test
    public void insertMessageTest(){

        assertEquals(19, messageDao.insertMessage("HeloIlyas"));
    }
}
