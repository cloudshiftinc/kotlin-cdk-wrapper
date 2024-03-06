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

package io.cloudshiftdev.awscdkdsl.services.apigatewayv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigatewayv2.CfnIntegration

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * ResponseParameterProperty responseParameterProperty = ResponseParameterProperty.builder()
 * .destination("destination")
 * .source("source")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-responseparameter.html)
 */
@CdkDslMarker
public class CfnIntegrationResponseParameterPropertyDsl {
    private val cdkBuilder: CfnIntegration.ResponseParameterProperty.Builder =
        CfnIntegration.ResponseParameterProperty.builder()

    /** @param destination the value to be set. */
    public fun destination(destination: String) {
        cdkBuilder.destination(destination)
    }

    /** @param source the value to be set. */
    public fun source(source: String) {
        cdkBuilder.source(source)
    }

    public fun build(): CfnIntegration.ResponseParameterProperty = cdkBuilder.build()
}
