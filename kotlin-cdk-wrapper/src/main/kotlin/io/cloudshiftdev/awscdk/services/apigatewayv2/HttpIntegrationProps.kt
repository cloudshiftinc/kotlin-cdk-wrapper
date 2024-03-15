@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface HttpIntegrationProps {
  public fun connectionId(): String? = unwrap(this).getConnectionId()

  public fun connectionType(): HttpConnectionType? =
      unwrap(this).getConnectionType()?.let(HttpConnectionType::wrap)

  public fun credentials(): IntegrationCredentials? =
      unwrap(this).getCredentials()?.let(IntegrationCredentials::wrap)

  public fun httpApi(): IHttpApi

  public fun integrationSubtype(): HttpIntegrationSubtype? =
      unwrap(this).getIntegrationSubtype()?.let(HttpIntegrationSubtype::wrap)

  public fun integrationType(): HttpIntegrationType

  public fun integrationUri(): String? = unwrap(this).getIntegrationUri()

  public fun method(): HttpMethod? = unwrap(this).getMethod()?.let(HttpMethod::wrap)

  public fun parameterMapping(): ParameterMapping? =
      unwrap(this).getParameterMapping()?.let(ParameterMapping::wrap)

  public fun payloadFormatVersion(): PayloadFormatVersion? =
      unwrap(this).getPayloadFormatVersion()?.let(PayloadFormatVersion::wrap)

  public fun secureServerName(): String? = unwrap(this).getSecureServerName()

  @CdkDslMarker
  public interface Builder {
    public fun connectionId(connectionId: String)

    public fun connectionType(connectionType: HttpConnectionType)

    public fun credentials(credentials: IntegrationCredentials)

    public fun httpApi(httpApi: IHttpApi)

    public fun integrationSubtype(integrationSubtype: HttpIntegrationSubtype)

    public fun integrationType(integrationType: HttpIntegrationType)

    public fun integrationUri(integrationUri: String)

    public fun method(method: HttpMethod)

    public fun parameterMapping(parameterMapping: ParameterMapping)

    public fun payloadFormatVersion(payloadFormatVersion: PayloadFormatVersion)

    public fun secureServerName(secureServerName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.HttpIntegrationProps.Builder =
        software.amazon.awscdk.services.apigatewayv2.HttpIntegrationProps.builder()

    override fun connectionId(connectionId: String) {
      cdkBuilder.connectionId(connectionId)
    }

    override fun connectionType(connectionType: HttpConnectionType) {
      cdkBuilder.connectionType(connectionType.let(HttpConnectionType::unwrap))
    }

    override fun credentials(credentials: IntegrationCredentials) {
      cdkBuilder.credentials(credentials.let(IntegrationCredentials::unwrap))
    }

    override fun httpApi(httpApi: IHttpApi) {
      cdkBuilder.httpApi(httpApi.let(IHttpApi::unwrap))
    }

    override fun integrationSubtype(integrationSubtype: HttpIntegrationSubtype) {
      cdkBuilder.integrationSubtype(integrationSubtype.let(HttpIntegrationSubtype::unwrap))
    }

    override fun integrationType(integrationType: HttpIntegrationType) {
      cdkBuilder.integrationType(integrationType.let(HttpIntegrationType::unwrap))
    }

    override fun integrationUri(integrationUri: String) {
      cdkBuilder.integrationUri(integrationUri)
    }

    override fun method(method: HttpMethod) {
      cdkBuilder.method(method.let(HttpMethod::unwrap))
    }

    override fun parameterMapping(parameterMapping: ParameterMapping) {
      cdkBuilder.parameterMapping(parameterMapping.let(ParameterMapping::unwrap))
    }

    override fun payloadFormatVersion(payloadFormatVersion: PayloadFormatVersion) {
      cdkBuilder.payloadFormatVersion(payloadFormatVersion.let(PayloadFormatVersion::unwrap))
    }

    override fun secureServerName(secureServerName: String) {
      cdkBuilder.secureServerName(secureServerName)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.HttpIntegrationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpIntegrationProps,
  ) : CdkObject(cdkObject), HttpIntegrationProps {
    override fun connectionId(): String? = unwrap(this).getConnectionId()

    override fun connectionType(): HttpConnectionType? =
        unwrap(this).getConnectionType()?.let(HttpConnectionType::wrap)

    override fun credentials(): IntegrationCredentials? =
        unwrap(this).getCredentials()?.let(IntegrationCredentials::wrap)

    override fun httpApi(): IHttpApi = unwrap(this).getHttpApi().let(IHttpApi::wrap)

    override fun integrationSubtype(): HttpIntegrationSubtype? =
        unwrap(this).getIntegrationSubtype()?.let(HttpIntegrationSubtype::wrap)

    override fun integrationType(): HttpIntegrationType =
        unwrap(this).getIntegrationType().let(HttpIntegrationType::wrap)

    override fun integrationUri(): String? = unwrap(this).getIntegrationUri()

    override fun method(): HttpMethod? = unwrap(this).getMethod()?.let(HttpMethod::wrap)

    override fun parameterMapping(): ParameterMapping? =
        unwrap(this).getParameterMapping()?.let(ParameterMapping::wrap)

    override fun payloadFormatVersion(): PayloadFormatVersion? =
        unwrap(this).getPayloadFormatVersion()?.let(PayloadFormatVersion::wrap)

    override fun secureServerName(): String? = unwrap(this).getSecureServerName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpIntegrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpIntegrationProps):
        HttpIntegrationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpIntegrationProps):
        software.amazon.awscdk.services.apigatewayv2.HttpIntegrationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.HttpIntegrationProps
  }
}
