@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnModel
import software.constructs.Construct

/**
 * The `AWS::ApiGatewayV2::Model` resource updates data model for a WebSocket API.
 *
 * For more information, see [Model Selection
 * Expressions](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-model-selection-expressions)
 * in the *API Gateway Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * Object schema;
 * CfnModel cfnModel = CfnModel.Builder.create(this, "MyCfnModel")
 * .apiId("apiId")
 * .name("name")
 * .schema(schema)
 * // the properties below are optional
 * .contentType("contentType")
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-model.html)
 */
@CdkDslMarker
public class CfnModelDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnModel.Builder = CfnModel.Builder.create(scope, id)

  /**
   * The API identifier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-model.html#cfn-apigatewayv2-model-apiid)
   * @param apiId The API identifier. 
   */
  public fun apiId(apiId: String) {
    cdkBuilder.apiId(apiId)
  }

  /**
   * The content-type for the model, for example, "application/json".
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-model.html#cfn-apigatewayv2-model-contenttype)
   * @param contentType The content-type for the model, for example, "application/json". 
   */
  public fun contentType(contentType: String) {
    cdkBuilder.contentType(contentType)
  }

  /**
   * The description of the model.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-model.html#cfn-apigatewayv2-model-description)
   * @param description The description of the model. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The name of the model.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-model.html#cfn-apigatewayv2-model-name)
   * @param name The name of the model. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The schema for the model.
   *
   * For application/json models, this should be JSON schema draft 4 model.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-model.html#cfn-apigatewayv2-model-schema)
   * @param schema The schema for the model. 
   */
  public fun schema(schema: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(schema)
    cdkBuilder.schema(builder.map)
  }

  /**
   * The schema for the model.
   *
   * For application/json models, this should be JSON schema draft 4 model.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-model.html#cfn-apigatewayv2-model-schema)
   * @param schema The schema for the model. 
   */
  public fun schema(schema: Any) {
    cdkBuilder.schema(schema)
  }

  public fun build(): CfnModel = cdkBuilder.build()
}
