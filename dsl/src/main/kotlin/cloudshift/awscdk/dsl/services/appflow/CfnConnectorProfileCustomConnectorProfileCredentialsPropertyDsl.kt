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

  public fun apiKey(apiKey: IResolvable) {
    cdkBuilder.apiKey(apiKey)
  }

  public fun apiKey(apiKey: CfnConnectorProfile.ApiKeyCredentialsProperty) {
    cdkBuilder.apiKey(apiKey)
  }

  public fun authenticationType(authenticationType: String) {
    cdkBuilder.authenticationType(authenticationType)
  }

  public fun basic(basic: IResolvable) {
    cdkBuilder.basic(basic)
  }

  public fun basic(basic: CfnConnectorProfile.BasicAuthCredentialsProperty) {
    cdkBuilder.basic(basic)
  }

  public fun custom(custom: IResolvable) {
    cdkBuilder.custom(custom)
  }

  public fun custom(custom: CfnConnectorProfile.CustomAuthCredentialsProperty) {
    cdkBuilder.custom(custom)
  }

  public fun oauth2(oauth2: IResolvable) {
    cdkBuilder.oauth2(oauth2)
  }

  public fun oauth2(oauth2: CfnConnectorProfile.OAuth2CredentialsProperty) {
    cdkBuilder.oauth2(oauth2)
  }

  public fun build(): CfnConnectorProfile.CustomConnectorProfileCredentialsProperty =
      cdkBuilder.build()
}
