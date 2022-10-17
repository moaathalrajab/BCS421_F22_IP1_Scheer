package com.example.bcs421_f22_ip1_scheer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import kotlinx.coroutines.delay

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        supportActionBar?.hide()

//        Handler().postDelayed({
//            val intent = Intent(this@SplashScreen, MainActivity::class.java)
//            startActivity(intent)
//            finish() //Makes sure user can't back into splash
//        },3000) //Sets a 3 second delay to splash

        MoveTo2()
    }

    private fun MoveTo2(){
        val someDelay = Thread{
            Thread.sleep(3000)
            val intent = Intent(this@SplashScreen, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        someDelay.start()
    }
}