@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@CdkDslMarker
public class CfnConnectorProfileCustomConnectorProfileCredentialsPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.CustomConnectorProfileCredentialsProperty.Builder =
      CfnConnectorProfile.CustomConnectorProfileCredentialsProperty.builder()

  /**
   * @param apiKey The API keys required for the authentication of the user.
   */
  public fun apiKey(apiKey: IResolvable) {
    cdkBuilder.apiKey(apiKey)
  }

  /**
   * @param apiKey The API keys required for the authentication of the user.
   */
  public fun apiKey(apiKey: CfnConnectorProfile.ApiKeyCredentialsProperty) {
    cdkBuilder.apiKey(apiKey)
  }

  /**
   * @param authenticationType The authentication type that the custom connector uses for
   * authenticating while creating a connector profile. 
   */
  public fun authenticationType(authenticationType: String) {
    cdkBuilder.authenticationType(authenticationType)
  }

  /**
   * @param basic The basic credentials that are required for the authentication of the user.
   */
  public fun basic(basic: IResolvable) {
    cdkBuilder.basic(basic)
  }

  /**
   * @param basic The basic credentials that are required for the authentication of the user.
   */
  public fun basic(basic: CfnConnectorProfile.BasicAuthCredentialsProperty) {
    cdkBuilder.basic(basic)
  }

  /**
   * @param custom If the connector uses the custom authentication mechanism, this holds the
   * required credentials.
   */
  public fun custom(custom: IResolvable) {
    cdkBuilder.custom(custom)
  }

  /**
   * @param custom If the connector uses the custom authentication mechanism, this holds the
   * required credentials.
   */
  public fun custom(custom: CfnConnectorProfile.CustomAuthCredentialsProperty) {
    cdkBuilder.custom(custom)
  }

  /**
   * @param oauth2 The OAuth 2.0 credentials required for the authentication of the user.
   */
  public fun oauth2(oauth2: IResolvable) {
    cdkBuilder.oauth2(oauth2)
  }

  /**
   * @param oauth2 The OAuth 2.0 credentials required for the authentication of the user.
   */
  public fun oauth2(oauth2: CfnConnectorProfile.OAuth2CredentialsProperty) {
    cdkBuilder.oauth2(oauth2)
  }

  public fun build(): CfnConnectorProfile.CustomConnectorProfileCredentialsProperty =
      cdkBuilder.build()
}
