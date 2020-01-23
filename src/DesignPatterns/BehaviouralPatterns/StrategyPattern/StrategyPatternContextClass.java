package DesignPatterns.BehaviouralPatterns.StrategyPattern;

public class StrategyPatternContextClass {
    private int amount1;
    private int amount2;

    public StrategyPatternContextClass(int amount1,int amount2){
        this.amount1 = amount1;
        this.amount2 = amount2;
    }

    public int executeStrategy(Strategy strategy){
        return strategy.strategyOperation(this.amount1,this.amount2);
    }
}
