@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnApi

@CdkDslMarker
public class CfnApiCorsConfigurationPropertyDsl {
  private val cdkBuilder: CfnApi.CorsConfigurationProperty.Builder =
      CfnApi.CorsConfigurationProperty.builder()

  public fun allowCredentials(allowCredentials: Boolean) {
    cdkBuilder.allowCredentials(allowCredentials)
  }

  public fun allowCredentials(allowCredentials: IResolvable) {
    cdkBuilder.allowCredentials(allowCredentials)
  }

  public fun allowHeaders(allowHeaders: String) {
    cdkBuilder.allowHeaders(allowHeaders)
  }

  public fun allowMethods(allowMethods: String) {
    cdkBuilder.allowMethods(allowMethods)
  }

  public fun allowOrigin(allowOrigin: String) {
    cdkBuilder.allowOrigin(allowOrigin)
  }

  public fun maxAge(maxAge: String) {
    cdkBuilder.maxAge(maxAge)
  }

  public fun build(): CfnApi.CorsConfigurationProperty = cdkBuilder.build()
}
