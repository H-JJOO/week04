package com.sparata.week04.utils;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

//public class NaverShopSearch {
//    public String search() {
//        RestTemplate rest = new RestTemplate();
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("X-Naver-Client-Id", "여러분이 발급받은 Client ID");
//        headers.add("X-Naver-Client-Secret", "여러분이 발급받은 Client Secret");
//        String body = "";
//        HttpEntity<String> requestEntity = new HttpEntity<String>(body, headers);
//        ResponseEntity<String> responseEntity = rest.exchange("https://openapi.naver.com/v1/search/shop.json?query=adidas", Ht
//                HttpStatus httpStatus = responseEntity.getStatusCode();
//        int status = httpStatus.value();
//        String response = responseEntity.getBody();
//        System.out.println("Response status: " + status);
//        System.out.println(response);
//        return response;
//    }
//    public static void main(String[] args) {
//        NaverShopSearch naverShopSearch = new NaverShopSearch();
//        naverShopSearch.search();
//    }
//}

