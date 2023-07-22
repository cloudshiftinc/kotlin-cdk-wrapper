@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opensearchserverless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig

@CdkDslMarker
public class CfnSecurityConfigSamlConfigOptionsPropertyDsl {
  private val cdkBuilder: CfnSecurityConfig.SamlConfigOptionsProperty.Builder =
      CfnSecurityConfig.SamlConfigOptionsProperty.builder()

  /**
   * @param groupAttribute The group attribute for this SAML integration.
   */
  public fun groupAttribute(groupAttribute: String) {
    cdkBuilder.groupAttribute(groupAttribute)
  }

  /**
   * @param metadata The XML IdP metadata file generated from your identity provider. 
   */
  public fun metadata(metadata: String) {
    cdkBuilder.metadata(metadata)
  }

  /**
   * @param sessionTimeout The session timeout, in minutes.
   * Default is 60 minutes (12 hours).
   */
  public fun sessionTimeout(sessionTimeout: Number) {
    cdkBuilder.sessionTimeout(sessionTimeout)
  }

  /**
   * @param userAttribute A user attribute for this SAML integration.
   */
  public fun userAttribute(userAttribute: String) {
    cdkBuilder.userAttribute(userAttribute)
  }

  public fun build(): CfnSecurityConfig.SamlConfigOptionsProperty = cdkBuilder.build()
}
