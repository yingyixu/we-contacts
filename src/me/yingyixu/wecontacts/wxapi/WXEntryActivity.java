
package me.yingyixu.wecontacts.wxapi;

import com.tencent.mm.sdk.openapi.BaseReq;
import com.tencent.mm.sdk.openapi.BaseResp;
import com.tencent.mm.sdk.openapi.IWXAPI;
import com.tencent.mm.sdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.sdk.openapi.WXAPIFactory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class WXEntryActivity extends Activity implements IWXAPIEventHandler {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        genWXApi();
        wxapi.handleIntent(getIntent(), this);
    }

    private IWXAPI wxapi;

    private void genWXApi() {
        wxapi = WXAPIFactory.createWXAPI(this, WXApi.APP_ID, true);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

        setIntent(intent);
        wxapi.handleIntent(intent, this);
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
