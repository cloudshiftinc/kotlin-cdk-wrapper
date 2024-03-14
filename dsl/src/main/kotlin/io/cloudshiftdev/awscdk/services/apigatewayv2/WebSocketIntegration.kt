package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class WebSocketIntegration internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketIntegration,
) : Resource(cdkObject), IWebSocketIntegration {
  public override fun integrationId(): String = unwrap(this).getIntegrationId()

  public override fun webSocketApi(): IWebSocketApi =
      unwrap(this).getWebSocketApi().let(IWebSocketApi::wrap)

  public interface Builder {
    public fun credentialsRole(credentialsRole: IRole)

    public fun integrationMethod(integrationMethod: String)

    public fun integrationType(integrationType: WebSocketIntegrationType)

    public fun integrationUri(integrationUri: String)

    public fun passthroughBehavior(passthroughBehavior: PassthroughBehavior)

    public fun requestParameters(requestParameters: Map<String, String>)

    public fun requestTemplates(requestTemplates: Map<String, String>)

    public fun templateSelectionExpression(templateSelectionExpression: String)

    public fun webSocketApi(webSocketApi: IWebSocketApi)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.WebSocketIntegration.Builder =
        software.amazon.awscdk.services.apigatewayv2.WebSocketIntegration.Builder.create(scope, id)

    override fun credentialsRole(credentialsRole: IRole) {
      cdkBuilder.credentialsRole(credentialsRole.let(IRole::unwrap))
    }

    override fun integrationMethod(integrationMethod: String) {
      cdkBuilder.integrationMethod(integrationMethod)
    }

    override fun integrationType(integrationType: WebSocketIntegrationType) {
      cdkBuilder.integrationType(integrationType.let(WebSocketIntegrationType::unwrap))
    }

    override fun integrationUri(integrationUri: String) {
      cdkBuilder.integrationUri(integrationUri)
    }

    override fun passthroughBehavior(passthroughBehavior: PassthroughBehavior) {
      cdkBuilder.passthroughBehavior(passthroughBehavior.let(PassthroughBehavior::unwrap))
    }

    override fun requestParameters(requestParameters: Map<String, String>) {
      cdkBuilder.requestParameters(requestParameters)
    }

    override fun requestTemplates(requestTemplates: Map<String, String>) {
      cdkBuilder.requestTemplates(requestTemplates)
    }

    override fun templateSelectionExpression(templateSelectionExpression: String) {
      cdkBuilder.templateSelectionExpression(templateSelectionExpression)
    }

    override fun webSocketApi(webSocketApi: IWebSocketApi) {
      cdkBuilder.webSocketApi(webSocketApi.let(IWebSocketApi::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.WebSocketIntegration =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): WebSocketIntegration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return WebSocketIntegration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketIntegration):
        WebSocketIntegration = WebSocketIntegration(cdkObject)

    internal fun unwrap(wrapped: WebSocketIntegration):
        software.amazon.awscdk.services.apigatewayv2.WebSocketIntegration = wrapped.cdkObject
  }
}
