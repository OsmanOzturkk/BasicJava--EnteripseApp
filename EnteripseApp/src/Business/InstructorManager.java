package Business;

import DAO.InstructorDAO;
import Entity.Course;
import Entity.Instructor;
import Log.Logger;

import java.util.ArrayList;
import java.util.List;

public class InstructorManager {

    private InstructorDAO instructorDAO;
    private List<Logger> loggers;



    public InstructorManager(InstructorDAO instructorDAO,List<Logger> loggers) {
        this.instructorDAO = instructorDAO;
        this.loggers = loggers;
    }

    public void add(String firstName,String lastName,List<Course> courses) {

            Instructor instructor = new Instructor(firstName,lastName,courses);
            instructorDAO.add(instructor);

            for (Logger logger : loggers) {
                logger.log(instructor.getFirstName());
            }
    }
}
