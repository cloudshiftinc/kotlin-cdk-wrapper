@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.alexa.ask

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.alexa.ask.CfnSkill

@CdkDslMarker
public class CfnSkillAuthenticationConfigurationPropertyDsl {
  private val cdkBuilder: CfnSkill.AuthenticationConfigurationProperty.Builder =
      CfnSkill.AuthenticationConfigurationProperty.builder()

  /**
   * @param clientId Client ID from Login with Amazon (LWA). 
   */
  public fun clientId(clientId: String) {
    cdkBuilder.clientId(clientId)
  }

  /**
   * @param clientSecret Client secret from Login with Amazon (LWA). 
   */
  public fun clientSecret(clientSecret: String) {
    cdkBuilder.clientSecret(clientSecret)
  }

  /**
   * @param refreshToken Refresh token from Login with Amazon (LWA). 
   * This token is secret.
   */
  public fun refreshToken(refreshToken: String) {
    cdkBuilder.refreshToken(refreshToken)
  }

  public fun build(): CfnSkill.AuthenticationConfigurationProperty = cdkBuilder.build()
}
