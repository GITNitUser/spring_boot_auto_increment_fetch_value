package com.nit;

import com.nit.dao.MessageDaoTest;
import com.nit.dao.MessageDaoTest1;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        SpringBootAutoIncrementFetchValueApplicationTests.class,
        MessageDaoTest.class,
        MessageDaoTest1.class
})
public class SuitTestsClass {
}
