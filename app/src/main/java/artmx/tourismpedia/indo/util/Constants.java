package artmx.tourismpedia.indo.util;

/**
 * Created by ARTMX on 03-Jan-17.
 */

public class Constants {


    //Parameters
    public static final String BASE_URL_PLACES = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?";
    public static final String BASE_URL_PLACE_DETAILS = "https://maps.googleapis.com/maps/api/place/details/json?";
    public static final String PLACE_THUMBNAIL = "https://maps.googleapis.com/maps/api/place/photo?maxheight=220&photoreference=";
    public static final String BASE_URL_STATIC_MAP = "https://maps.googleapis.com/maps/api/staticmap?";


    public static final String PLACE_PHOTO = "https://maps.googleapis.com/maps/api/place/photo?maxheight=800&photoreference=";
    public static final String API_KEY_PARAM = "key";
    public static final String LOCATION_PARAM = "location";
    public static final String TYPE_PARAM = "type";
    public static final String TYPES_PARAM = "types";
    public static final String RADIUS_PARAM = "radius";
    public static final String RANK_BY_PARAM = "rankby";
    public static final String PLACE_ID_PARAM = "placeid";
    public static final String CENTER_PARAM = "center";
    public static final String ZOOM_PARAM = "zoom";
    public static final String SIZE_PARAM = "size";


    //Values
    public static final String API_VALUE = "AIzaSyBvOVLxeCtW-XviZMK593VMLXLL_4Uvg38";


    public static final String API_MAPS_VALUE = "AIzaSyBvOVLxeCtW-XviZMK593VMLXLL_4Uvg38";
    public static final String ABMOBS_APP_ID = "ca-app-pub-3940256099942544~3347511713";
    public static final String TYPE_VALUE_RESTAURANT = "restaurant|meal_delivery|meal_takeway";
    public static final String TYPE_VALUE_HOTEL = "lodging|";
    public static final String TYPE_VALUE_WISATA = "amusement_park|museum|zoo";
    public static final String TYPE_VALUE_POI = "point_of_interest";
    public static final String TYPE_VALUE_SHOPPING = "shopping_mall";
    public static final String RADIUS_VALUE = "5000";
    public static final String RANK_BY_VALUE = "prominence";
    public static final String ZOOM_VALUE_HIGH = "16";
    public static final String ZOOM_VALUE_LOW = "10";
    public static final String SIZE_VALUE_S = "150x100";
    public static final String SIZE_VALUE_M = "800x400";
    public static final int HEIGHT_CITY_GPHOTO = 300;
    public static final int WIDTH_CITY_GPHOTO = 600;

    //keys
    public static final String TAG_RESULT = "result";
    public static final String TAG_ICON = "icon";
    public static final String TAG_NAME = "name";
    public static final String TAG_PLACE_ID = "place_id";
    public static final String TAG_RATING = "rating";
    public static final String TAG_REVIEWS = "reviews";
    public static final String TAG_ADDRESS = "vicinity";
    public static final String TAG_ADDRESS_FULL = "formatted_address";
    public static final String TAG_WEBSITE = "website";
    public static final String TAG_PHONE = "international_phone_number";
    public static final String TAG_MAP_URL = "url";
    public static final String TAG_LAT = "lat";
    public static final String TAG_LNG = "lng";
    public static final String TAG_GEOMETRY = "geometry";
    public static final String TAG_LOCATION = "location";
    public static final String TAG_REVIEW_NAME = "author_name";
    public static final String TAG_REVIEW_AVATAR = "profile_photo_url";
    public static final String TAG_REVIEW_TIME = "relative_time_description";
    public static final String TAG_REVIEW_BODY = "text";
    public static final String TAG_REVIEW_RATING = "rating";


    //Delays
    public static final int PERMISSION_DELAY_MS = 2000;
    public static final int SPLASH_DELAY_MS = 1500;
    public static final int ADMOB_DELAY_MS = 0;



     //FCM Push notifications -start

    // global topic to receive app wide push notifications
    public static final String TOPIC_GLOBAL = "global";
    // broadcast receiver intent filters
    public static final String REGISTRATION_COMPLETE = "registrationComplete";
    public static final String PUSH_NOTIFICATION = "pushNotification";
    // id to handle the notification in the notification tray
    public static final int NOTIFICATION_ID = 100;
    public static final int NOTIFICATION_ID_BIG_IMAGE = 101;
    public static final String SHARED_PREF = "ah_firebase";

    //Firebase Auth
    public static final int RC_SIGN_IN = 1;
    public static final String ANONYMOUS = "anonymous";

    //FCM Push notifications -end

    //Firebase db values -start

    //same as the place-title field name in PlaceDetail model
    public  static final String title_node_place_id="place_detail_id";

    //new Embeded


    public static final int SUCCESS_RESULT = 0;

    public static final int FAILURE_RESULT = 1;

    public static final String PACKAGE_NAME =
            "com.google.android.gms.location.sample.locationaddress";

    public static final String RECEIVER = PACKAGE_NAME + ".RECEIVER";

    public static final String RESULT_DATA_KEY = PACKAGE_NAME + ".RESULT_DATA_KEY";

    public static final String LOCATION_DATA_EXTRA = PACKAGE_NAME + ".LOCATION_DATA_EXTRA";

    public static final String TAG_PARENT = "tourismpedia";

    public static final String FIREBASE_PROJECT_ID = "";

    public static final String APP_TWITTER = "app_twitter";
    public static final String APP_FACEBOOK = "app_facebook";
    public static final String APP_EMAIL = "app_email";
    public static final String APP_INSTAGRAM = "app_instagram";
    public static final String APP_YOUTUBE = "app_youtube";
    public static final String APP_WEBSITE = "app_website";
    public static final String APP_DESCRIPTION = "app_description";

    public static final String ENABLE_ADS_BANNER = "enable_ad_banner";
    public static final String ENABLE_ADS_NATIVE = "enable_ad_native";
    public static final String ENABLE_ADS_INTERSTITIAL = "enable_ad_interstitial";

}
