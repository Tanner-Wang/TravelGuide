package com.example.administrator.travelguide;


public class Item {
    private int mImageRes;
    private int mNameId;
    private int mScoreId;
    private int mEvaluationId;
    private int mLevelId;
    private int mLocationId;
    private int mFeaturesId;
    private int mPriceId;
    private int mkindId;
    private int mAmountId;
    private int mWebLinkId;

    public Item(){}

    public Item(int imageResId, int nameId, int scoreId, int evaluationId, int levelId, int locationId,
                int featuresId, int priceId, int webLinkId){
        mImageRes = imageResId;
        mNameId = nameId;
        mScoreId = scoreId;
        mEvaluationId = evaluationId;
        mLevelId = levelId;
        mLocationId = locationId;
        mFeaturesId = featuresId;
        mPriceId = priceId;
        mWebLinkId = webLinkId;
    }

    public Item(int imageResId, int nameId, int levelId, int locationId, int kindId, int featuresId, int priceId,  int webLinkId){
        mImageRes = imageResId;
        mNameId = nameId;
        mLevelId = levelId;
        mLocationId = locationId;
        mkindId = kindId;
        mFeaturesId = featuresId;
        mPriceId = priceId;
        mWebLinkId = webLinkId;
    }

    public Item(int imageResId, int nameId, int evaluationId, int amountId, int locationId, int priceId, int webLinkId){
        mImageRes = imageResId;
        mNameId = nameId;
        mEvaluationId = evaluationId;
        mAmountId = amountId;
        mLocationId = locationId;
        mPriceId = priceId;
        mWebLinkId = webLinkId;
    }

    public Item(int imageResId, int nameId, int evaluationId, int locationId, int webLinkId){
        mImageRes = imageResId;
        mNameId = nameId;
        mEvaluationId = evaluationId;
        mLocationId = locationId;
        mWebLinkId = webLinkId;
    }


    public int getmImageRes(){
        return mImageRes;
    }


    public int getmName (){
        return mNameId;
    }

    public int getmScoreId(){
        return mScoreId;
    }

    public int getmEvaluationId() {
        return mEvaluationId;
    }

    public int getmLevelId() {
        return mLevelId;
    }

    public int getmLocationId() {
        return mLocationId;
    }

    public int getmFeaturesId() {
        return mFeaturesId;
    }

    public int getmPriceId() {
        return mPriceId;
    }

    public int getmWebLinkId() {
        return mWebLinkId;
    }

    public int getmKindId() {
        return mkindId;
    }

    public int getmAmountId() {
        return mAmountId;
    }
}
