@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.IRestApi
import software.amazon.awscdk.services.apigateway.JsonSchema
import software.amazon.awscdk.services.apigateway.Model
import software.constructs.Construct

@CdkDslMarker
public class ModelDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Model.Builder = Model.Builder.create(scope, id)

  public fun contentType(contentType: String) {
    cdkBuilder.contentType(contentType)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun modelName(modelName: String) {
    cdkBuilder.modelName(modelName)
  }

  public fun restApi(restApi: IRestApi) {
    cdkBuilder.restApi(restApi)
  }

  public fun schema(block: JsonSchemaDsl.() -> Unit = {}) {
    val builder = JsonSchemaDsl()
    builder.apply(block)
    cdkBuilder.schema(builder.build())
  }

  public fun schema(schema: JsonSchema) {
    cdkBuilder.schema(schema)
  }

  public fun build(): Model = cdkBuilder.build()
}
