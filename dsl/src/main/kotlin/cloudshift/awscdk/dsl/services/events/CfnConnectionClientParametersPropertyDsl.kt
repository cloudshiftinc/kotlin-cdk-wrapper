@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.CfnConnection

@CdkDslMarker
public class CfnConnectionClientParametersPropertyDsl {
  private val cdkBuilder: CfnConnection.ClientParametersProperty.Builder =
      CfnConnection.ClientParametersProperty.builder()

  public fun clientId(clientId: String) {
    cdkBuilder.clientId(clientId)
  }

  public fun clientSecret(clientSecret: String) {
    cdkBuilder.clientSecret(clientSecret)
  }

  public fun build(): CfnConnection.ClientParametersProperty = cdkBuilder.build()
}
