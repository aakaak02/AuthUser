package com.careerit.cbook.auth.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AppUserDTO {
  private String id;
  private String username;
  private String password;
}
