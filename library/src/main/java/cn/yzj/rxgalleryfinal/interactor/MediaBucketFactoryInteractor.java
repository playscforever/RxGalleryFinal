package cn.yzj.rxgalleryfinal.interactor;

import java.util.List;

import cn.yzj.rxgalleryfinal.bean.BucketBean;

/**
 * Desction:
 * Author:pengjianbo  Dujinyang
 * Date:16/7/4 下午8:24
 */
public interface MediaBucketFactoryInteractor {

    void generateBuckets();

    interface OnGenerateBucketListener {
        void onFinished(List<BucketBean> list);
    }
}
