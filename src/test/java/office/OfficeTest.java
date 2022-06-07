package office;

import java_basic.office.MeetingRoom;
import java_basic.office.Office;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.*;

class OfficeTest {
    Office office;
    @BeforeEach
    void init(){
        System.out.println("init");
        office = new Office();
        office.addMeetingRoom(new MeetingRoom("Tárgyaló", 15, 20));
        office.addMeetingRoom(new MeetingRoom("Aula", 20, 20));
        office.addMeetingRoom(new MeetingRoom("Kistárgyaló", 3, 5));
        office.addMeetingRoom(new MeetingRoom("Előadó", 15, 32));
        office.addMeetingRoom(new MeetingRoom("Vizsgaterem", 10, 20));
    }

    @Test
    void getNames() {
        assertLinesMatch(List.of("Tárgyaló", "Aula", "Kistárgyaló", "Előadó", "Vizsgaterem"), office.getNames());
    }

    @Test
    void getNamesReverse() {
        assertLinesMatch(List.of("Vizsgaterem", "Előadó", "Kistárgyaló", "Aula", "Tárgyaló"), office.getNamesReverse());
    }

    @Test
    void getEvenNames() {
        assertLinesMatch(List.of("Tárgyaló", "Kistárgyaló", "Vizsgaterem"), office.getEvenNames());
    }

    @Test
    void getAreas() {
        List<Integer> areas = new ArrayList<>(List.of(15*20, 20*20, 3*5, 15*32, 10*20));

        for(int i = 0; i< areas.size(); i++){
            assertEquals(office.getAreas().get(i), areas.get(i));
        }
    }
    @Test
    void getAreas_wrong() {
        List<Integer> areas = new ArrayList<>(List.of(15*20+1, 20*20-2, 3*5-3, 15*32*0, 10*20-2));

        for(int i = 0; i< areas.size(); i++){
            assertNotEquals(office.getAreas().get(i), areas.get(i));
        }
    }

    @Test
    void getMeetingRoomsWithName() {
        assertEquals("Tárgyaló", office.getMeetingRoomsWithName("Tárgyaló"));
    }
    @Test
    void getMeetingRoomsWithName_not_found() {
        assertEquals("Not found", office.getMeetingRoomsWithName("YZ65"));

    }
    @Test
    void getMeetingRoomsWithName_not_found_not_equals() {
        assertNotEquals("Tárgyaló", office.getMeetingRoomsWithName("YZ65"));

    }

    @Test
    void getMeetingRoomsContains() {
        var result = office.getMeetingRoomsContains("l");
        assertEquals(2, result.size());


        assertEquals(List.of("Tárgyaló", "Aula", "Kistárgyaló", "Előadó"), result.stream().map(MeetingRoom::getName).toList());

    }
/*
    @Test
    void getAreasLargerThan() {
    }

 */
}