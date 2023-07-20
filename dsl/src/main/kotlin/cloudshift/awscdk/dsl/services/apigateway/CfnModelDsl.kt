@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnModel
import software.constructs.Construct

@CdkDslMarker
public class CfnModelDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnModel.Builder = CfnModel.Builder.create(scope, id)

  public fun contentType(contentType: String) {
    cdkBuilder.contentType(contentType)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun restApiId(restApiId: String) {
    cdkBuilder.restApiId(restApiId)
  }

  public fun schema(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.schema(builder.map)
  }

  public fun schema(schema: Any) {
    cdkBuilder.schema(schema)
  }

  public fun build(): CfnModel = cdkBuilder.build()
}
