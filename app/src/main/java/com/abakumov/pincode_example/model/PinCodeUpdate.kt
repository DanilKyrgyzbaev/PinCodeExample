package com.abakumov.pincode_example.model

import android.content.Context
import android.content.res.Resources
import android.widget.ImageView
import android.widget.LinearLayout

import java.util.ArrayList
import com.abakumov.pincode_example.R
import com.abakumov.pincode_example.asynctask.AsyncTaskVerification
import com.abakumov.pincode_example.interfaces.PinCodeState
import com.abakumov.pincode_example.pref.Pref


class PinCodeUpdate(private var listImageViews: ArrayList<ImageView>, // for get image
                    private var resources: Resources, private var linearLayout: LinearLayout, private var context: Context) : PinCodeState {


    private lateinit var asyncTaskVerification: AsyncTaskVerification
    private var listPinCode = ArrayList<String>()
    // counter for click Buttons
    private var countClick = 0

    override fun onSetNumber(s: String, create: Boolean) {

        if (s != "-1") {
            // add number in list
            listPinCode.add(s)
            countClick++

            if (countClick == 4) {
                // if countClick = 4
                // set image full in ImageView
                // and start Verification for PIN-code
                    if (create){
                        Pref.localPassword = listPinCode[0]+listPinCode[1]+listPinCode[2]+listPinCode[3]
                        listImageViews[countClick - 1].setImageResource(R.mipmap.ovalfull)
                        asyncTaskVerification = AsyncTaskVerification(listPinCode, listImageViews, resources, countClick, linearLayout, context, create)
                        asyncTaskVerification.execute()
                        countClick = 0
                    }else{
                        listImageViews[countClick - 1].setImageResource(R.mipmap.ovalfull)
                        asyncTaskVerification = AsyncTaskVerification(listPinCode, listImageViews, resources, countClick, linearLayout, context, create)
                        asyncTaskVerification.execute()
                        countClick = 0
                    }

            }
            else {
                listImageViews[countClick - 1].setImageResource(R.mipmap.ovalfull)
            }
        }
        else {
            if (listPinCode.size != 0) {
                listPinCode.removeAt(countClick - 1)
                listImageViews[countClick - 1].setImageResource(R.mipmap.oval)
                countClick--
            }
        }
//        listImageViews[countClick - 1].setImageResource(R.mipmap.ovalfull)
//                asyncTaskVerification = AsyncTaskVerification(listPinCode, listImageViews, resources, countClick, linearLayout, context)
//                asyncTaskVerification.execute()
    }
}
