package com.ushannlabs.doc.ui.orientation;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class OrientationViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public OrientationViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Orientation pour l'apres baccalaureat");
    }

    public LiveData<String> getText() {
        return mText;
    }
}