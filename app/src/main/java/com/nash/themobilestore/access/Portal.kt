package com.nash.themobilestore.access

import com.nash.themobilestore.objectmanagement.ObjectCreation

class Portal {

    val objectCreation = ObjectCreation

    fun selectYourRole(){


        println("You are Admin or User\n" +
                "1. Admin\n" +
                "2. User"
        )
        val userInput = readLine()?.get(0)!!
        when(userInput){
            '1' -> admin()
            '2' -> user()
        }
    }

    private fun user() {
        println("Which Phone Do you want to look\n" +
                "1. Basic Phone\n" +
                "2. Smart Phone")
        val userInput = readLine()?.get(0)

        when(userInput){
            '1' -> objectCreation.displayPhone.getTheTypeOfPhone("basic")
            '2' -> objectCreation.displayPhone.getTheTypeOfPhone("smart")
        }
    }

    private fun admin() {
        println("Do you want to\n" +
                "1. Add\n" +
                "2. View\n" +
                "3. Remove")
        val adminSelector = readLine()?.get(0)
        when(adminSelector){
            '1' -> basicOrSmart()
        }
    }

    private fun basicOrSmart() {
        println("Your Wish to Enter Basic or Smart\n" +
                "1. Basic\n" +
                "2. Smart\n")
        val basicOrSmart = readLine()?.get(0)

        when(basicOrSmart){
            '1' -> objectCreation.basicPhone.brandName("basic")
            '2' -> objectCreation.smartPhone.brandName("smart")
        }
    }



}