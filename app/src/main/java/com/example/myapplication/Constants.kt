package com.example.myapplication

object Constants {

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val ques1 = Question(
            1,
            "what country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Austrila",
            "Armenia", "Austria",
            1
        )

        questionsList.add(ques1)

        val ques2 = Question(
            2,
            "what country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Angola", "Austria",
            "Australia", "Armenia",
            3
        )

        questionsList.add(ques2)

        val ques3 = Question(
            3,
            "what country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Belarus", "Belize",
            "Brunei", "Brazil",
            4
        )

        questionsList.add(ques3)

        val ques4 = Question(
            4,
            "what country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Bahamas", "Belgium",
            "Barbados", "Belize",
            2
        )

        questionsList.add(ques4)

        val ques5 = Question(
            5,
            "what country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Gabon", "France",
            "Fiji", "Finland",
            3
        )

        questionsList.add(ques5)

        val ques6 = Question(
            6,
            "what country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Germany", "Georgia",
            "Greece", "none of these",
            1
        )

        questionsList.add(ques6)

        val ques7 = Question(
            7,
            "what country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Dominica", "Egypt",
            "Denmark", "Ethiopia",
            3
        )

        questionsList.add(ques7)

        val ques8 = Question(
            8,
            "what country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Ireland", "Iran",
            "Hungary", "India",
            4
        )

        questionsList.add(ques8)

        val ques9 = Question(
            9,
            "what country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "New Zealand", "Jordan",
            "Sudan", "Palestine",
            1
        )

        questionsList.add(ques9)

        return  questionsList

    }

}