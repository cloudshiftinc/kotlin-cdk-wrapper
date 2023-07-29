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
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot1click.CfnProject

/**
 * In AWS CloudFormation , use the `DeviceTemplate` property type to define the template for an AWS
 * IoT 1-Click project.
 *
 * `DeviceTemplate` is a property of the `AWS::IoT1Click::Project` resource.
 *
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
@CdkDslMarker
public class CfnProjectDeviceTemplatePropertyDsl {
    private val cdkBuilder: CfnProject.DeviceTemplateProperty.Builder =
        CfnProject.DeviceTemplateProperty.builder()

    /**
     * @param callbackOverrides An optional AWS Lambda function to invoke instead of the default AWS
     *   Lambda function provided by the placement template.
     */
    public fun callbackOverrides(callbackOverrides: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(callbackOverrides)
        cdkBuilder.callbackOverrides(builder.map)
    }

    /**
     * @param callbackOverrides An optional AWS Lambda function to invoke instead of the default AWS
     *   Lambda function provided by the placement template.
     */
    public fun callbackOverrides(callbackOverrides: Any) {
        cdkBuilder.callbackOverrides(callbackOverrides)
    }

    /** @param deviceType The device type, which currently must be `"button"` . */
    public fun deviceType(deviceType: String) {
        cdkBuilder.deviceType(deviceType)
    }

    public fun build(): CfnProject.DeviceTemplateProperty = cdkBuilder.build()
}
