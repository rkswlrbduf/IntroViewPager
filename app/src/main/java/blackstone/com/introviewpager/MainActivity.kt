package blackstone.com.introviewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import blackstone.com.introviewpager.adapter.IntroAdapter
import blackstone.com.introviewpager.transformer.IntroPageTransformer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewpager.adapter = IntroAdapter(supportFragmentManager)
        viewpager.setPageTransformer(false, IntroPageTransformer(viewpager))

    }

}
