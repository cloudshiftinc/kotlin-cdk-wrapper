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
import kotlin.String

@CdkDslMarker
public class CfnInstanceGroupConfigMetricDimensionPropertyDsl {
    private val cdkBuilder: CfnInstanceGroupConfig.MetricDimensionProperty.Builder =
        CfnInstanceGroupConfig.MetricDimensionProperty.builder()

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnInstanceGroupConfig.MetricDimensionProperty = cdkBuilder.build()
}
