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
import software.amazon.awscdk.CfnCodeDeployBlueGreenAdditionalOptions
import kotlin.Number

@CdkDslMarker
public class CfnCodeDeployBlueGreenAdditionalOptionsDsl {
    private val cdkBuilder: CfnCodeDeployBlueGreenAdditionalOptions.Builder =
        CfnCodeDeployBlueGreenAdditionalOptions.builder()

    public fun terminationWaitTimeInMinutes(terminationWaitTimeInMinutes: Number) {
        cdkBuilder.terminationWaitTimeInMinutes(terminationWaitTimeInMinutes)
    }

    public fun build(): CfnCodeDeployBlueGreenAdditionalOptions = cdkBuilder.build()
}
