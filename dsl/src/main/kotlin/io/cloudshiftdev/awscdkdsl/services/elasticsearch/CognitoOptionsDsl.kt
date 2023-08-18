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

package io.cloudshiftdev.awscdkdsl.services.elasticsearch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.String
import software.amazon.awscdk.services.elasticsearch.CognitoOptions
import software.amazon.awscdk.services.iam.IRole

/**
 * (deprecated) Configures Amazon ES to use Amazon Cognito authentication for Kibana.
 *
 * Example:
 * ```
 * Domain.Builder.create(this, "Domain")
 * .cognitoKibanaAuth(CognitoOptions.builder()
 * .identityPoolId("test-identity-pool-id")
 * .userPoolId("test-user-pool-id")
 * .role(role)
 * .build())
 * .version(elasticsearchVersion)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html)
 *
 * @deprecated use opensearchservice module instead
 */
@CdkDslMarker
@Deprecated(message = "deprecated in CDK")
public class CognitoOptionsDsl {
    private val cdkBuilder: CognitoOptions.Builder = CognitoOptions.builder()

    /**
     * @param identityPoolId The Amazon Cognito identity pool ID that you want Amazon ES to use for
     *   Kibana authentication.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun identityPoolId(identityPoolId: String) {
        cdkBuilder.identityPoolId(identityPoolId)
    }

    /**
     * @param role A role that allows Amazon ES to configure your user pool and identity pool. It
     *   must have the `AmazonESCognitoAccess` policy attached to it.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /**
     * @param userPoolId The Amazon Cognito user pool ID that you want Amazon ES to use for Kibana
     *   authentication.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun userPoolId(userPoolId: String) {
        cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): CognitoOptions = cdkBuilder.build()
}
