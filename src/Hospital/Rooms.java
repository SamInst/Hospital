package Hospital;

public class Rooms {
    public int RoomNo;
    public String location;

    public Rooms(int roomNo, String location) {
        RoomNo = roomNo;
        this.location = location;
    }

    public int getRoomNo() {
        return RoomNo;
    }

    public void setRoomNo(int roomNo) {
        RoomNo = roomNo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
