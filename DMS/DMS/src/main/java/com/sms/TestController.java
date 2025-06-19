package com.sms;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("student-doc")
    public ResponseEntity<String> getDoc() {
        System.out.println("getting docs");
        return new ResponseEntity<>("Base64 image", HttpStatus.OK);
    }


}
