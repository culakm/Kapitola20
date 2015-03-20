/***
	Copyright (c) 2008-2011 CommonsWare, LLC
	
	Licensed under the Apache License, Version 2.0 (the "License"); you may
	not use this file except in compliance with the License. You may obtain
	a copy of the License at
		http://www.apache.org/licenses/LICENSE-2.0
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/

package com.hellbilling.kapitola20;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;

public class CWBrowser extends Activity {
	public static final String URL="com.commonsware.android.intenttab.URL";
	private WebView browser;
		
	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		
		browser=new WebView(this);
		setContentView(browser);
		browser.loadUrl(getIntent().getStringExtra(URL));
	}			
}
