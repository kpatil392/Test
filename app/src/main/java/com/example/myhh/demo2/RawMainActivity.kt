package com.example.myhh.demo2

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myhh.R
import com.example.myhh.databinding.RawActivityMainBinding
import java.util.*
import java.util.logging.Logger
import kotlin.collections.ArrayList

class RawMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val log = Logger.getLogger(RawMainActivity::class.java.name)

        val binding = DataBindingUtil.setContentView<RawActivityMainBinding>(this, R.layout.raw_activity_main)
        //val articles = ArticleMockHelper.mockArticleData
        val list = ArrayList<Article>()
        for (i in 0..24) {
            val article = Article()
            article.title = "Nuevo evento de desarrollo"
            article.subtitle = "Los lugareños han creado un nuevo evento de desarrollo web cerca de su zona."
            article.excerpt = "La cita de referencia en España para los profesionales del marketing online vuelve al World Trade Center. Zaragoza acoge cada año a cientos de profesionales para aprender sobre SEO, Social Media, Analítica y Optimización, Desarrollo, actualizarse con los últimos cambios en Internet y realizar mucho… mucho networking."
            article.date = Date()
            list.add(article)
        }
        val layoutManager = LinearLayoutManager(this)
        binding.contactList.layoutManager = layoutManager
        val adapter = ArticleAdapter(list)
        binding.contactList.adapter = adapter

    }

    
}