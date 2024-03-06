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

package io.cloudshiftdev.awscdkdsl.services.iotwireless

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotwireless.CfnWirelessDevice

/**
 * Session keys for ABP v1.0.x.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotwireless.*;
 * SessionKeysAbpV10xProperty sessionKeysAbpV10xProperty = SessionKeysAbpV10xProperty.builder()
 * .appSKey("appSKey")
 * .nwkSKey("nwkSKey")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-sessionkeysabpv10x.html)
 */
@CdkDslMarker
public class CfnWirelessDeviceSessionKeysAbpV10xPropertyDsl {
    private val cdkBuilder: CfnWirelessDevice.SessionKeysAbpV10xProperty.Builder =
        CfnWirelessDevice.SessionKeysAbpV10xProperty.builder()

    /** @param appSKey The AppSKey value. */
    public fun appSKey(appSKey: String) {
        cdkBuilder.appSKey(appSKey)
    }

    /** @param nwkSKey The NwkKey value. */
    public fun nwkSKey(nwkSKey: String) {
        cdkBuilder.nwkSKey(nwkSKey)
    }

    public fun build(): CfnWirelessDevice.SessionKeysAbpV10xProperty = cdkBuilder.build()
}
