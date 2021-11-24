package com.abcdLibrary.backend.abcdLibrary.member;

import com.abcdLibrary.backend.abcdLibrary.dvd.DvdService;
import com.abcdLibrary.backend.abcdLibrary.dvd.dto.DvdInfo;
import com.abcdLibrary.backend.abcdLibrary.handling.RestResponse;
import com.abcdLibrary.backend.abcdLibrary.handling.RestResponseFactory;
import com.abcdLibrary.backend.abcdLibrary.member.dto.MemberInfo;
import lombok.RequiredArgsConstructor;
import lombok.var;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "api/member")
public class MemberController {

    private final MemberService memberService;
    private final RestResponseFactory resp;

    @GetMapping({"", "/", "/all", "/all/"})
    public ResponseEntity<RestResponse<List<MemberInfo>>> getAllMember() {

        var memberList= memberService.getAllMember();

        return ResponseEntity.ok(resp.success("dvdsFetched", memberList));
    }
}
