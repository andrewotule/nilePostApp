package com.andrew.nilepostapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    // private val web : WebView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //create a variable so that we can link the webview
        val web = findViewById<WebView>(R.id.webnile)
        web.webViewClient = WebViewClient()//responsible for loading the url defined below
        web.loadUrl("https://nilepost.co.ug/")
        val webSettings=web.settings
        webSettings.javaScriptEnabled=true

    }

    /*override fun onBackPressed() { //enables someone to remain on the site
        if (web!!.canGoBack()) {
            web.goBack()
        }
        super.onBackPressed()
    }*/
}