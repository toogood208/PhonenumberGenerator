package hfad.com.phonenumbergenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun generateNumber(view: View){

        // intstatiate the lead genrator class
        val leadGenerator = LeadGenerator()
        // grab the leads view
        val leads = findViewById<EditText>(R.id.number_of_leads)
        //convert the leads to string then to int
        val intLeads =  leads.text.toString().toInt()
        // return the set from the lead generator class
        val numbers = leadGenerator.results(intLeads)
        // convert numbers to array
        val arrayNumbers:Array<String> = numbers.toTypedArray()
        // use array adapter to hold the information
        val listAdapter = ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1,arrayNumbers)
        // grab the listview
        val numberList = findViewById<ListView>(R.id.numbers)
        //link list view to arrayadapter
        numberList.adapter = listAdapter

        // convert to int


    }
}