package q15;

public class ExamSystemController {
    Exam exam = new Exam("id");

    public void createCentre(String name, String supervisorName) {
        ExamCenter examCenter = new ExamCenter("id", name);
        examCenter.setSupervisor(new Supervisor(supervisorName, "supervisorId"));
    }

    public void createClassroom(String centre, String classroomName, String invigilatorName) {
        ExamCenter examCenter = new ExamCenter("centerId", centre);
        ClassRoom classRoom = new ClassRoom("classroomId", classroomName);
        examCenter.addClassRoom(classRoom);
        classRoom.setInviligator(new Inviligator(invigilatorName, "staffId"));
    }

    public void addStudentToClassroom(String classroomName, String studentID) {
        ClassRoom classRoom = new ClassRoom("id", classroomName);
        classRoom.addStudent(studentID);
    }

    public void removeStudentFromClassroom(String classroomName, String studentID) {
        ClassRoom classRoom = new ClassRoom("id", classroomName);
        classRoom.removeStudent(studentID);
    }
}
