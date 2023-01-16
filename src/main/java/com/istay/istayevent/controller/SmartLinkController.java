package com.istay.stayevent.controller;


import com.istay.stayevent.dto.SmartLinkEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SmartLinkController {




    @PostMapping("/stayguardian/smartlink")
    public ResponseEntity postSmartLink(@RequestBody SmartLinkEvent smartLinkEvent) {



        return null;
    }
}
