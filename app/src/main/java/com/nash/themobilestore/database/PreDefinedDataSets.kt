package com.nash.themobilestore.database

import com.nash.themobilestore.instancemanagement.InstanceOfClasses

class PreDefinedDataSets {

    //val phoneMap : MutableMap<String, MutableMap<String, MutableMap<String, MutableMap<String, PhoneSpecification>>>> = mutableMapOf()

    fun phoneDatabase(){

        val instanceOfClass = InstanceOfClasses

        //Samsung
        val samJ1 = PhoneSpecification("Can call", "Can message", "4Gb", "32Gb", "5 inch", "12 mp", "15000")
        val samJ2 = PhoneSpecification("Can call", "Can message", "6Gb", "64Gb", "5.3 inch", "21 mp", "14000")

        val samNoteOne = PhoneSpecification("Can call", "Can message", "4Gb", "32Gb", "5 inch", "12 mp", "32000")
        val samNoteTwo = PhoneSpecification("Can call", "Can message", "6Gb", "64Gb", "5.3 inch", "21 mp", "38000")

        val samG1 = PhoneSpecification("Can call", "Can message", "4Gb", "32Gb", "5 inch", "12 mp", "30000")
        val samG2 = PhoneSpecification("Can call", "Can message", "6Gb", "64Gb", "5.3 inch", "21 mp", "28000")


        val samsung =  mutableMapOf(
            "J series" to mutableMapOf("J1" to samJ1, "J2" to samJ2),
            "Note series" to mutableMapOf("Note 5" to samNoteOne, "Note 8" to samNoteTwo),
            "Galaxy Series" to mutableMapOf("S8" to samG1, "S10" to samG2)
        )

        //Iphone
        val i6 = PhoneSpecification("Can call", "Can message", "4Gb", "32Gb", "5 inch", "12 mp", "15000")
        val i7 = PhoneSpecification("Can call", "Can message", "6Gb", "64Gb", "5.3 inch", "21 mp", "14000")

        val i8 = PhoneSpecification("Can call", "Can message", "4Gb", "32Gb", "5 inch", "12 mp", "32000")
        val i8Plus = PhoneSpecification("Can call", "Can message", "6Gb", "64Gb", "5.3 inch", "21 mp", "38000")

        val i10 = PhoneSpecification("Can call", "Can message", "4Gb", "32Gb", "5 inch", "12 mp", "30000")
        val i11Pro = PhoneSpecification("Can call", "Can message", "6Gb", "64Gb", "5.3 inch", "21 mp", "28000")


        val iPhone =  mutableMapOf(
            "Budget series" to mutableMapOf("Iphone 6" to i6, "Iphone 7" to i7),
            "Pro Series" to mutableMapOf("Iphone 8" to i8, "Iphone 8+" to i8Plus),
            "New Series" to mutableMapOf("Iphone 10" to i10, "Iphone 11 pro" to i11Pro)
        )

        //Nokia
        val nokOne = PhoneSpecification("Can call", "Can message",price = "1000")
        val nokTwo = PhoneSpecification("Can call", "Can message",price = "1500")

        val nokThree = PhoneSpecification("Can call", "Can message",price = "999")
        val nokFour = PhoneSpecification("Can call", "Can message",price = "1299")

        val nokia =  mutableMapOf(
            "105" to mutableMapOf("2019" to nokOne, "2018" to nokTwo),
            "106" to mutableMapOf("2018" to nokThree, "2019" to nokFour)
        )

        instanceOfClass.phoneMap.put("Smart", mutableMapOf("Samsung" to samsung, "Iphone" to iPhone))
        instanceOfClass.phoneMap.put("Basic", mutableMapOf("Nokia" to nokia))

    }

}