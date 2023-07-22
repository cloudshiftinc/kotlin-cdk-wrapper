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
import software.amazon.awscdk.services.apigatewayv2.CfnApiProps

/**
 * Properties for defining a `CfnApi`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * Object body;
 * CfnApiProps cfnApiProps = CfnApiProps.builder()
 * .apiKeySelectionExpression("apiKeySelectionExpression")
 * .basePath("basePath")
 * .body(body)
 * .bodyS3Location(BodyS3LocationProperty.builder()
 * .bucket("bucket")
 * .etag("etag")
 * .key("key")
 * .version("version")
 * .build())
 * .corsConfiguration(CorsProperty.builder()
 * .allowCredentials(false)
 * .allowHeaders(List.of("allowHeaders"))
 * .allowMethods(List.of("allowMethods"))
 * .allowOrigins(List.of("allowOrigins"))
 * .exposeHeaders(List.of("exposeHeaders"))
 * .maxAge(123)
 * .build())
 * .credentialsArn("credentialsArn")
 * .description("description")
 * .disableExecuteApiEndpoint(false)
 * .disableSchemaValidation(false)
 * .failOnWarnings(false)
 * .name("name")
 * .protocolType("protocolType")
 * .routeKey("routeKey")
 * .routeSelectionExpression("routeSelectionExpression")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .target("target")
 * .version("version")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html)
 */
@CdkDslMarker
public class CfnApiPropsDsl {
  private val cdkBuilder: CfnApiProps.Builder = CfnApiProps.builder()

  /**
   * @param apiKeySelectionExpression An API key selection expression.
   * Supported only for WebSocket APIs. See [API Key Selection
   * Expressions](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions)
   * .
   */
  public fun apiKeySelectionExpression(apiKeySelectionExpression: String) {
    cdkBuilder.apiKeySelectionExpression(apiKeySelectionExpression)
  }

  /**
   * @param basePath Specifies how to interpret the base path of the API during import.
   * Valid values are `ignore` , `prepend` , and `split` . The default value is `ignore` . To learn
   * more, see [Set the OpenAPI basePath
   * Property](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-import-api-basePath.html)
   * . Supported only for HTTP APIs.
   */
  public fun basePath(basePath: String) {
    cdkBuilder.basePath(basePath)
  }

  /**
   * @param body The OpenAPI definition.
   * Supported only for HTTP APIs. To import an HTTP API, you must specify a `Body` or
   * `BodyS3Location` . If you specify a `Body` or `BodyS3Location` , don't specify CloudFormation
   * resources such as `AWS::ApiGatewayV2::Authorizer` or `AWS::ApiGatewayV2::Route` . API Gateway
   * doesn't support the combination of OpenAPI and CloudFormation resources.
   */
  public fun body(body: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(body)
    cdkBuilder.body(builder.map)
  }

  /**
   * @param body The OpenAPI definition.
   * Supported only for HTTP APIs. To import an HTTP API, you must specify a `Body` or
   * `BodyS3Location` . If you specify a `Body` or `BodyS3Location` , don't specify CloudFormation
   * resources such as `AWS::ApiGatewayV2::Authorizer` or `AWS::ApiGatewayV2::Route` . API Gateway
   * doesn't support the combination of OpenAPI and CloudFormation resources.
   */
  public fun body(body: Any) {
    cdkBuilder.body(body)
  }

  /**
   * @param bodyS3Location The S3 location of an OpenAPI definition.
   * Supported only for HTTP APIs. To import an HTTP API, you must specify a `Body` or
   * `BodyS3Location` . If you specify a `Body` or `BodyS3Location` , don't specify CloudFormation
   * resources such as `AWS::ApiGatewayV2::Authorizer` or `AWS::ApiGatewayV2::Route` . API Gateway
   * doesn't support the combination of OpenAPI and CloudFormation resources.
   */
  public fun bodyS3Location(bodyS3Location: IResolvable) {
    cdkBuilder.bodyS3Location(bodyS3Location)
  }

  /**
   * @param bodyS3Location The S3 location of an OpenAPI definition.
   * Supported only for HTTP APIs. To import an HTTP API, you must specify a `Body` or
   * `BodyS3Location` . If you specify a `Body` or `BodyS3Location` , don't specify CloudFormation
   * resources such as `AWS::ApiGatewayV2::Authorizer` or `AWS::ApiGatewayV2::Route` . API Gateway
   * doesn't support the combination of OpenAPI and CloudFormation resources.
   */
  public fun bodyS3Location(bodyS3Location: CfnApi.BodyS3LocationProperty) {
    cdkBuilder.bodyS3Location(bodyS3Location)
  }

  /**
   * @param corsConfiguration A CORS configuration.
   * Supported only for HTTP APIs. See [Configuring
   * CORS](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html) for more
   * information.
   */
  public fun corsConfiguration(corsConfiguration: IResolvable) {
    cdkBuilder.corsConfiguration(corsConfiguration)
  }

