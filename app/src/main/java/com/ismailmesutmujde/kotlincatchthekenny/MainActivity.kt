package com.ismailmesutmujde.kotlincatchthekenny

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlincatchthekenny.databinding.ActivityMainBinding
import java.util.Random


class MainActivity : AppCompatActivity() {

    private lateinit var bindingMainActivity: ActivityMainBinding
    var score = 0
    var imageArray = ArrayList<ImageView>()
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
    }

    fun hideImages() {
        for (image in imageArray) {
            image.visibility = View.INVISIBLE
        }
        val random = Random()
        var randomIndex = random.nextInt(24)
        imageArray[randomIndex].visibility = View.VISIBLE
    }

    fun increaseScore(view : View) {
        score = score + 1
        bindingMainActivity.scoreText.text = "Score : ${score}"
    }
}