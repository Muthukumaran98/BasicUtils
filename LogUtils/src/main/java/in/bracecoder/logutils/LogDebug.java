package in.bracecoder.logutils;

import android.util.Log;

public class LogDebug {
    public static final String TAG="App_Debug_Android";
    public static void d(String message)
    {
        Log.d(TAG,message);
    }
}
