package com.example.vasanth.hambutton.branch;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.vasanth.hambutton.R;
import com.example.vasanth.hambutton.cseBranchIndividualActivities.CseActivity1;
import com.example.vasanth.hambutton.cseBranchIndividualActivities.CseActivity2;
import com.example.vasanth.hambutton.eceBranchIndividualActivities.CircuitrixECE;
import com.example.vasanth.hambutton.eceBranchIndividualActivities.CodeBreakers;
import com.example.vasanth.hambutton.eceBranchIndividualActivities.DumbShellElectronics;
import com.example.vasanth.hambutton.eceBranchIndividualActivities.MatlabMania;
import com.example.vasanth.hambutton.eceBranchIndividualActivities.PaperPresentationECE;
import com.example.vasanth.hambutton.eceBranchIndividualActivities.PosterPresentationECE;
import com.example.vasanth.hambutton.eceBranchIndividualActivities.ProjectPresentationECE;
import com.example.vasanth.hambutton.eceBranchIndividualActivities.RamAndRomECE;
import com.example.vasanth.hambutton.eceBranchIndividualActivities.RoboticsECE;
import com.example.vasanth.hambutton.eceBranchIndividualActivities.TechnicalQuizECE;
import com.nostra13.universalimageloader.cache.memory.impl.WeakMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;

import java.util.ArrayList;

/**
 * Created by mravi on 14-01-2018.
 */

public class ECECustomListAdapter extends ArrayAdapter<Card> {

    private static final String TAG = "PersonListAdapterECE";

    private Context mContextECE;
    private int mResourceECE;
    private int lastPositionECE = -1;

    /**
     * Holds variables in a View
     */
    private static class ViewHolder {

        TextView titleECE;
        ImageView imageECE;
    }


    public ECECustomListAdapter(Context context, int resource, ArrayList<Card> objects) {
        super(context, resource, objects);
        mContextECE = context;
        mResourceECE = resource;
    }

    @NonNull
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        //sets up the image loader library
        setupImageLoader();

        //get the persons information
        final String title = getItem(position).getTitle();

        String imgUrl = getItem(position).getImgUrl();

        //create the view result for showing the animation
        final View result;

