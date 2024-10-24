package vn.edu.hust.listexamples

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val students = mutableListOf<StudentModel>()
    for (i in 0..27)
      students.add(
        StudentModel("Student $i", "$i",
        resources.getIdentifier("thumb$i", "drawable", packageName))
      )

    val adapter = StudentAdapter(students)

    val listStudents = findViewById<ListView>(R.id.list_students)
    listStudents.adapter = adapter
  }
}