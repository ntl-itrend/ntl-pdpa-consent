package com.reactnativefirebase.ntlpdpaconsent

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Callback

import java.util.EnumMap

//Import firebase
import com.google.firebase.analytics.FirebaseAnalytics



class NtlPdpaConsentModule internal constructor(context: ReactApplicationContext) :
  NtlPdpaConsentSpec(context) {
  var firebaseAnalytics: FirebaseAnalytics


  override fun getName(): String {
    return NAME
  }

  // Example method
  // See https://reactnative.dev/docs/native-modules-android

  @ReactMethod
  override fun setGrantAnalyticsStorage(cb: Callback) {
    try {
      firebaseAnalytics = FirebaseAnalytics.getInstance(getReactApplicationContext())
      val consentMap: MutableMap<FirebaseAnalytics.ConsentType, FirebaseAnalytics.ConsentStatus> = EnumMap<Any?, Any?>(FirebaseAnalytics.ConsentType::class.java)
      consentMap[FirebaseAnalytics.ConsentType.ANALYTICS_STORAGE] = FirebaseAnalytics.ConsentStatus.GRANTED
      firebaseAnalytics.setConsent(consentMap)
      cb.invoke(null, "analytics_storage granted")
    } catch (e: Exception) {
      cb.invoke(e.toString(), null)
    }
  }

  @ReactMethod
  override fun setDenyAnalyticsStorage(cb: Callback) {
    try {
      firebaseAnalytics = FirebaseAnalytics.getInstance(getReactApplicationContext())
      val consentMap: MutableMap<FirebaseAnalytics.ConsentType, FirebaseAnalytics.ConsentStatus> = EnumMap<Any?, Any?>(FirebaseAnalytics.ConsentType::class.java)
      consentMap[FirebaseAnalytics.ConsentType.ANALYTICS_STORAGE] = FirebaseAnalytics.ConsentStatus.DENIED
      firebaseAnalytics.setConsent(consentMap)
      cb.invoke(null, "analytics_storage denied")
    } catch (e: java.lang.Exception) {
      cb.invoke(e.toString(), null)
    }
  }

  @ReactMethod
  override fun setGrantAdStorage(cb: Callback) {
    try {
      firebaseAnalytics = FirebaseAnalytics.getInstance(getReactApplicationContext())
      val consentMap: MutableMap<FirebaseAnalytics.ConsentType, FirebaseAnalytics.ConsentStatus> = EnumMap<Any?, Any?>(FirebaseAnalytics.ConsentType::class.java)
      consentMap[FirebaseAnalytics.ConsentType.AD_STORAGE] = FirebaseAnalytics.ConsentStatus.GRANTED
      firebaseAnalytics.setConsent(consentMap)
      cb.invoke(null, "ad_storage granted")
    } catch (e: java.lang.Exception) {
      cb.invoke(e.toString(), null)
    }
  }

  @ReactMethod
  override fun setDenyAdStorage(cb: Callback) {
    try {
      firebaseAnalytics = FirebaseAnalytics.getInstance(getReactApplicationContext())
      val consentMap: MutableMap<FirebaseAnalytics.ConsentType, FirebaseAnalytics.ConsentStatus> = EnumMap<Any?, Any?>(FirebaseAnalytics.ConsentType::class.java)
      consentMap[FirebaseAnalytics.ConsentType.AD_STORAGE] = FirebaseAnalytics.ConsentStatus.DENIED
      firebaseAnalytics.setConsent(consentMap)
      cb.invoke(null, "ad_storage denied")
    } catch (e: java.lang.Exception) {
      cb.invoke(e.toString(), null)
    }
  }

  companion object {
    const val NAME = "NtlPdpaConsent"
  }
}
