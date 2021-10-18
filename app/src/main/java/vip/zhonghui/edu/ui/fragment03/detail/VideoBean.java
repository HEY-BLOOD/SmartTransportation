package vip.zhonghui.edu.ui.fragment03.detail;

public class VideoBean extends ImageBean {

    int videoResId;

    public VideoBean(int imageId, int videoResId, String info) {
        super(imageId, info);
        this.videoResId = videoResId;
    }

    public int getVideoResId() {
        return videoResId;
    }

    public void setVideoResId(int videoResId) {
        this.videoResId = videoResId;
    }
}

