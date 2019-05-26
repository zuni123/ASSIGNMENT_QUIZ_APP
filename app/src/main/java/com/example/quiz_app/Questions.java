package com.example.quiz_app;

import java.util.ArrayList;
import java.util.Arrays;

public class Questions {
    final String[] arrayz = {getString(R.string.e1), getString(R.string.e2), getString(R.string.e3), getString(R.string.e4), getString(R.string.e5),
            getString(R.string.e6), getString(R.string.e7), getString(R.string.e8), getString(R.string.e9), getString(R.string.e10),"what is this?"};

    private String getString(int h) {
        return null;
    }

    final Boolean[] arrayy = {true, false, false, true, false, true, false, true, true, true, false};

    final ArrayList<String> questions = new ArrayList<String>(Arrays.asList(arrayz));
    final ArrayList<Boolean> answers = new ArrayList<Boolean>(Arrays.asList(arrayy));
}
