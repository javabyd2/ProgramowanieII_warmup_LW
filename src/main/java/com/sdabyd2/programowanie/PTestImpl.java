package com.sdabyd2.programowanie;

//import sun.jvm.hotspot.utilities.Assert;

import java.util.*;

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

        T g = nowaLista.get(b-1);
        nowaLista.remove(b-1);
        List<T> a = nowaLista;

        Object[] afterChanges= new Object[]{a, g};

        return afterChanges;
    }
}
