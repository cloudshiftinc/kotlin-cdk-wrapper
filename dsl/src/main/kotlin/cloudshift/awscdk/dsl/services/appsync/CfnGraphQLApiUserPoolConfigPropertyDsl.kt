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
import software.amazon.awscdk.services.appsync.CfnGraphQLApi

/**
 * The `UserPoolConfig` property type specifies the optional authorization configuration for using
 * Amazon Cognito user pools with your GraphQL endpoint for an AWS AppSync GraphQL API.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * UserPoolConfigProperty userPoolConfigProperty = UserPoolConfigProperty.builder()
 * .appIdClientRegex("appIdClientRegex")
 * .awsRegion("awsRegion")
 * .defaultAction("defaultAction")
 * .userPoolId("userPoolId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html)
 */
@CdkDslMarker
public class CfnGraphQLApiUserPoolConfigPropertyDsl {
    private val cdkBuilder: CfnGraphQLApi.UserPoolConfigProperty.Builder =
        CfnGraphQLApi.UserPoolConfigProperty.builder()

    /**
     * @param appIdClientRegex A regular expression for validating the incoming Amazon Cognito user
     *   pool app client ID. If this value isn't set, no filtering is applied.
     */
    public fun appIdClientRegex(appIdClientRegex: String) {
        cdkBuilder.appIdClientRegex(appIdClientRegex)
    }

    /** @param awsRegion The AWS Region in which the user pool was created. */
    public fun awsRegion(awsRegion: String) {
        cdkBuilder.awsRegion(awsRegion)
    }

    /**
     * @param defaultAction The action that you want your GraphQL API to take when a request that
     *   uses Amazon Cognito user pool authentication doesn't match the Amazon Cognito user pool
     *   configuration. When specifying Amazon Cognito user pools as the default authentication, you
     *   must set the value for `DefaultAction` to `ALLOW` if specifying
     *   `AdditionalAuthenticationProviders` .
     */
    public fun defaultAction(defaultAction: String) {
        cdkBuilder.defaultAction(defaultAction)
    }

    /** @param userPoolId The user pool ID. */
    public fun userPoolId(userPoolId: String) {
        cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): CfnGraphQLApi.UserPoolConfigProperty = cdkBuilder.build()
}
