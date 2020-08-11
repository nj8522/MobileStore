package com.nash.themobilestore.typesofphone


import com.nash.themobilestore.extension.Detail
import com.nash.themobilestore.phone.BasicFeatures

class BasicPhone : BasicFeatures(), Detail {



    override var brandName: String = ""

    override var productName: String = ""

    override var productSeries: String = ""

    override var price: String = ""

    var call : String = ""

    var message : String = ""

    override var noOfProduct: String = ""



}