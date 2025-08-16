package q15;

import java.util.ArrayList;
import java.util.List;

public class ExamCenter {
    private String centerId;
    private String name;
    // center and supervisor: aggregation 1 : 1
    private Supervisor supervisor;
    // classrooms and center: composition 1 : n
    private List<ClassRoom> classRooms = new ArrayList<>();

    public ExamCenter(String centerId, String name) {
    };

    public void setSupervisor(Supervisor supervisor) {
    };

    public void addClassRoom(ClassRoom classRoom) {
    };

}
