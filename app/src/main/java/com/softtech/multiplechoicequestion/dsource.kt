package com.softtech.multiplechoicequestion

class dsource {

    val qlist: List<dmodel> = listOf(dmodel
        ("1. What is the default type of Kotlin list created using listOf()?",

        "A. MutableList","B. ArrayList","C. List","D. Set",2),

        dmodel
            ("2. Which function is used to add an element to a MutableList in Kotlin?",

            "A. append()","B. put()","C. add()","D. insert()",3),

        dmodel
            ("3. How do you create an empty mutable list in Kotlin?",

            "A. mutableListOf()","B. listOf()t","C. arrayListOf(null)","D. new MutableList()"
               ,0),

        dmodel
            ("4. Which of the following is true about Kotlin's List and MutableList?",

            "A. Both can modify elements freely","B. List is mutable and MutableList is immutable",

            "C. List is read-only and MutableList is read-write","D. Both are the same in Kotlin",2),




    )



}