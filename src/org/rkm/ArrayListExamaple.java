package org.rkm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListExamaple
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<Integer> listOne = new ArrayList<>(Arrays.asList(1,3,5,7,8));

        ArrayList<Integer> listTwo = new ArrayList<>(Arrays.asList(1,2,3,5,8));

        List<Integer> combinedList = Stream.of(listOne, listTwo)
                .flatMap(x -> x.stream()).distinct().sorted()
                .collect(Collectors.toList());
        System.out.println(combinedList);
    }
}
