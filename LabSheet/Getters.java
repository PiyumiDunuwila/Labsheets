public class Getters {
        private String name;
        private String contact_no;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String  getContactno() {
            return contact_no;
        }
        public void setcontactNo(String contact_No){
            this.contact_no = contact_no;
        }
        public int getAge(){
            return age;
        }
        public void setAge(int age){
            this.age = age;
        }
    }
    class Runsoftware{
        public static void main(String[] args) {
            Getters s = new Getters();
            s.setName("Piyumi");
            s.setcontactNo("+94760131597");
            s.setAge(21);
            System.out.println("Name =" + "\t" + s.getName() + "\n" + "contact_no" + "\t" + s.getContactno() + "\n" + "Age" + "\t" + s.getAge());
        }
    }