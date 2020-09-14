package br.com.maypay.calculadora

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_histo.*
import org.json.JSONArray

class HistActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_histo)

        // receiving a simple string
        /*val stringHist = intent.getStringExtra("stringHist")

        var hist = stringHist?.split(";")
        for (item in hist!!){
            textView.text = textView.text.toString() + item.replace("*[%]", "%") + "\n"
        }*/

        // receiving a list of strings
        /*val listStringHist = intent.getStringArrayListExtra("listStringHist")
        for (item in listStringHist?.indices!!){
            textView.text = textView.text.toString() + listStringHist[item].replace("*[%]", "%") + "\n"
        }*/

        // receiving a single historic
        //val historic = intent.getParcelableExtra<History>("Historic")
        //textView.text = textView.text.toString() +  "expression: "+historic?.expression_calc + " result: "+historic?.result_calc + "\n"

        // receiving an array of historics
        //var historico = intent.getParcelableArrayListExtra<History>("Historics")
        //if (historico != null){
        //    for (i in historico.indices){
        //        textView.text =  textView.text.toString() + "expression: "+historico[i].expression_calc + " result: "+historico[i].result_calc + "\n"
        //        println(historico[i].expression_calc + " " + historico[i].result_calc)
        //    }
        //}

        // receiving a array of jsons with historics
        var arrayJon = intent.getStringExtra("jsonArray")
        var objArrayJson = JSONArray(arrayJon)

        for (i in 0 until objArrayJson.length()){
            var item = objArrayJson.getJSONObject(i)
            println(item.toString())
            textView.text = textView.text.toString() + item.toString() + "\n"
        }

    }
}