package org.sec01.verify.exam05;

public class CheckBox {
    OnSetectListener listener;

    void setOnSelectListener (OnSelectListener listener) {
        this.listener = listener;
    }

    void select() {
        listener.onSelect();
    }

    static interface OnSelectListener {
        void onSelect();
    }
}
