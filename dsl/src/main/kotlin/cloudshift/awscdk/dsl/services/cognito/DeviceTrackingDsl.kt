@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.cognito.DeviceTracking

@CdkDslMarker
public class DeviceTrackingDsl {
  private val cdkBuilder: DeviceTracking.Builder = DeviceTracking.builder()

  /**
   * @param challengeRequiredOnNewDevice Indicates whether a challenge is required on a new device. 
   * Only applicable to a new device.
   */
  public fun challengeRequiredOnNewDevice(challengeRequiredOnNewDevice: Boolean) {
    cdkBuilder.challengeRequiredOnNewDevice(challengeRequiredOnNewDevice)
  }

  /**
   * @param deviceOnlyRememberedOnUserPrompt If true, a device is only remembered on user prompt. 
   */
  public fun deviceOnlyRememberedOnUserPrompt(deviceOnlyRememberedOnUserPrompt: Boolean) {
    cdkBuilder.deviceOnlyRememberedOnUserPrompt(deviceOnlyRememberedOnUserPrompt)
  }

  public fun build(): DeviceTracking = cdkBuilder.build()
}
