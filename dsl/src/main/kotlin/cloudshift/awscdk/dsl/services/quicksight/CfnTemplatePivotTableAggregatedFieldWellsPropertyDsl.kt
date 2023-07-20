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
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTemplatePivotTableAggregatedFieldWellsPropertyDsl {
    private val cdkBuilder: CfnTemplate.PivotTableAggregatedFieldWellsProperty.Builder =
        CfnTemplate.PivotTableAggregatedFieldWellsProperty.builder()

    private val _columns: MutableList<Any> = mutableListOf()

    private val _rows: MutableList<Any> = mutableListOf()

    private val _values: MutableList<Any> = mutableListOf()

    public fun columns(vararg columns: Any) {
        _columns.addAll(listOf(*columns))
    }

    public fun columns(columns: Collection<Any>) {
        _columns.addAll(columns)
    }

    public fun columns(columns: IResolvable) {
        cdkBuilder.columns(columns)
    }

    public fun rows(vararg rows: Any) {
        _rows.addAll(listOf(*rows))
    }

    public fun rows(rows: Collection<Any>) {
        _rows.addAll(rows)
    }

    public fun rows(rows: IResolvable) {
        cdkBuilder.rows(rows)
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

    public fun build(): CfnTemplate.PivotTableAggregatedFieldWellsProperty {
        if (_columns.isNotEmpty()) cdkBuilder.columns(_columns)
        if (_rows.isNotEmpty()) cdkBuilder.rows(_rows)
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
