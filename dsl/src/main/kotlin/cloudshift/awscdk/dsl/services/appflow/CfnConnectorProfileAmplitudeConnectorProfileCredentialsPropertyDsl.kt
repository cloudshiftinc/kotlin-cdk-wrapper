@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@CdkDslMarker
public class CfnConnectorProfileAmplitudeConnectorProfileCredentialsPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.AmplitudeConnectorProfileCredentialsProperty.Builder =
      CfnConnectorProfile.AmplitudeConnectorProfileCredentialsProperty.builder()

  public fun apiKey(apiKey: String) {
    cdkBuilder.apiKey(apiKey)
  }

  public fun secretKey(secretKey: String) {
    cdkBuilder.secretKey(secretKey)
  }

  public fun build(): CfnConnectorProfile.AmplitudeConnectorProfileCredentialsProperty =
      cdkBuilder.build()
}
