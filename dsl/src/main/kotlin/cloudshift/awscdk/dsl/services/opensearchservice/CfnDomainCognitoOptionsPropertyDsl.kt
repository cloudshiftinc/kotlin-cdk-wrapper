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
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opensearchservice.CfnDomain

/**
 * Configures OpenSearch Service to use Amazon Cognito authentication for OpenSearch Dashboards.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opensearchservice.*;
 * CognitoOptionsProperty cognitoOptionsProperty = CognitoOptionsProperty.builder()
 * .enabled(false)
 * .identityPoolId("identityPoolId")
 * .roleArn("roleArn")
 * .userPoolId("userPoolId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-cognitooptions.html)
 */
@CdkDslMarker
public class CfnDomainCognitoOptionsPropertyDsl {
    private val cdkBuilder: CfnDomain.CognitoOptionsProperty.Builder =
        CfnDomain.CognitoOptionsProperty.builder()

    /**
     * @param enabled Whether to enable or disable Amazon Cognito authentication for OpenSearch
     *   Dashboards. See
     *   [Amazon Cognito authentication for OpenSearch Dashboards](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html)
     *   .
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Whether to enable or disable Amazon Cognito authentication for OpenSearch
     *   Dashboards. See
     *   [Amazon Cognito authentication for OpenSearch Dashboards](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html)
     *   .
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param identityPoolId The Amazon Cognito identity pool ID that you want OpenSearch Service to
     *   use for OpenSearch Dashboards authentication. Required if you enabled Cognito
     *   Authentication for OpenSearch Dashboards.
     */
    public fun identityPoolId(identityPoolId: String) {
        cdkBuilder.identityPoolId(identityPoolId)
    }

    /**
     * @param roleArn The `AmazonOpenSearchServiceCognitoAccess` role that allows OpenSearch Service
     *   to configure your user pool and identity pool. Required if you enabled Cognito
     *   Authentication for OpenSearch Dashboards.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param userPoolId The Amazon Cognito user pool ID that you want OpenSearch Service to use for
     *   OpenSearch Dashboards authentication. Required if you enabled Cognito Authentication for
     *   OpenSearch Dashboards.
     */
    public fun userPoolId(userPoolId: String) {
        cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): CfnDomain.CognitoOptionsProperty = cdkBuilder.build()
}
