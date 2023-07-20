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

  public fun audience(vararg audience: String) {
    _audience.addAll(listOf(*audience))
  }

  public fun audience(audience: Collection<String>) {
    _audience.addAll(audience)
  }

  public fun issuer(issuer: String) {
    cdkBuilder.issuer(issuer)
  }

  public fun build(): CfnAuthorizer.JWTConfigurationProperty {
    if(_audience.isNotEmpty()) cdkBuilder.audience(_audience)
    return cdkBuilder.build()
  }
}
