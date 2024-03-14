package io.cloudshiftdev.awscdk.services.apigatewayv2

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

  public interface Builder {
    public fun connectionId(connectionId: String) {
    }

    public fun connectionType(connectionType: HttpConnectionType) {
    }

    public fun credentials(credentials: IntegrationCredentials) {
    }

    public fun method(method: HttpMethod) {
    }

    public fun parameterMapping(parameterMapping: ParameterMapping) {
    }

    public fun payloadFormatVersion(payloadFormatVersion: PayloadFormatVersion) {
    }

    public fun secureServerName(secureServerName: String) {
    }

    public fun subtype(subtype: HttpIntegrationSubtype) {
    }

    public fun type(type: HttpIntegrationType) {
    }

    public fun uri(uri: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationConfig.Builder =
        software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationConfig.builder()

    public override fun connectionId(connectionId: String) {
      cdkBuilder.connectionId(connectionId)
    }

    public override fun connectionType(connectionType: HttpConnectionType) {
      cdkBuilder.connectionType(connectionType.let(HttpConnectionType::unwrap))
    }

    public override fun credentials(credentials: IntegrationCredentials) {
      cdkBuilder.credentials(credentials.let(IntegrationCredentials::unwrap))
    }

    public override fun method(method: HttpMethod) {
      cdkBuilder.method(method.let(HttpMethod::unwrap))
    }

    public override fun parameterMapping(parameterMapping: ParameterMapping) {
      cdkBuilder.parameterMapping(parameterMapping.let(ParameterMapping::unwrap))
    }

    public override fun payloadFormatVersion(payloadFormatVersion: PayloadFormatVersion) {
      cdkBuilder.payloadFormatVersion(payloadFormatVersion.let(PayloadFormatVersion::unwrap))
    }

    public override fun secureServerName(secureServerName: String) {
      cdkBuilder.secureServerName(secureServerName)
    }

    public override fun subtype(subtype: HttpIntegrationSubtype) {
      cdkBuilder.subtype(subtype.let(HttpIntegrationSubtype::unwrap))
    }

    public override fun type(type: HttpIntegrationType) {
      cdkBuilder.type(type.let(HttpIntegrationType::unwrap))
    }

    public override fun uri(uri: String) {
      cdkBuilder.uri(uri)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationConfig,
  ) : HttpRouteIntegrationConfig {
    public override fun connectionId(): String? = unwrap(this).getConnectionId()

    public override fun connectionType(): HttpConnectionType? =
        unwrap(this).getConnectionType()?.let(HttpConnectionType::wrap)

    public override fun credentials(): IntegrationCredentials? =
        unwrap(this).getCredentials()?.let(IntegrationCredentials::wrap)

    public override fun method(): HttpMethod? = unwrap(this).getMethod()?.let(HttpMethod::wrap)

    public override fun parameterMapping(): ParameterMapping? =
        unwrap(this).getParameterMapping()?.let(ParameterMapping::wrap)

    public override fun payloadFormatVersion(): PayloadFormatVersion =
        unwrap(this).getPayloadFormatVersion().let(PayloadFormatVersion::wrap)

    public override fun secureServerName(): String? = unwrap(this).getSecureServerName()

    public override fun subtype(): HttpIntegrationSubtype? =
        unwrap(this).getSubtype()?.let(HttpIntegrationSubtype::wrap)

    public override fun type(): HttpIntegrationType =
        unwrap(this).getType().let(HttpIntegrationType::wrap)

    public override fun uri(): String? = unwrap(this).getUri()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): HttpRouteIntegrationConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationConfig):
        HttpRouteIntegrationConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpRouteIntegrationConfig):
        software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationConfig = (wrapped as
        Wrapper).cdkObject
  }
}
