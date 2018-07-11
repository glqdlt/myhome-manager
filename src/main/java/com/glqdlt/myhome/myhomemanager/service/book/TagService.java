package com.glqdlt.myhome.myhomemanager.service.book;

import com.glqdlt.myhome.myhomemanager.persistence.book.entity.Tag;
import com.glqdlt.myhome.myhomemanager.persistence.book.repository.TagRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TagService {

    @Autowired
    TagRepo tagRepo;

    public List<Tag> findTagsIfNotFoundedWithSave(String values){
        List<Tag> tags = Arrays.asList(values.split(",")).stream().map(x -> {
            Optional<Tag> search = tagRepo.findByValue(x);
            if (!search.isPresent()) {
                return tagRepo.save(new Tag(x));
            } else {
                return tagRepo.findByValue(x).get();
            }
        }).collect(Collectors.toList());
        return tags;
    }
}
