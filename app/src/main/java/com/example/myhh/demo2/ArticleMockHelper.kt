package com.example.myhh.demo2

import java.util.*
import kotlin.collections.ArrayList

object ArticleMockHelper {

    val mockArticleData: List<Article>
        get() {
            val list = ArrayList<Article>()
            for (i in 0..24) {
                val article = Article()
                article.title = "Nuevo evento de desarrollo"
                article.subtitle = "Los lugareños han creado un nuevo evento de desarrollo web cerca de su zona."
                article.excerpt = "La cita de referencia en España para los profesionales del marketing online vuelve al World Trade Center. Zaragoza acoge cada año a cientos de profesionales para aprender sobre SEO, Social Media, Analítica y Optimización, Desarrollo, actualizarse con los últimos cambios en Internet y realizar mucho… mucho networking."
                article.date = Date()

                list.add(article)
            }
            return list
        }

}