package developer.bekzod.foodapp.ui

import MySharedPreferese
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import developer.bekzod.foodapp.R
import developer.bekzod.foodapp.utils.MyFood
import kotlinx.android.synthetic.main.activity_info.*

class infoActivity : AppCompatActivity() {
    private lateinit var myFood: MyFood
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        val index = intent.getIntExtra("keyIndex", 0)
        MySharedPreferese.init(this)

        myFood = MySharedPreferese.list[index]

        tv_name.text = myFood.name
        tv_mahsulot.text = myFood.kerakliMahsulot
        tv_Tayyorlash.text = myFood.tayyorlashTar


    }
}