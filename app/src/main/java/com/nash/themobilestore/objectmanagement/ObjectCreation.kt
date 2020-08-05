package com.nash.themobilestore.objectmanagement

import com.nash.themobilestore.access.Portal
import com.nash.themobilestore.database.DataBase
import com.nash.themobilestore.typesofphone.BasicPhone
import com.nash.themobilestore.typesofphone.SmartPhone
import com.nash.themobilestore.view.DisplayPhone

object ObjectCreation {

    val db = DataBase()
    val portal = Portal()
    val smartPhone = SmartPhone()
    val basicPhone = BasicPhone()

    //View
    val displayPhone = DisplayPhone()

}
