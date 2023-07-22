@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinition
import software.constructs.Construct

/**
 * The `AWS::Greengrass::DeviceDefinition` resource represents a device definition for AWS IoT
 * Greengrass .
 *
 * Device definitions are used to organize your device definition versions.
 *
 * Device definitions can reference multiple device definition versions. All device definition
 * versions must be associated with a device definition. Each device definition version can contain one
 * or more devices.
 *
 *
 * When you create a device definition, you can optionally include an initial device definition
 * version. To associate a device definition version later, create an
 * [`AWS::Greengrass::DeviceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html)
 * resource and specify the ID of this device definition.
 *
 * After you create the device definition version that contains the devices you want to deploy, you
 * must add it to your group version. For more information, see
 * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
 * .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * Object tags;
 * CfnDeviceDefinition cfnDeviceDefinition = CfnDeviceDefinition.Builder.create(this,
 * "MyCfnDeviceDefinition")
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
public class CfnDeviceDefinitionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDeviceDefinition.Builder = CfnDeviceDefinition.Builder.create(scope,
      id)

  /**
   * The device definition version to include when the device definition is created.
   *
   * A device definition version contains a list of
   * [`device`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-device.html)
   * property types.
   *
   *
   * To associate a device definition version after the device definition is created, create an
   * [`AWS::Greengrass::DeviceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html)
   * resource and specify the ID of this device definition.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinition.html#cfn-greengrass-devicedefinition-initialversion)
   * @param initialVersion The device definition version to include when the device definition is
   * created. 
   */
  public fun initialVersion(initialVersion: IResolvable) {
    cdkBuilder.initialVersion(initialVersion)
  }

  /**
   * The device definition version to include when the device definition is created.
   *
   * A device definition version contains a list of
   * [`device`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-devicedefinition-device.html)
   * property types.
   *
   *
   * To associate a device definition version after the device definition is created, create an
   * [`AWS::Greengrass::DeviceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinitionversion.html)
   * resource and specify the ID of this device definition.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinition.html#cfn-greengrass-devicedefinition-initialversion)
   * @param initialVersion The device definition version to include when the device definition is
   * created. 
   */
  public fun initialVersion(initialVersion: CfnDeviceDefinition.DeviceDefinitionVersionProperty) {
    cdkBuilder.initialVersion(initialVersion)
  }

  /**
   * The name of the device definition.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinition.html#cfn-greengrass-devicedefinition-name)
   * @param name The name of the device definition. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * Application-specific metadata to attach to the device definition.
   *
   * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
   * also use tags to categorize your resources. For more information, see [Tagging Your AWS IoT
   * Greengrass Resources](https://docs.aws.amazon.com/greengrass/latest/developerguide/tagging.html)
   * in the *Developer Guide* .
   *
   * This `Json` property type is processed as a map of key-value pairs. It uses the following
   * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
   *
   * ```
   * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
   * }
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinition.html#cfn-greengrass-devicedefinition-tags)
   * @param tags Application-specific metadata to attach to the device definition. 
   */
  public fun tags(tags: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(tags)
    cdkBuilder.tags(builder.map)
  }

  /**
   * Application-specific metadata to attach to the device definition.
   *
   * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
   * also use tags to categorize your resources. For more information, see [Tagging Your AWS IoT
   * Greengrass Resources](https://docs.aws.amazon.com/greengrass/latest/developerguide/tagging.html)
   * in the *Developer Guide* .
   *
   * This `Json` property type is processed as a map of key-value pairs. It uses the following
   * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
   *
   * ```
   * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
   * }
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-devicedefinition.html#cfn-greengrass-devicedefinition-tags)
   * @param tags Application-specific metadata to attach to the device definition. 
   */
  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnDeviceDefinition = cdkBuilder.build()
}
