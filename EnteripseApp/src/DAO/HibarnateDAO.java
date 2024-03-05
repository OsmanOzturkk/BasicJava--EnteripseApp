package DAO;

import Entity.Category;
import Entity.Course;
import Entity.Instructor;

public class HibarnateDAO implements InstructorDAO,CourseDAO,CategoryDAO {
    @Override
    public void add(Category category) {
        System.out.println(category.getCategoryName() + " Jdbc Veri Tabanına eklendi");
    }

    @Override
    public void add(Course course) {
        System.out.println(course.getCourseName() + " Jdbc Veri Tabanına eklendi");
    }

    @Override
    public void add(Instructor instructor) {
        System.out.println(instructor.getFirstName() + " Jdbc Veri Tabanına eklendi");
    }
}