        //ViewHolder object
        ViewHolder holder;


        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(mContextECE);
            convertView = inflater.inflate(mResourceECE, parent, false);
            holder = new ViewHolder();
            holder.titleECE = (TextView) convertView.findViewById(R.id.cardTitleInECE);
            holder.imageECE = (ImageView) convertView.findViewById(R.id.cardImageInECE);
            result = convertView;

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        Button readMoreInECE = (Button) convertView.findViewById(R.id.readMoreInECE);
        readMoreInECE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (position == 0)
                    mContextECE.startActivity(new Intent(mContextECE, TechnicalQuizECE.class));
                else if (position == 1)
                    mContextECE.startActivity(new Intent(mContextECE, CircuitrixECE.class));
                else if (position == 2)
                    mContextECE.startActivity(new Intent(mContextECE, RamAndRomECE.class));
                else if (position == 3)
                    mContextECE.startActivity(new Intent(mContextECE, PaperPresentationECE.class));
                else if (position == 4)
                    mContextECE.startActivity(new Intent(mContextECE, PosterPresentationECE.class));
                else if (position == 5)
                    mContextECE.startActivity(new Intent(mContextECE, ProjectPresentationECE.class));
                else if (position == 6)
                    mContextECE.startActivity(new Intent(mContextECE, RoboticsECE.class));
                else if (position == 7)
                    mContextECE.startActivity(new Intent(mContextECE, CodeBreakers.class));
                else if (position == 8)
                    mContextECE.startActivity(new Intent(mContextECE, DumbShellElectronics.class));
                else if (position == 9)
                    mContextECE.startActivity(new Intent(mContextECE, MatlabMania.class));
            }
        });
        Button registerInECE = (Button) convertView.findViewById(R.id.registerInECE);
        registerInECE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (position == 0) {
                    goToChrome("https://docs.google.com/forms/d/e/1FAIpQLScxA8uVPpfhJvYff3EM6tB7RfpBxDu5wL5vB6DflqUmJt3Rxw/viewform");
                } else if (position == 1) {
                    goToChrome("https://docs.google.com/forms/d/e/1FAIpQLScxA8uVPpfhJvYff3EM6tB7RfpBxDu5wL5vB6DflqUmJt3Rxw/viewform");
                } else if (position == 2) {
                    goToChrome("https://docs.google.com/forms/d/e/1FAIpQLScxA8uVPpfhJvYff3EM6tB7RfpBxDu5wL5vB6DflqUmJt3Rxw/viewform");
                } else if (position == 3) {
                goToChrome("https://docs.google.com/forms/d/e/1FAIpQLScxA8uVPpfhJvYff3EM6tB7RfpBxDu5wL5vB6DflqUmJt3Rxw/viewform");
            }else if (position == 4) {
                    goToChrome("https://docs.google.com/forms/d/e/1FAIpQLScxA8uVPpfhJvYff3EM6tB7RfpBxDu5wL5vB6DflqUmJt3Rxw/viewform");
                }else if (position == 5) {
                    goToChrome("https://docs.google.com/forms/d/e/1FAIpQLScxA8uVPpfhJvYff3EM6tB7RfpBxDu5wL5vB6DflqUmJt3Rxw/viewform");
                }else if (position == 6) {
                    goToChrome("https://docs.google.com/forms/d/e/1FAIpQLScxA8uVPpfhJvYff3EM6tB7RfpBxDu5wL5vB6DflqUmJt3Rxw/viewform");
                }else if (position == 7) {
                    goToChrome("https://docs.google.com/forms/d/e/1FAIpQLScxA8uVPpfhJvYff3EM6tB7RfpBxDu5wL5vB6DflqUmJt3Rxw/viewform");
                }else if (position == 8) {
                    goToChrome("https://docs.google.com/forms/d/e/1FAIpQLScxA8uVPpfhJvYff3EM6tB7RfpBxDu5wL5vB6DflqUmJt3Rxw/viewform");
                }else if (position == 9) {
                    goToChrome("https://docs.google.com/forms/d/e/1FAIpQLScxA8uVPpfhJvYff3EM6tB7RfpBxDu5wL5vB6DflqUmJt3Rxw/viewform");
                }
            }
        });


        //    Animation animation = AnimationUtils.loadAnimation(mContext,
        //           (position > lastPosition) ? R.anim.load_down_anim : R.anim.load_up_anim);
        //  result.startAnimation(animation);
        // lastPosition = position;

        holder.titleECE.setText(title);


        //create the imageloader object
        ImageLoader imageLoader = ImageLoader.getInstance();

        int defaultImage = mContextECE.getResources().getIdentifier("@drawable/image_failed", null, mContextECE.getPackageName());

        //create display options
        DisplayImageOptions options = new DisplayImageOptions.Builder().cacheInMemory(true)
                .cacheOnDisc(true).resetViewBeforeLoading(true)
                .showImageForEmptyUri(defaultImage)
                .showImageOnFail(defaultImage)
                .showImageOnLoading(defaultImage).build();

        //download and display image from url
        imageLoader.displayImage(imgUrl, holder.imageECE, options);

        return convertView;


    }

    /**
     * Required for setting up the Universal Image loader Library
     */
    private void setupImageLoader() {
        // UNIVERSAL IMAGE LOADER SETUP
        DisplayImageOptions defaultOptions = new DisplayImageOptions.Builder()
                .cacheOnDisc(true).cacheInMemory(true)
                .imageScaleType(ImageScaleType.EXACTLY)
                .displayer(new FadeInBitmapDisplayer(300)).build();

        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(
                mContextECE)
                .defaultDisplayImageOptions(defaultOptions)
                .memoryCache(new WeakMemoryCache())
                .discCacheSize(100 * 1024 * 1024).build();

        ImageLoader.getInstance().init(config);
        // END - UNIVERSAL IMAGE LOADER SETUP
    }

    public void goToChrome(String docsLink) {
        try {
            Intent i = new Intent("android.intent.action.MAIN");
            i.setComponent(ComponentName.unflattenFromString("com.android.chrome/com.android.chrome.Main"));
            i.addCategory("android.intent.category.LAUNCHER");
            i.setData(Uri.parse(docsLink));
            mContextECE.startActivity(i);
        } catch (ActivityNotFoundException e) {
            // Chrome is not installed
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(docsLink));
            mContextECE.startActivity(i);
        }
    }
}