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

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudwatch.SearchComponents

/**
 * Search components for use with [Values.fromSearchComponents].
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.cloudwatch.*;
 * Dashboard dashboard = Dashboard.Builder.create(this, "Dash")
 * .defaultInterval(Duration.days(7))
 * .variables(List.of(DashboardVariable.Builder.create()
 * .id("functionName")
 * .type(VariableType.PATTERN)
 * .label("Function")
 * .inputType(VariableInputType.RADIO)
 * .value("originalFuncNameInDashboard")
 * // equivalent to cw.Values.fromSearch('{AWS/Lambda,FunctionName} MetricName=\"Duration\"',
 * 'FunctionName')
 * .values(Values.fromSearchComponents(SearchComponents.builder()
 * .namespace("AWS/Lambda")
 * .dimensions(List.of("FunctionName"))
 * .metricName("Duration")
 * .populateFrom("FunctionName")
 * .build()))
 * .defaultValue(DefaultValue.FIRST)
 * .visible(true)
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class SearchComponentsDsl {
    private val cdkBuilder: SearchComponents.Builder = SearchComponents.builder()

    private val _dimensions: MutableList<String> = mutableListOf()

    /** @param dimensions The list of dimensions to be used in the search expression. */
    public fun dimensions(vararg dimensions: String) {
        _dimensions.addAll(listOf(*dimensions))
    }

    /** @param dimensions The list of dimensions to be used in the search expression. */
    public fun dimensions(dimensions: Collection<String>) {
        _dimensions.addAll(dimensions)
    }

    /** @param metricName The metric name to be used in the search expression. */
    public fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
    }

    /** @param namespace The namespace to be used in the search expression. */
    public fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
    }

    /**
     * @param populateFrom The dimension name, that the search expression retrieves, whose values
     *   will be used to populate the values to choose from.
     */
    public fun populateFrom(populateFrom: String) {
        cdkBuilder.populateFrom(populateFrom)
    }

    public fun build(): SearchComponents {
        if (_dimensions.isNotEmpty()) cdkBuilder.dimensions(_dimensions)
        return cdkBuilder.build()
    }
}
