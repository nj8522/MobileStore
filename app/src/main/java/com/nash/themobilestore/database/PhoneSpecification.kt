package com.nash.themobilestore.database

data class PhoneSpecification(
    var call: String = "",
    var message: String = "",
    var ram: String = "Not Available",
    var rom: String = "Not Available",
    var screenSize: String = "Not Available",
    var camera: String = "Not Available",
    var price: String = "Not Available"
)