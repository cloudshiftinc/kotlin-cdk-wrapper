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

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.logs.CfnMetricFilterProps

/**
 * Properties for defining a `CfnMetricFilter`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.logs.*;
 * CfnMetricFilterProps cfnMetricFilterProps = CfnMetricFilterProps.builder()
 * .filterPattern("filterPattern")
 * .logGroupName("logGroupName")
 * .metricTransformations(List.of(MetricTransformationProperty.builder()
 * .metricName("metricName")
 * .metricNamespace("metricNamespace")
 * .metricValue("metricValue")
 * // the properties below are optional
 * .defaultValue(123)
 * .dimensions(List.of(DimensionProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .unit("unit")
 * .build()))
 * // the properties below are optional
 * .filterName("filterName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html)
 */
@CdkDslMarker
public class CfnMetricFilterPropsDsl {
    private val cdkBuilder: CfnMetricFilterProps.Builder = CfnMetricFilterProps.builder()

    private val _metricTransformations: MutableList<Any> = mutableListOf()

    /** @param filterName The name of the metric filter. */
    public fun filterName(filterName: String) {
        cdkBuilder.filterName(filterName)
    }

    /**
     * @param filterPattern A filter pattern for extracting metric data out of ingested log events.
     *   For more information, see
     *   [Filter and Pattern Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html)
     *   .
     */
    public fun filterPattern(filterPattern: String) {
        cdkBuilder.filterPattern(filterPattern)
    }

    /**
     * @param logGroupName The name of an existing log group that you want to associate with this
     *   metric filter.
     */
    public fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
    }

    /** @param metricTransformations The metric transformations. */
    public fun metricTransformations(vararg metricTransformations: Any) {
        _metricTransformations.addAll(listOf(*metricTransformations))
    }

    /** @param metricTransformations The metric transformations. */
    public fun metricTransformations(metricTransformations: Collection<Any>) {
        _metricTransformations.addAll(metricTransformations)
    }

    /** @param metricTransformations The metric transformations. */
    public fun metricTransformations(metricTransformations: IResolvable) {
        cdkBuilder.metricTransformations(metricTransformations)
    }

    public fun build(): CfnMetricFilterProps {
        if (_metricTransformations.isNotEmpty())
            cdkBuilder.metricTransformations(_metricTransformations)
        return cdkBuilder.build()
    }
}
