package com.ismailmesutmujde.kotlincatchthekenny

import android.content.DialogInterface
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlincatchthekenny.databinding.ActivityMainBinding
import java.util.Random



class MainActivity : AppCompatActivity() {

    private lateinit var bindingMainActivity: ActivityMainBinding
    var score = 0
    var imageArray = ArrayList<ImageView>()
    var runnable = Runnable {  }
    var handler = Handler(Looper.getMainLooper())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMainActivity = ActivityMainBinding.inflate(layoutInflater)
        val view = bindingMainActivity.root
        setContentView(view)

        // ImageArray
        imageArray.add(bindingMainActivity.imageView)
        imageArray.add(bindingMainActivity.imageView2)
        imageArray.add(bindingMainActivity.imageView3)
        imageArray.add(bindingMainActivity.imageView4)
        imageArray.add(bindingMainActivity.imageView5)
        imageArray.add(bindingMainActivity.imageView6)
        imageArray.add(bindingMainActivity.imageView7)
        imageArray.add(bindingMainActivity.imageView8)
        imageArray.add(bindingMainActivity.imageView9)
        imageArray.add(bindingMainActivity.imageView10)
        imageArray.add(bindingMainActivity.imageView11)
        imageArray.add(bindingMainActivity.imageView12)
        imageArray.add(bindingMainActivity.imageView13)
        imageArray.add(bindingMainActivity.imageView14)
        imageArray.add(bindingMainActivity.imageView15)
        imageArray.add(bindingMainActivity.imageView16)
        imageArray.add(bindingMainActivity.imageView17)
        imageArray.add(bindingMainActivity.imageView18)
        imageArray.add(bindingMainActivity.imageView19)
        imageArray.add(bindingMainActivity.imageView20)
        imageArray.add(bindingMainActivity.imageView21)
        imageArray.add(bindingMainActivity.imageView22)
        imageArray.add(bindingMainActivity.imageView23)
        imageArray.add(bindingMainActivity.imageView24)
        imageArray.add(bindingMainActivity.imageView25)

        hideImages()

        // CountDownTimer
        object : CountDownTimer(30500,1000) {
            override fun onTick(p0: Long) {
                bindingMainActivity.timeText.text = "Time : ${p0/1000}"
            }

            override fun onFinish() {
                bindingMainActivity.timeText.text = "Time : 0"
                handler.removeCallbacks(runnable)

                for (image in imageArray) {
                    image.visibility = View.INVISIBLE
                }

                // alert dialog
                val alert = AlertDialog.Builder(this@MainActivity)
                alert.setTitle("Game Over")
                alert.setMessage("Restart The Game?")
                alert.setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, i ->
                    // restart
                    val intentFromMain = intent
                    finish()
                    startActivity(intentFromMain)
                })
                alert.setNegativeButton("No", DialogInterface.OnClickListener { dialogInterface, i ->
                    Toast.makeText(this@MainActivity, "Game Over!", Toast.LENGTH_LONG).show()
                })
                alert.show()
            }

        }.start()
    }

    fun hideImages() {

        runnable = object : Runnable {
            override fun run() {
                for (image in imageArray) {
                    image.visibility = View.INVISIBLE
                }
                val random = Random()
                var randomIndex = random.nextInt(24)
                imageArray[randomIndex].visibility = View.VISIBLE

                handler.postDelayed(runnable, 500)
            }
        }
        handler.post(runnable)
    }

    fun increaseScore(view : View) {
        score = score + 1
        bindingMainActivity.scoreText.text = "Score : ${score}"
    }
}