@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.iot1click

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.iot1click.CfnProject
import kotlin.Any
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnProjectDeviceTemplatePropertyDsl {
    private val cdkBuilder: CfnProject.DeviceTemplateProperty.Builder =
        CfnProject.DeviceTemplateProperty.builder()

    public fun callbackOverrides(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.callbackOverrides(builder.map)
    }

    public fun callbackOverrides(callbackOverrides: Any) {
        cdkBuilder.callbackOverrides(callbackOverrides)
    }

    public fun deviceType(deviceType: String) {
        cdkBuilder.deviceType(deviceType)
    }

    public fun build(): CfnProject.DeviceTemplateProperty = cdkBuilder.build()
}
