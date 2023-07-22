@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigatewayv2.CfnApi
import software.constructs.Construct

@CdkDslMarker
public class CfnApiDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnApi.Builder = CfnApi.Builder.create(scope, id)

  /**
   * An API key selection expression.
   *
   * Supported only for WebSocket APIs. See [API Key Selection
   * Expressions](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-apikeyselectionexpression)
   * @param apiKeySelectionExpression An API key selection expression. 
   */
  public fun apiKeySelectionExpression(apiKeySelectionExpression: String) {
    cdkBuilder.apiKeySelectionExpression(apiKeySelectionExpression)
  }

  /**
   * Specifies how to interpret the base path of the API during import.
   *
   * Valid values are `ignore` , `prepend` , and `split` . The default value is `ignore` . To learn
   * more, see [Set the OpenAPI basePath
   * Property](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-import-api-basePath.html)
   * . Supported only for HTTP APIs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-basepath)
   * @param basePath Specifies how to interpret the base path of the API during import. 
   */
  public fun basePath(basePath: String) {
    cdkBuilder.basePath(basePath)
  }

  /**
   * The OpenAPI definition.
   *
   * Supported only for HTTP APIs. To import an HTTP API, you must specify a `Body` or
   * `BodyS3Location` . If you specify a `Body` or `BodyS3Location` , don't specify CloudFormation
   * resources such as `AWS::ApiGatewayV2::Authorizer` or `AWS::ApiGatewayV2::Route` . API Gateway
   * doesn't support the combination of OpenAPI and CloudFormation resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-body)
   * @param body The OpenAPI definition. 
   */
  public fun body(body: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(body)
    cdkBuilder.body(builder.map)
  }

  /**
   * The OpenAPI definition.
   *
   * Supported only for HTTP APIs. To import an HTTP API, you must specify a `Body` or
   * `BodyS3Location` . If you specify a `Body` or `BodyS3Location` , don't specify CloudFormation
   * resources such as `AWS::ApiGatewayV2::Authorizer` or `AWS::ApiGatewayV2::Route` . API Gateway
   * doesn't support the combination of OpenAPI and CloudFormation resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-body)
   * @param body The OpenAPI definition. 
   */
  public fun body(body: Any) {
    cdkBuilder.body(body)
  }

  /**
   * The S3 location of an OpenAPI definition.
   *
   * Supported only for HTTP APIs. To import an HTTP API, you must specify a `Body` or
   * `BodyS3Location` . If you specify a `Body` or `BodyS3Location` , don't specify CloudFormation
   * resources such as `AWS::ApiGatewayV2::Authorizer` or `AWS::ApiGatewayV2::Route` . API Gateway
   * doesn't support the combination of OpenAPI and CloudFormation resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-bodys3location)
   * @param bodyS3Location The S3 location of an OpenAPI definition. 
   */
  public fun bodyS3Location(bodyS3Location: IResolvable) {
    cdkBuilder.bodyS3Location(bodyS3Location)
  }

  /**
   * The S3 location of an OpenAPI definition.
   *
   * Supported only for HTTP APIs. To import an HTTP API, you must specify a `Body` or
   * `BodyS3Location` . If you specify a `Body` or `BodyS3Location` , don't specify CloudFormation
   * resources such as `AWS::ApiGatewayV2::Authorizer` or `AWS::ApiGatewayV2::Route` . API Gateway
   * doesn't support the combination of OpenAPI and CloudFormation resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-bodys3location)
   * @param bodyS3Location The S3 location of an OpenAPI definition. 
   */
  public fun bodyS3Location(bodyS3Location: CfnApi.BodyS3LocationProperty) {
    cdkBuilder.bodyS3Location(bodyS3Location)
  }

  /**
   * A CORS configuration.
   *
   * Supported only for HTTP APIs. See [Configuring
   * CORS](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html) for more
   * information.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-corsconfiguration)
   * @param corsConfiguration A CORS configuration. 
   */
  public fun corsConfiguration(corsConfiguration: IResolvable) {
    cdkBuilder.corsConfiguration(corsConfiguration)
  }

  /**
   * A CORS configuration.
   *
   * Supported only for HTTP APIs. See [Configuring
   * CORS](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html) for more
   * information.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-corsconfiguration)
   * @param corsConfiguration A CORS configuration. 
   */
  public fun corsConfiguration(corsConfiguration: CfnApi.CorsProperty) {
    cdkBuilder.corsConfiguration(corsConfiguration)
  }

  /**
   * This property is part of quick create.
   *
   * It specifies the credentials required for the integration, if any. For a Lambda integration,
   * three options are available. To specify an IAM Role for API Gateway to assume, use the role's
   * Amazon Resource Name (ARN). To require that the caller's identity be passed through from the
   * request, specify `arn:aws:iam::*:user/ *` . To use resource-based permissions on supported AWS
   * services, specify `null` . Currently, this property is not used for HTTP integrations. Supported
   * only for HTTP APIs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-credentialsarn)
   * @param credentialsArn This property is part of quick create. 
   */
  public fun credentialsArn(credentialsArn: String) {
    cdkBuilder.credentialsArn(credentialsArn)
  }

  /**
   * The description of the API.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-description)
   * @param description The description of the API. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * Specifies whether clients can invoke your API by using the default `execute-api` endpoint.
   *
   * By default, clients can invoke your API with the default
   * https://{api_id}.execute-api.{region}.amazonaws.com endpoint. To require that clients use a custom
   * domain name to invoke your API, disable the default endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-disableexecuteapiendpoint)
   * @param disableExecuteApiEndpoint Specifies whether clients can invoke your API by using the
   * default `execute-api` endpoint. 
   */
  public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean) {
    cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
  }

  /**
   * Specifies whether clients can invoke your API by using the default `execute-api` endpoint.
   *
   * By default, clients can invoke your API with the default
   * https://{api_id}.execute-api.{region}.amazonaws.com endpoint. To require that clients use a custom
   * domain name to invoke your API, disable the default endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-disableexecuteapiendpoint)
   * @param disableExecuteApiEndpoint Specifies whether clients can invoke your API by using the
   * default `execute-api` endpoint. 
   */
  public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: IResolvable) {
    cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
  }

  /**
   * Avoid validating models when creating a deployment.
   *
   * Supported only for WebSocket APIs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-disableschemavalidation)
   * @param disableSchemaValidation Avoid validating models when creating a deployment. 
   */
  public fun disableSchemaValidation(disableSchemaValidation: Boolean) {
    cdkBuilder.disableSchemaValidation(disableSchemaValidation)
  }

  /**
   * Avoid validating models when creating a deployment.
   *
   * Supported only for WebSocket APIs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-disableschemavalidation)
   * @param disableSchemaValidation Avoid validating models when creating a deployment. 
   */
  public fun disableSchemaValidation(disableSchemaValidation: IResolvable) {
    cdkBuilder.disableSchemaValidation(disableSchemaValidation)
  }

  /**
   * Specifies whether to rollback the API creation when a warning is encountered.
   *
   * By default, API creation continues if a warning is encountered.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-failonwarnings)
   * @param failOnWarnings Specifies whether to rollback the API creation when a warning is
   * encountered. 
   */
  public fun failOnWarnings(failOnWarnings: Boolean) {
    cdkBuilder.failOnWarnings(failOnWarnings)
  }

  /**
   * Specifies whether to rollback the API creation when a warning is encountered.
   *
   * By default, API creation continues if a warning is encountered.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-failonwarnings)
   * @param failOnWarnings Specifies whether to rollback the API creation when a warning is
   * encountered. 
   */
  public fun failOnWarnings(failOnWarnings: IResolvable) {
    cdkBuilder.failOnWarnings(failOnWarnings)
  }

  /**
   * The name of the API.
   *
   * Required unless you specify an OpenAPI definition for `Body` or `S3BodyLocation` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-name)
   * @param name The name of the API. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The API protocol.
   *
   * Valid values are `WEBSOCKET` or `HTTP` . Required unless you specify an OpenAPI definition for
   * `Body` or `S3BodyLocation` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-protocoltype)
   * @param protocolType The API protocol. 
   */
  public fun protocolType(protocolType: String) {
    cdkBuilder.protocolType(protocolType)
  }

  /**
   * This property is part of quick create.
   *
   * If you don't specify a `routeKey` , a default route of `$default` is created. The `$default`
   * route acts as a catch-all for any request made to your API, for a particular stage. The `$default`
   * route key can't be modified. You can add routes after creating the API, and you can update the
   * route keys of additional routes. Supported only for HTTP APIs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-routekey)
   * @param routeKey This property is part of quick create. 
   */
  public fun routeKey(routeKey: String) {
    cdkBuilder.routeKey(routeKey)
  }

  /**
   * The route selection expression for the API.
   *
   * For HTTP APIs, the `routeSelectionExpression` must be `${request.method} ${request.path}` . If
   * not provided, this will be the default for HTTP APIs. This property is required for WebSocket
   * APIs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-routeselectionexpression)
   * @param routeSelectionExpression The route selection expression for the API. 
   */
  public fun routeSelectionExpression(routeSelectionExpression: String) {
    cdkBuilder.routeSelectionExpression(routeSelectionExpression)
  }

  /**
   * The collection of tags.
   *
   * Each tag element is associated with a given resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-tags)
   * @param tags The collection of tags. 
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  /**
   * This property is part of quick create.
   *
   * Quick create produces an API with an integration, a default catch-all route, and a default
   * stage which is configured to automatically deploy changes. For HTTP integrations, specify a fully
   * qualified URL. For Lambda integrations, specify a function ARN. The type of the integration will
   * be HTTP_PROXY or AWS_PROXY, respectively. Supported only for HTTP APIs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-target)
   * @param target This property is part of quick create. 
   */
  public fun target(target: String) {
    cdkBuilder.target(target)
  }

  /**
   * A version identifier for the API.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#cfn-apigatewayv2-api-version)
   * @param version A version identifier for the API. 
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnApi = cdkBuilder.build()
}
