package DesignPatterns.BehaviouralPatterns.StrategyPattern;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        int amount1 = 5;
        int amount2 = 5;
        StrategyPatternContextClass strategyPatternContextClass = new StrategyPatternContextClass(amount1,amount2);
        int additionResult = strategyPatternContextClass.executeStrategy(new StrategyConcreteClassOperationAdd());
        int multiplicationResult = strategyPatternContextClass.executeStrategy(new StrategyConcreteClassOperationMultiply());
        int divisionResult = strategyPatternContextClass.executeStrategy(new StrategyConcreteClassOperationDivide());
        int substractionResult = strategyPatternContextClass.executeStrategy(new StrategyConcreteClassOperationSubtract());

        System.out.println("Addition result: "+additionResult);
        System.out.println("multiplication result: "+multiplicationResult);
        System.out.println("division result : "+divisionResult);
        System.out.println("substraction result : "+substractionResult);
    }
}
