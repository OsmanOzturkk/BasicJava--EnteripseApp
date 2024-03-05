package Entity;

import java.util.List;

public class Category {
    private String categoryName;
    private List<Course> courseList;



    public Category(String categoryName, List<Course> courseList) {
        this.categoryName = categoryName;
        this.courseList = courseList;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryName='" + categoryName + '\'' +
                ", courseList=" + courseList +
                '}';
    }
}
