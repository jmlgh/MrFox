package com.example.javi.mrfox;

import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;


public class MyTest extends ActivityInstrumentationTestCase2<MyLogin> {

    // componentes
    private MyLogin login;
    private Button btnLogin;

    public MyTest(){
        super(MyLogin.class);
    }

    // inicializacion de componentes
    protected void setUp() throws Exception{
        super.setUp();
        login = getActivity();
        btnLogin = (Button) login.findViewById(R.id.btn_login);
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testPreCondiciones(){
        assertNotNull("btnLogin is null", btnLogin);
    }

    public void testClick(){
        TouchUtils.clickView(this, btnLogin);
    }


}
