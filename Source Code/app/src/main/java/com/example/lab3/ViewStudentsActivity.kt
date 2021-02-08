package com.example.lab3

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ViewStudentsActivity: AppCompatActivity() {

    // TODO: Add instance variables

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_students)

        // TODO: Hook up UI elements

        // TODO: Get necessary data from intent.extras

        buildStudentsList()

        // TODO: Course name as title in navigation bar
        // TODO: Compute the total age of all students in the course and display it in a textView
    }

    /**
     * Display the list of students & their attributes in the UI, separated by a newline
     * If an attribute is null, don't display it or its label
     *
     * Example:
     * Name: Adam Noel, Address: 2313 Hilltop Lane, Year of Study: 2, Age: 43 // student with all attributes
     * Name: Mike Danes, Year of Study: 4 // student missing a few attributes
     *
     */
    private fun buildStudentsList() {
        // TODO: Build student list and render it in the UI as described in the method comments
    }

    companion object {
        // TODO: Add bundle key variable(s)

        // TODO: Finish implementing newIntent method, make sure it also accepts a courseName argument

//        fun newIntent(students: List<String>, context: Context): Intent {
            // create the required intent
            // include the list of students in the intent extras
//        }
    }
}