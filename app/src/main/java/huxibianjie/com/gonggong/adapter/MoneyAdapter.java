package huxibianjie.com.gonggong.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.home.runmining.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by wangtao on 2018/6/11.
 */

public class MoneyAdapter extends RecyclerView.Adapter {

    private Context context;

    public MoneyAdapter(Context context) {
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.adapter_money, null);
        RecyclerView.ViewHolder viewHolder = new MoneyViewHolder(inflate);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((MoneyViewHolder) holder).setData(position);
    }

    @Override
    public int getItemCount() {
        return 4;
    }

    class MoneyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv1)
        TextView tv1;
        @BindView(R.id.tv2)
        TextView tv2;
        @BindView(R.id.tv3)
        TextView tv3;
        @BindView(R.id.tv4)
        TextView tv4;
        @BindView(R.id.tv5)
        TextView tv5;
        @BindView(R.id.rl)
        RelativeLayout rl;

        public MoneyViewHolder(View inflate) {
            super(inflate);
            ButterKnife.bind(this, inflate);
        }

        public void setData(int position) {
            if (position == 0) {
                tv3.setVisibility(View.GONE);
                tv4.setVisibility(View.GONE);
                tv5.setVisibility(View.VISIBLE);
                rl.setBackgroundColor(Color.parseColor("#00D679"));
            } else {
                rl.setBackgroundColor(Color.parseColor("#15000000"));
                tv3.setVisibility(View.VISIBLE);
                tv4.setVisibility(View.VISIBLE);
                tv5.setVisibility(View.GONE);
            }
        }
    }
}
