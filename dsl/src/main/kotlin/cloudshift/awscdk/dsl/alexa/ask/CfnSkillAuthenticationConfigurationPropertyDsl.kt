@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.alexa.ask

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.alexa.ask.CfnSkill

/**
 * The `AuthenticationConfiguration` property type specifies the Login with Amazon (LWA)
 * configuration used to authenticate with the Alexa service.
 *
 * Only Login with Amazon security profiles created through the  are supported for authentication. A
 * client ID, client secret, and refresh token are required. You can generate a client ID and client
 * secret by creating a new  on the Amazon Developer Portal or you can retrieve them from an existing
 * profile. You can then retrieve the refresh token using the Alexa Skills Kit CLI. For instructions,
 * see  in the  .
 *
 * `AuthenticationConfiguration` is a property of the `Alexa::ASK::Skill` resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.alexa.ask.*;
 * AuthenticationConfigurationProperty authenticationConfigurationProperty =
 * AuthenticationConfigurationProperty.builder()
 * .clientId("clientId")
 * .clientSecret("clientSecret")
 * .refreshToken("refreshToken")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ask-skill-authenticationconfiguration.html)
 */
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
