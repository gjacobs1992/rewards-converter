import java.math.BigDecimal;

public class RewardValue {
    private double cashValue;
    private int miles;
    public RewardValue(double cash){
        this.cashValue = cash;
    };
    public RewardValue(int mile){
        this.miles = mile;
    }
    public double getMilesValue(){
        return this.cashValue * 0.0035;
    }
    public double getCashValue(){
        return this.cashValue;
    }
}
