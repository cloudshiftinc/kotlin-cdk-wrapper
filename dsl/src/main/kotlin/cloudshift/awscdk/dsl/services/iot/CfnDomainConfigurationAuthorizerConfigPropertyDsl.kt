@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnDomainConfiguration

@CdkDslMarker
public class CfnDomainConfigurationAuthorizerConfigPropertyDsl {
  private val cdkBuilder: CfnDomainConfiguration.AuthorizerConfigProperty.Builder =
      CfnDomainConfiguration.AuthorizerConfigProperty.builder()

  /**
   * @param allowAuthorizerOverride A Boolean that specifies whether the domain configuration's
   * authorization service can be overridden.
   */
  public fun allowAuthorizerOverride(allowAuthorizerOverride: Boolean) {
    cdkBuilder.allowAuthorizerOverride(allowAuthorizerOverride)
  }

  /**
   * @param allowAuthorizerOverride A Boolean that specifies whether the domain configuration's
   * authorization service can be overridden.
   */
  public fun allowAuthorizerOverride(allowAuthorizerOverride: IResolvable) {
    cdkBuilder.allowAuthorizerOverride(allowAuthorizerOverride)
  }

  /**
   * @param defaultAuthorizerName The name of the authorization service for a domain configuration.
   */
  public fun defaultAuthorizerName(defaultAuthorizerName: String) {
    cdkBuilder.defaultAuthorizerName(defaultAuthorizerName)
  }

  public fun build(): CfnDomainConfiguration.AuthorizerConfigProperty = cdkBuilder.build()
}
