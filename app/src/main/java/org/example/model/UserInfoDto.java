package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.example.entities.UserInfo;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserInfoDto extends UserInfo {


    private String username;

    private String lastName;

    private Long phoneNumber;

    private String email;



}
