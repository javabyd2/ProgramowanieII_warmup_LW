package com.sdabyd2.programowanie;

//import sun.jvm.hotspot.utilities.Assert;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class PTestImpl {

    public static String last(List<String> lista) {

        return lista.get(lista.size() - 1);
    }

    public static int size(List<String> lista) {
        return lista.size();
    }

    public static <T> List<T> reverse(List<T> lista) {
        Collections.reverse(lista);
        return lista;
    }

    public static <T> boolean palindrom(List<T> lista) {
        List<T> list = new ArrayList<>(lista);
        PTestImpl.reverse(lista);
        return Objects.equals(lista, list);
    }

    public static <T> Object[] removeAt(List<T> lista, int b) {

        List<T> nowaLista = new ArrayList<>(lista);

        T g = nowaLista.get(b - 1);
        nowaLista.remove(b - 1);
        List<T> a = nowaLista;

        Object[] afterChanges = new Object[]{a, g};

        return afterChanges;
    }

//    public static <T> List<T> randomSelect(List<T> lista, int b) {
//        Random random = new Random();
//
//        List<T> list = new ArrayList<>(lista);
//
//        for (int i = 0; i < 3; i++) {
//            int g = random.nextInt(lista.size());
//            list.add(lista.get(g));
//            System.out.println(list.get(g));
//        }
//        return list;
//    }
//    public static <T> List<T> flatten(List<T> lista, Class<T> elementType){
//
//        return lista
//                .stream()
//                .flatMap(e -> e instanceof List ? flatten(((List<T>)
//                                e),
//                        elementType).stream() : Stream.of(e))
//                .map(e -> (T) e)
//                .collect(toList());
//    }
}
