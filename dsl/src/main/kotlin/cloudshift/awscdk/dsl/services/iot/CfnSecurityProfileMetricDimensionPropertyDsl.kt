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
public class CfnSecurityProfileMetricDimensionPropertyDsl {
    private val cdkBuilder: CfnSecurityProfile.MetricDimensionProperty.Builder =
        CfnSecurityProfile.MetricDimensionProperty.builder()

    public fun dimensionName(dimensionName: String) {
        cdkBuilder.dimensionName(dimensionName)
    }

    public fun `operator`(`operator`: String) {
        cdkBuilder.`operator`(`operator`)
    }

    public fun build(): CfnSecurityProfile.MetricDimensionProperty = cdkBuilder.build()
}
