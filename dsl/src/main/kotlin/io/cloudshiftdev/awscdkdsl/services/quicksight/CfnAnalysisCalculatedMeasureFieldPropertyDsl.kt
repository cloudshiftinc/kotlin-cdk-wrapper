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
 * The table calculation measure field for pivot tables.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * CalculatedMeasureFieldProperty calculatedMeasureFieldProperty =
 * CalculatedMeasureFieldProperty.builder()
 * .expression("expression")
 * .fieldId("fieldId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-calculatedmeasurefield.html)
 */
@CdkDslMarker
public class CfnAnalysisCalculatedMeasureFieldPropertyDsl {
    private val cdkBuilder: CfnAnalysis.CalculatedMeasureFieldProperty.Builder =
        CfnAnalysis.CalculatedMeasureFieldProperty.builder()

    /** @param expression The expression in the table calculation. */
    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    /** @param fieldId The custom field ID. */
    public fun fieldId(fieldId: String) {
        cdkBuilder.fieldId(fieldId)
    }

    public fun build(): CfnAnalysis.CalculatedMeasureFieldProperty = cdkBuilder.build()
}
