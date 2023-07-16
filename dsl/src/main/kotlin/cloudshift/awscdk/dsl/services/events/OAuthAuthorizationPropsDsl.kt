@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.events.HttpMethod
import software.amazon.awscdk.services.events.HttpParameter
import software.amazon.awscdk.services.events.OAuthAuthorizationProps

@CdkDslMarker
public class OAuthAuthorizationPropsDsl {
  private val cdkBuilder: OAuthAuthorizationProps.Builder = OAuthAuthorizationProps.builder()

  public fun authorizationEndpoint(authorizationEndpoint: String) {
    cdkBuilder.authorizationEndpoint(authorizationEndpoint)
  }

  public fun bodyParameters(bodyParameters: Map<String, out HttpParameter>) {
    cdkBuilder.bodyParameters(bodyParameters)
  }

  public fun clientId(clientId: String) {
    cdkBuilder.clientId(clientId)
  }

  public fun clientSecret(clientSecret: SecretValue) {
    cdkBuilder.clientSecret(clientSecret)
  }

  public fun headerParameters(headerParameters: Map<String, out HttpParameter>) {
    cdkBuilder.headerParameters(headerParameters)
  }

  public fun httpMethod(httpMethod: HttpMethod) {
    cdkBuilder.httpMethod(httpMethod)
  }

  public fun queryStringParameters(queryStringParameters: Map<String, out HttpParameter>) {
    cdkBuilder.queryStringParameters(queryStringParameters)
  }

  public fun build(): OAuthAuthorizationProps = cdkBuilder.build()
}
