package artmx.tourismpedia.indo.ui;

import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.LoaderManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import artmx.tourismpedia.indo.R;

/**
 * Created by RCIPCMOB7 on 06/04/2018.
 */

public class NotificationActivity extends AppCompatActivity {

        public static final String TAG = "NotificationActivity";
        //Loader
        private static final int ACTIVITY_LOADER_ID = 0;

        //UI
        LinearLayout llNoNotification,llOfflinelayout;
        CoordinatorLayout coordinatorLayout;
        AppBarLayout appBarLayout;
        ImageView mBanner;
        Button ivReload;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

    }
}
