package com.company.utils;

import com.company.base.VarName;

import java.util.ArrayList;
import java.util.Random;

public class VarGen {

    public static ArrayList<VarName> existingVar = new ArrayList<>();

    public VarGen () {}

    public VarName generate() {
        VarName newVariable = new VarName();
        this.existingVar.add(newVariable);
        return newVariable;
    }

    public VarName getRandom() {
        if (this.existingVar.size() <= 0) {
            return generate();
        }
        int upperLimit = this.existingVar.size();
        Random r = new Random();
        int randomIndex = r.nextInt(upperLimit);

        return this.existingVar.get(randomIndex);
    }
}
