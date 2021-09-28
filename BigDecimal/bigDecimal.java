import java.math.BigDecimal;
import java.util.Arrays;

public class bigDecimal {
	
 public static void main(String[] args){


        BigDecimal[] Amounts = {new BigDecimal("1000.75"),new BigDecimal("11000.23"),new BigDecimal("4005.10")};
        BigDecimal intrestRate = new BigDecimal("0.05");

        for (int i =0 ;i<Amounts .length ; i++){

            BigDecimal CurrentBalance = Amounts[i].add(Amounts[i].multiply (intrestRate).setScale(2,BigDecimal.ROUND_DOWN));
                    System.out.println("Current Balance : "+CurrentBalance);
        }


    }
	
}