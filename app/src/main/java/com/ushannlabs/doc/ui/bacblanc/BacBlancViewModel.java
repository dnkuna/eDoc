package com.ushannlabs.doc.ui.bacblanc;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BacBlancViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BacBlancViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Epreuves de bac blac");
    }

    public LiveData<String> getText() {
        return mText;
    }
}