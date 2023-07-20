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

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iotevents.CfnDetectorModel
import kotlin.String

@CdkDslMarker
public class CfnDetectorModelSetVariablePropertyDsl {
    private val cdkBuilder: CfnDetectorModel.SetVariableProperty.Builder =
        CfnDetectorModel.SetVariableProperty.builder()

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun variableName(variableName: String) {
        cdkBuilder.variableName(variableName)
    }

    public fun build(): CfnDetectorModel.SetVariableProperty = cdkBuilder.build()
}
