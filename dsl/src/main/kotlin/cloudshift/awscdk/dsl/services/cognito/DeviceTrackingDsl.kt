@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cognito.DeviceTracking
import kotlin.Boolean

@CdkDslMarker
public class DeviceTrackingDsl {
    private val cdkBuilder: DeviceTracking.Builder = DeviceTracking.builder()

    public fun challengeRequiredOnNewDevice(challengeRequiredOnNewDevice: Boolean) {
        cdkBuilder.challengeRequiredOnNewDevice(challengeRequiredOnNewDevice)
    }

    public fun deviceOnlyRememberedOnUserPrompt(deviceOnlyRememberedOnUserPrompt: Boolean) {
        cdkBuilder.deviceOnlyRememberedOnUserPrompt(deviceOnlyRememberedOnUserPrompt)
    }

    public fun build(): DeviceTracking = cdkBuilder.build()
}
