package com.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${base.gateway.url}")
    private String baseGatewayUrl;


    @GetMapping("student-info")
    public ResponseEntity<Map> getStudentInfo() {

        //Go to student db and get the data
        Map<String, Object> response = new HashMap<>();

        response.put("id", "283");

        response.put("name", "hsdhsdhjs");

        response.put("sdsdh", "uisdisdis");


        String url = baseGatewayUrl + "dms/student-doc";

        String docResponse = restTemplate.getForObject(url, String.class);


        response.put("doc", docResponse);

        return new ResponseEntity<>(response, HttpStatus.OK);

    }


}
