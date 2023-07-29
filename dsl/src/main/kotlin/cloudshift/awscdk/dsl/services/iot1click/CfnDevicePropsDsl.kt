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

package cloudshift.awscdk.dsl.services.iot1click

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot1click.CfnDeviceProps

/**
 * Properties for defining a `CfnDevice`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot1click.*;
 * CfnDeviceProps cfnDeviceProps = CfnDeviceProps.builder()
 * .deviceId("deviceId")
 * .enabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-device.html)
 */
@CdkDslMarker
public class CfnDevicePropsDsl {
    private val cdkBuilder: CfnDeviceProps.Builder = CfnDeviceProps.builder()

    /** @param deviceId The ID of the device, such as `G030PX0312744DWM` . */
    public fun deviceId(deviceId: String) {
        cdkBuilder.deviceId(deviceId)
    }

    /**
     * @param enabled A Boolean value indicating whether the device is enabled ( `true` ) or not (
     *   `false` ).
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled A Boolean value indicating whether the device is enabled ( `true` ) or not (
     *   `false` ).
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): CfnDeviceProps = cdkBuilder.build()
}
