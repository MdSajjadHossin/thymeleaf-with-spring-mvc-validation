package com.springboot.formvalidation;

import com.springboot.formvalidation.validation.CourseCode;
import jakarta.validation.constraints.*;

public class Customer {

    public String firstName;
    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    public String lastName;

    @NotNull(message = "is required")
    @Min(value = 0, message = "Must be grater than or equal to zero")
    @Max(value = 10, message = "Must be less than or equal to 10")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Only 5 chars/digits")
    private String postalCode;

    @CourseCode
    private String courseCode;


    // getter and setter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    //
}
