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
import kotlin.String

@CdkDslMarker
public class CfnDeploymentGroupTargetGroupInfoPropertyDsl {
    private val cdkBuilder: CfnDeploymentGroup.TargetGroupInfoProperty.Builder =
        CfnDeploymentGroup.TargetGroupInfoProperty.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnDeploymentGroup.TargetGroupInfoProperty = cdkBuilder.build()
}
