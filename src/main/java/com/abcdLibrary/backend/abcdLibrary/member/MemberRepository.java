package com.abcdLibrary.backend.abcdLibrary.member;

import com.abcdLibrary.backend.abcdLibrary.entity.Dvd;
import com.abcdLibrary.backend.abcdLibrary.entity.Member;
import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface MemberRepository extends CrudRepository<Member, Integer> {

    List<Member> findAll();
    List<Member> findAllByNameContains(@NonNull String name);

    @NonNull
    Optional<Member> findByUuid(@NonNull UUID memberUuid);

}
