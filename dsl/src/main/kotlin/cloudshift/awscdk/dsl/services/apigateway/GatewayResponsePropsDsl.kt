@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.apigateway.GatewayResponseProps
import software.amazon.awscdk.services.apigateway.IRestApi
import software.amazon.awscdk.services.apigateway.ResponseType

@CdkDslMarker
public class GatewayResponsePropsDsl {
  private val cdkBuilder: GatewayResponseProps.Builder = GatewayResponseProps.builder()

  public fun responseHeaders(responseHeaders: Map<String, String>) {
    cdkBuilder.responseHeaders(responseHeaders)
  }

  public fun restApi(restApi: IRestApi) {
    cdkBuilder.restApi(restApi)
  }

  public fun statusCode(statusCode: String) {
    cdkBuilder.statusCode(statusCode)
  }

  public fun templates(templates: Map<String, String>) {
    cdkBuilder.templates(templates)
  }

  public fun type(type: ResponseType) {
    cdkBuilder.type(type)
  }

  public fun build(): GatewayResponseProps = cdkBuilder.build()
}
