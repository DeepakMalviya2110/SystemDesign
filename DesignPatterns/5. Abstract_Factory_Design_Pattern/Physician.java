//Liver
class Physician implements Doctor,DoctorAbstractFactory{

        public String speciality()
        {
            return "Physician";
        }

        public String DoctorName(){
            return "Dr. Amit Yele";
        }

        public int fees()
        {
            return 100;
        }

        public int experience(){
            return 20;
        }

        public Physician createDoctor()
        {
            return new Physician();
        }

}