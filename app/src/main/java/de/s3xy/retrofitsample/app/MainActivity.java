package de.s3xy.retrofitsample.app;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import de.s3xy.retrofitsample.app.Api.BlizzardClient;
import de.s3xy.retrofitsample.app.Models.Profile;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class MainActivity extends ActionBarActivity {

    private TextView txtBattleTag;
    private TextView txtTotalKills;
    private TextView txtParagonLevel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.buttonGetProfile).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                download();
            }
        });

        txtBattleTag = (TextView) findViewById(R.id.txtBattleNetId);
        txtParagonLevel = (TextView) findViewById(R.id.txtParagonLevel);
        txtTotalKills = (TextView) findViewById(R.id.txtTotalKills);

    }

    private void download() {
        BlizzardClient.
                getBlizzardApiClient().
                getUserProfile(txtBattleTag.getText().toString(), new Callback<Profile>() {
                    @Override
                    public void success(Profile result, Response response) {
                        Toast.makeText(getApplicationContext(), result.getBattleTag() + " Loaded! Status Code:" + response.getStatus(), Toast.LENGTH_SHORT).show();

                        txtTotalKills.setText(result.getKills().toString());
                        txtParagonLevel.setText(String.valueOf(result.getParagonLevel()));
                    }

                    @Override
                    public void failure(RetrofitError retrofitError) {
                        Toast.makeText(getApplicationContext(), retrofitError.getMessage(), Toast.LENGTH_SHORT).show();

                    }
                });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
