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

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.gamelift.CfnGameServerGroup
import kotlin.Number

@CdkDslMarker
public class CfnGameServerGroupAutoScalingPolicyPropertyDsl {
    private val cdkBuilder: CfnGameServerGroup.AutoScalingPolicyProperty.Builder =
        CfnGameServerGroup.AutoScalingPolicyProperty.builder()

    public fun estimatedInstanceWarmup(estimatedInstanceWarmup: Number) {
        cdkBuilder.estimatedInstanceWarmup(estimatedInstanceWarmup)
    }

    public fun targetTrackingConfiguration(targetTrackingConfiguration: IResolvable) {
        cdkBuilder.targetTrackingConfiguration(targetTrackingConfiguration)
    }

    public fun targetTrackingConfiguration(targetTrackingConfiguration: CfnGameServerGroup.TargetTrackingConfigurationProperty) {
        cdkBuilder.targetTrackingConfiguration(targetTrackingConfiguration)
    }

    public fun build(): CfnGameServerGroup.AutoScalingPolicyProperty = cdkBuilder.build()
}
