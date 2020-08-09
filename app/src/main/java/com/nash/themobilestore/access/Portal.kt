package com.nash.themobilestore.access

import com.nash.themobilestore.instancemanagement.InstanceOfClasses

class Portal {

    val instanceOfClasses = InstanceOfClasses
    val mobile = instanceOfClasses.mobile

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

//        when(userInput){
//            '1' -> objectCreation.displayPhone.getTheTypeOfPhone("basic")
//            '2' -> objectCreation.displayPhone.getTheTypeOfPhone("smart")
//        }
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

      fun basicOrSmart() {

        println("Which Type of Phone Do you want to Add\n" +
                "1. Basic\n" +
                "2. Smart")

         when(readLine()?.get(0)){
            '1' -> instanceOfClasses.mobile.addStock("Basic")
            '2' -> instanceOfClasses.mobile.addStock("Smart")
        }

        }
    }
