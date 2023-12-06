package com.reactnativefirebase.ntlpdpaconsent

import com.facebook.react.bridge.ReactApplicationContext

abstract class NtlPdpaConsentSpec internal constructor(context: ReactApplicationContext) :
  NativeNtlPdpaConsentSpec(context) {

  abstract fun setGrantAnalyticsStorage(cb: Callback)
  abstract fun setDenyAnalyticsStorage(cb: Callback)
  abstract fun setGrantAdStorage(cb: Callback)
  abstract fun setDenyAdStorage(cb: Callback)
}
