@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit

public interface CfnIntegrationResponseProps {
  public fun apiId(): String

  public fun contentHandlingStrategy(): String? = unwrap(this).getContentHandlingStrategy()

  public fun integrationId(): String

  public fun integrationResponseKey(): String

  public fun responseParameters(): Any? = unwrap(this).getResponseParameters()

  public fun responseTemplates(): Any? = unwrap(this).getResponseTemplates()

  public fun templateSelectionExpression(): String? = unwrap(this).getTemplateSelectionExpression()

  @CdkDslMarker
  public interface Builder {
    public fun apiId(apiId: String)

    public fun contentHandlingStrategy(contentHandlingStrategy: String)

    public fun integrationId(integrationId: String)

    public fun integrationResponseKey(integrationResponseKey: String)

    public fun responseParameters(responseParameters: Any)

    public fun responseTemplates(responseTemplates: Any)

    public fun templateSelectionExpression(templateSelectionExpression: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponseProps.Builder =
        software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponseProps.builder()

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

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponseProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponseProps,
  ) : CdkObject(cdkObject), CfnIntegrationResponseProps {
    override fun apiId(): String = unwrap(this).getApiId()

    override fun contentHandlingStrategy(): String? = unwrap(this).getContentHandlingStrategy()

    override fun integrationId(): String = unwrap(this).getIntegrationId()

    override fun integrationResponseKey(): String = unwrap(this).getIntegrationResponseKey()

    override fun responseParameters(): Any? = unwrap(this).getResponseParameters()

    override fun responseTemplates(): Any? = unwrap(this).getResponseTemplates()

    override fun templateSelectionExpression(): String? =
        unwrap(this).getTemplateSelectionExpression()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIntegrationResponseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponseProps):
        CfnIntegrationResponseProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIntegrationResponseProps):
        software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponseProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponseProps
  }
}
