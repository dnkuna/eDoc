package com.ushannlabs.doc.ui.bacofficiel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BacOfficielViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BacOfficielViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Epreuve de baccalaureat officiel");
    }

    public LiveData<String> getText() {
        return mText;
    }
}