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

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cloudwatch.SearchComponents
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class SearchComponentsDsl {
    private val cdkBuilder: SearchComponents.Builder = SearchComponents.builder()

    private val _dimensions: MutableList<String> = mutableListOf()

    public fun dimensions(vararg dimensions: String) {
        _dimensions.addAll(listOf(*dimensions))
    }

    public fun dimensions(dimensions: Collection<String>) {
        _dimensions.addAll(dimensions)
    }

    public fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
    }

    public fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
    }

    public fun populateFrom(populateFrom: String) {
        cdkBuilder.populateFrom(populateFrom)
    }

    public fun build(): SearchComponents {
        if (_dimensions.isNotEmpty()) cdkBuilder.dimensions(_dimensions)
        return cdkBuilder.build()
    }
}
