package com.nash.themobilestore.crud

import com.nash.themobilestore.instancemanagement.InstanceOfClasses
import java.lang.IllegalArgumentException

class UpdatePhone {

    private val instanceOfClass = InstanceOfClasses
    private val smartPhoneList = instanceOfClass.smartPhoneList
    private val basicPhoneList = instanceOfClass.basicPhoneList

    private var index : Int  = 1
    private var dataCarryMap : MutableList<String> = mutableListOf()
    private var mapValue : String = ""
    private var updateTheValue : String = ""
    private var userInput : String = ""


    fun updatePhone(){

        println("Select a Phone to Update\n" +
                "1. Basic Phone\n" +
                "2. Smart Phone\n" +
                "3. Go to Main")
        userInput = readLine().toString()
        when(userInput) {
            "1" -> updateBasicPhone()
            "2" -> updateSmartPhone()
            "3"-> instanceOfClass.portal.admin()
            else -> { println("Invalid Option")
                     updatePhone() }
        }

    }


    private fun updateBasicPhone(){

         if(basicPhoneList.isNotEmpty()){
             println("Select the Product you want to Update")
             for(item in basicPhoneList){
                 println("$index.${item.productName}")
                 dataCarryMap.add(item.productName)
                 index++
             }

             val userInput = readLine().toString()
             when(userInput){
                 "1" -> mapValue = dataCarryMap[0]
                 "2" -> mapValue = dataCarryMap[1]
                 "3" -> mapValue = dataCarryMap[2]
                 else -> println("invalid Option")
             }

             try {
                 println("Enter the Stock to Update")
                 updateTheValue = readLine().toString()
                 val valueIsNumber = updateTheValue.toInt()
             }
             catch (e : IllegalArgumentException){
                 println("Enter a number")
                 updateBasicPhone()
             }


             for(item in basicPhoneList){
                 if(item.productName == mapValue){
                     item.noOfProduct = updateTheValue
                     println("Stock Updated")
                     break
                 }
             }

         }
         else{
             println("Sorry Store Is empty")
             instanceOfClass.portal.selectYourRole()
         }

           instanceOfClass.portal.selectYourRole()

     }

    private fun updateSmartPhone(){

        if(basicPhoneList.isNotEmpty()){
            println("Select the Product you want to Update")
            for(item in smartPhoneList){
                println("$index.${item.productName}")
                dataCarryMap.add(item.productName)
                index++
            }

            val userInput = readLine().toString()
            when(userInput){
                "1" -> mapValue = dataCarryMap[0]
                "2" -> mapValue = dataCarryMap[1]
                "3" -> mapValue = dataCarryMap[2]
                else -> println("invalid Option")
            }

            try {
                println("Enter the Stock to Update")
                updateTheValue = readLine().toString()
                val valueIsNumber = updateTheValue.toInt()
            }
            catch (e : IllegalArgumentException){
                println("Enter a number")
                updateBasicPhone()
            }


            for(item in basicPhoneList){
                if(item.productName == mapValue){
                    item.noOfProduct = updateTheValue
                    println("Stock Updated")
                    break
                }
            }

        }
        else{
            println("Sorry Store Is empty")
            instanceOfClass.portal.selectYourRole()
        }

        instanceOfClass.portal.selectYourRole()


    }





}