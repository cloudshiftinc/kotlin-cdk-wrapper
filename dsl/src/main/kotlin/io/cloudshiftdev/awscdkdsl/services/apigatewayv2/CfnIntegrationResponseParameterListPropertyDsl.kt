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
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigatewayv2.CfnIntegration

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * ResponseParameterListProperty responseParameterListProperty =
 * ResponseParameterListProperty.builder()
 * .responseParameters(List.of(ResponseParameterProperty.builder()
 * .destination("destination")
 * .source("source")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-responseparameterlist.html)
 */
@CdkDslMarker
public class CfnIntegrationResponseParameterListPropertyDsl {
    private val cdkBuilder: CfnIntegration.ResponseParameterListProperty.Builder =
        CfnIntegration.ResponseParameterListProperty.builder()

    private val _responseParameters: MutableList<Any> = mutableListOf()

    /** @param responseParameters the value to be set. */
    public fun responseParameters(vararg responseParameters: Any) {
        _responseParameters.addAll(listOf(*responseParameters))
    }

    /** @param responseParameters the value to be set. */
    public fun responseParameters(responseParameters: Collection<Any>) {
        _responseParameters.addAll(responseParameters)
    }

    /** @param responseParameters the value to be set. */
    public fun responseParameters(responseParameters: IResolvable) {
        cdkBuilder.responseParameters(responseParameters)
    }

    public fun build(): CfnIntegration.ResponseParameterListProperty {
        if (_responseParameters.isNotEmpty()) cdkBuilder.responseParameters(_responseParameters)
        return cdkBuilder.build()
    }
}
