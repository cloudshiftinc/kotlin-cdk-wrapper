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
public class CfnAnalysisTableSortConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.TableSortConfigurationProperty.Builder =
        CfnAnalysis.TableSortConfigurationProperty.builder()

    private val _rowSort: MutableList<Any> = mutableListOf()

    public fun paginationConfiguration(paginationConfiguration: IResolvable) {
        cdkBuilder.paginationConfiguration(paginationConfiguration)
    }

    public fun paginationConfiguration(paginationConfiguration: CfnAnalysis.PaginationConfigurationProperty) {
        cdkBuilder.paginationConfiguration(paginationConfiguration)
    }

    public fun rowSort(vararg rowSort: Any) {
        _rowSort.addAll(listOf(*rowSort))
    }

    public fun rowSort(rowSort: Collection<Any>) {
        _rowSort.addAll(rowSort)
    }

    public fun rowSort(rowSort: IResolvable) {
        cdkBuilder.rowSort(rowSort)
    }

    public fun build(): CfnAnalysis.TableSortConfigurationProperty {
        if (_rowSort.isNotEmpty()) cdkBuilder.rowSort(_rowSort)
        return cdkBuilder.build()
    }
}
