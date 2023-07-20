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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAnalysisTableAggregatedFieldWellsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.TableAggregatedFieldWellsProperty.Builder =
        CfnAnalysis.TableAggregatedFieldWellsProperty.builder()

    private val _groupBy: MutableList<Any> = mutableListOf()

    private val _values: MutableList<Any> = mutableListOf()

    public fun groupBy(vararg groupBy: Any) {
        _groupBy.addAll(listOf(*groupBy))
    }

    public fun groupBy(groupBy: Collection<Any>) {
        _groupBy.addAll(groupBy)
    }

    public fun groupBy(groupBy: IResolvable) {
        cdkBuilder.groupBy(groupBy)
    }

    public fun values(vararg values: Any) {
        _values.addAll(listOf(*values))
    }

    public fun values(values: Collection<Any>) {
        _values.addAll(values)
    }

    public fun values(values: IResolvable) {
        cdkBuilder.values(values)
    }

    public fun build(): CfnAnalysis.TableAggregatedFieldWellsProperty {
        if (_groupBy.isNotEmpty()) cdkBuilder.groupBy(_groupBy)
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
