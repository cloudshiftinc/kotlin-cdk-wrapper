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
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDashboardCustomFilterListConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.CustomFilterListConfigurationProperty.Builder =
        CfnDashboard.CustomFilterListConfigurationProperty.builder()

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

    public fun nullOption(nullOption: String) {
        cdkBuilder.nullOption(nullOption)
    }

    public fun selectAllOptions(selectAllOptions: String) {
        cdkBuilder.selectAllOptions(selectAllOptions)
    }

    public fun build(): CfnDashboard.CustomFilterListConfigurationProperty {
        if (_categoryValues.isNotEmpty()) cdkBuilder.categoryValues(_categoryValues)
        return cdkBuilder.build()
    }
}
