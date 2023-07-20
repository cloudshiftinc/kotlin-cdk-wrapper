@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.apigateway.LambdaAuthorizerProps
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.lambda.IFunction
import kotlin.String

@CdkDslMarker
public class LambdaAuthorizerPropsDsl {
    private val cdkBuilder: LambdaAuthorizerProps.Builder = LambdaAuthorizerProps.builder()

    public fun assumeRole(assumeRole: IRole) {
        cdkBuilder.assumeRole(assumeRole)
    }

    public fun authorizerName(authorizerName: String) {
        cdkBuilder.authorizerName(authorizerName)
    }

    public fun handler(handler: IFunction) {
        cdkBuilder.handler(handler)
    }

    public fun resultsCacheTtl(resultsCacheTtl: Duration) {
        cdkBuilder.resultsCacheTtl(resultsCacheTtl)
    }

    public fun build(): LambdaAuthorizerProps = cdkBuilder.build()
}
