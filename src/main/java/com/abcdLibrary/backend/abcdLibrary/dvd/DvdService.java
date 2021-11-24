package com.abcdLibrary.backend.abcdLibrary.dvd;

import com.abcdLibrary.backend.abcdLibrary.book.BookRepository;
import com.abcdLibrary.backend.abcdLibrary.book.dto.BookInfo;
import com.abcdLibrary.backend.abcdLibrary.dvd.dto.DvdInfo;
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
public class DvdService {

    private final DvdRepository dvdRepository;
    public  List<DvdInfo> getAllDvd() {

        List<DvdInfo> result = new ArrayList<>();

        dvdRepository.findAll().forEach(t -> {
            DvdInfo target = new DvdInfo();

            BeanUtils.copyProperties(t, target);
            result.add(target);
        });

        return result;
    }
}
