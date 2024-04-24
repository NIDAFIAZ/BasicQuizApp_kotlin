package com.example.quizapp

object setData {

    const val name:String="name"
    const val score:String="score"


    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()

        var question1= QuestionData(
            1,
            " What is the keyword used to define a class in Kotlin?",
            "class",
            "struct",
            "object",
            "type",
            1
        )
        var question2= QuestionData(
            1,
            "What is the syntax for calling a method in Kotlin?",
            "object.method()",
            "object.function()",
            "object.procedure()",
            "object.call()",
            1
        )

        var question3= QuestionData(
            1,
            "What is the keyword used to define an extension function in Kotlin?",
            "extend",
            "fun",
            "operator",
            "infix",
            2
        )
        var question4= QuestionData(
            1,
            "What is the purpose of the constructor keyword in Kotlin?",

            "to initialize variables",
            "to set default values for variables",
            "to define a constructor",
            "to create object",
            3
        )
        var question5= QuestionData(
            1,
            "How do you declare a variable in Kotlin?",
            "let myVariable = 10;",
            "val myVariable: Int = 10",
            "const myVariable = 10;",
            "var myVariable: Int = 10",
            4
        )
        que.add(question1)
        que.add(question2)
        que.add(question3)
        que.add(question4)
        que.add(question5)
        return que
    }

}