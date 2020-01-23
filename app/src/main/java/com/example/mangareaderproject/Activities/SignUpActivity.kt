package com.example.mangareaderproject.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mangareaderproject.R
import kotlinx.android.synthetic.main.activity_sign_up.*
import kotlin.math.sign

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        bindListeners()
    }

    fun bindListeners(){
        sign_up_button.setOnClickListener {
            val email = sign_up_mail.text.toString()
            val password = sign_up_password.text.toString()
            val confirmPass = confirm_sign_up_password.text.toString()
            val error =validateInputs(email, password, confirmPass)
            if (!error.equals("")){
                Toast.makeText(this,error, Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
        }
    }

    fun validateInputs( email:String, password:String,confirmPass:String):String{
        if (email.isEmpty() || password.isEmpty() || confirmPass.isEmpty()){
            return "Fill in the Fields properly"
        }
        else if(!password.equals(confirmPass)){
            return "Fields do not match"
        }

        return ""
    }
}
