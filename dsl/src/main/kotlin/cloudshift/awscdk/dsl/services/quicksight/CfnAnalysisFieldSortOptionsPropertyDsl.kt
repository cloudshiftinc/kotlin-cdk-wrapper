@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The field sort options in a chart configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FieldSortOptionsProperty fieldSortOptionsProperty = FieldSortOptionsProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-fieldsortoptions.html)
 */
@CdkDslMarker
public class CfnAnalysisFieldSortOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.FieldSortOptionsProperty.Builder =
        CfnAnalysis.FieldSortOptionsProperty.builder()

    /**
     * @param columnSort The sort configuration for a column that is not used in a field well.
     */
    public fun columnSort(columnSort: IResolvable) {
        cdkBuilder.columnSort(columnSort)
    }

    /**
     * @param columnSort The sort configuration for a column that is not used in a field well.
     */
    public fun columnSort(columnSort: CfnAnalysis.ColumnSortProperty) {
        cdkBuilder.columnSort(columnSort)
    }

    /**
     * @param fieldSort The sort configuration for a field in a field well.
     */
    public fun fieldSort(fieldSort: IResolvable) {
        cdkBuilder.fieldSort(fieldSort)
    }

    /**
     * @param fieldSort The sort configuration for a field in a field well.
     */
    public fun fieldSort(fieldSort: CfnAnalysis.FieldSortProperty) {
        cdkBuilder.fieldSort(fieldSort)
    }

    public fun build(): CfnAnalysis.FieldSortOptionsProperty = cdkBuilder.build()
}
