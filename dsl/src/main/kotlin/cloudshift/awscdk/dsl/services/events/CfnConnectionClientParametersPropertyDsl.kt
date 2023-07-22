@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.CfnConnection

@CdkDslMarker
public class CfnConnectionClientParametersPropertyDsl {
  private val cdkBuilder: CfnConnection.ClientParametersProperty.Builder =
      CfnConnection.ClientParametersProperty.builder()

  /**
   * @param clientId The client ID to use for OAuth authorization. 
   */
  public fun clientId(clientId: String) {
    cdkBuilder.clientId(clientId)
  }

  /**
   * @param clientSecret The client secret assciated with the client ID to use for OAuth
   * authorization. 
   */
  public fun clientSecret(clientSecret: String) {
    cdkBuilder.clientSecret(clientSecret)
  }

  public fun build(): CfnConnection.ClientParametersProperty = cdkBuilder.build()
}
