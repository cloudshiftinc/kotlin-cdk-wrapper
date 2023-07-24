@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * The sort configuration for a `TableVisual` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TableSortConfigurationProperty tableSortConfigurationProperty =
 * TableSortConfigurationProperty.builder()
 * .paginationConfiguration(PaginationConfigurationProperty.builder()
 * .pageNumber(123)
 * .pageSize(123)
 * .build())
 * .rowSort(List.of(FieldSortOptionsProperty.builder()
 * .columnSort(ColumnSortProperty.builder()
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
 * .fieldSort(FieldSortProperty.builder()
 * .direction("direction")
 * .fieldId("fieldId")
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-tablesortconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisTableSortConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.TableSortConfigurationProperty.Builder =
        CfnAnalysis.TableSortConfigurationProperty.builder()

    private val _rowSort: MutableList<Any> = mutableListOf()

    /**
     * @param paginationConfiguration The pagination configuration (page size, page number) for the
     * table.
     */
    public fun paginationConfiguration(paginationConfiguration: IResolvable) {
        cdkBuilder.paginationConfiguration(paginationConfiguration)
    }

    /**
     * @param paginationConfiguration The pagination configuration (page size, page number) for the
     * table.
     */
    public fun paginationConfiguration(paginationConfiguration: CfnAnalysis.PaginationConfigurationProperty) {
        cdkBuilder.paginationConfiguration(paginationConfiguration)
    }

    /**
     * @param rowSort The field sort options for rows in the table.
     */
    public fun rowSort(vararg rowSort: Any) {
        _rowSort.addAll(listOf(*rowSort))
    }

    /**
     * @param rowSort The field sort options for rows in the table.
     */
    public fun rowSort(rowSort: Collection<Any>) {
        _rowSort.addAll(rowSort)
    }

    /**
     * @param rowSort The field sort options for rows in the table.
     */
    public fun rowSort(rowSort: IResolvable) {
        cdkBuilder.rowSort(rowSort)
    }

    public fun build(): CfnAnalysis.TableSortConfigurationProperty {
        if (_rowSort.isNotEmpty()) cdkBuilder.rowSort(_rowSort)
        return cdkBuilder.build()
    }
}
