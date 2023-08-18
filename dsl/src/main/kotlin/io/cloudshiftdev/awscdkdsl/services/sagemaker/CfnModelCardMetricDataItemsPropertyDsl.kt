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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.sagemaker.CfnModelCard

/**
 * Metric data.
 *
 * The `type` determines the data types that you specify for `value` , `XAxisName` and `YAxisName` .
 * For information about specifying values for metrics, see
 * [model card JSON schema](https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards.html#model-cards-json-schema)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * Object value;
 * MetricDataItemsProperty metricDataItemsProperty = MetricDataItemsProperty.builder()
 * .name("name")
 * .type("type")
 * .value(value)
 * // the properties below are optional
 * .notes("notes")
 * .xAxisName(List.of("xAxisName"))
 * .yAxisName(List.of("yAxisName"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-metricdataitems.html)
 */
@CdkDslMarker
public class CfnModelCardMetricDataItemsPropertyDsl {
    private val cdkBuilder: CfnModelCard.MetricDataItemsProperty.Builder =
        CfnModelCard.MetricDataItemsProperty.builder()

    private val _xAxisName: MutableList<String> = mutableListOf()

    private val _yAxisName: MutableList<String> = mutableListOf()

    /** @param name The names of the metrics. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param notes Any notes to add to the metric. */
    public fun notes(notes: String) {
        cdkBuilder.notes(notes)
    }

    /**
     * @param type You must specify one of the following data types:.
     * * Bar Chart `bar_char`
     * * Boolean `boolean`
     * * Linear Graph `linear_graph`
     * * Matrix `matrix`
     * * Number `number`
     * * String `string`
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /**
     * @param value The datatype of the metric. The metric's *value* must be compatible with the
     *   metric's *type* .
     */
    public fun `value`(`value`: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(`value`)
        cdkBuilder.`value`(builder.map)
    }

    /**
     * @param value The datatype of the metric. The metric's *value* must be compatible with the
     *   metric's *type* .
     */
    public fun `value`(`value`: Any) {
        cdkBuilder.`value`(`value`)
    }

    /** @param xAxisName The name of the x axis. */
    public fun xAxisName(vararg xAxisName: String) {
        _xAxisName.addAll(listOf(*xAxisName))
    }

    /** @param xAxisName The name of the x axis. */
    public fun xAxisName(xAxisName: Collection<String>) {
        _xAxisName.addAll(xAxisName)
    }

    /** @param yAxisName The name of the y axis. */
    public fun yAxisName(vararg yAxisName: String) {
        _yAxisName.addAll(listOf(*yAxisName))
    }

    /** @param yAxisName The name of the y axis. */
    public fun yAxisName(yAxisName: Collection<String>) {
        _yAxisName.addAll(yAxisName)
    }

    public fun build(): CfnModelCard.MetricDataItemsProperty {
        if (_xAxisName.isNotEmpty()) cdkBuilder.xAxisName(_xAxisName)
        if (_yAxisName.isNotEmpty()) cdkBuilder.yAxisName(_yAxisName)
        return cdkBuilder.build()
    }
}
