package com.ayushkushwaha2212.quizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWER : String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        //1
        val que1 = Question(
            1, "what country does this flag belong to?",
            R.drawable.argentina,"Argentina", "Australia",
            "Armenia","Austria",
            1
        )
        questionsList.add(que1)

        //2

        val que2 = Question(
            1, "what country does this flag belong to?",
            R.drawable.ic_flag_of_india,"USA", "India",
            "Bhutan","Nepal",
            2
        )
        questionsList.add(que2)

        //3

        val que3 = Question(
            1, "what country does this flag belong to?",
            R.drawable.british,"Argentina", "Italy",
            "NewZealand","British",
            4
        )
        questionsList.add(que3)

        //4

        val que4 = Question(
            1, "what country does this flag belong to?",
            R.drawable.italy,"Italy", "Australia",
            "Armenia","Afghanistan",
            1
        )
        questionsList.add(que4)

        //5

        val que5 = Question(
            1, "what country does this flag belong to?",
            R.drawable.japan,"Taiwan", "Japan",
            "Norway","None Of These",
            2
        )
        questionsList.add(que5)

        //6

        val que6 = Question(
            1, "what country does this flag belong to?",
            R.drawable.russia,"Argentina", "Mexico",
            "Russia","Vietnam",
            3
        )
        questionsList.add(que6)

        //7

        val que7 = Question(
            1, "what country does this flag belong to?",
            R.drawable.switzerland,"Germany", "Oman",
            "Switzerland","UAE",
            3
        )
        questionsList.add(que7)

        //8

        val que8 = Question(
            1, "what country does this flag belong to?",
            R.drawable.ic_flag_of_america,"Greenland", "USA",
            "Japan","None Of These",
            2
        )
        questionsList.add(que8)

        return questionsList
    }
}