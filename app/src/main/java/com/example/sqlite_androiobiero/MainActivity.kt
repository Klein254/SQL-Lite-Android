package com.example.sqlite_androiobiero

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var edtName:EditText
    lateinit var edtEmail:EditText
    lateinit var edtID:EditText
    lateinit var btnSave:Button
    lateinit var btnView:Button
    lateinit var btnDelete:Button
    lateinit var db:SQLiteDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        edtName = findViewById(R.id.edtName)
        edtEmail = findViewById(R.id.edtEmail)
        edtID = findViewById(R.id.edtID)
        btnSave = findViewById(R.id.btnSave)
        btnView = findViewById(R.id.btnView)
        btnDelete = findViewById(R.id.btnDelete)

        //CREATING THE DATABASE
        db = openOrCreateDatabase("ObieroDB", Context.MODE_PRIVATE, null)

        //CREATING A TABLE
        db.execSQL("CREATE TABLE IF NOT EXISTS users")


        btnSave.setOnClickListener {

        }
        btnView.setOnClickListener {

        }
        btnDelete.setOnClickListener {

        }


    }
}