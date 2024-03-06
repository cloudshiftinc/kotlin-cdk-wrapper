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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The display options for the visual tooltip.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TooltipOptionsProperty tooltipOptionsProperty = TooltipOptionsProperty.builder()
 * .fieldBasedTooltip(FieldBasedTooltipProperty.builder()
 * .aggregationVisibility("aggregationVisibility")
 * .tooltipFields(List.of(TooltipItemProperty.builder()
 * .columnTooltipItem(ColumnTooltipItemProperty.builder()
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * // the properties below are optional
 * .aggregation(AggregationFunctionProperty.builder()
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
 * .label("label")
 * .visibility("visibility")
 * .build())
 * .fieldTooltipItem(FieldTooltipItemProperty.builder()
 * .fieldId("fieldId")
 * // the properties below are optional
 * .label("label")
 * .visibility("visibility")
 * .build())
 * .build()))
 * .tooltipTitleType("tooltipTitleType")
 * .build())
 * .selectedTooltipType("selectedTooltipType")
 * .tooltipVisibility("tooltipVisibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-tooltipoptions.html)
 */
@CdkDslMarker
public class CfnDashboardTooltipOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.TooltipOptionsProperty.Builder =
        CfnDashboard.TooltipOptionsProperty.builder()

    /**
     * @param fieldBasedTooltip The setup for the detailed tooltip. The tooltip setup is always
     *   saved. The display type is decided based on the tooltip type.
     */
    public fun fieldBasedTooltip(fieldBasedTooltip: IResolvable) {
        cdkBuilder.fieldBasedTooltip(fieldBasedTooltip)
    }

    /**
     * @param fieldBasedTooltip The setup for the detailed tooltip. The tooltip setup is always
     *   saved. The display type is decided based on the tooltip type.
     */
    public fun fieldBasedTooltip(fieldBasedTooltip: CfnDashboard.FieldBasedTooltipProperty) {
        cdkBuilder.fieldBasedTooltip(fieldBasedTooltip)
    }

    /**
     * @param selectedTooltipType The selected type for the tooltip. Choose one of the following
     *   options:.
     * * `BASIC` : A basic tooltip.
     * * `DETAILED` : A detailed tooltip.
     */
    public fun selectedTooltipType(selectedTooltipType: String) {
        cdkBuilder.selectedTooltipType(selectedTooltipType)
    }

    /** @param tooltipVisibility Determines whether or not the tooltip is visible. */
    public fun tooltipVisibility(tooltipVisibility: String) {
        cdkBuilder.tooltipVisibility(tooltipVisibility)
    }

    public fun build(): CfnDashboard.TooltipOptionsProperty = cdkBuilder.build()
}
