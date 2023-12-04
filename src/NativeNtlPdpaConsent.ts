import type { TurboModule } from 'react-native';
import { TurboModuleRegistry } from 'react-native';

export interface Spec extends TurboModule {
  setGrantAnalyticsStorage(callback: () => void): void;
  setDenyAnalyticsStorage(callback: () => void): void;
  setGrantAdStorage(callback: () => void): void;
  setDenyAdStorage(callback: () => void): void;
}

export default TurboModuleRegistry.getEnforcing<Spec>('NtlPdpaConsent');
