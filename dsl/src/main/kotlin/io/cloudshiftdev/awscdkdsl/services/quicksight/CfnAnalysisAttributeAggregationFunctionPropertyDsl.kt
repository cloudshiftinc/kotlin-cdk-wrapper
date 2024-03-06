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
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * Aggregation for attributes.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * AttributeAggregationFunctionProperty attributeAggregationFunctionProperty =
 * AttributeAggregationFunctionProperty.builder()
 * .simpleAttributeAggregation("simpleAttributeAggregation")
 * .valueForMultipleValues("valueForMultipleValues")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-attributeaggregationfunction.html)
 */
@CdkDslMarker
public class CfnAnalysisAttributeAggregationFunctionPropertyDsl {
    private val cdkBuilder: CfnAnalysis.AttributeAggregationFunctionProperty.Builder =
        CfnAnalysis.AttributeAggregationFunctionProperty.builder()

    /**
     * @param simpleAttributeAggregation The built-in aggregation functions for attributes.
     * * `UNIQUE_VALUE` : Returns the unique value for a field, aggregated by the dimension fields.
     */
    public fun simpleAttributeAggregation(simpleAttributeAggregation: String) {
        cdkBuilder.simpleAttributeAggregation(simpleAttributeAggregation)
    }

    /**
     * @param valueForMultipleValues Used by the `UNIQUE_VALUE` aggregation function. If there are
     *   multiple values for the field used by the aggregation, the value for this property will be
     *   returned instead. Defaults to '*'.
     */
    public fun valueForMultipleValues(valueForMultipleValues: String) {
        cdkBuilder.valueForMultipleValues(valueForMultipleValues)
    }

    public fun build(): CfnAnalysis.AttributeAggregationFunctionProperty = cdkBuilder.build()
}