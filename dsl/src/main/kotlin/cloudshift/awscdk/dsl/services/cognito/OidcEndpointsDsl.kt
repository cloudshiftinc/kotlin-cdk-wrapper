@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.OidcEndpoints

@CdkDslMarker
public class OidcEndpointsDsl {
  private val cdkBuilder: OidcEndpoints.Builder = OidcEndpoints.builder()

  public fun authorization(authorization: String) {
    cdkBuilder.authorization(authorization)
  }

  public fun jwksUri(jwksUri: String) {
    cdkBuilder.jwksUri(jwksUri)
  }

  public fun token(token: String) {
    cdkBuilder.token(token)
  }

  public fun userInfo(userInfo: String) {
    cdkBuilder.userInfo(userInfo)
  }

  public fun build(): OidcEndpoints = cdkBuilder.build()
}
