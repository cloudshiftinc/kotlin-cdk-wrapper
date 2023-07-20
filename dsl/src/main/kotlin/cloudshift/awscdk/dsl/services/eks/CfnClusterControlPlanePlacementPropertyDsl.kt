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

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.eks.CfnCluster
import kotlin.String

@CdkDslMarker
public class CfnClusterControlPlanePlacementPropertyDsl {
    private val cdkBuilder: CfnCluster.ControlPlanePlacementProperty.Builder =
        CfnCluster.ControlPlanePlacementProperty.builder()

    public fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
    }

    public fun build(): CfnCluster.ControlPlanePlacementProperty = cdkBuilder.build()
}
