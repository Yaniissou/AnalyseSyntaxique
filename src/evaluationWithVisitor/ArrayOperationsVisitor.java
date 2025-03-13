package evaluationWithVisitor;

import model.*;

public interface ArrayOperationsVisitor<R> {

    R visit(Program program);
    R visit(Max max);
    R visit(Min min);
    R visit(Prod prod);
    R visit(Sort sort);
    R visit(Sum sum);
    R visit(VariableDeclaration<?> variable);
    R visit(Affectation<?> affectation);
    R visit(VarOut varOut);
    R visit(Median median);
    R visit(SecondMin secondMin);
    R visit(SecondMax secondMax);
}
