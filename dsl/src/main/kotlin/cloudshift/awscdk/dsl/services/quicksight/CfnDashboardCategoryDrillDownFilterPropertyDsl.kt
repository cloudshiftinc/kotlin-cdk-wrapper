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
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDashboardCategoryDrillDownFilterPropertyDsl {
    private val cdkBuilder: CfnDashboard.CategoryDrillDownFilterProperty.Builder =
        CfnDashboard.CategoryDrillDownFilterProperty.builder()

    private val _categoryValues: MutableList<String> = mutableListOf()

    public fun categoryValues(vararg categoryValues: String) {
        _categoryValues.addAll(listOf(*categoryValues))
    }

    public fun categoryValues(categoryValues: Collection<String>) {
        _categoryValues.addAll(categoryValues)
    }

    public fun column(column: IResolvable) {
        cdkBuilder.column(column)
    }

    public fun column(column: CfnDashboard.ColumnIdentifierProperty) {
        cdkBuilder.column(column)
    }

    public fun build(): CfnDashboard.CategoryDrillDownFilterProperty {
        if (_categoryValues.isNotEmpty()) cdkBuilder.categoryValues(_categoryValues)
        return cdkBuilder.build()
    }
}
