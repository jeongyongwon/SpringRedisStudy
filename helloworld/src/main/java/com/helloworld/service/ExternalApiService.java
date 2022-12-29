package com.helloworld.service;


import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service //호출한다고 가정하고 만든 Service
public class ExternalApiService {

    public String getUserName(String userId) {
        try {
            Thread.sleep(500);
        }
        catch (InterruptedException e) {

        }
        System.out.println("getting user name from other service");

        if(userId.equals("A")) {
            return "Adam";
        }
        if(userId.equals("B")) {
            return "Bob";
        }
        return "";
    }

    @Cacheable(cacheNames = "userAgeCache", key = "#userId")
    public int getUserAge(String userId) {
        try {
            Thread.sleep(500);
        }
        catch (InterruptedException e) {

        }

        System.out.println("getting user age from other service");

        if(userId.equals("A")) {
            return 28;
        }
        if(userId.equals("B")) {
            return 32;
        }
        return 0;
    }

}
