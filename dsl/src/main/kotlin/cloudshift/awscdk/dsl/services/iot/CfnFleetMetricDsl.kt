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
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnFleetMetric
import software.constructs.Construct
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnFleetMetricDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnFleetMetric.Builder = CfnFleetMetric.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun aggregationField(aggregationField: String) {
        cdkBuilder.aggregationField(aggregationField)
    }

    public fun aggregationType(aggregationType: IResolvable) {
        cdkBuilder.aggregationType(aggregationType)
    }

    public fun aggregationType(aggregationType: CfnFleetMetric.AggregationTypeProperty) {
        cdkBuilder.aggregationType(aggregationType)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun indexName(indexName: String) {
        cdkBuilder.indexName(indexName)
    }

    public fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
    }

    public fun period(period: Number) {
        cdkBuilder.period(period)
    }

    public fun queryString(queryString: String) {
        cdkBuilder.queryString(queryString)
    }

    public fun queryVersion(queryVersion: String) {
        cdkBuilder.queryVersion(queryVersion)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun unit(unit: String) {
        cdkBuilder.unit(unit)
    }

    public fun build(): CfnFleetMetric {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
