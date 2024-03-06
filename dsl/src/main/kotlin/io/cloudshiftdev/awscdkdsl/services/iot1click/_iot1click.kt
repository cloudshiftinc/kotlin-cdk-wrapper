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

package io.cloudshiftdev.awscdkdsl.services.iot1click

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot1click.CfnDevice
import software.amazon.awscdk.services.iot1click.CfnDeviceProps
import software.amazon.awscdk.services.iot1click.CfnPlacement
import software.amazon.awscdk.services.iot1click.CfnPlacementProps
import software.amazon.awscdk.services.iot1click.CfnProject
import software.amazon.awscdk.services.iot1click.CfnProjectProps
import software.constructs.Construct

public object iot1click {
    /**
     * The `AWS::IoT1Click::Device` resource controls the enabled state of an AWS IoT 1-Click
     * compatible device.
     *
     * For more information, see
     * [Device](https://docs.aws.amazon.com/iot-1-click/1.0/devices-apireference/devices-deviceid.html)
     * in the *AWS IoT 1-Click Devices API Reference* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot1click.*;
     * CfnDevice cfnDevice = CfnDevice.Builder.create(this, "MyCfnDevice")
     * .deviceId("deviceId")
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-device.html)
     */
    public inline fun cfnDevice(
        scope: Construct,
        id: String,
        block: CfnDeviceDsl.() -> Unit = {},
    ): CfnDevice {
        val builder = CfnDeviceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnDeviceProps(block: CfnDevicePropsDsl.() -> Unit = {}): CfnDeviceProps {
        val builder = CfnDevicePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::IoT1Click::Placement` resource creates a placement to be associated with an AWS IoT
     * 1-Click project.
     *
     * A placement is an instance of a device in a location. For more information, see
     * [Projects, Templates, and Placements](https://docs.aws.amazon.com/iot-1-click/latest/developerguide/1click-PTP.html)
     * in the *AWS IoT 1-Click Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot1click.*;
     * Object associatedDevices;
     * Object attributes;
     * CfnPlacement cfnPlacement = CfnPlacement.Builder.create(this, "MyCfnPlacement")
     * .projectName("projectName")
     * // the properties below are optional
     * .associatedDevices(associatedDevices)
     * .attributes(attributes)
     * .placementName("placementName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html)
     */
    public inline fun cfnPlacement(
        scope: Construct,
        id: String,
        block: CfnPlacementDsl.() -> Unit = {},
    ): CfnPlacement {
        val builder = CfnPlacementDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPlacement`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot1click.*;
     * Object associatedDevices;
     * Object attributes;
     * CfnPlacementProps cfnPlacementProps = CfnPlacementProps.builder()
     * .projectName("projectName")
     * // the properties below are optional
     * .associatedDevices(associatedDevices)
     * .attributes(attributes)
     * .placementName("placementName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-placement.html)
     */
    public inline fun cfnPlacementProps(
        block: CfnPlacementPropsDsl.() -> Unit = {}
    ): CfnPlacementProps {
        val builder = CfnPlacementPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::IoT1Click::Project` resource creates an empty project with a placement template.
     *
     * A project contains zero or more placements that adhere to the placement template defined in
     * the project. For more information, see
     * [CreateProject](https://docs.aws.amazon.com/iot-1-click/latest/projects-apireference/API_CreateProject.html)
     * in the *AWS IoT 1-Click Projects API Reference* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot1click.*;
     * Object callbackOverrides;
     * Object defaultAttributes;
     * CfnProject cfnProject = CfnProject.Builder.create(this, "MyCfnProject")
     * .placementTemplate(PlacementTemplateProperty.builder()
     * .defaultAttributes(defaultAttributes)
     * .deviceTemplates(Map.of(
     * "deviceTemplatesKey", DeviceTemplateProperty.builder()
     * .callbackOverrides(callbackOverrides)
     * .deviceType("deviceType")
     * .build()))
     * .build())
     * // the properties below are optional
     * .description("description")
     * .projectName("projectName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html)
     */
    public inline fun cfnProject(
        scope: Construct,
        id: String,
        block: CfnProjectDsl.() -> Unit = {},
    ): CfnProject {
        val builder = CfnProjectDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot1click.*;
     * Object callbackOverrides;
     * DeviceTemplateProperty deviceTemplateProperty = DeviceTemplateProperty.builder()
     * .callbackOverrides(callbackOverrides)
     * .deviceType("deviceType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-devicetemplate.html)
     */
    public inline fun cfnProjectDeviceTemplateProperty(
        block: CfnProjectDeviceTemplatePropertyDsl.() -> Unit = {}
    ): CfnProject.DeviceTemplateProperty {
        val builder = CfnProjectDeviceTemplatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * In AWS CloudFormation , use the `PlacementTemplate` property type to define the template for
     * an AWS IoT 1-Click project.
     *
     * `PlacementTemplate` is a property of the `AWS::IoT1Click::Project` resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot1click.*;
     * Object callbackOverrides;
     * Object defaultAttributes;
     * PlacementTemplateProperty placementTemplateProperty = PlacementTemplateProperty.builder()
     * .defaultAttributes(defaultAttributes)
     * .deviceTemplates(Map.of(
     * "deviceTemplatesKey", DeviceTemplateProperty.builder()
     * .callbackOverrides(callbackOverrides)
     * .deviceType("deviceType")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot1click-project-placementtemplate.html)
     */
    public inline fun cfnProjectPlacementTemplateProperty(
        block: CfnProjectPlacementTemplatePropertyDsl.() -> Unit = {}
    ): CfnProject.PlacementTemplateProperty {
        val builder = CfnProjectPlacementTemplatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnProject`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iot1click.*;
     * Object callbackOverrides;
     * Object defaultAttributes;
     * CfnProjectProps cfnProjectProps = CfnProjectProps.builder()
     * .placementTemplate(PlacementTemplateProperty.builder()
     * .defaultAttributes(defaultAttributes)
     * .deviceTemplates(Map.of(
     * "deviceTemplatesKey", DeviceTemplateProperty.builder()
     * .callbackOverrides(callbackOverrides)
     * .deviceType("deviceType")
     * .build()))
     * .build())
     * // the properties below are optional
     * .description("description")
     * .projectName("projectName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-project.html)
     */
    public inline fun cfnProjectProps(block: CfnProjectPropsDsl.() -> Unit = {}): CfnProjectProps {
        val builder = CfnProjectPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
