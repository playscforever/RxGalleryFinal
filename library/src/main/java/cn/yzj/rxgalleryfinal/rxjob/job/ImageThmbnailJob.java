package cn.yzj.rxgalleryfinal.rxjob.job;

import android.content.Context;

import java.io.File;

import cn.yzj.rxgalleryfinal.bean.MediaBean;
import cn.yzj.rxgalleryfinal.rxjob.Job;
import cn.yzj.rxgalleryfinal.utils.BitmapUtils;
import cn.yzj.rxgalleryfinal.utils.MediaUtils;

/**
 * Desction:
 * Author:pengjianbo  Dujinyang
 * Date:16/7/31 上午11:46
 */
public class ImageThmbnailJob implements Job {

    private final MediaBean mediaBean;
    private final Context context;

    public ImageThmbnailJob(Context context, Params params) {
        this.context = context;
        this.mediaBean = (MediaBean) params.getRequestData();
    }

    @Override
    public Result onRunJob() {
        String originalPath = mediaBean.getOriginalPath();
        File bigThumFile = MediaUtils.createThumbnailBigFileName(context, originalPath);
        File smallThumFile = MediaUtils.createThumbnailSmallFileName(context, originalPath);
        if (!bigThumFile.exists()) {
            BitmapUtils.createThumbnailBig(bigThumFile, originalPath);
        }
        if (!smallThumFile.exists()) {
            BitmapUtils.createThumbnailSmall(smallThumFile, originalPath);
        }
        Result result = Result.SUCCESS;
        result.setResultData(mediaBean);
        return result;
    }
}
