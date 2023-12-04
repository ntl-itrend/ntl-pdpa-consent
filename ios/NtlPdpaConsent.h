
#ifdef RCT_NEW_ARCH_ENABLED
#import "RNNtlPdpaConsentSpec.h"

@interface NtlPdpaConsent : NSObject <NativeNtlPdpaConsentSpec>
#else
#import <React/RCTBridgeModule.h>

@interface NtlPdpaConsent : NSObject <RCTBridgeModule>
#endif

@end
