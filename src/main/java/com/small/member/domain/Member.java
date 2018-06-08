package com.small.member.domain;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.Instant;

@Data
@Entity
@Table(name = "member")
public class Member {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  Long id;
  private String loginId;
  private String passwd;
  private String name;
  private String phoneNumber;
  @CreatedDate
  private Instant createdAt;
  private String createdBy;
  @LastModifiedDate
  private Instant lastModified;
  private String lastModifiedBy;
}
