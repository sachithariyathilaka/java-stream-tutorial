package io.github.sachithariyathilaka;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Main class for the tutorial.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/05/12
 */
public class JavaStreamTutorial {

    public static void main(String[] args) {
        JavaStreamTutorial javaStreamTutorial = new JavaStreamTutorial();
        List<Integer> list = Arrays.asList(2, 4, 6, 8);

        // map method
        javaStreamTutorial.map(list);

        // filter method
        javaStreamTutorial.filter(list);

        // sorted method
        javaStreamTutorial.sorted(list);

        // skip method
        javaStreamTutorial.skip(list);

        // limit method
        javaStreamTutorial.limit(list);

        // collect method
        javaStreamTutorial.collect(list);

        // forEach method
        javaStreamTutorial.forEach(list);

        // findFirst method
        javaStreamTutorial.findFirst(list);

        // findAny method
        javaStreamTutorial.findAny(list);
    }

    /**
     * Java stream map method.
     *
     * @param   list the list
     */
    private void map(List<Integer> list) {
        List<Integer> newList = list.stream().map(x -> x*x).collect(Collectors.toList());
        print(newList);
    }

    /**
     * Java stream filter method.
     *
     * @param   list the list
     */
    private void filter(List<Integer> list) {
        List<Integer> newList = list.stream().filter(x -> x > 2 && x < 8).collect(Collectors.toList());
        print(newList);
    }

    /**
     * Java stream sorted method.
     *
     * @param   list the list
     */
    private void sorted(List<Integer> list) {
        List<Integer> newList = list.stream().sorted().collect(Collectors.toList());
        print(newList);
    }

    /**
     * Java stream skip method.
     *
     * @param   list the list
     */
    private void skip(List<Integer> list) {
        List<Integer> newList = list.stream().skip(2L).collect(Collectors.toList());
        print(newList);
    }

    /**
     * Java stream limit method.
     *
     * @param   list the list
     */
    private void limit(List<Integer> list) {
        List<Integer> newList = list.stream().limit(1L).collect(Collectors.toList());
        print(newList);
    }

    /**
     * Java stream collect method.
     *
     * @param   list the list
     */
    private void collect(List<Integer> list) {
        List<Integer> newList = list.stream().sorted().collect(Collectors.toList());
        print(newList);
    }

    /**
     * Java stream forEach method.
     *
     * @param   list the list
     */
    private void forEach(List<Integer> list) {
        list.stream().sorted().forEach(x-> print(Collections.singletonList(x)));
    }

    /**
     * Java stream findFirst method.
     *
     * @param   list the list
     */
    private void findFirst(List<Integer> list) {
        Optional<Integer> optionalResult = list.stream().sorted().findFirst();
        print(Collections.singletonList(optionalResult.orElse(0)));
    }

    /**
     * Java stream findAny method.
     *
     * @param   list the list
     */
    private void findAny(List<Integer> list) {
        Optional<Integer> optionalResult = list.stream().sorted().findAny();
        print(Collections.singletonList(optionalResult.orElse(0)));
    }

    /**
     * Print the list.
     *
     * @param   list the list
     */
    private void print(List<Integer> list) {
        System.out.println("List is: " + list);
    }
}
