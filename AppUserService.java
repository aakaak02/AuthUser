package com.careerit.cbook.auth.service;

import com.careerit.cbook.auth.domain.AppUser;
import com.careerit.cbook.auth.dto.AppUserDTO;

public interface AppUserService {

      public AppUserDTO registerUser(AppUserDTO appUserDTO);
      public AppUserDTO findByUsername(String username);
}
