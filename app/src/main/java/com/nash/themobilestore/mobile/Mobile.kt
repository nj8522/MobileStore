package com.nash.themobilestore.mobile

import com.nash.themobilestore.instancemanagement.InstanceOfClasses

class Mobile {



    fun addStock(typeOfPhone : String){

        val instanceOfClasses = InstanceOfClasses
        val dataMap = instanceOfClasses.phoneMap

        val fKey = dataMap.getValue(typeOfPhone)

        for(item in fKey.keys){
            println(item)
        }

        instanceOfClasses.portal.basicOrSmart()

    }


}