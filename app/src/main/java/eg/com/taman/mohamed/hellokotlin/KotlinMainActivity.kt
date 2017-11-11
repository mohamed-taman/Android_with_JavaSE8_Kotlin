package eg.com.taman.mohamed.hellokotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log.i
import android.view.View
import java.util.*

/**
 * Created by mohamed_taman on 11/6/17.
 */

class KotlinMainActivity : AppCompatActivity(), AgeComparer {

    private val TAG = "MainActivity"
    private var persons: List<Person>?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_main)

        persons = ArrayList()

        (persons as ArrayList<Person>).add(Person("Mohamed", 37))
        (persons as ArrayList<Person>).add(Person("Loky", 4))
        (persons as ArrayList<Person>).add(Person("Mariam", 5))
        (persons as ArrayList<Person>).add(Person("Malik", 8))
    }

    fun runCode(view: View) {

        Collections.sort(
                persons,
                this::compareAges
        )

        persons?.filter{ it.age > 5 }!!.forEach { i(TAG, "On Create -> " + it) }
    }


}
