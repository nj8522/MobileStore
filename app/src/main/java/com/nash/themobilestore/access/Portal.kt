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



     fun admin() {
        println("Do you want to\n" +
                "1. Add\n" +
                "2. View\n" +
                "3. Update\n" +
                "4. Delete\n" +
                "3. Remove")
        val adminSelector = readLine()?.get(0)
        when(adminSelector){
            '1' -> basicOrSmart()
            '2' -> instanceOfClasses.viewPhone.viewAllThePhone()
            '3' -> instanceOfClasses.updatePhone.updatePhone()
            '4' -> instanceOfClasses.deletePhone.selectPhoneToDelete()

        }
    }

      fun basicOrSmart() {

        println("Which Type of Phone Do you want to Add\n" +
                "1. Basic\n" +
                "2. Smart\n" +
                "3. Admin Panel\n" +
                "4. Main Menu\n" +
                "5. Exit")

         when(readLine()?.get(0)){
             '1' -> instanceOfClasses.mobile.addStockForBasic()
             '2' -> instanceOfClasses.mobile.addStockForSmart()
             '3' -> admin()
             '4' -> selectYourRole()
             '5' -> return
        }

        }
    }
