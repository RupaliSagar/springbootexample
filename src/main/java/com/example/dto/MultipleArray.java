package com.example.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MultipleArray {

    @JsonProperty("Array1")
    private List<Integer> Array1;

    @JsonProperty("Array2")
    private List<Integer> Array2;

    @JsonProperty("Array3")
    private List<Integer> Array3;

    public MultipleArray() {
    }

    public List<Integer> getArray1() {
        return Array1;
    }

    public void setArray1(List<Integer> array1) {
        Array1 = array1;
    }

    public List<Integer> getArray2() {
        return Array2;
    }

    public void setArray2(List<Integer> array2) {
        Array2 = array2;
    }

    public List<Integer> getArray3() {
        return Array3;
    }

    public void setArray3(List<Integer> array3) {
        Array3 = array3;
    }
}
