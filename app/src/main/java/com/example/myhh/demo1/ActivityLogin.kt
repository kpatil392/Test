package com.example.myhh.demo1

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.myhh.R
import com.example.myhh.databinding.ActivityLoginBinding

class ActivityLogin : AppCompatActivity()
{
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,
            R.layout.activity_login
        )
        binding.button.setOnClickListener(){
            var Name=binding.edtOne.text.toString().trim()
            var Pass=binding.edtTwo.text.toString().trim()
            if(Name.isEmpty())
            {
                Toast.makeText(this,"Enter Name",Toast.LENGTH_LONG).show()
            }else{
                if(Pass.isEmpty())
                {
                    Toast.makeText(this,"Enter Password",Toast.LENGTH_LONG).show()
                }else{
                    if(Name.equals("k") && Pass.equals("k") )
                    {
                        val intent=Intent(this, MainActivity::class.java)
                        intent.putExtra("K",Name)
                        intent.putExtra("N",Pass)
                        startActivity(intent)
                      /*  val bundle=Bundle()
                        bundle.putString("K",Name)
                        bundle.putString("N",Pass)
                        intent.putExtras(intent)
                        startActivity(intent)*/


                        // Toast.makeText(this," $Name \n $Pass",Toast.LENGTH_LONG).show()

                    }else{
                        Toast.makeText(this," wrong name & Password",Toast.LENGTH_LONG).show()

                    }
                }
            }
        }
        
        
        
        
    }
}

