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
import software.amazon.awscdk.services.quicksight.CfnDataSet

/**
 * A transform operation that filters rows based on a condition.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FilterOperationProperty filterOperationProperty = FilterOperationProperty.builder()
 * .conditionExpression("conditionExpression")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-filteroperation.html)
 */
@CdkDslMarker
public class CfnDataSetFilterOperationPropertyDsl {
    private val cdkBuilder: CfnDataSet.FilterOperationProperty.Builder =
        CfnDataSet.FilterOperationProperty.builder()

    /**
     * @param conditionExpression An expression that must evaluate to a Boolean value. Rows for
     *   which the expression evaluates to true are kept in the dataset.
     */
    public fun conditionExpression(conditionExpression: String) {
        cdkBuilder.conditionExpression(conditionExpression)
    }

    public fun build(): CfnDataSet.FilterOperationProperty = cdkBuilder.build()
}
