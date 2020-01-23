package DesignPatterns.BehaviouralPatterns.StrategyPattern;

public class StrategyConcreteClassOperationAdd implements Strategy {
    @Override
    public int strategyOperation(int amount1, int amount2) {
        return  amount1+amount2;
    }
}
