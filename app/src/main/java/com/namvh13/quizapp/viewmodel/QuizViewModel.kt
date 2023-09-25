package com.namvh13.quizapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.namvh13.quizapp.model.QuestionsList
import com.namvh13.quizapp.repository.QuizRepository

class QuizViewModel: ViewModel() {
    var repository: QuizRepository = QuizRepository()

    lateinit var questionsLiveData: LiveData<QuestionsList>

    init {
        questionsLiveData = repository.getQuestionsFromAPI()
    }

    fun getQuestionsFromLiveData(): LiveData<QuestionsList>{
        return questionsLiveData
    }
}