package Ex12;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class BankAccount{
    private double principal_amt,rate_invest;
    private int years;
    public void setPrincipal(double principal_amt){
        this.principal_amt = principal_amt;
    }
    public void setInterestRate(double int_rate){
        this.rate_invest = int_rate / 100.0;
    }
    public void setYears(int years)
    {
        this.years = years;
    }
    public int getYears()
    {
        return this.years;
    }
    public String getAmount()
    {
        Locale locale = new Locale("en", "US");
        NumberFormat curr_format = NumberFormat.getCurrencyInstance(locale);
        double total = this.principal_amt * (1 + (this.years * this.rate_invest));
        return curr_format.format(total);
    }
}
