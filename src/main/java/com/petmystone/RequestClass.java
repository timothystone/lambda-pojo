/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.petmystone;

/**
 *
 * @author tstone
 */
public class RequestClass {

    int numberOfNames;

    public int getNumberOfNames() {
        return numberOfNames;
    }

    public void setNumberOfNames(int numberOfNames) {
        this.numberOfNames = numberOfNames;
    }

    public RequestClass(int numberOfNames) {
        this.numberOfNames = numberOfNames;
    }

    public RequestClass() {
    }
}
