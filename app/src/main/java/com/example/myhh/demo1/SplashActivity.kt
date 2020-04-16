package com.example.myhh.demo1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.databinding.DataBindingUtil
import com.example.myhh.R
import com.example.myhh.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity()  {
    private lateinit var binding: ActivitySplashBinding
    val SPLASH :Long=2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,
            R.layout.activity_splash
        )
        
        Handler().postDelayed({
            val prefs = customPreference(this)
            if(prefs.session==true)
            {
                val intent=Intent(this,MainActivity::class.java)
                startActivity(intent)
                finish()
            }else{
                val intent=Intent(this, ActivityLogin::class.java)
                startActivity(intent)
                finish()
            }
           
            //startActivity(Intent(this,MainActivity::class.java))
        },SPLASH)
    }
}
