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

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.opensearchservice.CognitoOptions

/**
 * Configures Amazon OpenSearch Service to use Amazon Cognito authentication for OpenSearch
 * Dashboards.
 *
 * Example:
 * ```
 * Domain.Builder.create(this, "Domain")
 * .cognitoDashboardsAuth(CognitoOptions.builder()
 * .identityPoolId("test-identity-pool-id")
 * .userPoolId("test-user-pool-id")
 * .role(role)
 * .build())
 * .version(openSearchVersion)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html)
 */
@CdkDslMarker
public class CognitoOptionsDsl {
    private val cdkBuilder: CognitoOptions.Builder = CognitoOptions.builder()

    /**
     * @param identityPoolId The Amazon Cognito identity pool ID that you want Amazon OpenSearch
     *   Service to use for OpenSearch Dashboards authentication.
     */
    public fun identityPoolId(identityPoolId: String) {
        cdkBuilder.identityPoolId(identityPoolId)
    }

    /**
     * @param role A role that allows Amazon OpenSearch Service to configure your user pool and
     *   identity pool. It must have the `AmazonESCognitoAccess` policy attached to it.
     */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /**
     * @param userPoolId The Amazon Cognito user pool ID that you want Amazon OpenSearch Service to
     *   use for OpenSearch Dashboards authentication.
     */
    public fun userPoolId(userPoolId: String) {
        cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): CognitoOptions = cdkBuilder.build()
}
