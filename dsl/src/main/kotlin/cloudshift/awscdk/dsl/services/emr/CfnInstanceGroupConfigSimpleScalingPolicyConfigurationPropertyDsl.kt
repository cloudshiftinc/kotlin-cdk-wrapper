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
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnInstanceGroupConfigSimpleScalingPolicyConfigurationPropertyDsl {
    private val cdkBuilder: CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty.Builder =
        CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty.builder()

    public fun adjustmentType(adjustmentType: String) {
        cdkBuilder.adjustmentType(adjustmentType)
    }

    public fun coolDown(coolDown: Number) {
        cdkBuilder.coolDown(coolDown)
    }

    public fun scalingAdjustment(scalingAdjustment: Number) {
        cdkBuilder.scalingAdjustment(scalingAdjustment)
    }

    public fun build(): CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty =
        cdkBuilder.build()
}
