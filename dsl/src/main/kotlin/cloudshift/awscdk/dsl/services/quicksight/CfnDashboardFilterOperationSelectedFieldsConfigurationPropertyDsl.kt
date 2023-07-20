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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDashboardFilterOperationSelectedFieldsConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.FilterOperationSelectedFieldsConfigurationProperty.Builder =
        CfnDashboard.FilterOperationSelectedFieldsConfigurationProperty.builder()

    private val _selectedColumns: MutableList<Any> = mutableListOf()

    private val _selectedFields: MutableList<String> = mutableListOf()

    public fun selectedColumns(vararg selectedColumns: Any) {
        _selectedColumns.addAll(listOf(*selectedColumns))
    }

    public fun selectedColumns(selectedColumns: Collection<Any>) {
        _selectedColumns.addAll(selectedColumns)
    }

    public fun selectedColumns(selectedColumns: IResolvable) {
        cdkBuilder.selectedColumns(selectedColumns)
    }

    public fun selectedFieldOptions(selectedFieldOptions: String) {
        cdkBuilder.selectedFieldOptions(selectedFieldOptions)
    }

    public fun selectedFields(vararg selectedFields: String) {
        _selectedFields.addAll(listOf(*selectedFields))
    }

    public fun selectedFields(selectedFields: Collection<String>) {
        _selectedFields.addAll(selectedFields)
    }

    public fun build(): CfnDashboard.FilterOperationSelectedFieldsConfigurationProperty {
        if (_selectedColumns.isNotEmpty()) cdkBuilder.selectedColumns(_selectedColumns)
        if (_selectedFields.isNotEmpty()) cdkBuilder.selectedFields(_selectedFields)
        return cdkBuilder.build()
    }
}
