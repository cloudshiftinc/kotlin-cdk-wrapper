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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnDevice
import software.amazon.awscdk.services.sagemaker.CfnDeviceProps

/**
 * Properties for defining a `CfnDevice`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CfnDeviceProps cfnDeviceProps = CfnDeviceProps.builder()
 * .deviceFleetName("deviceFleetName")
 * // the properties below are optional
 * .device(DeviceProperty.builder()
 * .deviceName("deviceName")
 * // the properties below are optional
 * .description("description")
 * .iotThingName("iotThingName")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-device.html)
 */
@CdkDslMarker
public class CfnDevicePropsDsl {
    private val cdkBuilder: CfnDeviceProps.Builder = CfnDeviceProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param device Edge device you want to create. */
    public fun device(device: IResolvable) {
        cdkBuilder.device(device)
    }

    /** @param device Edge device you want to create. */
    public fun device(device: CfnDevice.DeviceProperty) {
        cdkBuilder.device(device)
    }

    /** @param deviceFleetName The name of the fleet the device belongs to. */
    public fun deviceFleetName(deviceFleetName: String) {
        cdkBuilder.deviceFleetName(deviceFleetName)
    }

    /**
     * @param tags An array of key-value pairs that contain metadata to help you categorize and
     *   organize your devices. Each tag consists of a key and a value, both of which you define.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs that contain metadata to help you categorize and
     *   organize your devices. Each tag consists of a key and a value, both of which you define.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDeviceProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
