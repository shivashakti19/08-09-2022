package com.example.prac8sep

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //getting recyclerview from xml
        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView

        //adding a layoutmanager
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)


        //crating an arraylist to store users using the data class user
        val users = ArrayList<User>()

        //adding some dummy data to the list
        users.add(User("Belal Khan", "JharkhandRanchi@gmail.com"))
        users.add(User("Jim Jam", "jimjam@gmail.com"))
        users.add(User("Bal Khan", "balkhan@gmail.com"))
        users.add(User("Bel Khan", "belkhan@gmail.com"))
        users.add(User("Rohan San", "rohansan@gmail.com"))
        users.add(User("Fahad Gorge", "fahadgeorge@gmail.com"))
        users.add(User("Shrey hood", "shreyhood@gmail.com"))
        users.add(User("Jinal vada", "jinalvada@gmail.com"))


        //creating our adapter
        val adapter = CustomAdapter(users)

        //now adding the adapter to recyclerview
        recyclerView.adapter = adapter
    }
}