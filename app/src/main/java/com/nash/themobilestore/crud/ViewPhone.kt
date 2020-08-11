package com.nash.themobilestore.crud

import com.nash.themobilestore.instancemanagement.InstanceOfClasses

class ViewPhone {

    fun viewAllThePhone(){

        val instanceOfClasses = InstanceOfClasses
        val smartPhoneList = instanceOfClasses.smartPhoneList
        val basicPhoneList = instanceOfClasses.basicPhoneList


        println("Smart Phone : ${smartPhoneList.size}")
        println("Basic Phone : ${basicPhoneList.size}")

        if(basicPhoneList.isNotEmpty()){
            for(item in basicPhoneList){
                println(item.brandName)
                println(item.productSeries)
                println(item.productName)
                println(item.call)
                println(item.message)
                println(item.price)
                println(item.noOfProduct+"\n")
            }
        }

        if(smartPhoneList.isNotEmpty()){
            for(item in smartPhoneList){
                println(item.brandName)
                println(item.productName)
                println(item.productSeries)
                println(item.Ram)
                println(item.Rom)
                println(item.camera)
                println(item.screenSize)
                println(item.price)
                println(item.noOfProduct+"\n")
            }
        }

        instanceOfClasses.portal.selectYourRole()
    }

}