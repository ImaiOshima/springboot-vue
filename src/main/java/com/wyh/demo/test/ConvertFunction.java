package com.wyh.demo.test;

public class ConvertFunction {
    public static void main(String[] args) {
        Convert<String,Integer> convert = ConvertFunction::String2Int;
        System.out.println(convert.convert("120"));
    }

    @FunctionalInterface
    interface Convert<F,T>{
        T convert(F from);
    }

    interface create<T extends Animal>{

    }

    static int String2Int(String from){
        return Integer.valueOf(from);
    }
}
