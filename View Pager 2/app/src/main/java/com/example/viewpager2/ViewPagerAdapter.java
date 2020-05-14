package com.example.viewpager2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

public class ViewPagerAdapter extends RecyclerView.Adapter<ViewPagerAdapter.ViewHolder> {
    private LayoutInflater layoutInflater;
    private ViewPager2 viewPager2;


    private int[] pix = new int[]
            {
                    R.drawable.algeria, R.drawable.angola, R.drawable.benin, R.drawable.botswana,
                    R.drawable.burkina_faso, R.drawable.burundi, R.drawable.cameroon,
                    R.drawable.cape_verde, R.drawable.chad, R.drawable.comoros, R.drawable.cote_d_ivoire,
                    R.drawable.djibouti, R.drawable.egypt, R.drawable.eritrea, R.drawable.eswatini,
                    R.drawable.ethiopia,
                    R.drawable.gabon, R.drawable.gambia, R.drawable.ghana, R.drawable.guinea,
                    R.drawable.guinea_bissa,
                    R.drawable.kenya, R.drawable.lesotho, R.drawable.liberia, R.drawable.libya,
                    R.drawable.madagascar,
                    R.drawable.malawi, R.drawable.mali, R.drawable.mauritania, R.drawable.mauritius,
                    R.drawable.morocco,
                    R.drawable.mozambique, R.drawable.namibia, R.drawable.niger, R.drawable.nigeria,
                    R.drawable.reunion,
                    R.drawable.rwanda, R.drawable.senegal, R.drawable.seychlles, R.drawable.sierra_leone,
                    R.drawable.somalia,
                    R.drawable.south_africa, R.drawable.south_sudan, R.drawable.sudan, R.drawable.tanzania,
                    R.drawable.togo, R.drawable.uganda, R.drawable.tunisia, R.drawable.zambia,
                    R.drawable.zimbabwe
            };

    ViewPagerAdapter(Context context, ViewPager2 viewPager2) {
        this.layoutInflater = LayoutInflater.from(context);
        this.viewPager2 = viewPager2;
    }

    @NonNull
    @Override
    public ViewPagerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = layoutInflater.inflate(R.layout.view_pager_layout, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewPagerAdapter.ViewHolder viewHolder, int i) {
        viewHolder.myImageView.setImageResource(pix[i]);
    }

    @Override
    public int getItemCount() {
        return pix.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView myImageView;
        Button button1, button2, button3, button4, button5, button6,
                button7, button8, button9, button10, button11, button12;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            myImageView = itemView.findViewById(R.id.myImageView);
            button1 = itemView.findViewById(R.id.buton_1);
            button2 = itemView.findViewById(R.id.buton_2);
            button3 = itemView.findViewById(R.id.buton_3);
            button4 = itemView.findViewById(R.id.buton_4);
            button5 = itemView.findViewById(R.id.buton_5);
            button6 = itemView.findViewById(R.id.buton_6);
            button7 = itemView.findViewById(R.id.buton_7);
            button8 = itemView.findViewById(R.id.buton_8);
            button9 = itemView.findViewById(R.id.buton_9);
            button10 = itemView.findViewById(R.id.buton_10);
            button11 = itemView.findViewById(R.id.buton_11);
            button12 = itemView.findViewById(R.id.buton_12);

            viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                    super.onPageScrolled(position, positionOffset, positionOffsetPixels);
                }

