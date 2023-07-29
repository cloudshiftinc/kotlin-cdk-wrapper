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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelCard

/**
 * A group of metric data that you use to initialize a metric group object.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * Object value;
 * MetricGroupProperty metricGroupProperty = MetricGroupProperty.builder()
 * .metricData(List.of(MetricDataItemsProperty.builder()
 * .name("name")
 * .type("type")
 * .value(value)
 * // the properties below are optional
 * .notes("notes")
 * .xAxisName(List.of("xAxisName"))
 * .yAxisName(List.of("yAxisName"))
 * .build()))
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-metricgroup.html)
 */
@CdkDslMarker
public class CfnModelCardMetricGroupPropertyDsl {
    private val cdkBuilder: CfnModelCard.MetricGroupProperty.Builder =
        CfnModelCard.MetricGroupProperty.builder()

    private val _metricData: MutableList<Any> = mutableListOf()

    /**
     * @param metricData A list of metric objects. The `MetricDataItems` list can have one of the
     *   following values:.
     * * `bar_chart_metric`
     * * `matrix_metric`
     * * `simple_metric`
     * * `linear_graph_metric`
     *
     * For more information about the metric schema, see the definition section of the
     * [model card JSON schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
     * .
     */
    public fun metricData(vararg metricData: Any) {
        _metricData.addAll(listOf(*metricData))
    }

    /**
     * @param metricData A list of metric objects. The `MetricDataItems` list can have one of the
     *   following values:.
     * * `bar_chart_metric`
     * * `matrix_metric`
     * * `simple_metric`
     * * `linear_graph_metric`
     *
     * For more information about the metric schema, see the definition section of the
     * [model card JSON schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
     * .
     */
    public fun metricData(metricData: Collection<Any>) {
        _metricData.addAll(metricData)
    }

    /**
     * @param metricData A list of metric objects. The `MetricDataItems` list can have one of the
     *   following values:.
     * * `bar_chart_metric`
     * * `matrix_metric`
     * * `simple_metric`
     * * `linear_graph_metric`
     *
     * For more information about the metric schema, see the definition section of the
     * [model card JSON schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
     * .
     */
    public fun metricData(metricData: IResolvable) {
        cdkBuilder.metricData(metricData)
    }

    /** @param name The metric group name. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnModelCard.MetricGroupProperty {
        if (_metricData.isNotEmpty()) cdkBuilder.metricData(_metricData)
        return cdkBuilder.build()
    }
}
