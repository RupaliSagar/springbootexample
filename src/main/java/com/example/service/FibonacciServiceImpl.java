package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class FibonacciServiceImpl implements FibonacciService {

    @Override
    public Long fibonacci(Long number)  {
        if(number<0)
            throw new IllegalArgumentException("n should be non-negative");
        else if(number==0)
            return 0l;
        else if(number==1)
            return 1l;
        else
            return (fibonacci(number-1) + fibonacci(number-2));
    }
}
