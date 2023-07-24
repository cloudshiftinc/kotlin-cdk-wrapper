@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.String

/**
 * The sort configuration for a column that is not used in a field well.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ColumnSortProperty columnSortProperty = ColumnSortProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-columnsort.html)
 */
@CdkDslMarker
public class CfnTemplateColumnSortPropertyDsl {
    private val cdkBuilder: CfnTemplate.ColumnSortProperty.Builder =
        CfnTemplate.ColumnSortProperty.builder()

    /**
     * @param aggregationFunction The aggregation function that is defined in the column sort.
     */
    public fun aggregationFunction(aggregationFunction: IResolvable) {
        cdkBuilder.aggregationFunction(aggregationFunction)
    }

    /**
     * @param aggregationFunction The aggregation function that is defined in the column sort.
     */
    public fun aggregationFunction(aggregationFunction: CfnTemplate.AggregationFunctionProperty) {
        cdkBuilder.aggregationFunction(aggregationFunction)
    }

    /**
     * @param direction The sort direction.
     */
    public fun direction(direction: String) {
        cdkBuilder.direction(direction)
    }

    /**
     * @param sortBy the value to be set.
     */
    public fun sortBy(sortBy: IResolvable) {
        cdkBuilder.sortBy(sortBy)
    }

    /**
     * @param sortBy the value to be set.
     */
    public fun sortBy(sortBy: CfnTemplate.ColumnIdentifierProperty) {
        cdkBuilder.sortBy(sortBy)
    }

    public fun build(): CfnTemplate.ColumnSortProperty = cdkBuilder.build()
}
