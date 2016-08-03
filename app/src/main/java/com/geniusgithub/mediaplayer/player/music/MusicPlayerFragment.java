package com.geniusgithub.mediaplayer.player.music;

import com.geniusgithub.mediaplayer.base.BasePresenterFragment;
import com.geniusgithub.mediaplayer.base.IBaseFragmentPresent;

public class MusicPlayerFragment extends BasePresenterFragment<IBaseFragmentPresent> {


    @Override
    public IBaseFragmentPresent createPresenter(){
        return new MusicPlayerPresenter();
    }

}
