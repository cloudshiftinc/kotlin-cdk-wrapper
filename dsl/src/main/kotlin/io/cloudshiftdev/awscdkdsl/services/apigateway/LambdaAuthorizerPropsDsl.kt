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

package io.cloudshiftdev.awscdkdsl.services.apigateway

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.apigateway.LambdaAuthorizerProps
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.lambda.IFunction

/**
 * Base properties for all lambda authorizers.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.apigateway.*;
 * import software.amazon.awscdk.services.iam.*;
 * import software.amazon.awscdk.services.lambda.*;
 * Function function_;
 * Role role;
 * LambdaAuthorizerProps lambdaAuthorizerProps = LambdaAuthorizerProps.builder()
 * .handler(function_)
 * // the properties below are optional
 * .assumeRole(role)
 * .authorizerName("authorizerName")
 * .resultsCacheTtl(Duration.minutes(30))
 * .build();
 * ```
 */
@CdkDslMarker
public class LambdaAuthorizerPropsDsl {
    private val cdkBuilder: LambdaAuthorizerProps.Builder = LambdaAuthorizerProps.builder()

    /**
     * @param assumeRole An optional IAM role for APIGateway to assume before calling the
     *   Lambda-based authorizer. The IAM role must be assumable by 'apigateway.amazonaws.com'.
     */
    public fun assumeRole(assumeRole: IRole) {
        cdkBuilder.assumeRole(assumeRole)
    }

    /**
     * @param authorizerName An optional human friendly name for the authorizer. Note that, this is
     *   not the primary identifier of the authorizer.
     */
    public fun authorizerName(authorizerName: String) {
        cdkBuilder.authorizerName(authorizerName)
    }

    /**
     * @param handler The handler for the authorizer lambda function. The handler must follow a very
     *   specific protocol on the input it receives and the output it needs to produce. API Gateway
     *   has documented the handler's
     *   [input specification](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-lambda-authorizer-input.html)
     *   and
     *   [output specification](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-lambda-authorizer-output.html).
     */
    public fun handler(handler: IFunction) {
        cdkBuilder.handler(handler)
    }

    /**
     * @param resultsCacheTtl How long APIGateway should cache the results. Max 1 hour. Disable
     *   caching by setting this to 0.
     */
    public fun resultsCacheTtl(resultsCacheTtl: Duration) {
        cdkBuilder.resultsCacheTtl(resultsCacheTtl)
    }

    public fun build(): LambdaAuthorizerProps = cdkBuilder.build()
}
