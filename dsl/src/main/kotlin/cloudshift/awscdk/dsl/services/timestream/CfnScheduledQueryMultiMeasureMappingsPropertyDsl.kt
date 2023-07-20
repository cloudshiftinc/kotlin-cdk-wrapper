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

package cloudshift.awscdk.dsl.services.timestream

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.timestream.CfnScheduledQuery
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnScheduledQueryMultiMeasureMappingsPropertyDsl {
    private val cdkBuilder: CfnScheduledQuery.MultiMeasureMappingsProperty.Builder =
        CfnScheduledQuery.MultiMeasureMappingsProperty.builder()

    private val _multiMeasureAttributeMappings: MutableList<Any> = mutableListOf()

    public fun multiMeasureAttributeMappings(vararg multiMeasureAttributeMappings: Any) {
        _multiMeasureAttributeMappings.addAll(listOf(*multiMeasureAttributeMappings))
    }

    public fun multiMeasureAttributeMappings(multiMeasureAttributeMappings: Collection<Any>) {
        _multiMeasureAttributeMappings.addAll(multiMeasureAttributeMappings)
    }

    public fun multiMeasureAttributeMappings(multiMeasureAttributeMappings: IResolvable) {
        cdkBuilder.multiMeasureAttributeMappings(multiMeasureAttributeMappings)
    }

    public fun targetMultiMeasureName(targetMultiMeasureName: String) {
        cdkBuilder.targetMultiMeasureName(targetMultiMeasureName)
    }

    public fun build(): CfnScheduledQuery.MultiMeasureMappingsProperty {
        if (_multiMeasureAttributeMappings.isNotEmpty()) {
            cdkBuilder.multiMeasureAttributeMappings(_multiMeasureAttributeMappings)
        }
        return cdkBuilder.build()
    }
}
