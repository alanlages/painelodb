package br.com.painelodb.painelodb;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by alan.sousa on 14/12/2017.
 */

public class Teste extends Activity {

    private Activity activity;

    public Teste(Activity activity){
        this.activity = activity;
    }

    public void AlterarValor(String t) {
        TextView tw = (TextView)activity.findViewById(R.id.texto);
        tw.setText(t);
    }

    public void AlterarValor2(String t) {
        TextView tv = (TextView) getLayoutByRes(R.layout.activity_main ,null).findViewById(R.id.texto);
        tv.setText(t);
    }

    public View getLayoutByRes(@LayoutRes int layoutRes, @Nullable ViewGroup viewGroup)
    {
        final LayoutInflater factory = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        return factory.inflate(layoutRes, viewGroup);
    }
}
