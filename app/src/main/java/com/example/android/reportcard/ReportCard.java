package com.example.android.reportcard;

import androidx.annotation.NonNull;

public class ReportCard {

    private final String mFirstName;
    private final String mLastName;
    private final String mClassNo;
    private final int mStudentID;

    private char mMathGrade;
    private char mBosnianGrade;
    private char mChemistryGrade;
    private char mPhysicsGrade;
    private char mBiologyGrade;

    public ReportCard(String firstName, String lastName, int studentID, String classNo) {
        mFirstName = firstName;
        mLastName = lastName;
        mStudentID = studentID;
        mClassNo = classNo;
    }

    public ReportCard(String firstName, String lastName, int studentID, String classNo, char mathGrade,
                      char bosnianGrade, char chemistryGrade, char physicsGrade, char biologyGrade) {
        mFirstName = firstName;
        mLastName = lastName;
        mStudentID = studentID;
        mClassNo = classNo;
        mMathGrade = mathGrade;
        mBosnianGrade = bosnianGrade;
        mChemistryGrade = chemistryGrade;
        mPhysicsGrade = physicsGrade;
        mBiologyGrade = biologyGrade;
    }

    public char getMathGrade() {
        return mMathGrade;
    }

    public char getBosnianGrade() {
        return mBosnianGrade;
    }

    public char getChemistryGrade() {
        return mChemistryGrade;
    }

    public char getPhysicsGrade() {
        return mPhysicsGrade;
    }

    public char getBiologyGrade() {
        return mBiologyGrade;
    }

    public void setMathGrade(char mMathGrade) {
        this.mMathGrade = mMathGrade;
    }

    public void setBiologyGrade(char mBiologyGrade) {
        this.mBiologyGrade = mBiologyGrade;
    }

    public void setBosnianGrade(char mBosnianGrade) {
        this.mBosnianGrade = mBosnianGrade;
    }

    public void setChemistryGrade(char mChemistryGrade) {
        this.mChemistryGrade = mChemistryGrade;
    }

    public void setPhysicsGrade(char mPhysicsGrade) {
        this.mPhysicsGrade = mPhysicsGrade;
    }

    @NonNull
    @Override
    public String toString() {
        return "Student: " + mFirstName + " " + mLastName + ";" +
                "\nStudent ID: " + mStudentID + ";" +
                "\nClass: " + mClassNo + ";" +
                "\n\nMath grade: " + mMathGrade + ";" +
                "\nBosnian language grade: " + mBosnianGrade + ";" +
                "\nChemistry grade: " + mChemistryGrade + ";" +
                "\nPhysics grade: " + mPhysicsGrade + ";" +
                "\nBiology grade: " + mBiologyGrade + ";";
    }
}
