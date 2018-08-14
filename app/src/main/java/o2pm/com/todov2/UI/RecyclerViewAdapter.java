package o2pm.com.todov2.UI;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import o2pm.com.todov2.R;
import o2pm.com.todov2.model.ToDoItem;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{
    private Context context;
    private List<ToDoItem> todoListItemList;


    public RecyclerViewAdapter(Context context, List<ToDoItem> toDoItemList) {
        this.context = context;
        this.todoListItemList = toDoItemList;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.Layout.list_row, parent, false);
        return ViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {

        ToDoItem toDoItem = todoListItemList.get(position);


    }

    @Override
    public int getItemCount() {
        return todoListItemList.size();
    }

    public class ViewHolder extends RecyclerViewAdapter.ViewHolder implements View.OnClickListener {

    }
}
