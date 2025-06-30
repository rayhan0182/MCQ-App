package com.softtech.multiplechoicequestion

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.softtech.multiplechoicequestion.databinding.ActivityMain2Binding


class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    val data = dsource().qlist
    var count = 0
    var score = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

         currentquiz()


         binding.click.setOnClickListener {

             val sindex = binding.grp.indexOfChild(findViewById(binding.grp.checkedRadioButtonId))

             if (sindex==data[count].correctanser){

                 score++

                 count++

                 currentquiz()

             }

             else{

                 count++

                 currentquiz()

             }


         }



    }



    private fun currentquiz() {

        if (data.size>count){

            binding.let {

                data[count].apply {

                    it.qstion.text = Question

                    it.op.text = op1

                    it.op2.text = op2

                    it.op3.text = op3

                    it.op4.text = op4

                }
            }

        }

        else{


            Toast.makeText(this@MainActivity2,"$score", Toast.LENGTH_LONG).show()


        }




    }
}