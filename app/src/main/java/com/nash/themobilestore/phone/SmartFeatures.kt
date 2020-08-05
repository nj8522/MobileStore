package com.nash.themobilestore.phone

import com.nash.themobilestore.phone.BasicFeatures

abstract class SmartFeatures : BasicFeatures{

     abstract var ramSize: String
     abstract var romSize: String
     abstract var screenSize: String
     abstract var camera : String



     abstract fun ram()

     abstract fun rom()

     abstract fun screenSize()

     abstract fun cameraPixel()




  }