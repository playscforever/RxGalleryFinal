package cn.yzj.rxgalleryfinal.view;

import java.util.ArrayList;

import cn.yzj.rxgalleryfinal.bean.MediaBean;

/**
 * Desction:
 * Author:pengjianbo  Dujinyang
 * Date:16/5/14 下午9:56
 */
public interface ActivityFragmentView {

    void showMediaGridFragment();

    void showMediaPageFragment(ArrayList<MediaBean> list, int position);

    void showMediaPreviewFragment();
}
