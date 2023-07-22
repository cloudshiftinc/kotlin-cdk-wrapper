@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigatewayv2.CfnApiMappingProps

@CdkDslMarker
public class CfnApiMappingPropsDsl {
  private val cdkBuilder: CfnApiMappingProps.Builder = CfnApiMappingProps.builder()

  /**
   * @param apiId The identifier of the API. 
   */
  public fun apiId(apiId: String) {
    cdkBuilder.apiId(apiId)
  }

  /**
   * @param apiMappingKey The API mapping key.
   */
  public fun apiMappingKey(apiMappingKey: String) {
    cdkBuilder.apiMappingKey(apiMappingKey)
  }

  /**
   * @param domainName The domain name. 
   */
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  /**
   * @param stage The API stage. 
   */
  public fun stage(stage: String) {
    cdkBuilder.stage(stage)
  }

  public fun build(): CfnApiMappingProps = cdkBuilder.build()
}
