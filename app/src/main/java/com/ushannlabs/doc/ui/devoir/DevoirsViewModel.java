package com.ushannlabs.doc.ui.devoir;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DevoirsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DevoirsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Devoirs communs");
    }

    public LiveData<String> getText() {
        return mText;
    }
}