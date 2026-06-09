public class TaxBracket{
    public static void main(String[] args){
        int tax = 0;
        double income;
        String tax_Bracket = " ";

        Scanner sc = new Scanner(System.in);

        income = sc.nextDouble();

        if(income <= 5000){
            tax = income*0.05;
            tax_Bracket="Tax of 5%";
        }else if(income<=10000){
            tax = income*0.10;
            tax_Bracket = "Tax of 10%";
        }else if(income<=20000){
            tax = income*0.2;
            tax_Bracket = "Tax of 20%";
        }
        else{
            tax = income*0.3;
            tax_Bracket = "Tax of 30%";
        }
        System.out.println(income + "->" + tax_Bracket);
    }
}
