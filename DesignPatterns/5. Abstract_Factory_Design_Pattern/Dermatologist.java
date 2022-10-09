//Skin
class Dermatologist implements Doctor,DoctorAbstractFactory{

        public String speciality()
        {
            return "Dermatologist";
        }

        public String DoctorName(){
            return "Dr. Ravichandran G";
        }

        public int fees()
        {
            return 300;
        }

        public int experience(){
            return 10;
        }

        public Dermatologist createDoctor()
        {
            return new Dermatologist();
        }

}