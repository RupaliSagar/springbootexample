package com.example.controller;


import com.example.dto.MultipleArray;
import com.example.service.FibonacciServiceImpl;
import com.example.service.MultipleArrayImpl;
import com.example.service.TriangleTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/")
public class APIController {

    @Autowired
    FibonacciServiceImpl  fibonacciService;

    @Autowired
    MultipleArrayImpl multipleArrayService;

    @Autowired
    TriangleTypeServiceImpl triangleTypeService;


    @RequestMapping(path = "/fibonacci", method = RequestMethod.GET)
    public ResponseEntity calculateFibonacci(@RequestParam  Long number) {
        try {
            return new ResponseEntity<Long>(fibonacciService.fibonacci(number), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }


    @RequestMapping(path = "/makeOneArray", method = RequestMethod.POST)
    public ResponseEntity reverseWord(@RequestBody MultipleArray multipleArray) {
        try {
            return new ResponseEntity<List>(multipleArrayService.makeOneArray(multipleArray), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @RequestMapping(path = "/triangleType", method = RequestMethod.GET)
    public ResponseEntity reverseWord(@RequestParam Integer a, @RequestParam Integer b,@RequestParam Integer c) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(triangleTypeService.checkTriangleType(a,b,c));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }





    @RequestMapping(path = "/reverse", method = RequestMethod.GET)
    public ResponseEntity reverseWord(@RequestParam String string) {
        try {
            String[] words = string.split(" ");
            String reverse = "";
            String finalString = "";
            for (int i = 0; i < words.length; i++) {
                for (int j = words[i].length() - 1; j >= 0; j--) {
                    reverse += words[i].charAt(j);
                }
                finalString = finalString+ " " + reverse ;
                reverse = "";
            }
            return ResponseEntity.status(HttpStatus.OK).body(finalString);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }



}
