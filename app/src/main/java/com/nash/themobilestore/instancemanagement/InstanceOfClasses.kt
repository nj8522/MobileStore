package com.nash.themobilestore.instancemanagement

import com.nash.themobilestore.mobile.Mobile
import com.nash.themobilestore.access.Portal
import com.nash.themobilestore.database.PreDefinedDataSets
import com.nash.themobilestore.typesofphone.BasicPhone
import com.nash.themobilestore.database.PhoneSpecification

object InstanceOfClasses {

    val portal = Portal()

    //View
    val mobile = Mobile()

//    //Store Stock
//    val storeSock = StoreStock()

    //PreDefined Data
    val db = PreDefinedDataSets()

    //DataMap
   val phoneMap : MutableMap<String, MutableMap<String, MutableMap<String, MutableMap<String, PhoneSpecification>>>> = mutableMapOf()

    //Basic
    val basic = BasicPhone()



}
