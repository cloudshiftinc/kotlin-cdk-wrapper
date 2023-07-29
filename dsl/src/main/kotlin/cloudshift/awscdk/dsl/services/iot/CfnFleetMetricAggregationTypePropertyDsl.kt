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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iot.CfnFleetMetric

/**
 * The type of aggregation queries.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * AggregationTypeProperty aggregationTypeProperty = AggregationTypeProperty.builder()
 * .name("name")
 * .values(List.of("values"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-fleetmetric-aggregationtype.html)
 */
@CdkDslMarker
public class CfnFleetMetricAggregationTypePropertyDsl {
    private val cdkBuilder: CfnFleetMetric.AggregationTypeProperty.Builder =
        CfnFleetMetric.AggregationTypeProperty.builder()

    private val _values: MutableList<String> = mutableListOf()

    /** @param name The name of the aggregation type. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param values A list of the values of aggregation types. */
    public fun values(vararg values: String) {
        _values.addAll(listOf(*values))
    }

    /** @param values A list of the values of aggregation types. */
    public fun values(values: Collection<String>) {
        _values.addAll(values)
    }

    public fun build(): CfnFleetMetric.AggregationTypeProperty {
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
