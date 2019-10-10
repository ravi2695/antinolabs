package com.ravi.antinolabs;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder>{

    private Context mcontext;
    private List<User> userList;

    public UserAdapter(Context mcontext, List<User> userList) {
        this.mcontext = mcontext;
        this.userList = userList;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(mcontext);
        View view=inflater.inflate(R.layout.list_layout,null);
        UserViewHolder holder=new UserViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {

        User user=userList.get(position);
        holder.name.setText(user.getName());
        holder.age.setText(String.valueOf(user.getAge()));
        holder.location.setText(user.getLocation());
        holder.imageView.setImageDrawable(mcontext.getResources().getDrawable(user.getImage()));

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    class UserViewHolder extends RecyclerView.ViewHolder
    {

        ImageView imageView;
        TextView name,age,location;

        public UserViewHolder(View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageView);
            age=itemView.findViewById(R.id.age);
            name=itemView.findViewById(R.id.name);
            location=itemView.findViewById(R.id.location);

        }
    }
}
