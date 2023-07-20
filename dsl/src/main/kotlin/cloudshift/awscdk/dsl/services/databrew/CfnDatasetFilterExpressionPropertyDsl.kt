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

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnDataset
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDatasetFilterExpressionPropertyDsl {
    private val cdkBuilder: CfnDataset.FilterExpressionProperty.Builder =
        CfnDataset.FilterExpressionProperty.builder()

    private val _valuesMap: MutableList<Any> = mutableListOf()

    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    public fun valuesMap(vararg valuesMap: Any) {
        _valuesMap.addAll(listOf(*valuesMap))
    }

    public fun valuesMap(valuesMap: Collection<Any>) {
        _valuesMap.addAll(valuesMap)
    }

    public fun valuesMap(valuesMap: IResolvable) {
        cdkBuilder.valuesMap(valuesMap)
    }

    public fun build(): CfnDataset.FilterExpressionProperty {
        if (_valuesMap.isNotEmpty()) cdkBuilder.valuesMap(_valuesMap)
        return cdkBuilder.build()
    }
}
