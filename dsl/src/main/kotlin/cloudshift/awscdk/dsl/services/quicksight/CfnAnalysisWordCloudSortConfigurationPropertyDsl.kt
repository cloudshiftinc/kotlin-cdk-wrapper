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
public class CfnAnalysisWordCloudSortConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.WordCloudSortConfigurationProperty.Builder =
        CfnAnalysis.WordCloudSortConfigurationProperty.builder()

    private val _categorySort: MutableList<Any> = mutableListOf()

    public fun categoryItemsLimit(categoryItemsLimit: IResolvable) {
        cdkBuilder.categoryItemsLimit(categoryItemsLimit)
    }

    public fun categoryItemsLimit(categoryItemsLimit: CfnAnalysis.ItemsLimitConfigurationProperty) {
        cdkBuilder.categoryItemsLimit(categoryItemsLimit)
    }

    public fun categorySort(vararg categorySort: Any) {
        _categorySort.addAll(listOf(*categorySort))
    }

    public fun categorySort(categorySort: Collection<Any>) {
        _categorySort.addAll(categorySort)
    }

    public fun categorySort(categorySort: IResolvable) {
        cdkBuilder.categorySort(categorySort)
    }

    public fun build(): CfnAnalysis.WordCloudSortConfigurationProperty {
        if (_categorySort.isNotEmpty()) cdkBuilder.categorySort(_categorySort)
        return cdkBuilder.build()
    }
}
