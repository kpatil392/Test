/*
package com.example.myhh;

public class NavMainActivity {
}
class MainActivity : AppCompatActivity() {

private var content: FrameLayout? = null

private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
        R.id.navigation_home -> {

        val fragment = FragmentHome.Companion.newInstance()
        addFragment(fragment)

        return@OnNavigationItemSelectedListener true
        }
        R.id.navigation_dashboard -> {
        val fragment = FragmentDashboard()
        addFragment(fragment)
        return@OnNavigationItemSelectedListener true
        }
        R.id.navigation_notifications -> {
        val fragment = FragmentNotification()
        addFragment(fragment)
        return@OnNavigationItemSelectedListener true
        }
        }
        false
        }


        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        content = findViewById(R.id.content)
        val navigation = findViewById<BottomNavigationView>(R.id.navigation)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        val fragment = FragmentHome.Companion.newInstance()
        addFragment(fragment)
        }

*/
/**
 * add/replace fragment in container [FrameLayout]
 *//*

private fun addFragment(fragment: Fragment) {
        supportFragmentManager
        .beginTransaction()
        .setCustomAnimations(R.anim.design_bottom_sheet_slide_in, R.anim.design_bottom_sheet_slide_out)
        .replace(R.id.content, fragment, fragment.javaClass.simpleName)
        .commit()
        }
        }
        ////////////////////
        class FragmentDashboard : Fragment() {

        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_dashboard, container, false)
        }

        }
        /////////////
        class FragmentHome : Fragment() {

        */
/**
         * Initialize newInstance for passing parameters
         *//*

        companion object {
        fun newInstance(): FragmentHome {
        val fragmentHome = FragmentHome()
        val args = Bundle()
        fragmentHome.arguments = args
        return fragmentHome
        }

        }

        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_home, container, false)
        }
        }
        /////////////
        class FragmentNotification : Fragment() {

        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_notification, container, false)
        }
        }
        ////////
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    android:id="@+id/container"
            xmlns:android="http://schemas.android.com/apk/res/android"
            xmlns:app="http://schemas.android.com/apk/res-auto"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="vertical">

<FrameLayout
        android:id="@+id/content"
                android:layout_width="match_parent"
                android:layout_height="0dp"
                android:layout_weight="1">

</FrameLayout>

<com.google.android.material.bottomnavigation.BottomNavigationView
        android:id="@+id/navigation"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_gravity="bottom"
        android:background="?android:attr/windowBackground"
        app:menu="@menu/navigation"/>

</LinearLayout>
////////////
<RelativeLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
            android:layout_width="match_parent"
            android:layout_height="match_parent">

<TextView
        android:id="@+id/textViewNotification"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_centerHorizontal="true"
                android:layout_centerInParent="true"
                android:drawableTop="@drawable/ic_notifications_black_24dp"
                android:gravity="center_horizontal"
                android:text="@string/title_notifications"
                android:textAppearance="@style/Base.TextAppearance.AppCompat.Large"/>

</RelativeLayout>*/
