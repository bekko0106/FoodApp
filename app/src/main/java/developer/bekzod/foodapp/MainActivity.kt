package developer.bekzod.foodapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import developer.bekzod.foodapp.ui.AddFood
import developer.bekzod.foodapp.ui.AllFoodActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_taomlar.setOnClickListener {
            startActivity(Intent(this, AllFoodActivity::class.java))
        }

        btn_add_food.setOnClickListener {
            startActivity(Intent(this, AddFood::class.java))
        }
    }


}