package instruction;

import java.util.*;
import expression.Expression;
import tac.*;

public class DoWhile extends While {

    public DoWhile(Instruction self, Expression condition) {
        super(condition, self);
    }

    public void genererCode(Label suivant) {
        Label avantDo = new Label();
        //ModifierStack.pushTV(pileTableVariable);
        PileTableVariable.ajouterEnvironnement();

        System.out.println(avantDo + ":");
        self.genererCode(avantDo);

        condition.genererJumpCode(avantDo, suivant);
        //ModifierStack.popTV(pileTableVariable);
        PileTableVariable.retirerEnvironnement();
    }

}

