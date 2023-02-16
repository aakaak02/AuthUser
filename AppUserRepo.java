package com.careerit.cbook.auth.repo;

import com.careerit.cbook.auth.domain.AppUser;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AppUserRepo extends MongoRepository<AppUser,String>{
    AppUser findByUsername(String str);
}
