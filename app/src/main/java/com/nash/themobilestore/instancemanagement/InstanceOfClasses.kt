package com.nash.themobilestore.instancemanagement

import com.nash.themobilestore.crud.Mobile
import com.nash.themobilestore.access.Portal
import com.nash.themobilestore.crud.DeletePhone
import com.nash.themobilestore.crud.UpdatePhone
import com.nash.themobilestore.crud.ViewPhone
import com.nash.themobilestore.database.PreDefinedDataSets
import com.nash.themobilestore.typesofphone.BasicPhone
import com.nash.themobilestore.database.PhoneSpecification
import com.nash.themobilestore.typesofphone.SmartPhone

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

    //View Phones
    val viewPhone = ViewPhone()
    val smartPhoneList : MutableList<SmartPhone> = mutableListOf()
    val basicPhoneList : MutableList<BasicPhone> = mutableListOf()

    //Update Phone
    val updatePhone = UpdatePhone()

    //Delete Phone
    val deletePhone = DeletePhone()

}
