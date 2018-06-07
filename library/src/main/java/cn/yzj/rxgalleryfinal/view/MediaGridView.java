package cn.yzj.rxgalleryfinal.view;

import java.util.List;

import cn.yzj.rxgalleryfinal.bean.BucketBean;
import cn.yzj.rxgalleryfinal.bean.MediaBean;

/**
 * Desction:
 * Author:pengjianbo  Dujinyang
 * Date:16/5/14 上午11:00
 */
public interface MediaGridView {
    void onRequestMediaCallback(List<MediaBean> list);

    void onRequestBucketCallback(List<BucketBean> list);
}
