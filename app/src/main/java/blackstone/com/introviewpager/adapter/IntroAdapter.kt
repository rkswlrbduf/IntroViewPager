package blackstone.com.introviewpager.adapter

import android.graphics.Color
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import blackstone.com.introviewpager.fragment.IntroFragment

class IntroAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    lateinit var frag1: IntroFragment
    lateinit var frag2: IntroFragment

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> {
                frag1 = IntroFragment.newInstance(Color.parseColor("#03A9F4"), position)
                return frag1
            }
            else -> {
                frag2 = IntroFragment.newInstance(Color.parseColor("#4CAF50"), position)
                return frag2
            }
        }
    }

    fun getFragmentBackgroundColor(position: Int): Int? {
        when (position) {
            0 -> return frag1.getBackgroundColor()
            else -> return frag2.getBackgroundColor()
        }
    }

    override fun getCount(): Int = 2

}