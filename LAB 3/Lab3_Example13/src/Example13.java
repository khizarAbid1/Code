import java.util.ArrayList;
import java.util.List;

public class Example13 {
    class Room
    {
        String roomname;
        Room(String roomname)
        {
            this.roomname=roomname;

        }
        void display_room()
        {
            System.out.println("Rooms : "+roomname );
        }

    }
    class House
    {
        String House_name;
        List<Room> rooms;
        House(String House_name)
        {
            this.House_name=House_name;
            this.rooms=new ArrayList<>();
        }
        public void add_rooms(String room_name)
        {
            rooms.add(new Room(room_name));
        }
        public  void display_details()
        {
            System.out.print("House Name : "+House_name);
            System.out.println();
            for(Room room :rooms)
            {
                room.display_room();
            }
        }
    }

    public static void main(String[] args)
    {
       Example13 example13=new Example13();

       House house1=example13.new House("Barkat Palace");
       house1.add_rooms("Bed room");
        house1.add_rooms("Living room");
        house1.add_rooms("Dinig room");
       house1.display_details();
    }
}
