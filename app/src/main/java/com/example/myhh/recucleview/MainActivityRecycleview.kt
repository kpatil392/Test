package com.example.myhh.recucleview

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.AbsListView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.JSONObjectRequestListener
import com.example.myhh.R
import com.example.myhh.databinding.ActivityMainRecycleviewBinding
import com.google.gson.Gson
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import kotlin.collections.listOf as listOf1

class MainActivityRecycleview : AppCompatActivity()
{
    private lateinit var binding: ActivityMainRecycleviewBinding
    lateinit var recyclerAdapter: CustomAdapter

    lateinit var list:ArrayList<Models>
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main_recycleview)
        binding.rvlist.layoutManager= LinearLayoutManager(this,LinearLayout.VERTICAL,false)
        //binding.rvlist.adapter=CustomAdapter(,this)
       
        recyclerAdapter = CustomAdapter(this)
        binding.rvlist.layoutManager = LinearLayoutManager(this)
        binding.rvlist.adapter = recyclerAdapter
        
        val apiInterface = ApiInterface.create().getMovies()
        
    }
    fun getData(offset: Int) {
        AndroidNetworking.post("https://geecomindia.in/index.php/api/v1/explore-supply-v2")
            .addHeaders("Authentication-control", "")
            .addBodyParameter("lang_code", "en")
            .addBodyParameter("user_id", "652317339961")
            .addBodyParameter("supply_type", "1")
            .addBodyParameter("pincode", "452001")
            .addBodyParameter("lat", 22.2121212.toString())
            .addBodyParameter("lon", 72.24545.toString())
            .addBodyParameter("product_offset", offset.toString())
            .setTag("getexploreSupply")
            .setPriority(Priority.MEDIUM)
            .build()
            .getAsJSONObject(object : JSONObjectRequestListener {
                override fun onResponse(response: JSONObject) { //Log.i("Resp", response.toString());

                  /*  val example: Response =Gson().fromJson<Response>(response.toString(), Response::class.java)
                    if (example.status === 200) {
                        *//*list.add(example.list)*//*
                    
                       
                     
                    }
                 */
                    
                }

                override fun onError(anError: ANError) {}
            })
    }




}

