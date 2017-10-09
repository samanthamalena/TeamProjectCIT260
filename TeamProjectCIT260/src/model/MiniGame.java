/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Me
 */
public class MiniGame implements Serializable {
    private int numberOfQuestions;
    private String equations;
     private ArrayList<Question> questions = new ArrayList<Question>();

    public MiniGame() {
    }

    public int getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public void setNumberOfQuestions(int numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }

    public String getEquations() {
        return equations;
    }

    public void setEquations(String equations) {
        this.equations = equations;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.numberOfQuestions;
        hash = 71 * hash + Objects.hashCode(this.equations);
        hash = 71 * hash + Objects.hashCode(this.questions);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MiniGame other = (MiniGame) obj;
        if (this.numberOfQuestions != other.numberOfQuestions) {
            return false;
        }
        if (!Objects.equals(this.equations, other.equations)) {
            return false;
        }
        if (!Objects.equals(this.questions, other.questions)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MiniGame{" + "numberOfQuestions=" + numberOfQuestions + ", equations=" + equations + ", questions=" + questions + '}';
    }
     
    
    
}
