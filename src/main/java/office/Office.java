package office;

import java.util.ArrayList;
import java.util.List;

public class Office {
    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public List<String> getNames() {
        System.out.println("Getting the names of MeetingRooms:");
        List<String> res = new ArrayList<>();
        for (MeetingRoom m : meetingRooms) {
            res.add(m.getName());
        }
        return res;
    }

    public List<String> getNamesReverse() {
        System.out.println("Getting the names of MeetingRooms, but in reverse:");
        List<String> res = new ArrayList<>();
        for (int i = meetingRooms.size() - 1; i >= 0; i--) {
            res.add(meetingRooms.get(i).getName());
        }
        return res;
    }

    public List<String> getEvenNames() {
        System.out.println("Printing out the names of every other MeetingRoom");
        List<String> res = new ArrayList<>();
        for (int i = 0; i < meetingRooms.size(); i++) {
            if (i % 2 == 0) {
                res.add(meetingRooms.get(i).getName());
            }
        }
        return res;
    }

    public List<Integer> getAreas() {
        List<Integer> res = new ArrayList<>();
        for (MeetingRoom m : meetingRooms) {
            res.add(m.getArea());
        }
        return res;

    }

    public String getMeetingRoomsWithName(String name) {
        //give back the name of the first occurence
        for (MeetingRoom m : meetingRooms) {
            if (m.getName().equals(name)) {
                return (m.getName());
            }
        }
        return "Not found";

    }

    public List<String> getMeetingRoomsContains(String part) {
        List<String> res = new ArrayList<>();
        //TODO
        return res;
    }

    public List<String> getAreasLargerThan(int area) {
        List<String> res = new ArrayList<>();
        //TODO

        return res;
    }
}
