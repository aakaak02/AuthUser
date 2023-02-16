package com.careerit.cbook.auth.service;

import com.careerit.cbook.auth.domain.AppUser;
import com.careerit.cbook.auth.dto.AppUserDTO;
import com.careerit.cbook.auth.repo.AppUserRepo;
import com.careerit.cbook.util.ConvertorUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;


@Service
@Slf4j
public class AppUserServiceImpl implements AppUserService {

  @Autowired
  private AppUserRepo appUserRepo;

  @Override
  public AppUserDTO registerUser(AppUserDTO appUserDTO)
  {
    Assert.notNull(appUserDTO.getUsername(), "Name can't be null or empty");
    AppUser appUser = ConvertorUtil.convert(appUserDTO, AppUser.class);
    appUser = appUserRepo.save(appUser);
    appUserDTO = ConvertorUtil.convert(appUser, AppUserDTO.class);
    log.info("Contact is added with id {} and name {}", appUserDTO.getId(), appUserDTO.getUsername());
    return appUserDTO;

  }

@Override
public AppUserDTO findByUsername(String username){
  Assert.notNull(username, "Name can't be null or empty");
  AppUser appUser = appUserRepo.findByUsername(username);
  AppUserDTO appUserDTO = ConvertorUtil.convert(appUser, AppUserDTO.class);
  log.info("Contact is retrieved with id {} and name {}", appUserDTO.getId(), appUserDTO.getUsername());

  return appUserDTO;
}

}
