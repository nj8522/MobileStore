package com.nash.themobilestore.typesofphone


import com.nash.themobilestore.extension.Detail
import com.nash.themobilestore.objectmanagement.ObjectCreation
import com.nash.themobilestore.phone.SmartFeatures

class SmartPhone : SmartFeatures(), Detail {

    val objectCreation = ObjectCreation

    override var ramSize: String = ""

    override var romSize: String = ""

    override var screenSize: String = ""

    override var camera: String = ""

    var brandName : String = ""

    var productSeries : String = ""
    
    var productName : String = ""

    val pushToDb = objectCreation.db.storeDb

    val call : String = "This phone has Calling feature"

    val message : String = "This phone has Messaging feature"


    override fun brandName(basicOrSmart: String) {
        println("Enter the Brand Name")
        brandName = readLine().toString()
        pushToDb.put(basicOrSmart, mutableListOf(brandName))
        productSeries()
    }

    override fun productSeries() {
        println("Enter The Name of the Series")
        productSeries = readLine().toString()
        pushToDb.put(brandName, mutableListOf(productSeries))
        productName()
    }

    override fun productName() {
        println("Enter the Name of the Product")
        productName = readLine().toString()
        pushToDb.put(productSeries, mutableListOf(productName))
        ram()
    }

    override fun ram() {
         println("Enter the Ram of the Phone")
         ramSize = readLine().toString()
         rom()
    }

    override fun rom() {
        println("Enter the Rom of the Phone")
        romSize = readLine().toString()
        screenSize()
    }

    override fun screenSize() {
        println("Enter the Screen Size of the Phone")
        screenSize = readLine().toString()
        cameraPixel()
    }

    override fun cameraPixel() {
        println("Enter the camera pixel of the phone")
        camera = readLine().toString()
        call()
    }

    override fun call() {
        println("This Phone has Calling Feature")
        message()
    }

    override fun message() {
        println("This Phone has messaging Feature")
        updateToDb()
    }


    private fun updateToDb() {
        println("Updating in DB")
        val specification = listOf(SmartPhoneDataClass(ramSize,romSize,screenSize,camera,call,message))
        pushToDb.put(productName, mutableListOf(specification))
        objectCreation.portal.selectYourRole()
    }


    data class SmartPhoneDataClass(
                     val ram : String,
                     val rom : String,
                     val screenSize : String,
                     val cameraPixel : String,
                     val call : String,
                     val message : String
                    )


}




