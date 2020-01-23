package DesignPatterns.BehaviouralPatterns.StrategyPattern;

public class StrategyConcreteClassOperationMultiply implements Strategy {
    @Override
    public int strategyOperation(int amount1, int amount2) {
        return  amount1*amount2;
    }
}
