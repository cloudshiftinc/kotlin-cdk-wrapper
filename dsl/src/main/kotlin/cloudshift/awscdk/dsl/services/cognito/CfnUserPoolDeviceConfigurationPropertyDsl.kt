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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPool
import kotlin.Boolean

@CdkDslMarker
public class CfnUserPoolDeviceConfigurationPropertyDsl {
    private val cdkBuilder: CfnUserPool.DeviceConfigurationProperty.Builder =
        CfnUserPool.DeviceConfigurationProperty.builder()

    public fun challengeRequiredOnNewDevice(challengeRequiredOnNewDevice: Boolean) {
        cdkBuilder.challengeRequiredOnNewDevice(challengeRequiredOnNewDevice)
    }

    public fun challengeRequiredOnNewDevice(challengeRequiredOnNewDevice: IResolvable) {
        cdkBuilder.challengeRequiredOnNewDevice(challengeRequiredOnNewDevice)
    }

    public fun deviceOnlyRememberedOnUserPrompt(deviceOnlyRememberedOnUserPrompt: Boolean) {
        cdkBuilder.deviceOnlyRememberedOnUserPrompt(deviceOnlyRememberedOnUserPrompt)
    }

    public fun deviceOnlyRememberedOnUserPrompt(deviceOnlyRememberedOnUserPrompt: IResolvable) {
        cdkBuilder.deviceOnlyRememberedOnUserPrompt(deviceOnlyRememberedOnUserPrompt)
    }

    public fun build(): CfnUserPool.DeviceConfigurationProperty = cdkBuilder.build()
}
