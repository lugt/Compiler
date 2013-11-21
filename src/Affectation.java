public class Affectation extends Instruction {
    private Expression gauche;
    private Expression droite;

    public Affectation(Expression gauche, Expression droite){
        this.gauche = gauche;
        this.droite = droite;
    }

    public boolean verifier(){
        // Verification de gauche.type == droite.type
        return true;
    }

    public String evaluer(){

        return gauche.evaluer(EnumOp.UNKNOWN) + "=" + droite.evaluer(EnumOp.AFFECT);
    }
}

