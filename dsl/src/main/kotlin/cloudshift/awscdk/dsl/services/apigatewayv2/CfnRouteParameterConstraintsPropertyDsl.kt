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

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigatewayv2.CfnRoute

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * ParameterConstraintsProperty parameterConstraintsProperty =
 * ParameterConstraintsProperty.builder()
 * .required(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-route-parameterconstraints.html)
 */
@CdkDslMarker
public class CfnRouteParameterConstraintsPropertyDsl {
    private val cdkBuilder: CfnRoute.ParameterConstraintsProperty.Builder =
        CfnRoute.ParameterConstraintsProperty.builder()

    /** @param required the value to be set. */
    public fun required(required: Boolean) {
        cdkBuilder.required(required)
    }

    /** @param required the value to be set. */
    public fun required(required: IResolvable) {
        cdkBuilder.required(required)
    }

    public fun build(): CfnRoute.ParameterConstraintsProperty = cdkBuilder.build()
}
