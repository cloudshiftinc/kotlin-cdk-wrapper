@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnIdentityPool

@CdkDslMarker
public class CfnIdentityPoolCognitoIdentityProviderPropertyDsl {
  private val cdkBuilder: CfnIdentityPool.CognitoIdentityProviderProperty.Builder =
      CfnIdentityPool.CognitoIdentityProviderProperty.builder()

  /**
   * @param clientId The client ID for the Amazon Cognito user pool.
   */
  public fun clientId(clientId: String) {
    cdkBuilder.clientId(clientId)
  }

  /**
   * @param providerName The provider name for an Amazon Cognito user pool.
   * For example: `cognito-idp.us-east-2.amazonaws.com/us-east-2_123456789` .
   */
  public fun providerName(providerName: String) {
    cdkBuilder.providerName(providerName)
  }

  /**
   * @param serverSideTokenCheck TRUE if server-side token validation is enabled for the identity
   * provider’s token.
   * After you set the `ServerSideTokenCheck` to TRUE for an identity pool, that identity pool
   * checks with the integrated user pools to make sure the user has not been globally signed out or
   * deleted before the identity pool provides an OIDC token or AWS credentials for the user.
   *
   * If the user is signed out or deleted, the identity pool returns a 400 Not Authorized error.
   */
  public fun serverSideTokenCheck(serverSideTokenCheck: Boolean) {
    cdkBuilder.serverSideTokenCheck(serverSideTokenCheck)
  }

  /**
   * @param serverSideTokenCheck TRUE if server-side token validation is enabled for the identity
   * provider’s token.
   * After you set the `ServerSideTokenCheck` to TRUE for an identity pool, that identity pool
   * checks with the integrated user pools to make sure the user has not been globally signed out or
   * deleted before the identity pool provides an OIDC token or AWS credentials for the user.
   *
   * If the user is signed out or deleted, the identity pool returns a 400 Not Authorized error.
   */
  public fun serverSideTokenCheck(serverSideTokenCheck: IResolvable) {
    cdkBuilder.serverSideTokenCheck(serverSideTokenCheck)
  }

  public fun build(): CfnIdentityPool.CognitoIdentityProviderProperty = cdkBuilder.build()
}
