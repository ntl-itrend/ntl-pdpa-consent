package com.reactnativefirebase.ntlpdpaconsent

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Callback

import java.util.EnumMap

//Import firebase
import com.google.firebase.analytics.ktx.analytics



class NtlPdpaConsentModule internal constructor(context: ReactApplicationContext) :
  NtlPdpaConsentSpec(context) {
  private val firebaseAnalytics = Firebase.analytics

  val adStorage = FirebaseAnalytics.ConsentType.AD_STORAGE
  override fun getName(): String {
    return NAME
  }

  // Example method
  // See https://reactnative.dev/docs/native-modules-android

  @ReactMethod
  override fun setGrantAnalyticsStorage(cb: Callback) {
    try {
      firebaseAnalytics.setConsent {
        FirebaseAnalytics.ConsentType.ANALYTICS_STORAGE(firebaseAnalytics.ConsentStatus.GRANTED)
      }
      cb.invoke(null, "analytics_storage granted")
    } catch (e: Exception) {
      cb.invoke(e.toString(), null)
    }
  }

  @ReactMethod
  override fun setDenyAnalyticsStorage(cb: Callback) {
    try {
      firebaseAnalytics.setConsent {
        FirebaseAnalytics.ConsentType.ANALYTICS_STORAGE(firebaseAnalytics.ConsentStatus.DENIED)
      }
      cb.invoke(null, "analytics_storage denied")
    } catch (e: java.lang.Exception) {
      cb.invoke(e.toString(), null)
    }
  }

  @ReactMethod
  override fun setGrantAdStorage(cb: Callback) {
    try {
      firebaseAnalytics.setConsent {
        FirebaseAnalytics.ConsentType.AD_STORAGE(firebaseAnalytics.ConsentStatus.GRANTED)
      }
    } catch (e: java.lang.Exception) {
      cb.invoke(e.toString(), null)
    }
  }

  @ReactMethod
  override fun setDenyAdStorage(cb: Callback) {
    try {
      firebaseAnalytics = Firebase.analytics
      firebaseAnalytics.setConsent {
        FirebaseAnalytics.ConsentType.AD_STORAGE(firebaseAnalytics.ConsentStatus.DENIED)
      }
    } catch (e: java.lang.Exception) {
      cb.invoke(e.toString(), null)
    }
  }

  companion object {
    const val NAME = "NtlPdpaConsent"
  }
}
