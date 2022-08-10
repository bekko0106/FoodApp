package developer.bekzod.foodapp.ui

import MySharedPreferese
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import developer.bekzod.foodapp.R
import developer.bekzod.foodapp.adapters.MyFoodAdapter
import developer.bekzod.foodapp.utils.MyFood
import kotlinx.android.synthetic.main.activity_all_food.*

class AllFoodActivity : AppCompatActivity() {
    private lateinit var list: ArrayList<MyFood>
    private lateinit var myFoodAdapter: MyFoodAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_food)

        MySharedPreferese.init(this)
        list = MySharedPreferese.list



        myFoodAdapter = MyFoodAdapter(list, this)
        list_view_foods.adapter = myFoodAdapter


        list_view_foods.setOnItemClickListener { parent, view, position, id ->

            val intent = Intent(this, infoActivity::class.java)
            intent.putExtra("keyIndex", position)
            startActivity(intent)
        }


    }
}