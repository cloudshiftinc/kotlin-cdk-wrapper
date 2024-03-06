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
 * The sort configuration of a sankey diagram.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SankeyDiagramSortConfigurationProperty sankeyDiagramSortConfigurationProperty =
 * SankeyDiagramSortConfigurationProperty.builder()
 * .destinationItemsLimit(ItemsLimitConfigurationProperty.builder()
 * .itemsLimit(123)
 * .otherCategories("otherCategories")
 * .build())
 * .sourceItemsLimit(ItemsLimitConfigurationProperty.builder()
 * .itemsLimit(123)
 * .otherCategories("otherCategories")
 * .build())
 * .weightSort(List.of(FieldSortOptionsProperty.builder()
 * .columnSort(ColumnSortProperty.builder()
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
 * .fieldSort(FieldSortProperty.builder()
 * .direction("direction")
 * .fieldId("fieldId")
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-sankeydiagramsortconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardSankeyDiagramSortConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.SankeyDiagramSortConfigurationProperty.Builder =
        CfnDashboard.SankeyDiagramSortConfigurationProperty.builder()

    private val _weightSort: MutableList<Any> = mutableListOf()

    /**
     * @param destinationItemsLimit The limit on the number of destination nodes that are displayed
     *   in a sankey diagram.
     */
    public fun destinationItemsLimit(destinationItemsLimit: IResolvable) {
        cdkBuilder.destinationItemsLimit(destinationItemsLimit)
    }

    /**
     * @param destinationItemsLimit The limit on the number of destination nodes that are displayed
     *   in a sankey diagram.
     */
    public fun destinationItemsLimit(
        destinationItemsLimit: CfnDashboard.ItemsLimitConfigurationProperty
    ) {
        cdkBuilder.destinationItemsLimit(destinationItemsLimit)
    }

    /**
     * @param sourceItemsLimit The limit on the number of source nodes that are displayed in a
     *   sankey diagram.
     */
    public fun sourceItemsLimit(sourceItemsLimit: IResolvable) {
        cdkBuilder.sourceItemsLimit(sourceItemsLimit)
    }

    /**
     * @param sourceItemsLimit The limit on the number of source nodes that are displayed in a
     *   sankey diagram.
     */
    public fun sourceItemsLimit(sourceItemsLimit: CfnDashboard.ItemsLimitConfigurationProperty) {
        cdkBuilder.sourceItemsLimit(sourceItemsLimit)
    }

    /** @param weightSort The sort configuration of the weight fields. */
    public fun weightSort(vararg weightSort: Any) {
        _weightSort.addAll(listOf(*weightSort))
    }

    /** @param weightSort The sort configuration of the weight fields. */
    public fun weightSort(weightSort: Collection<Any>) {
        _weightSort.addAll(weightSort)
    }

    /** @param weightSort The sort configuration of the weight fields. */
    public fun weightSort(weightSort: IResolvable) {
        cdkBuilder.weightSort(weightSort)
    }

    public fun build(): CfnDashboard.SankeyDiagramSortConfigurationProperty {
        if (_weightSort.isNotEmpty()) cdkBuilder.weightSort(_weightSort)
        return cdkBuilder.build()
    }
}
