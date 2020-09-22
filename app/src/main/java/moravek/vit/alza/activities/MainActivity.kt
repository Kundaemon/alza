package moravek.vit.alza.activities

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import moravek.vit.alza.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
