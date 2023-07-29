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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The sort configuration for a `PivotTableVisual` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * PivotTableSortConfigurationProperty pivotTableSortConfigurationProperty =
 * PivotTableSortConfigurationProperty.builder()
 * .fieldSortOptions(List.of(PivotFieldSortOptionsProperty.builder()
 * .fieldId("fieldId")
 * .sortBy(PivotTableSortByProperty.builder()
 * .column(ColumnSortProperty.builder()
 * .direction("direction")
 * .sortBy(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * // the properties below are optional
 * .aggregationFunction(AggregationFunctionProperty.builder()
 * .categoricalAggregationFunction("categoricalAggregationFunction")
 * .dateAggregationFunction("dateAggregationFunction")
 * .numericalAggregationFunction(NumericalAggregationFunctionProperty.builder()
 * .percentileAggregation(PercentileAggregationProperty.builder()
 * .percentileValue(123)
 * .build())
 * .simpleNumericalAggregation("simpleNumericalAggregation")
 * .build())
 * .build())
 * .build())
 * .dataPath(DataPathSortProperty.builder()
 * .direction("direction")
 * .sortPaths(List.of(DataPathValueProperty.builder()
 * .fieldId("fieldId")
 * .fieldValue("fieldValue")
 * .build()))
 * .build())
 * .field(FieldSortProperty.builder()
 * .direction("direction")
 * .fieldId("fieldId")
 * .build())
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-pivottablesortconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardPivotTableSortConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.PivotTableSortConfigurationProperty.Builder =
        CfnDashboard.PivotTableSortConfigurationProperty.builder()

    private val _fieldSortOptions: MutableList<Any> = mutableListOf()

    /** @param fieldSortOptions The field sort options for a pivot table sort configuration. */
    public fun fieldSortOptions(vararg fieldSortOptions: Any) {
        _fieldSortOptions.addAll(listOf(*fieldSortOptions))
    }

    /** @param fieldSortOptions The field sort options for a pivot table sort configuration. */
    public fun fieldSortOptions(fieldSortOptions: Collection<Any>) {
        _fieldSortOptions.addAll(fieldSortOptions)
    }

    /** @param fieldSortOptions The field sort options for a pivot table sort configuration. */
    public fun fieldSortOptions(fieldSortOptions: IResolvable) {
        cdkBuilder.fieldSortOptions(fieldSortOptions)
    }

    public fun build(): CfnDashboard.PivotTableSortConfigurationProperty {
        if (_fieldSortOptions.isNotEmpty()) cdkBuilder.fieldSortOptions(_fieldSortOptions)
        return cdkBuilder.build()
    }
}
