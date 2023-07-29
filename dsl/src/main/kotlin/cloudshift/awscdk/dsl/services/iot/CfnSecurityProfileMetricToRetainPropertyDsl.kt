@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnSecurityProfile

/**
 * The metric you want to retain.
 *
 * Dimensions are optional.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * MetricToRetainProperty metricToRetainProperty = MetricToRetainProperty.builder()
 * .metric("metric")
 * // the properties below are optional
 * .metricDimension(MetricDimensionProperty.builder()
 * .dimensionName("dimensionName")
 * // the properties below are optional
 * .operator("operator")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-securityprofile-metrictoretain.html)
 */
@CdkDslMarker
public class CfnSecurityProfileMetricToRetainPropertyDsl {
    private val cdkBuilder: CfnSecurityProfile.MetricToRetainProperty.Builder =
        CfnSecurityProfile.MetricToRetainProperty.builder()

    /** @param metric A standard of measurement. */
    public fun metric(metric: String) {
        cdkBuilder.metric(metric)
    }

    /** @param metricDimension The dimension of the metric. */
    public fun metricDimension(metricDimension: IResolvable) {
        cdkBuilder.metricDimension(metricDimension)
    }

    /** @param metricDimension The dimension of the metric. */
    public fun metricDimension(metricDimension: CfnSecurityProfile.MetricDimensionProperty) {
        cdkBuilder.metricDimension(metricDimension)
    }

    public fun build(): CfnSecurityProfile.MetricToRetainProperty = cdkBuilder.build()
}
