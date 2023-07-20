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

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnDeploymentGroupBlueInstanceTerminationOptionPropertyDsl {
    private val cdkBuilder: CfnDeploymentGroup.BlueInstanceTerminationOptionProperty.Builder =
        CfnDeploymentGroup.BlueInstanceTerminationOptionProperty.builder()

    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    public fun terminationWaitTimeInMinutes(terminationWaitTimeInMinutes: Number) {
        cdkBuilder.terminationWaitTimeInMinutes(terminationWaitTimeInMinutes)
    }

    public fun build(): CfnDeploymentGroup.BlueInstanceTerminationOptionProperty = cdkBuilder.build()
}
