package q15;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
    private String classRoomId;
    private String name;
    // classRoom and inviligator: aggregation, 1 : 1
    private Inviligator inviligator;
    // classrooms and studnets: aggregation, 1 : n
    private List<Student> students = new ArrayList<>();

    public ClassRoom(String classRoomId, String name) {
    };

    public void setInviligator(Inviligator inviligator) {
    };

    public void addStudent(String studentId) {
    };

    public void removeStudent(String studentId) {
    };
}
