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
public class CfnDeploymentGroupDeploymentReadyOptionPropertyDsl {
    private val cdkBuilder: CfnDeploymentGroup.DeploymentReadyOptionProperty.Builder =
        CfnDeploymentGroup.DeploymentReadyOptionProperty.builder()

    public fun actionOnTimeout(actionOnTimeout: String) {
        cdkBuilder.actionOnTimeout(actionOnTimeout)
    }

    public fun waitTimeInMinutes(waitTimeInMinutes: Number) {
        cdkBuilder.waitTimeInMinutes(waitTimeInMinutes)
    }

    public fun build(): CfnDeploymentGroup.DeploymentReadyOptionProperty = cdkBuilder.build()
}
