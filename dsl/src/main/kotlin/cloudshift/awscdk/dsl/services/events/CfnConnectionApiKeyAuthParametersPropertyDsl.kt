@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.CfnConnection

@CdkDslMarker
public class CfnConnectionApiKeyAuthParametersPropertyDsl {
  private val cdkBuilder: CfnConnection.ApiKeyAuthParametersProperty.Builder =
      CfnConnection.ApiKeyAuthParametersProperty.builder()

  /**
   * @param apiKeyName The name of the API key to use for authorization. 
   */
  public fun apiKeyName(apiKeyName: String) {
    cdkBuilder.apiKeyName(apiKeyName)
  }

  /**
   * @param apiKeyValue The value for the API key to use for authorization. 
   */
  public fun apiKeyValue(apiKeyValue: String) {
    cdkBuilder.apiKeyValue(apiKeyValue)
  }

  public fun build(): CfnConnection.ApiKeyAuthParametersProperty = cdkBuilder.build()
}
