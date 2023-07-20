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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate
import kotlin.Number

@CdkDslMarker
public class CfnLaunchTemplateBaselineEbsBandwidthMbpsPropertyDsl {
    private val cdkBuilder: CfnLaunchTemplate.BaselineEbsBandwidthMbpsProperty.Builder =
        CfnLaunchTemplate.BaselineEbsBandwidthMbpsProperty.builder()

    public fun max(max: Number) {
        cdkBuilder.max(max)
    }

    public fun min(min: Number) {
        cdkBuilder.min(min)
    }

    public fun build(): CfnLaunchTemplate.BaselineEbsBandwidthMbpsProperty = cdkBuilder.build()
}
