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
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAnalysisFilterListConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.FilterListConfigurationProperty.Builder =
        CfnAnalysis.FilterListConfigurationProperty.builder()

    private val _categoryValues: MutableList<String> = mutableListOf()

    public fun categoryValues(vararg categoryValues: String) {
        _categoryValues.addAll(listOf(*categoryValues))
    }

    public fun categoryValues(categoryValues: Collection<String>) {
        _categoryValues.addAll(categoryValues)
    }

    public fun matchOperator(matchOperator: String) {
        cdkBuilder.matchOperator(matchOperator)
    }

    public fun selectAllOptions(selectAllOptions: String) {
        cdkBuilder.selectAllOptions(selectAllOptions)
    }

    public fun build(): CfnAnalysis.FilterListConfigurationProperty {
        if (_categoryValues.isNotEmpty()) cdkBuilder.categoryValues(_categoryValues)
        return cdkBuilder.build()
    }
}
