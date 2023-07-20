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
import software.amazon.awscdk.services.apigateway.TokenAuthorizer
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.lambda.IFunction
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class TokenAuthorizerDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: TokenAuthorizer.Builder = TokenAuthorizer.Builder.create(scope, id)

    public fun assumeRole(assumeRole: IRole) {
        cdkBuilder.assumeRole(assumeRole)
    }

    public fun authorizerName(authorizerName: String) {
        cdkBuilder.authorizerName(authorizerName)
    }

    public fun handler(handler: IFunction) {
        cdkBuilder.handler(handler)
    }

    public fun identitySource(identitySource: String) {
        cdkBuilder.identitySource(identitySource)
    }

    public fun resultsCacheTtl(resultsCacheTtl: Duration) {
        cdkBuilder.resultsCacheTtl(resultsCacheTtl)
    }

    public fun validationRegex(validationRegex: String) {
        cdkBuilder.validationRegex(validationRegex)
    }

    public fun build(): TokenAuthorizer = cdkBuilder.build()
}
