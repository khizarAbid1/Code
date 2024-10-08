public class Example10 {


    class Teacher {
        String name;


        Teacher(String name) {
            this.name = name;
        }


        public void teach() {
            System.out.println(name + " is teaching");
        }
    }


    class RoomNumber {
        int room_number;
        Teacher teacher;


        RoomNumber(int room_number, Teacher teacher) {
            this.room_number = room_number;
            this.teacher = teacher;
        }


        public void room_details() {
            System.out.println("Class Room Number is: " + room_number);
            System.out.println("Teacher in the room: " + teacher.name);
        }
    }

    public static void main(String[] args) {

        Example10 example10 = new Example10();


        Teacher teacher1 = example10.new Teacher("Khizar");
        teacher1.teach();


        RoomNumber roomNumber1 = example10.new RoomNumber(10, teacher1);
        roomNumber1.room_details();
    }
}
