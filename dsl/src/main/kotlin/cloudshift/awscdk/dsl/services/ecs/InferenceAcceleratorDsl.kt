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
import software.amazon.awscdk.services.ecs.InferenceAccelerator
import kotlin.String

@CdkDslMarker
public class InferenceAcceleratorDsl {
    private val cdkBuilder: InferenceAccelerator.Builder = InferenceAccelerator.builder()

    public fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
    }

    public fun deviceType(deviceType: String) {
        cdkBuilder.deviceType(deviceType)
    }

    public fun build(): InferenceAccelerator = cdkBuilder.build()
}
