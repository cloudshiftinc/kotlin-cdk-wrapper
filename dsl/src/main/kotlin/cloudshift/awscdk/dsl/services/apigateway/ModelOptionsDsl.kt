@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.JsonSchema
import software.amazon.awscdk.services.apigateway.ModelOptions

@CdkDslMarker
public class ModelOptionsDsl {
  private val cdkBuilder: ModelOptions.Builder = ModelOptions.builder()

  /**
   * @param contentType The content type for the model.
   * You can also force a
   * content type in the request or response model mapping.
   */
  public fun contentType(contentType: String) {
    cdkBuilder.contentType(contentType)
  }

  /**
   * @param description A description that identifies this model.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param modelName A name for the model.
   * Important
   * If you specify a name, you cannot perform updates that
   * require replacement of this resource. You can perform
   * updates that require no or some interruption. If you
   * must replace the resource, specify a new name.
   */
  public fun modelName(modelName: String) {
    cdkBuilder.modelName(modelName)
  }

  /**
   * @param schema The schema to use to transform data to one or more output formats. 
   * Specify null ({}) if you don't want to specify a schema.
   */
  public fun schema(schema: JsonSchemaDsl.() -> Unit = {}) {
    val builder = JsonSchemaDsl()
    builder.apply(schema)
    cdkBuilder.schema(builder.build())
  }

  /**
   * @param schema The schema to use to transform data to one or more output formats. 
   * Specify null ({}) if you don't want to specify a schema.
   */
  public fun schema(schema: JsonSchema) {
    cdkBuilder.schema(schema)
  }

  public fun build(): ModelOptions = cdkBuilder.build()
}
