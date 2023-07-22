@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.apigatewayv2.CfnAuthorizer

@CdkDslMarker
public class CfnAuthorizerJWTConfigurationPropertyDsl {
  private val cdkBuilder: CfnAuthorizer.JWTConfigurationProperty.Builder =
      CfnAuthorizer.JWTConfigurationProperty.builder()

  private val _audience: MutableList<String> = mutableListOf()

  /**
   * @param audience A list of the intended recipients of the JWT.
   * A valid JWT must provide an `aud` that matches at least one entry in this list. See [RFC
   * 7519](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc7519#section-4.1.3) . Required
   * for the `JWT` authorizer type. Supported only for HTTP APIs.
   */
  public fun audience(vararg audience: String) {
    _audience.addAll(listOf(*audience))
  }

  /**
   * @param audience A list of the intended recipients of the JWT.
   * A valid JWT must provide an `aud` that matches at least one entry in this list. See [RFC
   * 7519](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc7519#section-4.1.3) . Required
   * for the `JWT` authorizer type. Supported only for HTTP APIs.
   */
  public fun audience(audience: Collection<String>) {
    _audience.addAll(audience)
  }

  /**
   * @param issuer The base domain of the identity provider that issues JSON Web Tokens.
   * For example, an Amazon Cognito user pool has the following format: `https://cognito-idp.
   * {region} .amazonaws.com/ {userPoolId}` . Required for the `JWT` authorizer type. Supported only
   * for HTTP APIs.
   */
  public fun issuer(issuer: String) {
    cdkBuilder.issuer(issuer)
  }

  public fun build(): CfnAuthorizer.JWTConfigurationProperty {
    if(_audience.isNotEmpty()) cdkBuilder.audience(_audience)
    return cdkBuilder.build()
  }
}
