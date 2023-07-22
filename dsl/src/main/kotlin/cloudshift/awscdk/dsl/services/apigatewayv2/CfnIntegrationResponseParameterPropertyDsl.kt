@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigatewayv2.CfnIntegration

@CdkDslMarker
public class CfnIntegrationResponseParameterPropertyDsl {
  private val cdkBuilder: CfnIntegration.ResponseParameterProperty.Builder =
      CfnIntegration.ResponseParameterProperty.builder()

  /**
   * @param destination Specifies the location of the response to modify, and how to modify it. 
   * To learn more, see [Transforming API requests and
   * responses](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html)
   * .
   */
  public fun destination(destination: String) {
    cdkBuilder.destination(destination)
  }

  /**
   * @param source Specifies the data to update the parameter with. 
   * To learn more, see [Transforming API requests and
   * responses](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html)
   * .
   */
  public fun source(source: String) {
    cdkBuilder.source(source)
  }

  public fun build(): CfnIntegration.ResponseParameterProperty = cdkBuilder.build()
}
