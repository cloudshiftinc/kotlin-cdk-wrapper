@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnIntegrationProps {
  public fun apiId(): String

  public fun connectionId(): String? = unwrap(this).getConnectionId()

  public fun connectionType(): String? = unwrap(this).getConnectionType()

  public fun contentHandlingStrategy(): String? = unwrap(this).getContentHandlingStrategy()

  public fun credentialsArn(): String? = unwrap(this).getCredentialsArn()

  public fun description(): String? = unwrap(this).getDescription()

  public fun integrationMethod(): String? = unwrap(this).getIntegrationMethod()

  public fun integrationSubtype(): String? = unwrap(this).getIntegrationSubtype()

  public fun integrationType(): String

  public fun integrationUri(): String? = unwrap(this).getIntegrationUri()

  public fun passthroughBehavior(): String? = unwrap(this).getPassthroughBehavior()

  public fun payloadFormatVersion(): String? = unwrap(this).getPayloadFormatVersion()

  public fun requestParameters(): Any? = unwrap(this).getRequestParameters()

  public fun requestTemplates(): Any? = unwrap(this).getRequestTemplates()

  public fun responseParameters(): Any? = unwrap(this).getResponseParameters()

  public fun templateSelectionExpression(): String? = unwrap(this).getTemplateSelectionExpression()

  public fun timeoutInMillis(): Number? = unwrap(this).getTimeoutInMillis()

  public fun tlsConfig(): Any? = unwrap(this).getTlsConfig()

  @CdkDslMarker
  public interface Builder {
    public fun apiId(apiId: String)

    public fun connectionId(connectionId: String)

    public fun connectionType(connectionType: String)

    public fun contentHandlingStrategy(contentHandlingStrategy: String)

    public fun credentialsArn(credentialsArn: String)

    public fun description(description: String)

    public fun integrationMethod(integrationMethod: String)

    public fun integrationSubtype(integrationSubtype: String)

    public fun integrationType(integrationType: String)

    public fun integrationUri(integrationUri: String)

    public fun passthroughBehavior(passthroughBehavior: String)

    public fun payloadFormatVersion(payloadFormatVersion: String)

    public fun requestParameters(requestParameters: Any)

    public fun requestTemplates(requestTemplates: Any)

    public fun responseParameters(responseParameters: Any)

    public fun templateSelectionExpression(templateSelectionExpression: String)

    public fun timeoutInMillis(timeoutInMillis: Number)

    public fun tlsConfig(tlsConfig: IResolvable)

    public fun tlsConfig(tlsConfig: CfnIntegration.TlsConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("532a6c7e227e91660549cd423fd956612678020d6ce7bf3db3f8a6b3c51dbc0d")
    public fun tlsConfig(tlsConfig: CfnIntegration.TlsConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.CfnIntegrationProps.Builder
        = software.amazon.awscdk.services.apigatewayv2.CfnIntegrationProps.builder()

    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    override fun connectionId(connectionId: String) {
      cdkBuilder.connectionId(connectionId)
    }

    override fun connectionType(connectionType: String) {
      cdkBuilder.connectionType(connectionType)
    }

    override fun contentHandlingStrategy(contentHandlingStrategy: String) {
      cdkBuilder.contentHandlingStrategy(contentHandlingStrategy)
    }

    override fun credentialsArn(credentialsArn: String) {
      cdkBuilder.credentialsArn(credentialsArn)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun integrationMethod(integrationMethod: String) {
      cdkBuilder.integrationMethod(integrationMethod)
    }

    override fun integrationSubtype(integrationSubtype: String) {
      cdkBuilder.integrationSubtype(integrationSubtype)
    }

    override fun integrationType(integrationType: String) {
      cdkBuilder.integrationType(integrationType)
    }

    override fun integrationUri(integrationUri: String) {
      cdkBuilder.integrationUri(integrationUri)
    }

    override fun passthroughBehavior(passthroughBehavior: String) {
      cdkBuilder.passthroughBehavior(passthroughBehavior)
    }

    override fun payloadFormatVersion(payloadFormatVersion: String) {
      cdkBuilder.payloadFormatVersion(payloadFormatVersion)
    }

    override fun requestParameters(requestParameters: Any) {
      cdkBuilder.requestParameters(requestParameters)
    }

    override fun requestTemplates(requestTemplates: Any) {
      cdkBuilder.requestTemplates(requestTemplates)
    }

    override fun responseParameters(responseParameters: Any) {
      cdkBuilder.responseParameters(responseParameters)
    }

    override fun templateSelectionExpression(templateSelectionExpression: String) {
      cdkBuilder.templateSelectionExpression(templateSelectionExpression)
    }

    override fun timeoutInMillis(timeoutInMillis: Number) {
      cdkBuilder.timeoutInMillis(timeoutInMillis)
    }

    override fun tlsConfig(tlsConfig: IResolvable) {
      cdkBuilder.tlsConfig(tlsConfig.let(IResolvable::unwrap))
    }

    override fun tlsConfig(tlsConfig: CfnIntegration.TlsConfigProperty) {
      cdkBuilder.tlsConfig(tlsConfig.let(CfnIntegration.TlsConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("532a6c7e227e91660549cd423fd956612678020d6ce7bf3db3f8a6b3c51dbc0d")
    override fun tlsConfig(tlsConfig: CfnIntegration.TlsConfigProperty.Builder.() -> Unit): Unit =
        tlsConfig(CfnIntegration.TlsConfigProperty(tlsConfig))

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnIntegrationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnIntegrationProps,
  ) : CdkObject(cdkObject), CfnIntegrationProps {
    override fun apiId(): String = unwrap(this).getApiId()

    override fun connectionId(): String? = unwrap(this).getConnectionId()

    override fun connectionType(): String? = unwrap(this).getConnectionType()

    override fun contentHandlingStrategy(): String? = unwrap(this).getContentHandlingStrategy()

    override fun credentialsArn(): String? = unwrap(this).getCredentialsArn()

    override fun description(): String? = unwrap(this).getDescription()

    override fun integrationMethod(): String? = unwrap(this).getIntegrationMethod()

    override fun integrationSubtype(): String? = unwrap(this).getIntegrationSubtype()

    override fun integrationType(): String = unwrap(this).getIntegrationType()

    override fun integrationUri(): String? = unwrap(this).getIntegrationUri()

    override fun passthroughBehavior(): String? = unwrap(this).getPassthroughBehavior()

    override fun payloadFormatVersion(): String? = unwrap(this).getPayloadFormatVersion()

    override fun requestParameters(): Any? = unwrap(this).getRequestParameters()

    override fun requestTemplates(): Any? = unwrap(this).getRequestTemplates()

    override fun responseParameters(): Any? = unwrap(this).getResponseParameters()

    override fun templateSelectionExpression(): String? =
        unwrap(this).getTemplateSelectionExpression()

    override fun timeoutInMillis(): Number? = unwrap(this).getTimeoutInMillis()

    override fun tlsConfig(): Any? = unwrap(this).getTlsConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIntegrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnIntegrationProps):
        CfnIntegrationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIntegrationProps):
        software.amazon.awscdk.services.apigatewayv2.CfnIntegrationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.CfnIntegrationProps
  }
}
