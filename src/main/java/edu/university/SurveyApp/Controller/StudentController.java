package edu.university.SurveyApp.Controller;

import edu.university.SurveyApp.Model.Student;
import edu.university.SurveyApp.Service.StudentService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/survey")
public class StudentController {

	private static final Logger logger = LoggerFactory.getLogger(StudentService.class);

    @Autowired
    private StudentService studentService;

    @GetMapping
    public ResponseEntity<List<Student>> getAllSurveys() {
        return new ResponseEntity<>(studentService.getAllSurveys(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getSurveyById(@PathVariable int id) {
        return studentService.getSurveyById(id)
                .map(survey -> new ResponseEntity<>(survey, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/create")
    public ResponseEntity<Student> createSurvey(@RequestBody Student survey) {
    	logger.info(survey.getFirstName());
        return new ResponseEntity<Student>(studentService.createSurvey(survey), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateSurvey(@PathVariable int id, @RequestBody Student survey) {
        Student updatedSurvey = studentService.updateSurvey(id, survey);
        if (updatedSurvey != null) {
            return new ResponseEntity<>(updatedSurvey, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSurvey(@PathVariable int id) {
        studentService.deleteSurvey(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}