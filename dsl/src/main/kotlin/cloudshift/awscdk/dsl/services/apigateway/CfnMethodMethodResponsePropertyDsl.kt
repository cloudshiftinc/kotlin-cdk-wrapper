@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnMethod

@CdkDslMarker
public class CfnMethodMethodResponsePropertyDsl {
  private val cdkBuilder: CfnMethod.MethodResponseProperty.Builder =
      CfnMethod.MethodResponseProperty.builder()

  public fun responseModels(responseModels: Map<String, String>) {
    cdkBuilder.responseModels(responseModels)
  }

  public fun responseModels(responseModels: IResolvable) {
    cdkBuilder.responseModels(responseModels)
  }

  public fun responseParameters(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.responseParameters(builder.map)
  }

  public fun responseParameters(responseParameters: Map<String, Any>) {
    cdkBuilder.responseParameters(responseParameters)
  }

  public fun responseParameters(responseParameters: IResolvable) {
    cdkBuilder.responseParameters(responseParameters)
  }

  public fun statusCode(statusCode: String) {
    cdkBuilder.statusCode(statusCode)
  }

  public fun build(): CfnMethod.MethodResponseProperty = cdkBuilder.build()
}
