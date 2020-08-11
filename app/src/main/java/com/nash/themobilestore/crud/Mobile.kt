package com.nash.themobilestore.crud

import com.nash.themobilestore.instancemanagement.InstanceOfClasses
import com.nash.themobilestore.typesofphone.BasicPhone
import com.nash.themobilestore.typesofphone.SmartPhone

class Mobile {


    private val dataCarryList : MutableList<String> = mutableListOf()
    private var index : Int = 1
    private var dataMapValue : String = ""

    fun addStockForBasic(){

        val instanceOfClasses = InstanceOfClasses
        val basicObj = instanceOfClasses.basicPhoneList
        val dataMap = instanceOfClasses.phoneMap

        val brandKey = dataMap.getValue("Basic")

        val objOfBasicPhone = BasicPhone()

            for (item in brandKey.keys){
                println("$index.$item")
                dataCarryList.add(item)
                index++
            }

            var userInput: String = readLine().toString()
            when(userInput){
                "1" -> {objOfBasicPhone.brandName = dataCarryList[0]
                        dataMapValue = objOfBasicPhone.brandName
                      }
                else -> {println("Invalid Option")
                        return
                       }
            }


            val sKey = brandKey.getValue(dataMapValue)
            dataCarryList.clear()
            index = 1

            for (item in sKey.keys){
                println("$index.$item")
                dataCarryList.add(item)
                index++
            }


        userInput = readLine().toString()
        when(userInput){
            "1" -> {objOfBasicPhone.productSeries = dataCarryList[0]
                    dataMapValue = objOfBasicPhone.productSeries
                  }
            "2"->{objOfBasicPhone.productSeries = dataCarryList[1]
                  dataMapValue = objOfBasicPhone.productSeries
                }
            else -> {println("Invalid option")
                     return
                    }
        }

        val tKey = sKey.getValue(dataMapValue)
        dataMapValue =""
        dataCarryList.clear()
        index = 1
        for (item in tKey.keys){
            println("$index.$item")
            dataCarryList.add(item)
            index++
        }


            userInput = readLine().toString()
            when(userInput){
                "1" -> {objOfBasicPhone.productName = dataCarryList[0]
                        dataMapValue = objOfBasicPhone.productName
                       }
                "2"->{objOfBasicPhone.productName = dataCarryList[1]
                      dataMapValue = objOfBasicPhone.productName
                    }
                else -> {println("Invalid option")
                    return
                }
            }


            val mKey = tKey.getValue(dataMapValue)
            dataMapValue = ""
            dataCarryList.clear()
            index = 1

            objOfBasicPhone.call = mKey.call
            objOfBasicPhone.message = mKey.message
            objOfBasicPhone.price = mKey.price

        println("Enter the Stock for this Phone")
        try {
            userInput = readLine().toString()
            val checkNo = userInput.toDouble()
            objOfBasicPhone.noOfProduct = userInput
        }catch (e : IllegalArgumentException){
            println("Please do Enter a number")
            addStockForBasic()
        }

            basicObj.add(objOfBasicPhone)
            println("Product Added")

        println("Do you want to Go to Main\n " +
                    "1. Yes\n " +
                    "2. No")
             userInput = readLine().toString()
            if(userInput.equals("1")){
                instanceOfClasses.portal.basicOrSmart()
            }
            else{
                addStockForBasic()
            }
    }

    fun addStockForSmart() {
        val instanceOfClasses = InstanceOfClasses
        val smartObj = instanceOfClasses.smartPhoneList
        val dataMap = instanceOfClasses.phoneMap

        val fKey = dataMap.getValue("Smart")

        val smartPhone = SmartPhone()

            for (item in fKey.keys){
                println("$index.$item")
                dataCarryList.add(item)
                index++
            }


            var userInput: String = readLine().toString()
            when(userInput){
            "1" -> {smartPhone.brandName = dataCarryList[0]
                    dataMapValue = smartPhone.brandName
            }
            "2"->{smartPhone.brandName = dataCarryList[1]
                  dataMapValue = smartPhone.brandName
            }
            else -> {
                println("Invalid option")
                return
              }
            }

            val sKey = fKey.getValue(dataMapValue)
            dataMapValue = ""
            dataCarryList.clear()
            index = 1
            for (item in sKey.keys){
                println("$index.$item")
                dataCarryList.add(item)
                index++
            }


            userInput = readLine().toString()
            when(userInput){
                "1" -> {smartPhone.productSeries = dataCarryList[0]
                    dataMapValue = smartPhone.productSeries
                }
                "2"->{smartPhone.productSeries = dataCarryList[1]
                    dataMapValue = smartPhone.productSeries
                }
                "3"->{smartPhone.productSeries = dataCarryList[2]
                      dataMapValue = smartPhone.productSeries
                }
                else -> {
                    println("Invalid option")
                    return
                }
            }


            val tKey = sKey.getValue(dataMapValue)
            dataMapValue = ""
            dataCarryList.clear()
            index = 1
            for (item in tKey.keys){
                println("$index.$item")
                dataCarryList.add(item)
                index++
            }


            userInput = readLine().toString()
        when(userInput){
            "1" -> {smartPhone.productName = dataCarryList[0]
                dataMapValue = smartPhone.productName
            }
            "2"->{smartPhone.productName = dataCarryList[1]
                dataMapValue = smartPhone.productName
            }
            "3"->{smartPhone.productName = dataCarryList[2]
                  dataMapValue = smartPhone.productName
            }
            else -> {
                println("Invalid option")
                return
            }
            }


            val mKey = tKey.getValue(dataMapValue)
            dataMapValue = ""
            dataCarryList.clear()
            index = 1


            smartPhone.Ram = mKey.ram
            smartPhone.Rom = mKey.rom
            smartPhone.camera = mKey.camera
            smartPhone.screenSize = mKey.screenSize
            smartPhone.price = mKey.price

             println("Enter the Stock for this Phone")
             try {
                 userInput = readLine().toString()
                 val checkNo = userInput.toDouble()
                 smartPhone.noOfProduct = userInput
             }catch (e : IllegalArgumentException){
                 println("Please do Enter a number")
                 addStockForSmart()
             }

             smartPhone.noOfProduct = userInput

            smartObj.add(smartPhone)
            println("Product Added")

            println("Do you want to Go to Main\n " +
                    "1. Yes\n " +
                    "2. No")
            userInput = readLine().toString()
            if(userInput.equals("1")){
                instanceOfClasses.portal.basicOrSmart()

            }
            else{
                addStockForSmart()

            }

        }
}

