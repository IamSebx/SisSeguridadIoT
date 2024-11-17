package com.example.sisseguridad

import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Aquí vinculamos el layout creado

        
        val webView = findViewById<WebView>(R.id.webView)
        val webSettings: WebSettings = webView.settings

        webSettings.javaScriptEnabled = true
        webView.webViewClient = WebViewClient()

        webView.loadUrl("https://beneficiariosgob.neocities.org/")
    }
}
