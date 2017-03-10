package com.example.administrator.travelguide;

/**
 * Created by Administrator on 2017/3/10.
 */

public class Item {

    private static final int NO_IMAGE_PROVIDE = -1;
    private int mImageRes;
    private int mNameId;
    private int mAddressId;
    private int mPhoneCallRes = NO_IMAGE_PROVIDE;

    public Item(int imageResId, int nameId, int addressId){
        mImageRes = imageResId;
        mNameId = nameId;
        mAddressId = addressId;
    }

    public Item(int imageResId, int nameId, int addressId, int phoneCallResId){
        mImageRes = imageResId;
        mNameId = nameId;
        mAddressId = addressId;
        mPhoneCallRes = phoneCallResId;
    }


    public int getmImageRes(){
        return mImageRes;
    }


    public int getmName (){
        return mNameId;
    }


    public int getmAddress(){
        return mAddressId;
    }


    public int getmPhoneCallRes(){
        return mPhoneCallRes;
    }

    public boolean hasImage(){
        return mPhoneCallRes!=NO_IMAGE_PROVIDE;
    }
}
