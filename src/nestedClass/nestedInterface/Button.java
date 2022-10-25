package nestedClass.nestedInterface;

public class Button {

    OnCLickListener listener;

    interface OnCLickListener {
        void onClick();
    }

    void setOnClickListener(OnCLickListener listener) {
        this.listener = listener;
    }

    void touch() {
        listener.onClick();
    }
}
