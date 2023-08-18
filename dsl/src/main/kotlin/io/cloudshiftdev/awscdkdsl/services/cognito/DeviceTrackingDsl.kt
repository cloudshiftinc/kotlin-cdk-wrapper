@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.cognito

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.cognito.DeviceTracking

/**
 * Device tracking settings.
 *
 * Example:
 * ```
 * UserPool.Builder.create(this, "myuserpool")
 * // ...
 * .deviceTracking(DeviceTracking.builder()
 * .challengeRequiredOnNewDevice(true)
 * .deviceOnlyRememberedOnUserPrompt(true)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-device-tracking.html)
 */
@CdkDslMarker
public class DeviceTrackingDsl {
    private val cdkBuilder: DeviceTracking.Builder = DeviceTracking.builder()

    /**
     * @param challengeRequiredOnNewDevice Indicates whether a challenge is required on a new
     *   device. Only applicable to a new device.
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
