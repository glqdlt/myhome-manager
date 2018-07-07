package com.glqdlt.myhome.myhomemanager.persistence.book.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ScanBookRepoTest {

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private ScanBookRepo scanBookRepo;
}