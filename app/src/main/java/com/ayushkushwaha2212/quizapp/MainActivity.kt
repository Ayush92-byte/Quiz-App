package com.ayushkushwaha2212.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnStart : Button = findViewById(R.id.btn_start)
        val etName : EditText = findViewById(R.id.et_name)
        btnStart.setOnClickListener {

            if(etName.text.isEmpty()){
                Toast.makeText(this,"Please Enter your Name"
                ,Toast.LENGTH_LONG).show()     /* Toast is use for poping a little msg  */
            }
            else{
                val intent = Intent(this,QuizQuestionsActivity::class.java)   /* Intent is use for going from this activity to other. */
                intent.putExtra(Constants.USER_NAME, etName.text.toString())
                startActivity(intent)                       /* initialising the intent */
                finish()                                    /* finish the previous activity*/
            }
        }
    }
}