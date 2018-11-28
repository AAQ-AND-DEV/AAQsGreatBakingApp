package com.aaqanddev.aaqsgreatbakingapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.aaqanddev.aaqsgreatbakingapp.R;
import com.aaqanddev.aaqsgreatbakingapp.model.Step;

import org.w3c.dom.Text;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.BindsInstance;

//TODO (DI) add the module to generate/host this adapter)
public class StepsListRecyclerViewAdapter extends RecyclerView.Adapter<StepsListRecyclerViewAdapter.StepViewHolder> {

    //TODO (DI) I think I need to inject steps here!
    //gosh... seems like I will need to do that a lot
    List<Step> mSteps;
    private final Context stepsContext;

    //TODO (DI) check if this ctor needs delta
    public StepsListRecyclerViewAdapter(List<Step> steps, Context context){
        this.mSteps = steps;
        this.stepsContext = context;
    }

    @NonNull
    @Override
    public StepViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_aaqs_steps, parent, false);
        return new StepViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull StepViewHolder holder, int pos) {
        Step step = mSteps.get(pos);
        holder.stepCardView.setTag(step);
        holder.expandedStepDesc_t_v.setText(step.getDescription());
        holder.shortStepDesc_t_v.setText(step.getShortDescription());
        //TODO (negotiate accessing the IMG res...)
        //this sort of thing could go in a viewModel
        //but I don't think I need Room
        //and much sophisticated stuff just to pass
        //sooooo TODO (either setImage method in util class, or here(?)
        // put in fragment, i think)
        //holder.stepImgView.setImageResource();
    }

    @Override
    public int getItemCount() {
        return mSteps.size();
    }


    public class StepViewHolder extends ViewHolder {
        //ok...so, i think I'll want some dataBinding here
        //is DI going to handle that
        //TODO (R) any utility for DI for databinding
        //i don't think so
        //also @BindDrawable, @BindColor @BindDimen and @BindString avail.
        //and BindViews({list of comma-sep'd multiple views})
        //i.e. for hiding multiple views at once...would
        //generate List<View> (wonder if it can be the base class)
        //tODO (Expmt A: bindViews for hiding multiple views)
        @BindView(R.id.step_card_view)
        CardView stepCardView;
        @BindView(R.id.step_img_view)
        ImageView stepImgView;
        @BindView(R.id.step_expanded_desc_tv)
        TextView expandedStepDesc_t_v;
        @BindView(R.id.step_short_desc_tv)
        TextView shortStepDesc_t_v;


        public StepViewHolder(@NonNull View itemView) {

            super(itemView);
            ButterKnife.bind(this,itemView );
        }
    }
}
