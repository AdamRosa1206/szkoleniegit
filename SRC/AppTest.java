public class AppTest {


    public static void main(String[] args) {
        AndroidApp apkaandroid = new AndroidApp("Apka Androidowa");
        System.out.println(apkaandroid.name);
        apkaandroid.appInfo();
        apkaandroid.runAndroidApp();

        IphoneApp apkiphone = new IphoneApp("Apka Iphone");
        System.out.println(apkiphone.name);
        apkiphone.appInfo();
        apkiphone.runIphoneApp();

    }

}
