
package me.yingyixu.wecontacts;

import com.tencent.mm.sdk.openapi.BaseReq;
import com.tencent.mm.sdk.openapi.BaseResp;
import com.tencent.mm.sdk.openapi.IWXAPI;
import com.tencent.mm.sdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.sdk.openapi.WXAPIFactory;

import me.yingyixu.wecontacts.wxapi.WXApi;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity implements IWXAPIEventHandler {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reg2WeChat();
        wxapi.handleIntent(getIntent(), this);
    }

    private IWXAPI wxapi;

    private void reg2WeChat() {
        wxapi = WXAPIFactory.createWXAPI(this, WXApi.APP_ID, true);
        wxapi.registerApp(WXApi.APP_ID);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        reg2WeChat();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public void onReq(BaseReq arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onResp(BaseResp arg0) {
        // TODO Auto-generated method stub

    }

}
