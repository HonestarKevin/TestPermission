package com.honestar.qrpermission;

import android.util.Log;

public class CommonUtil {

	public static boolean DEBUG = true;
	public void print_f(String TAG, String msg)
	{
		if(DEBUG)
			Log.e(TAG, msg);
	}
}
