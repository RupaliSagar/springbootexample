package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class TriangleTypeServiceImpl implements TriangelTypeService {
    @Override
    public String checkTriangleType(Integer a, Integer b, Integer c) {
        if(a==b && b==c)
            return "Equilateral";

        else if ((a==b && b!=c ) || (a!=b && c==a) || (c==b && c!=a))
            return "Isosceles";

        else if(a!=b && b!=c && c!=a)
            return "Scalene";

        else if(a >= (b+c) || c >= (b+a) || b >= (a+c) )
            return "Not a triangle";

        return "";
    }
}
