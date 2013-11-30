public class ArithmetiqueUnaire extends OperationArithmetique {

    private Expression exp;
    private EnumOp op;

    public ArithmetiqueUnaire(Expression exp, EnumOp op) {
        this.exp = exp;
        this.op = op;
    }

    public Identifiant genererCode(){
        Identifiant operande = exp.genererCode();
        Identifiant res = new IdentifiantRegistre();
        String result = res + " = " + op + " " + operande;
        System.out.println(result);
        return res;
    }

}