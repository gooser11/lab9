package edu.up.cs301threadslab;

public class ThreadedAnimationView extends Thread{

    AnimationView av;

    public ThreadedAnimationView(AnimationView aniView){
        av = aniView;
    }

    @Override
    public void run(){
        while(true){
            av.postInvalidate();
            try{
                Thread.sleep(50);
            }
            catch (InterruptedException e){
                //interrupted
            }
        }

    }
}
