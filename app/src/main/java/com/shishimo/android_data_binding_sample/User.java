package com.shishimo.android_data_binding_sample;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.view.View;

/**
 * Created by shishimo on 2016/12/18.
 */

public class User {
    public ObservableField<String> name;
    public ObservableInt age;
    public ObservableInt likes;

    public User(String nameString, int age) {
        this.name = new ObservableField<>();
        this.age = new ObservableInt();
        this.likes = new ObservableInt();

        this.name.set(nameString);
        this.age.set(age);
        this.likes.set(0);
    }

    public void onClickLike(View view) {
        this.likes.set(this.likes.get()+1);
    }
}
