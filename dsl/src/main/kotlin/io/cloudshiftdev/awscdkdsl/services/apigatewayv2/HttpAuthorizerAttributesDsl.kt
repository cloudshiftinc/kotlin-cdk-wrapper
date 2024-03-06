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
import software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerAttributes

/**
 * Reference to an http authorizer.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * HttpAuthorizerAttributes httpAuthorizerAttributes = HttpAuthorizerAttributes.builder()
 * .authorizerId("authorizerId")
 * .authorizerType("authorizerType")
 * .build();
 * ```
 */
@CdkDslMarker
public class HttpAuthorizerAttributesDsl {
    private val cdkBuilder: HttpAuthorizerAttributes.Builder = HttpAuthorizerAttributes.builder()

    /** @param authorizerId Id of the Authorizer. */
    public fun authorizerId(authorizerId: String) {
        cdkBuilder.authorizerId(authorizerId)
    }

    /**
     * @param authorizerType Type of authorizer. Possible values are:
     * * JWT - JSON Web Token Authorizer
     * * CUSTOM - Lambda Authorizer
     * * NONE - No Authorization
     */
    public fun authorizerType(authorizerType: String) {
        cdkBuilder.authorizerType(authorizerType)
    }

    public fun build(): HttpAuthorizerAttributes = cdkBuilder.build()
}
