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

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinition

/**
 * A device definition version contains a list of
 * [devices](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-device.html)
 * .
 *
 * After you create a device definition version that contains the devices you want to deploy, you
 * must add it to your group version. For more information, see
 * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
 * .
 *
 * In an AWS CloudFormation template, `DeviceDefinitionVersion` is the property type of the
 * `InitialVersion` property in the
 * [`AWS::Greengrass::DeviceDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinition.html)
 * resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * DeviceDefinitionVersionProperty deviceDefinitionVersionProperty =
 * DeviceDefinitionVersionProperty.builder()
 * .devices(List.of(DeviceProperty.builder()
 * .certificateArn("certificateArn")
 * .id("id")
 * .thingArn("thingArn")
 * // the properties below are optional
 * .syncShadow(false)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-devicedefinitionversion.html)
 */
@CdkDslMarker
public class CfnDeviceDefinitionDeviceDefinitionVersionPropertyDsl {
    private val cdkBuilder: CfnDeviceDefinition.DeviceDefinitionVersionProperty.Builder =
        CfnDeviceDefinition.DeviceDefinitionVersionProperty.builder()

    private val _devices: MutableList<Any> = mutableListOf()

    /** @param devices The devices in this version. */
    public fun devices(vararg devices: Any) {
        _devices.addAll(listOf(*devices))
    }

    /** @param devices The devices in this version. */
    public fun devices(devices: Collection<Any>) {
        _devices.addAll(devices)
    }

    /** @param devices The devices in this version. */
    public fun devices(devices: IResolvable) {
        cdkBuilder.devices(devices)
    }

    public fun build(): CfnDeviceDefinition.DeviceDefinitionVersionProperty {
        if (_devices.isNotEmpty()) cdkBuilder.devices(_devices)
        return cdkBuilder.build()
    }
}
