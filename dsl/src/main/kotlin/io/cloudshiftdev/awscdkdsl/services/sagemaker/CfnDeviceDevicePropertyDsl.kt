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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnDevice

/**
 * Information of a particular device.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * DeviceProperty deviceProperty = DeviceProperty.builder()
 * .deviceName("deviceName")
 * // the properties below are optional
 * .description("description")
 * .iotThingName("iotThingName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-device-device.html)
 */
@CdkDslMarker
public class CfnDeviceDevicePropertyDsl {
    private val cdkBuilder: CfnDevice.DeviceProperty.Builder = CfnDevice.DeviceProperty.builder()

    /** @param description Description of the device. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param deviceName The name of the device. */
    public fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
    }

    /** @param iotThingName AWS Internet of Things (IoT) object name. */
    public fun iotThingName(iotThingName: String) {
        cdkBuilder.iotThingName(iotThingName)
    }

    public fun build(): CfnDevice.DeviceProperty = cdkBuilder.build()
}
