@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * The configuration of selected fields in the `CustomActionFilterOperation` .
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FilterOperationSelectedFieldsConfigurationProperty
 * filterOperationSelectedFieldsConfigurationProperty =
 * FilterOperationSelectedFieldsConfigurationProperty.builder()
 * .selectedColumns(List.of(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build()))
 * .selectedFieldOptions("selectedFieldOptions")
 * .selectedFields(List.of("selectedFields"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-filteroperationselectedfieldsconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardFilterOperationSelectedFieldsConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.FilterOperationSelectedFieldsConfigurationProperty.Builder =
        CfnDashboard.FilterOperationSelectedFieldsConfigurationProperty.builder()

    private val _selectedColumns: MutableList<Any> = mutableListOf()

    private val _selectedFields: MutableList<String> = mutableListOf()

    /**
     * @param selectedColumns The selected columns of a dataset.
     */
    public fun selectedColumns(vararg selectedColumns: Any) {
        _selectedColumns.addAll(listOf(*selectedColumns))
    }

    /**
     * @param selectedColumns The selected columns of a dataset.
     */
    public fun selectedColumns(selectedColumns: Collection<Any>) {
        _selectedColumns.addAll(selectedColumns)
    }

    /**
     * @param selectedColumns The selected columns of a dataset.
     */
    public fun selectedColumns(selectedColumns: IResolvable) {
        cdkBuilder.selectedColumns(selectedColumns)
    }

    /**
     * @param selectedFieldOptions A structure that contains the options that choose which fields are
     * filtered in the `CustomActionFilterOperation` .
     * Valid values are defined as follows:
     *
     * * `ALL_FIELDS` : Applies the filter operation to all fields.
     */
    public fun selectedFieldOptions(selectedFieldOptions: String) {
        cdkBuilder.selectedFieldOptions(selectedFieldOptions)
    }

    /**
     * @param selectedFields Chooses the fields that are filtered in `CustomActionFilterOperation` .
     */
    public fun selectedFields(vararg selectedFields: String) {
        _selectedFields.addAll(listOf(*selectedFields))
    }

    /**
     * @param selectedFields Chooses the fields that are filtered in `CustomActionFilterOperation` .
     */
    public fun selectedFields(selectedFields: Collection<String>) {
        _selectedFields.addAll(selectedFields)
    }

    public fun build(): CfnDashboard.FilterOperationSelectedFieldsConfigurationProperty {
        if (_selectedColumns.isNotEmpty()) cdkBuilder.selectedColumns(_selectedColumns)
        if (_selectedFields.isNotEmpty()) cdkBuilder.selectedFields(_selectedFields)
        return cdkBuilder.build()
    }
}
