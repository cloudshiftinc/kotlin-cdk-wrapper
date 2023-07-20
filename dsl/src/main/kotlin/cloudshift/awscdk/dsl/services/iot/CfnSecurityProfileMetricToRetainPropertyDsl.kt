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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnSecurityProfile
import kotlin.String

@CdkDslMarker
public class CfnSecurityProfileMetricToRetainPropertyDsl {
    private val cdkBuilder: CfnSecurityProfile.MetricToRetainProperty.Builder =
        CfnSecurityProfile.MetricToRetainProperty.builder()

    public fun metric(metric: String) {
        cdkBuilder.metric(metric)
    }

    public fun metricDimension(metricDimension: IResolvable) {
        cdkBuilder.metricDimension(metricDimension)
    }

    public fun metricDimension(metricDimension: CfnSecurityProfile.MetricDimensionProperty) {
        cdkBuilder.metricDimension(metricDimension)
    }

    public fun build(): CfnSecurityProfile.MetricToRetainProperty = cdkBuilder.build()
}
