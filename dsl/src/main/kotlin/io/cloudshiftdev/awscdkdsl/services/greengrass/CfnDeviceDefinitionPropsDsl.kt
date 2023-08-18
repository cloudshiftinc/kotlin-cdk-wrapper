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

package io.cloudshiftdev.awscdkdsl.services.greengrass

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinition
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionProps

/**
 * Properties for defining a `CfnDeviceDefinition`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * Object tags;
 * CfnDeviceDefinitionProps cfnDeviceDefinitionProps = CfnDeviceDefinitionProps.builder()
 * .name("name")
 * // the properties below are optional
 * .initialVersion(DeviceDefinitionVersionProperty.builder()
 * .devices(List.of(DeviceProperty.builder()
 * .certificateArn("certificateArn")
 * .id("id")
 * .thingArn("thingArn")
 * // the properties below are optional
 * .syncShadow(false)
 * .build()))
 * .build())
 * .tags(tags)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinition.html)
 */
@CdkDslMarker
public class CfnDeviceDefinitionPropsDsl {
    private val cdkBuilder: CfnDeviceDefinitionProps.Builder = CfnDeviceDefinitionProps.builder()

    /**
     * @param initialVersion The device definition version to include when the device definition is
     *   created. A device definition version contains a list of
     *   [`device`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-device.html)
     *   property types.
     *
     * To associate a device definition version after the device definition is created, create an
     * [`AWS::Greengrass::DeviceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html)
     * resource and specify the ID of this device definition.
     */
    public fun initialVersion(initialVersion: IResolvable) {
        cdkBuilder.initialVersion(initialVersion)
    }

    /**
     * @param initialVersion The device definition version to include when the device definition is
     *   created. A device definition version contains a list of
     *   [`device`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-device.html)
     *   property types.
     *
     * To associate a device definition version after the device definition is created, create an
     * [`AWS::Greengrass::DeviceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html)
     * resource and specify the ID of this device definition.
     */
    public fun initialVersion(initialVersion: CfnDeviceDefinition.DeviceDefinitionVersionProperty) {
        cdkBuilder.initialVersion(initialVersion)
    }

    /** @param name The name of the device definition. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param tags Application-specific metadata to attach to the device definition. You can use
     *   tags in IAM policies to control access to AWS IoT Greengrass resources. You can also use
     *   tags to categorize your resources. For more information, see
     *   [Tagging Your AWS IoT Greengrass Resources](https://docs.aws.amazon.com/greengrass/latest/developerguide/tagging.html)
     *   in the *Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     */
    public fun tags(tags: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(tags)
        cdkBuilder.tags(builder.map)
    }

    /**
     * @param tags Application-specific metadata to attach to the device definition. You can use
     *   tags in IAM policies to control access to AWS IoT Greengrass resources. You can also use
     *   tags to categorize your resources. For more information, see
     *   [Tagging Your AWS IoT Greengrass Resources](https://docs.aws.amazon.com/greengrass/latest/developerguide/tagging.html)
     *   in the *Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     */
    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnDeviceDefinitionProps = cdkBuilder.build()
}
