package com.example.service;

import com.example.dto.MultipleArray;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MultipleArrayImpl implements MultipleArrayService {

    @Override
    public List<Integer> makeOneArray(MultipleArray multipleArray) {
        Set<Integer> elementSet = new HashSet<>();
        elementSet.addAll(multipleArray.getArray1());
        elementSet.addAll(multipleArray.getArray2());
        elementSet.addAll(multipleArray.getArray3());
        List<Integer> removedDublicates = new ArrayList<Integer>(elementSet);
        removedDublicates.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        return  removedDublicates;
    }
}
