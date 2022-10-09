//Heart
class Cardiologist implements Doctor,DoctorAbstractFactory{

        public String speciality()
        {
            return "Cardiologist";
        }

        public String DoctorName(){
            return "Dr. Pankaj Manoria";
        }

        public int fees()
        {
            return 600;
        }

        public int experience(){
            return 25;
        }

        public Cardiologist createDoctor()
        {
            return new Cardiologist();
        }

}