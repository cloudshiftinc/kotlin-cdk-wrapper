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

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotwireless.CfnWirelessDevice

/**
 * ABP device object for LoRaWAN specification v1.0.x.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotwireless.*;
 * AbpV10xProperty abpV10xProperty = AbpV10xProperty.builder()
 * .devAddr("devAddr")
 * .sessionKeys(SessionKeysAbpV10xProperty.builder()
 * .appSKey("appSKey")
 * .nwkSKey("nwkSKey")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-abpv10x.html)
 */
@CdkDslMarker
public class CfnWirelessDeviceAbpV10xPropertyDsl {
    private val cdkBuilder: CfnWirelessDevice.AbpV10xProperty.Builder =
        CfnWirelessDevice.AbpV10xProperty.builder()

    /** @param devAddr The DevAddr value. */
    public fun devAddr(devAddr: String) {
        cdkBuilder.devAddr(devAddr)
    }

    /** @param sessionKeys Session keys for ABP v1.0.x. */
    public fun sessionKeys(sessionKeys: IResolvable) {
        cdkBuilder.sessionKeys(sessionKeys)
    }

    /** @param sessionKeys Session keys for ABP v1.0.x. */
    public fun sessionKeys(sessionKeys: CfnWirelessDevice.SessionKeysAbpV10xProperty) {
        cdkBuilder.sessionKeys(sessionKeys)
    }

    public fun build(): CfnWirelessDevice.AbpV10xProperty = cdkBuilder.build()
}
