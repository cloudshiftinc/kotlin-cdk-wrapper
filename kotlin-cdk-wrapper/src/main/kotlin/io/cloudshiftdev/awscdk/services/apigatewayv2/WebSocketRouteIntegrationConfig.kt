@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Config returned back as a result of the bind.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * Role role;
 * WebSocketRouteIntegrationConfig webSocketRouteIntegrationConfig =
 * WebSocketRouteIntegrationConfig.builder()
 * .type(WebSocketIntegrationType.AWS_PROXY)
 * .uri("uri")
 * // the properties below are optional
 * .contentHandling(ContentHandling.CONVERT_TO_BINARY)
 * .credentialsRole(role)
 * .method("method")
 * .passthroughBehavior(PassthroughBehavior.WHEN_NO_MATCH)
 * .requestParameters(Map.of(
 * "requestParametersKey", "requestParameters"))
 * .requestTemplates(Map.of(
 * "requestTemplatesKey", "requestTemplates"))
 * .templateSelectionExpression("templateSelectionExpression")
 * .timeout(Duration.minutes(30))
 * .build();
 * ```
 */
public interface WebSocketRouteIntegrationConfig {
  /**
   * Specifies how to handle response payload content type conversions.
   *
   * Default: - The response payload will be passed through from the integration response to
   * the route response or method response without modification.
   */
  public fun contentHandling(): ContentHandling? =
      unwrap(this).getContentHandling()?.let(ContentHandling::wrap)

  /**
   * Credentials role.
   *
   * Default: - No role provided.
   */
  public fun credentialsRole(): IRole? = unwrap(this).getCredentialsRole()?.let(IRole::wrap)

  /**
   * Integration method.
   *
   * Default: - No integration method.
   */
  public fun method(): String? = unwrap(this).getMethod()

  /**
   * Integration passthrough behaviors.
   *
   * Default: - No pass through bahavior.
   */
  public fun passthroughBehavior(): PassthroughBehavior? =
      unwrap(this).getPassthroughBehavior()?.let(PassthroughBehavior::wrap)

  /**
   * Request parameters.
   *
   * Default: - No request parameters provided.
   */
  public fun requestParameters(): Map<String, String> = unwrap(this).getRequestParameters() ?:
      emptyMap()

  /**
   * Request template.
   *
   * Default: - No request template provided.
   */
  public fun requestTemplates(): Map<String, String> = unwrap(this).getRequestTemplates() ?:
      emptyMap()

  /**
   * Template selection expression.
   *
   * Default: - No template selection expression.
   */
  public fun templateSelectionExpression(): String? = unwrap(this).getTemplateSelectionExpression()

  /**
   * The maximum amount of time an integration will run before it returns without a response.
   *
   * Must be between 50 milliseconds and 29 seconds.
   *
   * Default: Duration.seconds(29)
   */
  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  /**
   * Integration type.
   */
  public fun type(): WebSocketIntegrationType

  /**
   * Integration URI.
   */
  public fun uri(): String

  /**
   * A builder for [WebSocketRouteIntegrationConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param contentHandling Specifies how to handle response payload content type conversions.
     */
    public fun contentHandling(contentHandling: ContentHandling)

    /**
     * @param credentialsRole Credentials role.
     */
    public fun credentialsRole(credentialsRole: IRole)

    /**
     * @param method Integration method.
     */
    public fun method(method: String)

    /**
     * @param passthroughBehavior Integration passthrough behaviors.
     */
    public fun passthroughBehavior(passthroughBehavior: PassthroughBehavior)

    /**
     * @param requestParameters Request parameters.
     */
    public fun requestParameters(requestParameters: Map<String, String>)

    /**
     * @param requestTemplates Request template.
     */
    public fun requestTemplates(requestTemplates: Map<String, String>)

    /**
     * @param templateSelectionExpression Template selection expression.
     */
    public fun templateSelectionExpression(templateSelectionExpression: String)

    /**
     * @param timeout The maximum amount of time an integration will run before it returns without a
     * response.
     * Must be between 50 milliseconds and 29 seconds.
     */
    public fun timeout(timeout: Duration)

    /**
     * @param type Integration type. 
     */
    public fun type(type: WebSocketIntegrationType)

    /**
     * @param uri Integration URI. 
     */
    public fun uri(uri: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegrationConfig.Builder =
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegrationConfig.builder()

    /**
     * @param contentHandling Specifies how to handle response payload content type conversions.
     */
    override fun contentHandling(contentHandling: ContentHandling) {
      cdkBuilder.contentHandling(contentHandling.let(ContentHandling.Companion::unwrap))
    }

    /**
     * @param credentialsRole Credentials role.
     */
    override fun credentialsRole(credentialsRole: IRole) {
      cdkBuilder.credentialsRole(credentialsRole.let(IRole.Companion::unwrap))
    }

    /**
     * @param method Integration method.
     */
    override fun method(method: String) {
      cdkBuilder.method(method)
    }

    /**
     * @param passthroughBehavior Integration passthrough behaviors.
     */
    override fun passthroughBehavior(passthroughBehavior: PassthroughBehavior) {
      cdkBuilder.passthroughBehavior(passthroughBehavior.let(PassthroughBehavior.Companion::unwrap))
    }

    /**
     * @param requestParameters Request parameters.
     */
    override fun requestParameters(requestParameters: Map<String, String>) {
      cdkBuilder.requestParameters(requestParameters)
    }

    /**
     * @param requestTemplates Request template.
     */
    override fun requestTemplates(requestTemplates: Map<String, String>) {
      cdkBuilder.requestTemplates(requestTemplates)
    }

    /**
     * @param templateSelectionExpression Template selection expression.
     */
    override fun templateSelectionExpression(templateSelectionExpression: String) {
      cdkBuilder.templateSelectionExpression(templateSelectionExpression)
    }

    /**
     * @param timeout The maximum amount of time an integration will run before it returns without a
     * response.
     * Must be between 50 milliseconds and 29 seconds.
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration.Companion::unwrap))
    }

    /**
     * @param type Integration type. 
     */
    override fun type(type: WebSocketIntegrationType) {
      cdkBuilder.type(type.let(WebSocketIntegrationType.Companion::unwrap))
    }

    /**
     * @param uri Integration URI. 
     */
    override fun uri(uri: String) {
      cdkBuilder.uri(uri)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegrationConfig
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegrationConfig,
  ) : CdkObject(cdkObject),
      WebSocketRouteIntegrationConfig {
    /**
     * Specifies how to handle response payload content type conversions.
     *
     * Default: - The response payload will be passed through from the integration response to
     * the route response or method response without modification.
     */
    override fun contentHandling(): ContentHandling? =
        unwrap(this).getContentHandling()?.let(ContentHandling::wrap)

    /**
     * Credentials role.
     *
     * Default: - No role provided.
     */
    override fun credentialsRole(): IRole? = unwrap(this).getCredentialsRole()?.let(IRole::wrap)

    /**
     * Integration method.
     *
     * Default: - No integration method.
     */
    override fun method(): String? = unwrap(this).getMethod()

    /**
     * Integration passthrough behaviors.
     *
     * Default: - No pass through bahavior.
     */
    override fun passthroughBehavior(): PassthroughBehavior? =
        unwrap(this).getPassthroughBehavior()?.let(PassthroughBehavior::wrap)

    /**
     * Request parameters.
     *
     * Default: - No request parameters provided.
     */
    override fun requestParameters(): Map<String, String> = unwrap(this).getRequestParameters() ?:
        emptyMap()

    /**
     * Request template.
     *
     * Default: - No request template provided.
     */
    override fun requestTemplates(): Map<String, String> = unwrap(this).getRequestTemplates() ?:
        emptyMap()

    /**
     * Template selection expression.
     *
     * Default: - No template selection expression.
     */
    override fun templateSelectionExpression(): String? =
        unwrap(this).getTemplateSelectionExpression()

    /**
     * The maximum amount of time an integration will run before it returns without a response.
     *
     * Must be between 50 milliseconds and 29 seconds.
     *
     * Default: Duration.seconds(29)
     */
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    /**
     * Integration type.
     */
    override fun type(): WebSocketIntegrationType =
        unwrap(this).getType().let(WebSocketIntegrationType::wrap)

    /**
     * Integration URI.
     */
    override fun uri(): String = unwrap(this).getUri()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WebSocketRouteIntegrationConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegrationConfig):
        WebSocketRouteIntegrationConfig = CdkObjectWrappers.wrap(cdkObject) as?
        WebSocketRouteIntegrationConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: WebSocketRouteIntegrationConfig):
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegrationConfig = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegrationConfig
  }
}
