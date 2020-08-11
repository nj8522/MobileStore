package com.nash.themobilestore.crud

import com.nash.themobilestore.instancemanagement.InstanceOfClasses

class DeletePhone {

    private val instanceOfClass = InstanceOfClasses
    private val smartPhoneList = instanceOfClass.smartPhoneList
    private val basicPhoneList = instanceOfClass.basicPhoneList

    private val mapCarryList : MutableList<String> = mutableListOf()

    private var userInput : String =  ""
    private var index : Int = 1

    private var brandNameToDelete : String = ""
    private var productSeriesToDelete : String = ""
    private var productNameToDelete : String = ""
    private var indexOfItem : Int = 0


    fun selectPhoneToDelete(){
        println("Select a Phone to delete\n" +
                "1. Basic Phone\n" +
                "2. Smart Phone\n" +
                "3. Go to Main")
        userInput = readLine().toString()
        when(userInput) {
            "1" -> deleteBasicPhoneList()
            "2" -> deleteSmartPhone()
            "3"-> instanceOfClass.portal.admin()
            else -> { println("Invalid Option")
                      selectPhoneToDelete()
                    }
        }

    }

    private fun deleteBasicPhoneList(){

        if(basicPhoneList.isNotEmpty()){

            println("Select the Phone to Delete")

            for(item in basicPhoneList){
                println("$index.${item.brandName}")
                mapCarryList.add(item.brandName)
                index++
            }

            userInput = readLine().toString()
            when(userInput){
                "1" -> brandNameToDelete = mapCarryList[0]
                "2" -> brandNameToDelete = mapCarryList[1]
            }

            mapCarryList.clear()
            index = 1


            for(item in basicPhoneList){
                println("$index.${item.productSeries}")
                mapCarryList.add(item.productSeries)
                index++
            }

            userInput = readLine().toString()
            when(userInput){
                "1" -> productSeriesToDelete = mapCarryList[0]
                "2" -> productSeriesToDelete = mapCarryList[1]
            }

            mapCarryList.clear()
            index = 1

            for(item in basicPhoneList){
                println("$index.${item.productName}")
                mapCarryList.add(item.productName)
                index++
            }

            userInput = readLine().toString()
            when(userInput){
                "1" -> productNameToDelete = mapCarryList[0]
                "2" -> productNameToDelete = mapCarryList[1]
            }

            mapCarryList.clear()
            index = 1


            for(item in basicPhoneList){

                if(item.brandName.equals(brandNameToDelete)&&
                   item.productSeries.equals(productSeriesToDelete) &&
                   item.productName.equals(productNameToDelete)
                  ) {
                    indexOfItem = basicPhoneList.indexOf(item)
                    break
                }
            }

            basicPhoneList.removeAt(indexOfItem)
            instanceOfClass.portal.admin()
        }
        else{
            println("List is empty")
            instanceOfClass.portal.admin()
        }
    }

    private fun deleteSmartPhone(){

        if(smartPhoneList.isNotEmpty()){
            println("Select the Phone to Delete")

            for(item in smartPhoneList){
                println("$index.${item.brandName}")
                mapCarryList.add(item.brandName)
                index++
            }

            userInput = readLine().toString()
            when(userInput){
                "1" -> brandNameToDelete = mapCarryList[0]
                "2" -> brandNameToDelete = mapCarryList[1]
            }

            mapCarryList.clear()
            index = 1


            for(item in basicPhoneList){
                println("$index.${item.productSeries}")
                mapCarryList.add(item.productSeries)
                index++
            }

            userInput = readLine().toString()
            when(userInput){
                "1" -> productSeriesToDelete = mapCarryList[0]
                "2" -> productSeriesToDelete = mapCarryList[1]
            }

            mapCarryList.clear()
            index = 1

            for(item in basicPhoneList){
                println("$index.${item.productName}")
                mapCarryList.add(item.productName)
                index++
            }

            userInput = readLine().toString()
            when(userInput){
                "1" -> productNameToDelete = mapCarryList[0]
                "2" -> productNameToDelete = mapCarryList[1]
            }

            mapCarryList.clear()
            index = 1


            for(item in smartPhoneList){

                if(item.brandName.equals(brandNameToDelete)&&
                    item.productSeries.equals(productSeriesToDelete) &&
                    item.productName.equals(productNameToDelete)
                ) {

                    indexOfItem = smartPhoneList.indexOf(item)
                    break
                }
            }

             smartPhoneList.removeAt(indexOfItem)
        }
        else{
            println("List is empty")
            instanceOfClass.portal.admin()
        }

    }



}