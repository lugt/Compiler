package expression;

import tac.EnumOp;
//import identfiant.identifiant;

public abstract class OperationBooleenne extends Expression {

    //public Identifiant genererCode() { return null; };

    public EnumOp getType(){
        return EnumOp.OP_BOOL;
    }
}
