package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnIntegrationResponse internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponse,
) : CfnResource(cdkObject), IInspectable {
  public open fun apiId(): String = unwrap(this).getApiId()

  public open fun apiId(`value`: String) {
    unwrap(this).setApiId(`value`)
  }

  public open fun attrIntegrationResponseId(): String = unwrap(this).getAttrIntegrationResponseId()

  public open fun contentHandlingStrategy(): String? = unwrap(this).getContentHandlingStrategy()

  public open fun contentHandlingStrategy(`value`: String) {
    unwrap(this).setContentHandlingStrategy(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun integrationId(): String = unwrap(this).getIntegrationId()

  public open fun integrationId(`value`: String) {
    unwrap(this).setIntegrationId(`value`)
  }

  public open fun integrationResponseKey(): String = unwrap(this).getIntegrationResponseKey()

  public open fun integrationResponseKey(`value`: String) {
    unwrap(this).setIntegrationResponseKey(`value`)
  }

  public open fun responseParameters(): Any? = unwrap(this).getResponseParameters()

  public open fun responseParameters(`value`: Any) {
    unwrap(this).setResponseParameters(`value`)
  }

  public open fun responseTemplates(): Any? = unwrap(this).getResponseTemplates()

  public open fun responseTemplates(`value`: Any) {
    unwrap(this).setResponseTemplates(`value`)
  }

  public open fun templateSelectionExpression(): String? =
      unwrap(this).getTemplateSelectionExpression()

  public open fun templateSelectionExpression(`value`: String) {
    unwrap(this).setTemplateSelectionExpression(`value`)
  }

  public interface Builder {
    public fun apiId(apiId: String)

    public fun contentHandlingStrategy(contentHandlingStrategy: String)

    public fun integrationId(integrationId: String)

    public fun integrationResponseKey(integrationResponseKey: String)

    public fun responseParameters(responseParameters: Any)

    public fun responseTemplates(responseTemplates: Any)

    public fun templateSelectionExpression(templateSelectionExpression: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponse.Builder =
        software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponse.Builder.create(scope,
        id)

    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    override fun contentHandlingStrategy(contentHandlingStrategy: String) {
      cdkBuilder.contentHandlingStrategy(contentHandlingStrategy)
    }

    override fun integrationId(integrationId: String) {
      cdkBuilder.integrationId(integrationId)
    }

    override fun integrationResponseKey(integrationResponseKey: String) {
      cdkBuilder.integrationResponseKey(integrationResponseKey)
    }

    override fun responseParameters(responseParameters: Any) {
      cdkBuilder.responseParameters(responseParameters)
    }

    override fun responseTemplates(responseTemplates: Any) {
      cdkBuilder.responseTemplates(responseTemplates)
    }

    override fun templateSelectionExpression(templateSelectionExpression: String) {
      cdkBuilder.templateSelectionExpression(templateSelectionExpression)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponse =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIntegrationResponse {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIntegrationResponse(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponse):
        CfnIntegrationResponse = CfnIntegrationResponse(cdkObject)

    internal fun unwrap(wrapped: CfnIntegrationResponse):
        software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponse = wrapped.cdkObject
  }
}
