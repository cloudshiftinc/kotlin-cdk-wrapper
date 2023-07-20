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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iot.CfnSecurityProfile
import kotlin.String

@CdkDslMarker
public class CfnSecurityProfileStatisticalThresholdPropertyDsl {
    private val cdkBuilder: CfnSecurityProfile.StatisticalThresholdProperty.Builder =
        CfnSecurityProfile.StatisticalThresholdProperty.builder()

    public fun statistic(statistic: String) {
        cdkBuilder.statistic(statistic)
    }

    public fun build(): CfnSecurityProfile.StatisticalThresholdProperty = cdkBuilder.build()
}
