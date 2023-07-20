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

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.pipes.CfnPipe
import kotlin.String

@CdkDslMarker
public class CfnPipeEcsInferenceAcceleratorOverridePropertyDsl {
    private val cdkBuilder: CfnPipe.EcsInferenceAcceleratorOverrideProperty.Builder =
        CfnPipe.EcsInferenceAcceleratorOverrideProperty.builder()

    public fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
    }

    public fun deviceType(deviceType: String) {
        cdkBuilder.deviceType(deviceType)
    }

    public fun build(): CfnPipe.EcsInferenceAcceleratorOverrideProperty = cdkBuilder.build()
}
