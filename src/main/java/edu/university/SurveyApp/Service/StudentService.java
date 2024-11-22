package edu.university.SurveyApp.Service;

import edu.university.SurveyApp.Model.Student;
import edu.university.SurveyApp.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // Fetch all surveys
    public List<Student> getAllSurveys() {
        return studentRepository.findAll();
    }

    // Fetch a specific survey by ID
    public Optional<Student> getSurveyById(int id) {
        return studentRepository.findById(id);
    }

    // Create a new survey
    public Student createSurvey(Student survey) {
        return studentRepository.save(survey);
    }

    // Update an existing survey
    public Student updateSurvey(int id, Student survey) {
        // Ensure the survey exists
        if (studentRepository.existsById(id)) {
            survey.setSurveyId(id); // Ensure the ID matches
            return studentRepository.save(survey);
        }
        return null; // Return null if the survey doesn't exist
    }

    // Delete a survey by ID
    public void deleteSurvey(int id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
        } else {
            throw new RuntimeException("Survey with ID " + id + " not found.");
        }
    }
}
