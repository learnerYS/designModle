package Interpreter;

/**
 * 解释器模式
 */
public class Demo {
    public static Expression getMaleExpression(){
        TerminalExpression ys = new TerminalExpression("ys");
        TerminalExpression dlh = new TerminalExpression("dlh");
        return new OrExpression(ys,dlh);
    }
    public static Expression getMarriedWomanExpression(){
        TerminalExpression zjx = new TerminalExpression("zjx");
        TerminalExpression married = new TerminalExpression("married");
        return new AndExpression(zjx,married);
    }
    public static void main(String[] args){
        Expression maleExpression = getMaleExpression();
        Expression marriedWomanExpression = getMarriedWomanExpression();

        System.out.println("ys is a male ?"+maleExpression.interpret("ys"));

        System.out.println("zjx is married?"+marriedWomanExpression.interpret("zjxmarried"));
    }
}
