package com.example.myhh.demo1

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DataGenrater : ViewModel(){
    val items=MutableLiveData<String>()
    val mRandomnumber = String
  /*  fun getNumber(items:MutableLiveData<String>)
    {
        if(mRandomnumber==null)
        {
            mRandomnumber=new 
        }
        return 
    }*/
    /* public MutableLiveData<String> grtNumber()
    {
        if(mRandomGenrater==null)
        {
            mRandomGenrater=new MutableLiveData<>();
            createNumber();
        }
        return mRandomGenrater;
    }*/
}