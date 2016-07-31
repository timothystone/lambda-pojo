/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.petmystone;

import java.util.List;
/**
 *
 * @author tstone
 */
public class ResponseClass {

        List names;

        public List getNames() {
            return names;
        }

        public void setGreetings(List names) {
            this.names = names;
        }

        public ResponseClass(List names) {
            this.names = names;
        }

        public ResponseClass() {}
    
}
