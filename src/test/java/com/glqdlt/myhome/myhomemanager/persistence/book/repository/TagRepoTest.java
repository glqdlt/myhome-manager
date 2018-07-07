package com.glqdlt.myhome.myhomemanager.persistence.book.repository;

import com.glqdlt.myhome.myhomemanager.persistence.book.entity.Tag;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@ActiveProfiles("test")
@DataJpaTest
public class TagRepoTest {

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private TagRepo tagRepo;

    @Test
    public void whenFindAll_thenReturnTags(){

    }

}