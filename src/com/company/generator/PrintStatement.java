package com.company.generator;

import com.company.base.CondExpr;
import com.company.base.VarName;
import com.company.utils.VarGen;

public class PrintStatement implements Statement{
//    print: ‘print’ var_name’;’
    private String variableName;

    public PrintStatement(VarName variableName) {
        this.variableName = variableName.toString();
    }

    public PrintStatement() {}

    public void generateStatement() {
        VarGen varGen = new VarGen();
        this.variableName = varGen.getRandom().toString();
        return;
    }

    @Override
    public String toString() {
        String val = "print " + this.variableName + ";";
        return val;
    }
}
