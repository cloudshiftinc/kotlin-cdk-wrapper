@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.apigatewayv2.PassthroughBehavior
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Props for AWS type integration for an HTTP Api.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.WebSocketAwsIntegration;
 * import io.cloudshiftdev.awscdk.services.dynamodb.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * Role apiRole;
 * Table table;
 * WebSocketApi webSocketApi = new WebSocketApi(this, "mywsapi");
 * WebSocketStage.Builder.create(this, "mystage")
 * .webSocketApi(webSocketApi)
 * .stageName("dev")
 * .autoDeploy(true)
 * .build();
 * webSocketApi.addRoute("$connect", WebSocketRouteOptions.builder()
 * .integration(WebSocketAwsIntegration.Builder.create("DynamodbPutItem")
 * .integrationUri(String.format("arn:aws:apigateway:%s:dynamodb:action/PutItem", this.region))
 * .integrationMethod(HttpMethod.POST)
 * .credentialsRole(apiRole)
 * .requestTemplates(Map.of(
 * "application/json", JSON.stringify(Map.of(
 * "TableName", table.getTableName(),
 * "Item", Map.of(
 * "id", Map.of(
 * "S", "$context.requestId"))))))
 * .build())
 * .build());
 * ```
 */
public interface WebSocketAwsIntegrationProps {
  /**
   * Specifies the credentials role required for the integration.
   *
   * Default: - No credential role provided.
   */
  public fun credentialsRole(): IRole? = unwrap(this).getCredentialsRole()?.let(IRole::wrap)

  /**
   * Specifies the integration's HTTP method type.
   */
  public fun integrationMethod(): String

  /**
   * Integration URI.
   */
  public fun integrationUri(): String

  /**
   * Specifies the pass-through behavior for incoming requests based on the Content-Type header in
   * the request, and the available mapping templates specified as the requestTemplates property on the
   * Integration resource.
   *
   * There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and
   * NEVER.
   *
   * Default: - No passthrough behavior required.
   */
  public fun passthroughBehavior(): PassthroughBehavior? =
      unwrap(this).getPassthroughBehavior()?.let(PassthroughBehavior::wrap)

  /**
   * The request parameters that API Gateway sends with the backend request.
   *
   * Specify request parameters as key-value pairs (string-to-string
   * mappings), with a destination as the key and a source as the value.
   *
   * Default: - No request parameter provided to the integration.
   */
  public fun requestParameters(): Map<String, String> = unwrap(this).getRequestParameters() ?:
      emptyMap()

  /**
   * A map of Apache Velocity templates that are applied on the request payload.
   *
   * ```
   * { "application/json": "{ \"statusCode\": 200 }" }
   * ```
   *
   * Default: - No request template provided to the integration.
   */
  public fun requestTemplates(): Map<String, String> = unwrap(this).getRequestTemplates() ?:
      emptyMap()

  /**
   * The template selection expression for the integration.
   *
   * Default: - No template selection expression provided.
   */
  public fun templateSelectionExpression(): String? = unwrap(this).getTemplateSelectionExpression()

  /**
   * A builder for [WebSocketAwsIntegrationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param credentialsRole Specifies the credentials role required for the integration.
     */
    public fun credentialsRole(credentialsRole: IRole)

    /**
     * @param integrationMethod Specifies the integration's HTTP method type. 
     */
    public fun integrationMethod(integrationMethod: String)

    /**
     * @param integrationUri Integration URI. 
     */
    public fun integrationUri(integrationUri: String)

    /**
     * @param passthroughBehavior Specifies the pass-through behavior for incoming requests based on
     * the Content-Type header in the request, and the available mapping templates specified as the
     * requestTemplates property on the Integration resource.
     * There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and
     * NEVER.
     */
    public fun passthroughBehavior(passthroughBehavior: PassthroughBehavior)

    /**
     * @param requestParameters The request parameters that API Gateway sends with the backend
     * request.
     * Specify request parameters as key-value pairs (string-to-string
     * mappings), with a destination as the key and a source as the value.
     */
    public fun requestParameters(requestParameters: Map<String, String>)

    /**
     * @param requestTemplates A map of Apache Velocity templates that are applied on the request
     * payload.
     * ```
     * { "application/json": "{ \"statusCode\": 200 }" }
     * ```
     */
    public fun requestTemplates(requestTemplates: Map<String, String>)

    /**
     * @param templateSelectionExpression The template selection expression for the integration.
     */
    public fun templateSelectionExpression(templateSelectionExpression: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketAwsIntegrationProps.Builder =
        software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketAwsIntegrationProps.builder()

    /**
     * @param credentialsRole Specifies the credentials role required for the integration.
     */
    override fun credentialsRole(credentialsRole: IRole) {
      cdkBuilder.credentialsRole(credentialsRole.let(IRole::unwrap))
    }

    /**
     * @param integrationMethod Specifies the integration's HTTP method type. 
     */
    override fun integrationMethod(integrationMethod: String) {
      cdkBuilder.integrationMethod(integrationMethod)
    }

    /**
     * @param integrationUri Integration URI. 
     */
    override fun integrationUri(integrationUri: String) {
      cdkBuilder.integrationUri(integrationUri)
    }

    /**
     * @param passthroughBehavior Specifies the pass-through behavior for incoming requests based on
     * the Content-Type header in the request, and the available mapping templates specified as the
     * requestTemplates property on the Integration resource.
     * There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and
     * NEVER.
     */
    override fun passthroughBehavior(passthroughBehavior: PassthroughBehavior) {
      cdkBuilder.passthroughBehavior(passthroughBehavior.let(PassthroughBehavior::unwrap))
    }

    /**
     * @param requestParameters The request parameters that API Gateway sends with the backend
     * request.
     * Specify request parameters as key-value pairs (string-to-string
     * mappings), with a destination as the key and a source as the value.
     */
    override fun requestParameters(requestParameters: Map<String, String>) {
      cdkBuilder.requestParameters(requestParameters)
    }

    /**
     * @param requestTemplates A map of Apache Velocity templates that are applied on the request
     * payload.
     * ```
     * { "application/json": "{ \"statusCode\": 200 }" }
     * ```
     */
    override fun requestTemplates(requestTemplates: Map<String, String>) {
      cdkBuilder.requestTemplates(requestTemplates)
    }

    /**
     * @param templateSelectionExpression The template selection expression for the integration.
     */
    override fun templateSelectionExpression(templateSelectionExpression: String) {
      cdkBuilder.templateSelectionExpression(templateSelectionExpression)
    }

    public fun build():
        software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketAwsIntegrationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketAwsIntegrationProps,
  ) : CdkObject(cdkObject), WebSocketAwsIntegrationProps {
    /**
     * Specifies the credentials role required for the integration.
     *
     * Default: - No credential role provided.
     */
    override fun credentialsRole(): IRole? = unwrap(this).getCredentialsRole()?.let(IRole::wrap)

    /**
     * Specifies the integration's HTTP method type.
     */
    override fun integrationMethod(): String = unwrap(this).getIntegrationMethod()

    /**
     * Integration URI.
     */
    override fun integrationUri(): String = unwrap(this).getIntegrationUri()

    /**
     * Specifies the pass-through behavior for incoming requests based on the Content-Type header in
     * the request, and the available mapping templates specified as the requestTemplates property on
     * the Integration resource.
     *
     * There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and
     * NEVER.
     *
     * Default: - No passthrough behavior required.
     */
    override fun passthroughBehavior(): PassthroughBehavior? =
        unwrap(this).getPassthroughBehavior()?.let(PassthroughBehavior::wrap)

    /**
     * The request parameters that API Gateway sends with the backend request.
     *
     * Specify request parameters as key-value pairs (string-to-string
     * mappings), with a destination as the key and a source as the value.
     *
     * Default: - No request parameter provided to the integration.
     */
    override fun requestParameters(): Map<String, String> = unwrap(this).getRequestParameters() ?:
        emptyMap()

    /**
     * A map of Apache Velocity templates that are applied on the request payload.
     *
     * ```
     * { "application/json": "{ \"statusCode\": 200 }" }
     * ```
     *
     * Default: - No request template provided to the integration.
     */
    override fun requestTemplates(): Map<String, String> = unwrap(this).getRequestTemplates() ?:
        emptyMap()

    /**
     * The template selection expression for the integration.
     *
     * Default: - No template selection expression provided.
     */
    override fun templateSelectionExpression(): String? =
        unwrap(this).getTemplateSelectionExpression()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WebSocketAwsIntegrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketAwsIntegrationProps):
        WebSocketAwsIntegrationProps = CdkObjectWrappers.wrap(cdkObject) as?
        WebSocketAwsIntegrationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: WebSocketAwsIntegrationProps):
        software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketAwsIntegrationProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketAwsIntegrationProps
  }
}
