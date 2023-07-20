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

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnCluster
import kotlin.String

@CdkDslMarker
public class CfnClusterScalingActionPropertyDsl {
    private val cdkBuilder: CfnCluster.ScalingActionProperty.Builder =
        CfnCluster.ScalingActionProperty.builder()

    public fun market(market: String) {
        cdkBuilder.market(market)
    }

    public fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: IResolvable) {
        cdkBuilder.simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration)
    }

    public fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: CfnCluster.SimpleScalingPolicyConfigurationProperty) {
        cdkBuilder.simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration)
    }

    public fun build(): CfnCluster.ScalingActionProperty = cdkBuilder.build()
}
