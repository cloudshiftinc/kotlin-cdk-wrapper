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

  public fun clientId(clientId: String) {
    cdkBuilder.clientId(clientId)
  }

  public fun providerName(providerName: String) {
    cdkBuilder.providerName(providerName)
  }

  public fun serverSideTokenCheck(serverSideTokenCheck: Boolean) {
    cdkBuilder.serverSideTokenCheck(serverSideTokenCheck)
  }

  public fun serverSideTokenCheck(serverSideTokenCheck: IResolvable) {
    cdkBuilder.serverSideTokenCheck(serverSideTokenCheck)
  }

  public fun build(): CfnIdentityPool.CognitoIdentityProviderProperty = cdkBuilder.build()
}
