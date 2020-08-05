package com.nash.themobilestore.typesofphone


import com.nash.themobilestore.extension.Detail
import com.nash.themobilestore.objectmanagement.ObjectCreation
import com.nash.themobilestore.phone.BasicFeatures

class BasicPhone : BasicFeatures, Detail {

    val objectCreation = ObjectCreation


    var brandName : String = ""
    var productName : String = ""
    var call : String = "This phone has Calling Feature"
    var message : String = "This phone has Messaging Feature"



    val pushToDb = objectCreation.db.storeDb

    override fun brandName(basicOrSmart: String) {

        println("Enter the brand of the Phone")
        brandName = readLine().toString()
        pushToDb.put(basicOrSmart, mutableListOf(brandName))
        productSeries()
    }

    override fun productSeries() {

        println("Enter the Product Name")
        productName = readLine().toString()
        pushToDb.put(brandName, mutableListOf(productName))
        call()
    }

    override fun productName() {
        TODO("Not yet implemented")
    }

    override fun call() {
        println("Does This phone Have Calling feature" +
                "Y\n" +
                "N")
        val userInput = readLine().toString().toLowerCase()

        if(userInput == "n"){
            call = "This phone does not Have calling feature"
        }

        message()

    }

    override fun message() {

        println("Does This phone Have Messaging feature\n" +
                "Y\n" +
                "N")
        val userInput = readLine().toString().toLowerCase()

        if(userInput == "n"){
            message = "This phone does not Have Messaging feature"
        }

        updateToDB()

    }

    private fun updateToDB() {
        println("Updating in DB")
        val specification = listOf(basicPhoneData(call,message))
        pushToDb.put(productName, mutableListOf(specification))
        objectCreation.portal.selectYourRole()
    }


}

 data class basicPhoneData(val call : String, val message : String)