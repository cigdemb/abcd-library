package com.abcdLibrary.backend.abcdLibrary.dvd;

import com.abcdLibrary.backend.abcdLibrary.book.BookService;
import com.abcdLibrary.backend.abcdLibrary.book.dto.BookInfo;
import com.abcdLibrary.backend.abcdLibrary.dvd.dto.DvdInfo;
import com.abcdLibrary.backend.abcdLibrary.handling.RestResponse;
import com.abcdLibrary.backend.abcdLibrary.handling.RestResponseFactory;
import lombok.RequiredArgsConstructor;
import lombok.var;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "api/dvd")
public class DvdController {

    private final DvdService dvdService;
    private final RestResponseFactory resp;

    @GetMapping({"", "/", "/all", "/all/"})
    public ResponseEntity<RestResponse<List<DvdInfo>>> getAllDvd() {

        var  dvdList= dvdService.getAllDvd();

        return ResponseEntity.ok(resp.success("dvdsFetched", dvdList));
    }
}
