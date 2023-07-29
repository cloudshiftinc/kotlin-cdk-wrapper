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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersion
import software.constructs.Construct

/**
 * The `AWS::Greengrass::DeviceDefinitionVersion` resource represents a device definition version
 * for AWS IoT Greengrass .
 *
 * A device definition version contains a list of devices.
 *
 * To create a device definition version, you must specify the ID of the device definition that you
 * want to associate with the version. For information about creating a device definition, see
 * [`AWS::Greengrass::DeviceDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinition.html)
 * .
 *
 * After you create a device definition version that contains the devices you want to deploy, you
 * must add it to your group version. For more information, see
 * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * CfnDeviceDefinitionVersion cfnDeviceDefinitionVersion =
 * CfnDeviceDefinitionVersion.Builder.create(this, "MyCfnDeviceDefinitionVersion")
 * .deviceDefinitionId("deviceDefinitionId")
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html)
 */
@CdkDslMarker
public class CfnDeviceDefinitionVersionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDeviceDefinitionVersion.Builder =
        CfnDeviceDefinitionVersion.Builder.create(scope, id)

    private val _devices: MutableList<Any> = mutableListOf()

    /**
     * The ID of the device definition associated with this version.
     *
     * This value is a GUID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html#cfn-greengrass-devicedefinitionversion-devicedefinitionid)
     *
     * @param deviceDefinitionId The ID of the device definition associated with this version.
     */
    public fun deviceDefinitionId(deviceDefinitionId: String) {
        cdkBuilder.deviceDefinitionId(deviceDefinitionId)
    }

    /**
     * The devices in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html#cfn-greengrass-devicedefinitionversion-devices)
     *
     * @param devices The devices in this version.
     */
    public fun devices(vararg devices: Any) {
        _devices.addAll(listOf(*devices))
    }

    /**
     * The devices in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html#cfn-greengrass-devicedefinitionversion-devices)
     *
     * @param devices The devices in this version.
     */
    public fun devices(devices: Collection<Any>) {
        _devices.addAll(devices)
    }

    /**
     * The devices in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html#cfn-greengrass-devicedefinitionversion-devices)
     *
     * @param devices The devices in this version.
     */
    public fun devices(devices: IResolvable) {
        cdkBuilder.devices(devices)
    }

    public fun build(): CfnDeviceDefinitionVersion {
        if (_devices.isNotEmpty()) cdkBuilder.devices(_devices)
        return cdkBuilder.build()
    }
}
