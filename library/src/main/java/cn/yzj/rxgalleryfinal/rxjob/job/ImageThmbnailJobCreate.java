package cn.yzj.rxgalleryfinal.rxjob.job;

import android.content.Context;

import cn.yzj.rxgalleryfinal.bean.MediaBean;
import cn.yzj.rxgalleryfinal.rxjob.Job;
import cn.yzj.rxgalleryfinal.rxjob.JobCreator;

/**
 * Desction:
 * Author:pengjianbo  Dujinyang
 * Date:16/7/31 上午11:46
 */
public class ImageThmbnailJobCreate implements JobCreator {

    private final MediaBean mediaBean;
    private final Context context;

    public ImageThmbnailJobCreate(Context context, MediaBean mediaBean) {
        this.context = context;
        this.mediaBean = mediaBean;
    }

    @Override
    public Job create() {
        Job.Params params = new Job.Params(mediaBean.getOriginalPath(), mediaBean);
        return new ImageThmbnailJob(context, params);
    }


}
