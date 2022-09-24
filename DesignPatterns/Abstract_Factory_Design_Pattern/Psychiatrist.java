//Mental
class Psychiatrist implements Doctor,DoctorAbstractFactory{

        public String speciality()
        {
            return "Psychiatrist";
        }

        public String DoctorName(){
            return "Dr. Virat Kohli";
        }

        public int fees()
        {
            return 1000;
        }

        public int experience(){
            return 15;
        }

        public Psychiatrist createDoctor()
        {
            return new Psychiatrist();
        }

}