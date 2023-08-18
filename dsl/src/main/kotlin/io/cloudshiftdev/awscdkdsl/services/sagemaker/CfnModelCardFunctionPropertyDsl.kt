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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelCard

/**
 * Function details.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * FunctionProperty functionProperty = FunctionProperty.builder()
 * .condition("condition")
 * .facet("facet")
 * .function("function")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-function.html)
 */
@CdkDslMarker
public class CfnModelCardFunctionPropertyDsl {
    private val cdkBuilder: CfnModelCard.FunctionProperty.Builder =
        CfnModelCard.FunctionProperty.builder()

    /**
     * @param condition An optional description of any conditions of your objective function metric.
     */
    public fun condition(condition: String) {
        cdkBuilder.condition(condition)
    }

    /**
     * @param facet The metric of the model's objective function. For example, *loss* or *rmse* .
     *   The following list shows examples of the values that you can specify for the metric:
     * * `ACCURACY`
     * * `AUC`
     * * `LOSS`
     * * `MAE`
     * * `RMSE`
     */
    public fun facet(facet: String) {
        cdkBuilder.facet(facet)
    }

    /**
     * @param function The optimization direction of the model's objective function. You must
     *   specify one of the following values:.
     * * `Maximize`
     * * `Minimize`
     */
    public fun function(function: String) {
        cdkBuilder.function(function)
    }

    public fun build(): CfnModelCard.FunctionProperty = cdkBuilder.build()
}