  /**
   * @param corsConfiguration A CORS configuration.
   * Supported only for HTTP APIs. See [Configuring
   * CORS](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html) for more
   * information.
   */
  public fun corsConfiguration(corsConfiguration: CfnApi.CorsProperty) {
    cdkBuilder.corsConfiguration(corsConfiguration)
  }

  /**
   * @param credentialsArn This property is part of quick create.
   * It specifies the credentials required for the integration, if any. For a Lambda integration,
   * three options are available. To specify an IAM Role for API Gateway to assume, use the role's
   * Amazon Resource Name (ARN). To require that the caller's identity be passed through from the
   * request, specify `arn:aws:iam::*:user/ *` . To use resource-based permissions on supported AWS
   * services, specify `null` . Currently, this property is not used for HTTP integrations. Supported
   * only for HTTP APIs.
   */
  public fun credentialsArn(credentialsArn: String) {
    cdkBuilder.credentialsArn(credentialsArn)
  }

  /**
   * @param description The description of the API.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param disableExecuteApiEndpoint Specifies whether clients can invoke your API by using the
   * default `execute-api` endpoint.
   * By default, clients can invoke your API with the default
   * https://{api_id}.execute-api.{region}.amazonaws.com endpoint. To require that clients use a custom
   * domain name to invoke your API, disable the default endpoint.
   */
  public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean) {
    cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
  }

  /**
   * @param disableExecuteApiEndpoint Specifies whether clients can invoke your API by using the
   * default `execute-api` endpoint.
   * By default, clients can invoke your API with the default
   * https://{api_id}.execute-api.{region}.amazonaws.com endpoint. To require that clients use a custom
   * domain name to invoke your API, disable the default endpoint.
   */
  public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: IResolvable) {
    cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
  }

  /**
   * @param disableSchemaValidation Avoid validating models when creating a deployment.
   * Supported only for WebSocket APIs.
   */
  public fun disableSchemaValidation(disableSchemaValidation: Boolean) {
    cdkBuilder.disableSchemaValidation(disableSchemaValidation)
  }

  /**
   * @param disableSchemaValidation Avoid validating models when creating a deployment.
   * Supported only for WebSocket APIs.
   */
  public fun disableSchemaValidation(disableSchemaValidation: IResolvable) {
    cdkBuilder.disableSchemaValidation(disableSchemaValidation)
  }

  /**
   * @param failOnWarnings Specifies whether to rollback the API creation when a warning is
   * encountered.
   * By default, API creation continues if a warning is encountered.
   */
  public fun failOnWarnings(failOnWarnings: Boolean) {
    cdkBuilder.failOnWarnings(failOnWarnings)
  }

  /**
   * @param failOnWarnings Specifies whether to rollback the API creation when a warning is
   * encountered.
   * By default, API creation continues if a warning is encountered.
   */
  public fun failOnWarnings(failOnWarnings: IResolvable) {
    cdkBuilder.failOnWarnings(failOnWarnings)
  }

  /**
   * @param name The name of the API.
   * Required unless you specify an OpenAPI definition for `Body` or `S3BodyLocation` .
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param protocolType The API protocol.
   * Valid values are `WEBSOCKET` or `HTTP` . Required unless you specify an OpenAPI definition for
   * `Body` or `S3BodyLocation` .
   */
  public fun protocolType(protocolType: String) {
    cdkBuilder.protocolType(protocolType)
  }

  /**
   * @param routeKey This property is part of quick create.
   * If you don't specify a `routeKey` , a default route of `$default` is created. The `$default`
   * route acts as a catch-all for any request made to your API, for a particular stage. The `$default`
   * route key can't be modified. You can add routes after creating the API, and you can update the
   * route keys of additional routes. Supported only for HTTP APIs.
   */
  public fun routeKey(routeKey: String) {
    cdkBuilder.routeKey(routeKey)
  }

  /**
   * @param routeSelectionExpression The route selection expression for the API.
   * For HTTP APIs, the `routeSelectionExpression` must be `${request.method} ${request.path}` . If
   * not provided, this will be the default for HTTP APIs. This property is required for WebSocket
   * APIs.
   */
  public fun routeSelectionExpression(routeSelectionExpression: String) {
    cdkBuilder.routeSelectionExpression(routeSelectionExpression)
  }

  /**
   * @param tags The collection of tags.
   * Each tag element is associated with a given resource.
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  /**
   * @param target This property is part of quick create.
   * Quick create produces an API with an integration, a default catch-all route, and a default
   * stage which is configured to automatically deploy changes. For HTTP integrations, specify a fully
   * qualified URL. For Lambda integrations, specify a function ARN. The type of the integration will
   * be HTTP_PROXY or AWS_PROXY, respectively. Supported only for HTTP APIs.
   */
  public fun target(target: String) {
    cdkBuilder.target(target)
  }

  /**
   * @param version A version identifier for the API.
   */
  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun build(): CfnApiProps = cdkBuilder.build()
}
