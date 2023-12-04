#import "NtlPdpaConsent.h"
#import "Firebase/Firebase.h"

@implementation NtlPdpaConsent
RCT_EXPORT_MODULE()

//exports a method to javascript
RCT_EXPORT_METHOD(setGrantAnalyticsStorage:(RCTResponseSenderBlock)callback){
 @try{
   [FIRAnalytics setConsent:@{
     FIRConsentTypeAnalyticsStorage : FIRConsentStatusGranted
   }];
   callback(@[[NSNull null],  @"analytics_storage granted"]);
 }
 @catch(NSException *exception){
   callback(@[exception.reason, [NSNull null]]);
 }
}

RCT_EXPORT_METHOD(setDenyAnalyticsStorage:(RCTResponseSenderBlock)callback){
 @try{
   [FIRAnalytics setConsent:@{
     FIRConsentTypeAnalyticsStorage : FIRConsentStatusDenied
   }];
   callback(@[[NSNull null], @"analytics_storage denied"]);
 }
 @catch(NSException *exception){
   callback(@[exception.reason, [NSNull null]]);
 }
}

RCT_EXPORT_METHOD(setGrantAdStorage:(RCTResponseSenderBlock)callback){
 @try{
   [FIRAnalytics setConsent:@{
    FIRConsentTypeAdStorage : FIRConsentStatusGranted
  }];
   callback(@[[NSNull null],  @"ad_storage granted"]);
 }
 @catch(NSException *exception){
   callback(@[exception.reason, [NSNull null]]);
 }
}

RCT_EXPORT_METHOD(setDenyAdStorage:(RCTResponseSenderBlock)callback){
 @try{
   [FIRAnalytics setConsent:@{
    FIRConsentTypeAdStorage : FIRConsentStatusDenied
  }];
   callback(@[[NSNull null],  @"ad_storage denied"]);
 }
 @catch(NSException *exception){
   callback(@[exception.reason, [NSNull null]]);
 }
}

// Don't compile this code when we build for the old architecture.
#ifdef RCT_NEW_ARCH_ENABLED
- (std::shared_ptr<facebook::react::TurboModule>)getTurboModule:
    (const facebook::react::ObjCTurboModule::InitParams &)params
{
    return std::make_shared<facebook::react::NativeNtlPdpaConsentSpecJSI>(params);
}
#endif

@end

