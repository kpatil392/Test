package com.example.myhh.demo1

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.myhh.*

import com.example.myhh.databinding.AactivityMainBinding
import kotlinx.android.synthetic.main.aactivity_main.*

class MainActivity : AppCompatActivity() , View.OnClickListener{
    private lateinit var binding: AactivityMainBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,
            R.layout.aactivity_main
        )
        tv.setOnClickListener(this)
        val prefs = customPreference(this)
        if(prefs.session!=true) {
            val bundle: Bundle = intent.extras
            val name = bundle.get("K")
            val pass = bundle.get("N")
            prefs.userId = name.toString()
            prefs.password = pass.toString()
            prefs.session = true
            Toast.makeText(this, "$name and $pass", Toast.LENGTH_LONG).show()
            tv.text="$name and $pass"
            supportActionBar?.setTitle("$name and $pass")
        }else{
            tv.text=prefs.userId+"--"+prefs.password
            supportActionBar?.setTitle(prefs.userId+"--"+prefs.password)

        }

    }
    
    override fun onClick(v: View?) {
       
        when(v?.id)
        {
            R.id.tv ->{
               // prefs.clearValues
                Toast.makeText(this, "Clera data", Toast.LENGTH_LONG).show()
            }
        }
    }
    fun data(mContext:Context)
    {
        val prefs = customPreference(mContext)
    }
}
   

