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

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnIdentityPool

/**
 * `CognitoIdentityProvider` is a property of the
 * [AWS::Cognito::IdentityPool](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html)
 * resource that represents an Amazon Cognito user pool and its client ID.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * CognitoIdentityProviderProperty cognitoIdentityProviderProperty =
 * CognitoIdentityProviderProperty.builder()
 * .clientId("clientId")
 * .providerName("providerName")
 * .serverSideTokenCheck(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html)
 */
@CdkDslMarker
public class CfnIdentityPoolCognitoIdentityProviderPropertyDsl {
    private val cdkBuilder: CfnIdentityPool.CognitoIdentityProviderProperty.Builder =
        CfnIdentityPool.CognitoIdentityProviderProperty.builder()

    /** @param clientId The client ID for the Amazon Cognito user pool. */
    public fun clientId(clientId: String) {
        cdkBuilder.clientId(clientId)
    }

    /**
     * @param providerName The provider name for an Amazon Cognito user pool. For example:
     *   `cognito-idp.us-east-2.amazonaws.com/us-east-2_123456789` .
     */
    public fun providerName(providerName: String) {
        cdkBuilder.providerName(providerName)
    }

    /**
     * @param serverSideTokenCheck TRUE if server-side token validation is enabled for the identity
     *   provider’s token. After you set the `ServerSideTokenCheck` to TRUE for an identity pool,
     *   that identity pool checks with the integrated user pools to make sure the user has not been
     *   globally signed out or deleted before the identity pool provides an OIDC token or AWS
     *   credentials for the user.
     *
     * If the user is signed out or deleted, the identity pool returns a 400 Not Authorized error.
     */
    public fun serverSideTokenCheck(serverSideTokenCheck: Boolean) {
        cdkBuilder.serverSideTokenCheck(serverSideTokenCheck)
    }

    /**
     * @param serverSideTokenCheck TRUE if server-side token validation is enabled for the identity
     *   provider’s token. After you set the `ServerSideTokenCheck` to TRUE for an identity pool,
     *   that identity pool checks with the integrated user pools to make sure the user has not been
     *   globally signed out or deleted before the identity pool provides an OIDC token or AWS
     *   credentials for the user.
     *
     * If the user is signed out or deleted, the identity pool returns a 400 Not Authorized error.
     */
    public fun serverSideTokenCheck(serverSideTokenCheck: IResolvable) {
        cdkBuilder.serverSideTokenCheck(serverSideTokenCheck)
    }

    public fun build(): CfnIdentityPool.CognitoIdentityProviderProperty = cdkBuilder.build()
}
