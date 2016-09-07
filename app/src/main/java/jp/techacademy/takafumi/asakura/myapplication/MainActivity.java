package jp.techacademy.takafumi.asakura.myapplication;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    private String name = "剛史";
    private String age = "37";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Human human = new Human("剛史", 37);     // 名前をTakafumi、年齢37歳で、Humanのインスタンスを作る

        human.say();
        Log.d("javatest", "私の名前は" + this.name + "です。");
        Log.d("javatest", "年は" + this.age + "歳です。");
        human.think();                                      //thinkを実装


    }

}