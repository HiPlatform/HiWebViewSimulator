package com.example.alexandrevaz.hiwebviewsimulator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings

import kotlinx.android.synthetic.main.activity_main.webView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webViewSettings: WebSettings = webView.settings
        webView.loadUrl("https://dtbot.directtalk.com.br/1.0/staticbot/dist/index.html#!/?token=91e21a28-a555-4076-b8de-7cc0724d8e0b&widget=true&tab=true&top=40&text=Alguma%20d%C3%BAvida%3F&textcolor=ffffff&bgcolor=F7A723&from=right&widgetType=baloon&iconId=&fakebot=true&dttoken=DT-Fenix-Token P01_saG6szEtEsOfyqOh8cuxJmGqZoPOBUz_35274_819")

        webViewSettings.javaScriptEnabled = true
        webViewSettings.domStorageEnabled = true
    }
}
