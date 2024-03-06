@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The field options for a pivot table visual.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * PivotTableFieldOptionsProperty pivotTableFieldOptionsProperty =
 * PivotTableFieldOptionsProperty.builder()
 * .collapseStateOptions(List.of(PivotTableFieldCollapseStateOptionProperty.builder()
 * .target(PivotTableFieldCollapseStateTargetProperty.builder()
 * .fieldDataPathValues(List.of(DataPathValueProperty.builder()
 * .dataPathType(DataPathTypeProperty.builder()
 * .pivotTableDataPathType("pivotTableDataPathType")
 * .build())
 * .fieldId("fieldId")
 * .fieldValue("fieldValue")
 * .build()))
 * .fieldId("fieldId")
 * .build())
 * // the properties below are optional
 * .state("state")
 * .build()))
 * .dataPathOptions(List.of(PivotTableDataPathOptionProperty.builder()
 * .dataPathList(List.of(DataPathValueProperty.builder()
 * .dataPathType(DataPathTypeProperty.builder()
 * .pivotTableDataPathType("pivotTableDataPathType")
 * .build())
 * .fieldId("fieldId")
 * .fieldValue("fieldValue")
 * .build()))
 * // the properties below are optional
 * .width("width")
 * .build()))
 * .selectedFieldOptions(List.of(PivotTableFieldOptionProperty.builder()
 * .fieldId("fieldId")
 * // the properties below are optional
 * .customLabel("customLabel")
 * .visibility("visibility")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-pivottablefieldoptions.html)
 */
@CdkDslMarker
public class CfnDashboardPivotTableFieldOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.PivotTableFieldOptionsProperty.Builder =
        CfnDashboard.PivotTableFieldOptionsProperty.builder()

    private val _collapseStateOptions: MutableList<Any> = mutableListOf()

    private val _dataPathOptions: MutableList<Any> = mutableListOf()

    private val _selectedFieldOptions: MutableList<Any> = mutableListOf()

    /** @param collapseStateOptions The collapse state options for the pivot table field options. */
    public fun collapseStateOptions(vararg collapseStateOptions: Any) {
        _collapseStateOptions.addAll(listOf(*collapseStateOptions))
    }

    /** @param collapseStateOptions The collapse state options for the pivot table field options. */
    public fun collapseStateOptions(collapseStateOptions: Collection<Any>) {
        _collapseStateOptions.addAll(collapseStateOptions)
    }

    /** @param collapseStateOptions The collapse state options for the pivot table field options. */
    public fun collapseStateOptions(collapseStateOptions: IResolvable) {
        cdkBuilder.collapseStateOptions(collapseStateOptions)
    }

    /** @param dataPathOptions The data path options for the pivot table field options. */
    public fun dataPathOptions(vararg dataPathOptions: Any) {
        _dataPathOptions.addAll(listOf(*dataPathOptions))
    }

    /** @param dataPathOptions The data path options for the pivot table field options. */
    public fun dataPathOptions(dataPathOptions: Collection<Any>) {
        _dataPathOptions.addAll(dataPathOptions)
    }

    /** @param dataPathOptions The data path options for the pivot table field options. */
    public fun dataPathOptions(dataPathOptions: IResolvable) {
        cdkBuilder.dataPathOptions(dataPathOptions)
    }

    /** @param selectedFieldOptions The selected field options for the pivot table field options. */
    public fun selectedFieldOptions(vararg selectedFieldOptions: Any) {
        _selectedFieldOptions.addAll(listOf(*selectedFieldOptions))
    }

    /** @param selectedFieldOptions The selected field options for the pivot table field options. */
    public fun selectedFieldOptions(selectedFieldOptions: Collection<Any>) {
        _selectedFieldOptions.addAll(selectedFieldOptions)
    }

    /** @param selectedFieldOptions The selected field options for the pivot table field options. */
    public fun selectedFieldOptions(selectedFieldOptions: IResolvable) {
        cdkBuilder.selectedFieldOptions(selectedFieldOptions)
    }

    public fun build(): CfnDashboard.PivotTableFieldOptionsProperty {
        if (_collapseStateOptions.isNotEmpty())
            cdkBuilder.collapseStateOptions(_collapseStateOptions)
        if (_dataPathOptions.isNotEmpty()) cdkBuilder.dataPathOptions(_dataPathOptions)
        if (_selectedFieldOptions.isNotEmpty())
            cdkBuilder.selectedFieldOptions(_selectedFieldOptions)
        return cdkBuilder.build()
    }
}
