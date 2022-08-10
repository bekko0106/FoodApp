package developer.bekzod.foodapp.ui

import MySharedPreferese
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import developer.bekzod.foodapp.R
import developer.bekzod.foodapp.utils.MyFood
import kotlinx.android.synthetic.main.activity_add_food.*

class AddFood : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_food)

        MySharedPreferese.init(this)


        btn_save.setOnClickListener {

            val name = edt_name.text.toString().trim()
            val km = edt_kerakli_mahsulotlar.text.toString().trim()
            val tt = edt_tayyorlash_tartibi.text.toString().trim()


            if (name != "" && km != "" && tt != "") {

                val myFood = MyFood(name, km, tt)
                val list = MySharedPreferese.list
                list.add(myFood)
                MySharedPreferese.list = list
                Toast.makeText(this, "Saqlandi, Aldamagan bosez boldi", Toast.LENGTH_SHORT).show()
                finish()

            } else {
                Toast.makeText(this, "Toliq ma'lumot kirgaz", Toast.LENGTH_SHORT).show()
            }

        }


    }
}