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

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appsync.CfnGraphQLApi

/**
 * Describes an additional authentication provider.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * AdditionalAuthenticationProviderProperty additionalAuthenticationProviderProperty =
 * AdditionalAuthenticationProviderProperty.builder()
 * .authenticationType("authenticationType")
 * // the properties below are optional
 * .lambdaAuthorizerConfig(LambdaAuthorizerConfigProperty.builder()
 * .authorizerResultTtlInSeconds(123)
 * .authorizerUri("authorizerUri")
 * .identityValidationExpression("identityValidationExpression")
 * .build())
 * .openIdConnectConfig(OpenIDConnectConfigProperty.builder()
 * .authTtl(123)
 * .clientId("clientId")
 * .iatTtl(123)
 * .issuer("issuer")
 * .build())
 * .userPoolConfig(CognitoUserPoolConfigProperty.builder()
 * .appIdClientRegex("appIdClientRegex")
 * .awsRegion("awsRegion")
 * .userPoolId("userPoolId")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-additionalauthenticationprovider.html)
 */
@CdkDslMarker
public class CfnGraphQLApiAdditionalAuthenticationProviderPropertyDsl {
    private val cdkBuilder: CfnGraphQLApi.AdditionalAuthenticationProviderProperty.Builder =
        CfnGraphQLApi.AdditionalAuthenticationProviderProperty.builder()

    /**
     * @param authenticationType The authentication type for API key, AWS Identity and Access
     *   Management , OIDC, Amazon Cognito user pools , or AWS Lambda . Valid Values: `API_KEY` |
     *   `AWS_IAM` | `OPENID_CONNECT` | `AMAZON_COGNITO_USER_POOLS` | `AWS_LAMBDA`
     */
    public fun authenticationType(authenticationType: String) {
        cdkBuilder.authenticationType(authenticationType)
    }

    /** @param lambdaAuthorizerConfig Configuration for AWS Lambda function authorization. */
    public fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: IResolvable) {
        cdkBuilder.lambdaAuthorizerConfig(lambdaAuthorizerConfig)
    }

    /** @param lambdaAuthorizerConfig Configuration for AWS Lambda function authorization. */
    public fun lambdaAuthorizerConfig(
        lambdaAuthorizerConfig: CfnGraphQLApi.LambdaAuthorizerConfigProperty
    ) {
        cdkBuilder.lambdaAuthorizerConfig(lambdaAuthorizerConfig)
    }

    /** @param openIdConnectConfig The OIDC configuration. */
    public fun openIdConnectConfig(openIdConnectConfig: IResolvable) {
        cdkBuilder.openIdConnectConfig(openIdConnectConfig)
    }

    /** @param openIdConnectConfig The OIDC configuration. */
    public fun openIdConnectConfig(openIdConnectConfig: CfnGraphQLApi.OpenIDConnectConfigProperty) {
        cdkBuilder.openIdConnectConfig(openIdConnectConfig)
    }

    /** @param userPoolConfig The Amazon Cognito user pool configuration. */
    public fun userPoolConfig(userPoolConfig: IResolvable) {
        cdkBuilder.userPoolConfig(userPoolConfig)
    }

    /** @param userPoolConfig The Amazon Cognito user pool configuration. */
    public fun userPoolConfig(userPoolConfig: CfnGraphQLApi.CognitoUserPoolConfigProperty) {
        cdkBuilder.userPoolConfig(userPoolConfig)
    }

    public fun build(): CfnGraphQLApi.AdditionalAuthenticationProviderProperty = cdkBuilder.build()
}
