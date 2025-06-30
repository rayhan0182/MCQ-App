package com.softtech.multiplechoicequestion

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.softtech.multiplechoicequestion.databinding.ActivityMain2Binding


class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    private val vmodel: viewmodel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        currentquiz()

        binding.click.setOnClickListener {

            val sindex = binding.grp.indexOfChild(findViewById(binding.grp.checkedRadioButtonId))

            vmodel.canser(sindex)

            binding.grp.clearCheck()

            nextquiz()


        }


    }

    fun nextquiz() {


        if (vmodel.nextq()!=null){

            currentquiz()

        }else{

            Toast.makeText(this@MainActivity2,"${vmodel.score}", Toast.LENGTH_LONG).show()
        }




    }


    private fun currentquiz() {



        binding.let {

            vmodel.crntQ().apply {

                it.qstion.text = this.Question

                it.op.text = this.op1

                it.op2.text = this.op2

                it.op3.text = this.op3

                it.op4.text = this.op4


            }


        }

    }


}