package com.abcdLibrary.backend.abcdLibrary.member;

import com.abcdLibrary.backend.abcdLibrary.dvd.DvdRepository;
import com.abcdLibrary.backend.abcdLibrary.dvd.dto.DvdInfo;
import com.abcdLibrary.backend.abcdLibrary.member.dto.MemberInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class MemberService {

    private final MemberRepository memberRepository;
    public List<MemberInfo> getAllMember() {

        List<MemberInfo> result = new ArrayList<>();

        memberRepository.findAll().forEach(t -> {
            MemberInfo target = new MemberInfo();

            BeanUtils.copyProperties(t, target);
            result.add(target);
        });

        return result;
    }
}
