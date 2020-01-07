package com.ushannlabs.doc.ui.apropos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AproposViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AproposViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Apropos de KRO");
    }

    public LiveData<String> getText() {
        return mText;
    }
}