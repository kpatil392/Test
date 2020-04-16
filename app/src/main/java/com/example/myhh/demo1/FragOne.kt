package com.example.myhh.demo1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class FragOne : Fragment() {
    companion object {
        fun newInstance(): FragOne {
            val fragmentHome = FragOne()
            val args = Bundle()
            fragmentHome.arguments = args
            return fragmentHome
        }

    }
    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View? {
        return  return inflater.inflate(com.example.myhh.R.layout.frag_one,container,false)
    }
}