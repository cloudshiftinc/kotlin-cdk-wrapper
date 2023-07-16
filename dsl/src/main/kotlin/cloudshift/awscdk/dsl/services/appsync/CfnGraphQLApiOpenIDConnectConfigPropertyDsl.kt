@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnGraphQLApi

@CdkDslMarker
public class CfnGraphQLApiOpenIDConnectConfigPropertyDsl {
  private val cdkBuilder: CfnGraphQLApi.OpenIDConnectConfigProperty.Builder =
      CfnGraphQLApi.OpenIDConnectConfigProperty.builder()

  public fun authTtl(authTtl: Number) {
    cdkBuilder.authTtl(authTtl)
  }

  public fun clientId(clientId: String) {
    cdkBuilder.clientId(clientId)
  }

  public fun iatTtl(iatTtl: Number) {
    cdkBuilder.iatTtl(iatTtl)
  }

  public fun issuer(issuer: String) {
    cdkBuilder.issuer(issuer)
  }

  public fun build(): CfnGraphQLApi.OpenIDConnectConfigProperty = cdkBuilder.build()
}
