package com.abcdLibrary.backend.abcdLibrary.member.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberInfo {

   private Long id;

   private UUID uuid;

   private String username;

   private String name;

   private String surname;

   private String cardRegistrationNumber;

   private String email;

   private String address1;

   private String address2;

   private String phone;
}
