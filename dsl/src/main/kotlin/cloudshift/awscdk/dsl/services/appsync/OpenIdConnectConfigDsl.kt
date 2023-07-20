@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.appsync.OpenIdConnectConfig

@CdkDslMarker
public class OpenIdConnectConfigDsl {
  private val cdkBuilder: OpenIdConnectConfig.Builder = OpenIdConnectConfig.builder()

  public fun clientId(clientId: String) {
    cdkBuilder.clientId(clientId)
  }

  public fun oidcProvider(oidcProvider: String) {
    cdkBuilder.oidcProvider(oidcProvider)
  }

  public fun tokenExpiryFromAuth(tokenExpiryFromAuth: Number) {
    cdkBuilder.tokenExpiryFromAuth(tokenExpiryFromAuth)
  }

  public fun tokenExpiryFromIssue(tokenExpiryFromIssue: Number) {
    cdkBuilder.tokenExpiryFromIssue(tokenExpiryFromIssue)
  }

  public fun build(): OpenIdConnectConfig = cdkBuilder.build()
}
