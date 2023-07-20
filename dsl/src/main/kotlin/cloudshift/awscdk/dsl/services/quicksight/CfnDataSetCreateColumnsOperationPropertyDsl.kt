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
import software.amazon.awscdk.services.quicksight.CfnDataSet
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDataSetCreateColumnsOperationPropertyDsl {
    private val cdkBuilder: CfnDataSet.CreateColumnsOperationProperty.Builder =
        CfnDataSet.CreateColumnsOperationProperty.builder()

    private val _columns: MutableList<Any> = mutableListOf()

    public fun columns(vararg columns: Any) {
        _columns.addAll(listOf(*columns))
    }

    public fun columns(columns: Collection<Any>) {
        _columns.addAll(columns)
    }

    public fun columns(columns: IResolvable) {
        cdkBuilder.columns(columns)
    }

    public fun build(): CfnDataSet.CreateColumnsOperationProperty {
        if (_columns.isNotEmpty()) cdkBuilder.columns(_columns)
        return cdkBuilder.build()
    }
}
