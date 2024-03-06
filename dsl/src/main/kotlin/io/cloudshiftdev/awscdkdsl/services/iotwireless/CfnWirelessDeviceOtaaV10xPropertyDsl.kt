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
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotwireless.*;
 * OtaaV10xProperty otaaV10xProperty = OtaaV10xProperty.builder()
 * .appEui("appEui")
 * .appKey("appKey")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-wirelessdevice-otaav10x.html)
 */
@CdkDslMarker
public class CfnWirelessDeviceOtaaV10xPropertyDsl {
    private val cdkBuilder: CfnWirelessDevice.OtaaV10xProperty.Builder =
        CfnWirelessDevice.OtaaV10xProperty.builder()

    /**
     * @param appEui The AppEUI value. You specify this value when using LoRaWAN versions v1.0.2 or
     *   v1.0.3.
     */
    public fun appEui(appEui: String) {
        cdkBuilder.appEui(appEui)
    }

    /** @param appKey The AppKey value. */
    public fun appKey(appKey: String) {
        cdkBuilder.appKey(appKey)
    }

    public fun build(): CfnWirelessDevice.OtaaV10xProperty = cdkBuilder.build()
}
