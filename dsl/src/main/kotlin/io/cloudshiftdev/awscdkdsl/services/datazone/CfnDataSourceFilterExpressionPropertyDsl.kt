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

package io.cloudshiftdev.awscdkdsl.services.datazone

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.datazone.CfnDataSource

/**
 * A filter expression in Amazon DataZone.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datazone.*;
 * FilterExpressionProperty filterExpressionProperty = FilterExpressionProperty.builder()
 * .expression("expression")
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-filterexpression.html)
 */
@CdkDslMarker
public class CfnDataSourceFilterExpressionPropertyDsl {
    private val cdkBuilder: CfnDataSource.FilterExpressionProperty.Builder =
        CfnDataSource.FilterExpressionProperty.builder()

    /** @param expression The search filter expression. */
    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    /** @param type The search filter explresison type. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnDataSource.FilterExpressionProperty = cdkBuilder.build()
}
