@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface HttpRouteIntegrationConfig {
  public fun connectionId(): String? = unwrap(this).getConnectionId()

  public fun connectionType(): HttpConnectionType? =
      unwrap(this).getConnectionType()?.let(HttpConnectionType::wrap)

  public fun credentials(): IntegrationCredentials? =
      unwrap(this).getCredentials()?.let(IntegrationCredentials::wrap)

  public fun method(): HttpMethod? = unwrap(this).getMethod()?.let(HttpMethod::wrap)

  public fun parameterMapping(): ParameterMapping? =
      unwrap(this).getParameterMapping()?.let(ParameterMapping::wrap)

  public fun payloadFormatVersion(): PayloadFormatVersion

  public fun secureServerName(): String? = unwrap(this).getSecureServerName()

  public fun subtype(): HttpIntegrationSubtype? =
      unwrap(this).getSubtype()?.let(HttpIntegrationSubtype::wrap)

  public fun type(): HttpIntegrationType

  public fun uri(): String? = unwrap(this).getUri()

  @CdkDslMarker
  public interface Builder {
    public fun connectionId(connectionId: String)

    public fun connectionType(connectionType: HttpConnectionType)

    public fun credentials(credentials: IntegrationCredentials)

    public fun method(method: HttpMethod)

    public fun parameterMapping(parameterMapping: ParameterMapping)

    public fun payloadFormatVersion(payloadFormatVersion: PayloadFormatVersion)

    public fun secureServerName(secureServerName: String)

    public fun subtype(subtype: HttpIntegrationSubtype)

    public fun type(type: HttpIntegrationType)

    public fun uri(uri: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationConfig.Builder =
        software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationConfig.builder()

    override fun connectionId(connectionId: String) {
      cdkBuilder.connectionId(connectionId)
    }

    override fun connectionType(connectionType: HttpConnectionType) {
      cdkBuilder.connectionType(connectionType.let(HttpConnectionType::unwrap))
    }

    override fun credentials(credentials: IntegrationCredentials) {
      cdkBuilder.credentials(credentials.let(IntegrationCredentials::unwrap))
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

    override fun subtype(subtype: HttpIntegrationSubtype) {
      cdkBuilder.subtype(subtype.let(HttpIntegrationSubtype::unwrap))
    }

    override fun type(type: HttpIntegrationType) {
      cdkBuilder.type(type.let(HttpIntegrationType::unwrap))
    }

    override fun uri(uri: String) {
      cdkBuilder.uri(uri)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationConfig,
  ) : CdkObject(cdkObject), HttpRouteIntegrationConfig {
    override fun connectionId(): String? = unwrap(this).getConnectionId()

    override fun connectionType(): HttpConnectionType? =
        unwrap(this).getConnectionType()?.let(HttpConnectionType::wrap)

    override fun credentials(): IntegrationCredentials? =
        unwrap(this).getCredentials()?.let(IntegrationCredentials::wrap)

    override fun method(): HttpMethod? = unwrap(this).getMethod()?.let(HttpMethod::wrap)

    override fun parameterMapping(): ParameterMapping? =
        unwrap(this).getParameterMapping()?.let(ParameterMapping::wrap)

    override fun payloadFormatVersion(): PayloadFormatVersion =
        unwrap(this).getPayloadFormatVersion().let(PayloadFormatVersion::wrap)

    override fun secureServerName(): String? = unwrap(this).getSecureServerName()

    override fun subtype(): HttpIntegrationSubtype? =
        unwrap(this).getSubtype()?.let(HttpIntegrationSubtype::wrap)

    override fun type(): HttpIntegrationType = unwrap(this).getType().let(HttpIntegrationType::wrap)

    override fun uri(): String? = unwrap(this).getUri()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpRouteIntegrationConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationConfig):
        HttpRouteIntegrationConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpRouteIntegrationConfig):
        software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationConfig = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationConfig
  }
}
