package demo.firstperformance.fpcandroid;

import android.os.AsyncTask;

/**
 * Created by mtrussell on 6/30/15.
 * Copyright First Performance Corporation
 */
public class DemoAsyncTask extends AsyncTask<Void, Integer, Void>{

    private DemoInterface _delegate;

    public DemoAsyncTask(DemoInterface delegate) {
        this._delegate = delegate;
    }

    @Override
    protected void onPreExecute() {}


    @Override
    protected Void doInBackground(Void... params) {

        /* 3) Using the provided for loop, count down from 100 to 1
         * DO NOT CHANGE THE FOR LOOP.
         * It must begin with i=0;
         * You cannot add any code before the for loop
         * The countdown should decrement every 500ms */

        // for(int i=0;

        return null;
    }


    @Override
    protected void onProgressUpdate(Integer... progress) {

        // 4) Update the text view with the current progress of the countdown

    }


    @Override
    protected void onPostExecute(Void v) {}
}