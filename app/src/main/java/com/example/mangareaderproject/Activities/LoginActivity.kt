package com.example.mangareaderproject.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mangareaderproject.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        bindListeners()
    }

    fun bindListeners(){
        go_to_sign_up.setOnClickListener {
            val intent = Intent(this,SignUpActivity::class.java)
            startActivity(intent)
        }

        log_in_button.setOnClickListener {

            val email = log_in_mail.text.toString()
            val password = log_in_password.text.toString()
            val error  = validateInputs(email, password)

            if (!error.equals("")){
                Toast.makeText(this,error,Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
        }
    }

    fun validateInputs( email:String, password:String):String{
        if (email.isEmpty() || password.isEmpty()){
            return "Fill in the Fields properly"
        }

        return ""
    }
}
