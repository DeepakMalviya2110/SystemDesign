class ViolateScenario{

        interface Payment{

                public void saveCardDetails();

                public void savePaymentDetails();
        } 

        public static class CreditCardPayment implements Payment{

            public void saveCardDetails(){
                System.out.println("Card Details has been saved!");
            }

            public void savePaymentDetails(){
                System.out.println("Payment Details has been saved!");
            }

        }

        public static class CashPayment implements Payment{

             public void saveCardDetails(){
                System.out.println("Card has not been used!");   //This is violating Interface Substutuion Principle
            }

            public void savePaymentDetails(){
                System.out.println("Payment Details has been saved!");
            }

        }

        public static void main(String []args)
        {

            Payment pm=new CashPayment();

            pm.savePaymentDetails();
        }

}