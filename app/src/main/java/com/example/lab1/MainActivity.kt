import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.lab1.R

class MainActivity : AppCompatActivity() {

    private lateinit var myButton: Button
    private lateinit var myImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Находим кнопку и изображение по их идентификаторам в макете
        myButton = findViewById(R.id.my_button)
        myImage = findViewById(R.id.my_image)

        // Устанавливаем обработчик нажатия на кнопку
        myButton.setOnClickListener {
            // При нажатии на кнопку меняем изображение
            myImage.setImageResource(R.drawable.my_new_image)
        }
    }
}