                @Override
                public void onPageSelected(int position) {
                    super.onPageSelected(position);

//                    if (position == 0) {
//                        button1.setText("T");
//                        button2.setText("G");
//                        button3.setText("G");
//                        button4.setText("E");
//                        button5.setText("O");
//                        button6.setText("I");
//                        button7.setText("K");
//                        button8.setText("W");
//                        button9.setText("R");
//                        button10.setText("Q");
//                        button11.setText("V");
//                        button12.setText("U");
//                    } else {
//                        button1.setText("");
//                        button2.setText("");
//                        button3.setText("");
//                        button4.setText("");
//                        button5.setText("");
//                        button6.setText("");
//                        button7.setText("");
//                        button8.setText("");
//                        button9.setText("");
//                        button10.setText("");
//                        button11.setText("");
//                        button12.setText("");
//                    }
//
//                    if (position == 1) {
//                        button1.setText("O");
//                        button2.setText("E");
//                        button3.setText("F");
//                        button4.setText("Q");
//                        button5.setText("C");
//                        button6.setText("R");
//                        button7.setText("G");
//                        button8.setText("H");
//                        button9.setText("T");
//                        button10.setText("W");
//                        button11.setText("D");
//                        button12.setText("Q");
//                    } else {
//                        button1.setText("");
//                        button2.setText("");
//                        button3.setText("");
//                        button4.setText("");
//                        button5.setText("");
//                        button6.setText("");
//                        button7.setText("");
//                        button8.setText("");
//                        button9.setText("");
//                        button10.setText("");
//                        button11.setText("");
//                        button12.setText("");
//                    }
//
//                    if (position == 2) {
//                        button1.setText("W");
//                        button2.setText("R");
//                        button3.setText("G");
//                        button4.setText("T");
//                        button5.setText("G");
//                        button6.setText("I");
//                        button7.setText("U");
//                        button8.setText("R");
//                        button9.setText("F");
//                        button10.setText("D");
//                        button11.setText("D");
//                        button12.setText("A");
//                    } else {
//                        button1.setText("");
//                        button2.setText("");
//                        button3.setText("");
//                        button4.setText("");
//                        button5.setText("");
//                        button6.setText("");
//                        button7.setText("");
//                        button8.setText("");
//                        button9.setText("");
//                        button10.setText("");
//                        button11.setText("");
//                        button12.setText("");
//                    }

                }

                @Override
                public void onPageScrollStateChanged(int state) {
                    super.onPageScrollStateChanged(state);
                }
            });

           int position =  viewPager2.getCurrentItem();

            if (position == 0) {
                button1.setText("T");
                button2.setText("G");
                button3.setText("G");
                button4.setText("E");
                button5.setText("O");
                button6.setText("I");
                button7.setText("K");
                button8.setText("W");
                button9.setText("R");
                button10.setText("Q");
                button11.setText("V");
                button12.setText("U");
            } else {
                button1.setText("");
                button2.setText("");
                button3.setText("");
                button4.setText("");
                button5.setText("");
                button6.setText("");
                button7.setText("");
                button8.setText("");
                button9.setText("");
                button10.setText("");
                button11.setText("");
                button12.setText("");
            }

            if (position == 1) {
                button1.setText("O");
                button2.setText("E");
                button3.setText("F");
                button4.setText("Q");
                button5.setText("C");
                button6.setText("R");
                button7.setText("G");
                button8.setText("H");
                button9.setText("T");
                button10.setText("W");
                button11.setText("D");
                button12.setText("Q");
            } else {
                button1.setText("");
                button2.setText("");
                button3.setText("");
                button4.setText("");
                button5.setText("");
                button6.setText("");
                button7.setText("");
                button8.setText("");
                button9.setText("");
                button10.setText("");
                button11.setText("");
                button12.setText("");
            }

            if (position == 2) {
                button1.setText("W");
                button2.setText("R");
                button3.setText("G");
                button4.setText("T");
                button5.setText("G");
                button6.setText("I");
                button7.setText("U");
                button8.setText("R");
                button9.setText("F");
                button10.setText("D");
                button11.setText("D");
                button12.setText("A");
            } else {
                button1.setText("");
                button2.setText("");
                button3.setText("");
                button4.setText("");
                button5.setText("");
                button6.setText("");
                button7.setText("");
                button8.setText("");
                button9.setText("");
                button10.setText("");
                button11.setText("");
                button12.setText("");
            }


        }
    }
}
