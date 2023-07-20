@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.apigateway.IModel
import software.amazon.awscdk.services.apigateway.MethodResponse

@CdkDslMarker
public class MethodResponseDsl {
  private val cdkBuilder: MethodResponse.Builder = MethodResponse.builder()

  public fun responseModels(responseModels: Map<String, IModel>) {
    cdkBuilder.responseModels(responseModels)
  }

  public fun responseParameters(responseParameters: Map<String, Boolean>) {
    cdkBuilder.responseParameters(responseParameters)
  }

  public fun statusCode(statusCode: String) {
    cdkBuilder.statusCode(statusCode)
  }

  public fun build(): MethodResponse = cdkBuilder.build()
}
