package adiba.com.simplerecyclerview;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.support.design.widget.BottomSheetDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;

/**
 * Created by zhang on 2016.08.07.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private ArrayList<SingleItem> dataModelArrayList;


    public RecyclerViewAdapter(Context context, ArrayList<SingleItem> dataModelArrayList) {
        this.context = context;
        this.dataModelArrayList = dataModelArrayList;

    }

    public RecyclerViewAdapter() {

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        return new RecyclerViewHolder(view);

    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {

        if (holder instanceof RecyclerViewHolder) {
            final RecyclerViewHolder recyclerViewHolder = (RecyclerViewHolder) holder;

            recyclerViewHolder.title.setText(dataModelArrayList.get(position).getName());
        //    recyclerViewHolder.subTitle1.setText(dataModelArrayList.get(position).getSubTitle1());
          //  recyclerViewHolder.subTitle2.setText(dataModelArrayList.get(position).getSubTitle2());

            recyclerViewHolder.mView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, " click in position "+position , Toast.LENGTH_SHORT).show();
                }
            });
        }
    }


    @Override
    public int getItemCount() {
        return dataModelArrayList.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        private View mView;
        TextView title;
        TextView subTitle1;
        TextView subTitle2;
        private RecyclerViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            title = (TextView) itemView.findViewById(R.id.name);
            subTitle1 = (TextView) itemView.findViewById(R.id.vName);
            subTitle2 = (TextView) itemView.findViewById(R.id.address);
        }
    }
}