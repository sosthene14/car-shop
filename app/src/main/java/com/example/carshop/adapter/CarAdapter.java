package com.example.carshop.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.carshop.R;
import com.example.carshop.model.Car;

import java.util.List;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.CarViewHolder> {

    public interface OnItemClickListener {
        void onItemClick(Car car);
    }

    private List<Car> cars;
    private OnItemClickListener listener;

    public CarAdapter(List<Car> cars, OnItemClickListener listener) {
        this.cars = cars;
        this.listener = listener;
    }

    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_car, parent, false);
        return new CarViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {
        Car car = cars.get(position);
        holder.bind(car, listener);
    }

    @Override
    public int getItemCount() {
        return cars.size();
    }

    static class CarViewHolder extends RecyclerView.ViewHolder {
        private final ImageView carImage;
        private final TextView tvMarque;
        private final TextView tvType;

        public CarViewHolder(@NonNull View itemView) {
            super(itemView);
            carImage = itemView.findViewById(R.id.ivCarImage);
            tvMarque = itemView.findViewById(R.id.tvMarque);
            tvType = itemView.findViewById(R.id.tvType);
        }

        public void bind(final Car car, final OnItemClickListener listener) {
            Glide.with(itemView.getContext()).load(car.getImageUrl()).into(carImage);
            tvMarque.setText(car.getMarque());
            tvType.setText(car.getType());
            itemView.setOnClickListener(v -> listener.onItemClick(car));
        }
    }
}
