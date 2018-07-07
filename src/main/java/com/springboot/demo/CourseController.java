package com.springboot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@RestController
public class CourseController {
    //    @Autowired
////            CourseRepository courseRepository;
//    List<Course> courses= Arrays.asList(new Course(101,"java", "core java"), new Course(102, "sql", "postgres"));
    @Autowired
    CourseService courseService;

    //    @Autowired
//    RestTemplate restTemplate;
    @RequestMapping(value = "/courses", method = RequestMethod.GET)
    public List<Course> getAllCourses() {
        return courseService.getAllCouses();
    }

    @RequestMapping(value = "/courses/{id}", method = RequestMethod.GET)
    public Course getCourse(@PathVariable int id) {
//      Iterator<Course> iterator =courses.iterator();
//      while (iterator.hasNext());
//      Course course=iterator.next();
//      if (course.getId()==id){
        return courseService.getCourse(id);
    }

    @RequestMapping(value = "/courses", method = RequestMethod.POST)
    public void createCourses(@RequestBody Course course) {
        courseService.createCourse(course);
    }
@RequestMapping(value = "/courses/{id}", method = RequestMethod.DELETE)
    public void deleteCourse(@PathVariable int id){
       courseService.deleteCourse(id);
}
@RequestMapping(value = "/courses/{id}",method = RequestMethod.PUT)
public void update(@RequestBody Course course){
        courseService.update(course);
}
@RequestMapping(value = "/find")
public void findcourse(){}
}
