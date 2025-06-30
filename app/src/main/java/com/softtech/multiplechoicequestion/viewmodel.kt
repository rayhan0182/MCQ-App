package com.softtech.multiplechoicequestion

import androidx.lifecycle.ViewModel

class viewmodel: ViewModel() {

    var count = 0

    var score = 1

    val datasrc = dsource().qlist


    fun crntQ():dmodel{

           return  datasrc[count]

    }

    fun nextq():dmodel?{

        count++

       return if (datasrc.size>count){

            crntQ()

        }else{

            null

        }



    }

    fun canser(seaindex: Int){

        if (seaindex==datasrc[count].correctanser){

            score++

        }

    }




}