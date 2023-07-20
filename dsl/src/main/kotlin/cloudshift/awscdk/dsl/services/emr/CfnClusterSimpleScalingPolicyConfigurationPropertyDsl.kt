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
import software.amazon.awscdk.services.emr.CfnCluster
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnClusterSimpleScalingPolicyConfigurationPropertyDsl {
    private val cdkBuilder: CfnCluster.SimpleScalingPolicyConfigurationProperty.Builder =
        CfnCluster.SimpleScalingPolicyConfigurationProperty.builder()

    public fun adjustmentType(adjustmentType: String) {
        cdkBuilder.adjustmentType(adjustmentType)
    }

    public fun coolDown(coolDown: Number) {
        cdkBuilder.coolDown(coolDown)
    }

    public fun scalingAdjustment(scalingAdjustment: Number) {
        cdkBuilder.scalingAdjustment(scalingAdjustment)
    }

    public fun build(): CfnCluster.SimpleScalingPolicyConfigurationProperty = cdkBuilder.build()
}
