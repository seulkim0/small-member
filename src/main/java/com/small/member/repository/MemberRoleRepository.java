package com.small.member.repository;

import com.small.member.domain.MemberRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRoleRepository
        extends JpaRepository<MemberRole, Long> {

}
