package com.reactnativefirebase.ntlpdpaconsent

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.Callback

abstract class NtlPdpaConsentSpec internal constructor(context: ReactApplicationContext) :
  ReactContextBaseJavaModule(context) {

  abstract fun setGrantAnalyticsStorage(cb: Callback)
  abstract fun setDenyAnalyticsStorage(cb: Callback)
  abstract fun setGrantAdStorage(cb: Callback)
  abstract fun setDenyAdStorage(cb: Callback)

}
