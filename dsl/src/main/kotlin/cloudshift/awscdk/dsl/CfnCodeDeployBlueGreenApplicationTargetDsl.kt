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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.CfnCodeDeployBlueGreenApplicationTarget
import kotlin.String

@CdkDslMarker
public class CfnCodeDeployBlueGreenApplicationTargetDsl {
    private val cdkBuilder: CfnCodeDeployBlueGreenApplicationTarget.Builder =
        CfnCodeDeployBlueGreenApplicationTarget.builder()

    public fun logicalId(logicalId: String) {
        cdkBuilder.logicalId(logicalId)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnCodeDeployBlueGreenApplicationTarget = cdkBuilder.build()
}
