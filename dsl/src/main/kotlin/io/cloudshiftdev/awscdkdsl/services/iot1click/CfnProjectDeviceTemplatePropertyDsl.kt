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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot1click.CfnProject

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
@CdkDslMarker
public class CfnProjectDeviceTemplatePropertyDsl {
    private val cdkBuilder: CfnProject.DeviceTemplateProperty.Builder =
        CfnProject.DeviceTemplateProperty.builder()

    /** @param callbackOverrides the value to be set. */
    public fun callbackOverrides(callbackOverrides: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(callbackOverrides)
        cdkBuilder.callbackOverrides(builder.map)
    }

    /** @param callbackOverrides the value to be set. */
    public fun callbackOverrides(callbackOverrides: Any) {
        cdkBuilder.callbackOverrides(callbackOverrides)
    }

    /** @param deviceType the value to be set. */
    public fun deviceType(deviceType: String) {
        cdkBuilder.deviceType(deviceType)
    }

    public fun build(): CfnProject.DeviceTemplateProperty = cdkBuilder.build()
}
