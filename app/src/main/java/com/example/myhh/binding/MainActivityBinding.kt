package com.example.myhh.binding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.library.baseAdapters.BR
import com.example.myhh.R
import com.example.myhh.databinding.BindingActivityMainBinding

class MainActivityBinding: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: BindingActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.binding_activity_main)
        val user = User("Amanjeet Singh", 21, "amanjeetsingh150@gmail.com")
        binding.setVariable(BR.user,user)
    }
}