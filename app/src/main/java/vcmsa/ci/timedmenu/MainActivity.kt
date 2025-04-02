package vcmsa.ci.timedmenu


import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import vcmsa.ci.timedmenu.R.*


class MainActivity : AppCompatActivity() {

    private lateinit var userInput: EditText
    private lateinit var btnSuggest: Button
    private lateinit var btnClear: Button
    private lateinit var btnExit: Button
    private lateinit var userOutput: TextView

    @SuppressLint("WrongViewCast", "SetTextI18n", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(layout.activity_main)

        // Assigning vairiables to their IDs
        //Module Manual
        //Varsity College
        //Page 30 to 35
//https://advtechonline.sharepoint.com/:w:/r/sites/TertiaryStudents/_layouts/15/Doc.aspx?sourcedoc=%7BA1FF62F0-8E1A-47BC-99BD-CA07AE24427D%7D&file=IMAD5112_MM.docx&action=default&mobileredirect=true
        val userOutput = findViewById<TextView>(id.userOutput)
        userInput = findViewById(id.userInput)
        btnSuggest = findViewById(id.btnSuggest)
        btnClear = findViewById(id.btnClear)
        btnExit = findViewById(id.btnExit)


        btnExit.setOnClickListener {
            finish()
        }

        btnSuggest.setOnClickListener {
            val userInput = userInput.text.toString().trim().lowercase()
                val suggestFood = suggestFood(userInput)
                userOutput.text = "$suggestFood"
                userOutput.error = null
            }

        btnClear.setOnClickListener {
            userOutput.text = "Make a guess!"
            userInput.text.clear()
        }
    }
    //Module Manual page 53 to 57
    //https://advtechonline.sharepoint.com/:w:/r/sites/TertiaryStudents/_layouts/15/Doc.aspx?sourcedoc=%7BA1FF62F0-8E1A-47BC-99BD-CA07AE24427D%7D&file=IMAD5112_MM.docx&action=default&mobileredirect=true
    //Varsity College

    private fun suggestFood(userInput: String): Any {
        return when (userInput) {
            "morning" -> "Breakfast"
            "mid-morning" -> "Brunch"
            "afternoon" -> "Lunch"
            "mid-afternoon" -> "Snack"
            "Evening" -> "Dinner"

            else -> "Invalid"

        }
    }
}

private fun Nothing?.setBackgroundColor(backgroundColor: Int) {

}
