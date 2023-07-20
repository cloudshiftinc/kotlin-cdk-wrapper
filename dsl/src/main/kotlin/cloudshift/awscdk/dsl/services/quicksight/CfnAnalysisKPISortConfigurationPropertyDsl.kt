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
public class CfnAnalysisKPISortConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.KPISortConfigurationProperty.Builder =
        CfnAnalysis.KPISortConfigurationProperty.builder()

    private val _trendGroupSort: MutableList<Any> = mutableListOf()

    public fun trendGroupSort(vararg trendGroupSort: Any) {
        _trendGroupSort.addAll(listOf(*trendGroupSort))
    }

    public fun trendGroupSort(trendGroupSort: Collection<Any>) {
        _trendGroupSort.addAll(trendGroupSort)
    }

    public fun trendGroupSort(trendGroupSort: IResolvable) {
        cdkBuilder.trendGroupSort(trendGroupSort)
    }

    public fun build(): CfnAnalysis.KPISortConfigurationProperty {
        if (_trendGroupSort.isNotEmpty()) cdkBuilder.trendGroupSort(_trendGroupSort)
        return cdkBuilder.build()
    }
}
