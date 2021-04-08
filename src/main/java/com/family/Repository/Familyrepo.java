package com.family.Repository;

import com.family.model.Family;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Familyrepo extends MongoRepository<Family,String> {
}

