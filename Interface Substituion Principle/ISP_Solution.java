class SolveScenario{

        interface Payment{

                public void savePaymentDetails();
        } 

        interface OnlinePayment extends Payment{
            public void saveCardDetails();
        }

        public static class CreditCardPayment implements OnlinePayment{

            public void saveCardDetails(){
                System.out.println("Card Details has been saved!");
            }

            public void savePaymentDetails(){
                System.out.println("Payment Details has been saved!");
            }

        }

        public static class CashPayment implements Payment{

            public void savePaymentDetails(){
                System.out.println("Payment Details has been saved!");
            }

        }

        public static void main(String []args)
        {

            OnlinePayment pm=new CreditCardPayment();
            pm.saveCardDetails();
            pm.savePaymentDetails();
        }

}