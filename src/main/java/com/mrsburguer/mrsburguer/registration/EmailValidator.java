package com.mrsburguer.mrsburguer.registration;

import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class EmailValidator implements Predicate<String> {

    @Override
    public boolean test(String t) {
        // TODO: There's need to develop here
        return true;
    }

}
