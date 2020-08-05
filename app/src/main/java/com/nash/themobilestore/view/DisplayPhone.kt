package com.nash.themobilestore.view

import com.nash.themobilestore.objectmanagement.ObjectCreation

class DisplayPhone {
    val objectCreation = ObjectCreation
    val dataFromDb = objectCreation.db.storeDb




     fun getTheTypeOfPhone(type : String){

         val brandName = dataFromDb[type].toString()
         println("Brands Available are :\n" +
                 "$brandName")

         if(type == "smart"){

             val seriseName = readLine().toString()
             println("Serise Available for this Phone is :\n" +
                     "${dataFromDb[seriseName]}")
         }

         val productName = readLine().toString()
         println("Product Available are :\n" +
                 "${dataFromDb[productName]}")

         val specification = readLine().toString()
         println("Specification For this model is :\n" +
                 "${dataFromDb[specification]}")
         objectCreation.portal.selectYourRole()




     }

 }