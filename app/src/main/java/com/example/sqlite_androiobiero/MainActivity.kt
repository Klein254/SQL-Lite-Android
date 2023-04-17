package com.example.sqlite_androiobiero

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

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
        db.execSQL("CREATE TABLE IF NOT EXISTS users(jina VARCHAR, arafa VARCHAR, kitambulisho VARCHAR)")


        btnSave.setOnClickListener {
            var jina_edt = edtName.text.toString().trim()
            var arafa_edt = edtEmail.text.toString().trim()
            var kitambulisho_edt = edtID.text.toString().trim()

            //VALIDATE EDIT TEXT
            if(jina_edt.isEmpty() || kitambulisho_edt.isEmpty() || arafa_edt.isEmpty()){
                Toast.makeText(this, "Cannot Submit an Empty Field", Toast.LENGTH_SHORT).show()
            }
            else{
                //INSERT DATA
                db.execSQL("INSERT INTO users VALUES('\"+jina_edt+\"' , '\"+arafa_edt+\"' , '\"+kitambulisho_edt+\"')")

                Toast.makeText(this, "Data Saved Successfully", Toast.LENGTH_SHORT).show()
            }
        }


        btnView.setOnClickListener {

        }


        btnDelete.setOnClickListener {

        }


    }
}