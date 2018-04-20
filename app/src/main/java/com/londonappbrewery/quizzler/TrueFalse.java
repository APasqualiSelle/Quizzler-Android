package com.londonappbrewery.quizzler;

/**
 * Created by Aline de Alexandria e Pasquali Selle - OpenClassrooms on 19/04/2018.
 */
public class TrueFalse {

    private int mQuestionID;
    private boolean mAnswer;

    //create a constructor
    public TrueFalse(int QuestionID, boolean trueOrFalse){

        mQuestionID = QuestionID;
        mAnswer=trueOrFalse;
    }

    public int getQuestionID() {
        return mQuestionID;
    }

    public void setQuestionID(int questionID) {
        mQuestionID = questionID;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }
}
