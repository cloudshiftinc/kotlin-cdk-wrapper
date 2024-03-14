package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.Resource
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class HttpIntegration internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpIntegration,
) : Resource(cdkObject), IHttpIntegration {
  public override fun httpApi(): IHttpApi = unwrap(this).getHttpApi().let(IHttpApi::wrap)

  public override fun integrationId(): String = unwrap(this).getIntegrationId()

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.HttpIntegration.Builder =
        software.amazon.awscdk.services.apigatewayv2.HttpIntegration.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.apigatewayv2.HttpIntegration =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): HttpIntegration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return HttpIntegration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpIntegration):
        HttpIntegration = HttpIntegration(cdkObject)

    internal fun unwrap(wrapped: HttpIntegration):
        software.amazon.awscdk.services.apigatewayv2.HttpIntegration = wrapped.cdkObject
  }
}
