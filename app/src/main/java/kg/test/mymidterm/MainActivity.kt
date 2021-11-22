package kg.test.mymidterm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<ImageView>(R.id.imageView9)

        textView.setOnClickListener{
            startActivity(Intent(this,MainMidterm2::class.java))
        }
    }
}