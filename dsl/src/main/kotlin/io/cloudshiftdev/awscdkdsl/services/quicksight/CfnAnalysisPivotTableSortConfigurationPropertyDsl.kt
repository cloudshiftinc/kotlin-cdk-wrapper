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
import software.amazon.awscdk.services.quicksight.CfnAnalysis

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
 * .attributeAggregationFunction(AttributeAggregationFunctionProperty.builder()
 * .simpleAttributeAggregation("simpleAttributeAggregation")
 * .valueForMultipleValues("valueForMultipleValues")
 * .build())
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
 * .dataPathType(DataPathTypeProperty.builder()
 * .pivotTableDataPathType("pivotTableDataPathType")
 * .build())
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-pivottablesortconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisPivotTableSortConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.PivotTableSortConfigurationProperty.Builder =
        CfnAnalysis.PivotTableSortConfigurationProperty.builder()

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

    public fun build(): CfnAnalysis.PivotTableSortConfigurationProperty {
        if (_fieldSortOptions.isNotEmpty()) cdkBuilder.fieldSortOptions(_fieldSortOptions)
        return cdkBuilder.build()
    }
}
