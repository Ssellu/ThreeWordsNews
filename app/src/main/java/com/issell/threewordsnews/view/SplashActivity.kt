package com.issell.threewordsnews.view

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.issell.threewordsnews.R
import kotlinx.android.synthetic.main.activity_splash.*
import kotlinx.coroutines.*


class SplashActivity : AppCompatActivity() {
    companion object {
        // Splash's shown time in millis
        const val MILLI_DELAYED: Long = 2500
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_splash)

        val topAnim: Animation = AnimationUtils.loadAnimation(this,
            R.anim.top_splash_anim
        )
        val bottomAnim: Animation = AnimationUtils.loadAnimation(this,
            R.anim.bottom_splash_anim
        )

        splash_iv_logo.animation = topAnim
        splash_tv_app_name.animation = bottomAnim
        splash_tv_author.animation = bottomAnim

        GlobalScope.launch {
            delay(MILLI_DELAYED)
            goToMainActivity()
        }
    }

    private fun goToMainActivity(){
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }

    override fun finish() {
        super.finish()
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }
}
