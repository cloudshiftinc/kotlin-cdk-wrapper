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
public class CfnTemplatePivotTableFieldOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.PivotTableFieldOptionsProperty.Builder =
        CfnTemplate.PivotTableFieldOptionsProperty.builder()

    private val _collapseStateOptions: MutableList<Any> = mutableListOf()

    private val _dataPathOptions: MutableList<Any> = mutableListOf()

    private val _selectedFieldOptions: MutableList<Any> = mutableListOf()

    public fun collapseStateOptions(vararg collapseStateOptions: Any) {
        _collapseStateOptions.addAll(listOf(*collapseStateOptions))
    }

    public fun collapseStateOptions(collapseStateOptions: Collection<Any>) {
        _collapseStateOptions.addAll(collapseStateOptions)
    }

    public fun collapseStateOptions(collapseStateOptions: IResolvable) {
        cdkBuilder.collapseStateOptions(collapseStateOptions)
    }

    public fun dataPathOptions(vararg dataPathOptions: Any) {
        _dataPathOptions.addAll(listOf(*dataPathOptions))
    }

    public fun dataPathOptions(dataPathOptions: Collection<Any>) {
        _dataPathOptions.addAll(dataPathOptions)
    }

    public fun dataPathOptions(dataPathOptions: IResolvable) {
        cdkBuilder.dataPathOptions(dataPathOptions)
    }

    public fun selectedFieldOptions(vararg selectedFieldOptions: Any) {
        _selectedFieldOptions.addAll(listOf(*selectedFieldOptions))
    }

    public fun selectedFieldOptions(selectedFieldOptions: Collection<Any>) {
        _selectedFieldOptions.addAll(selectedFieldOptions)
    }

    public fun selectedFieldOptions(selectedFieldOptions: IResolvable) {
        cdkBuilder.selectedFieldOptions(selectedFieldOptions)
    }

    public fun build(): CfnTemplate.PivotTableFieldOptionsProperty {
        if (_collapseStateOptions.isNotEmpty()) cdkBuilder.collapseStateOptions(_collapseStateOptions)
        if (_dataPathOptions.isNotEmpty()) cdkBuilder.dataPathOptions(_dataPathOptions)
        if (_selectedFieldOptions.isNotEmpty()) cdkBuilder.selectedFieldOptions(_selectedFieldOptions)
        return cdkBuilder.build()
    }
}
