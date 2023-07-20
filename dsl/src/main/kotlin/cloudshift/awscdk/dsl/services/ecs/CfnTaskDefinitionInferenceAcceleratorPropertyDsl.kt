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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.CfnTaskDefinition
import kotlin.String

@CdkDslMarker
public class CfnTaskDefinitionInferenceAcceleratorPropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.InferenceAcceleratorProperty.Builder =
        CfnTaskDefinition.InferenceAcceleratorProperty.builder()

    public fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
    }

    public fun deviceType(deviceType: String) {
        cdkBuilder.deviceType(deviceType)
    }

    public fun build(): CfnTaskDefinition.InferenceAcceleratorProperty = cdkBuilder.build()
}
