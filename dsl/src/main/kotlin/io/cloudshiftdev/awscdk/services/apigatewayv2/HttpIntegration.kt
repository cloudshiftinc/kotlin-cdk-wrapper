package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class HttpIntegration internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpIntegration,
) : Resource(cdkObject), IHttpIntegration {
  /**
   * The HTTP API associated with this integration.
   */
  public override fun httpApi(): IHttpApi = unwrap(this).getHttpApi().let(IHttpApi::wrap)

  /**
   * Id of the integration.
   */
  public override fun integrationId(): String = unwrap(this).getIntegrationId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigatewayv2.HttpIntegration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the VPC link for a private integration.
     *
     * Supported only for HTTP APIs.
     *
     * Default: - undefined
     *
     * @param connectionId The ID of the VPC link for a private integration. 
     */
    public fun connectionId(connectionId: String)

    /**
     * The type of the network connection to the integration endpoint.
     *
     * Default: HttpConnectionType.INTERNET
     *
     * @param connectionType The type of the network connection to the integration endpoint. 
     */
    public fun connectionType(connectionType: HttpConnectionType)

    /**
     * The credentials with which to invoke the integration.
     *
     * Default: - no credentials, use resource-based permissions on supported AWS services
     *
     * @param credentials The credentials with which to invoke the integration. 
     */
    public fun credentials(credentials: IntegrationCredentials)

    /**
     * The HTTP API to which this integration should be bound.
     *
     * @param httpApi The HTTP API to which this integration should be bound. 
     */
    public fun httpApi(httpApi: IHttpApi)

    /**
     * Integration subtype.
     *
     * Used for AWS Service integrations, specifies the target of the integration.
     *
     * Default: - none, required if no `integrationUri` is defined.
     *
     * @param integrationSubtype Integration subtype. 
     */
    public fun integrationSubtype(integrationSubtype: HttpIntegrationSubtype)

    /**
     * Integration type.
     *
     * @param integrationType Integration type. 
     */
    public fun integrationType(integrationType: HttpIntegrationType)

    /**
     * Integration URI.
     *
     * This will be the function ARN in the case of `HttpIntegrationType.AWS_PROXY`,
     * or HTTP URL in the case of `HttpIntegrationType.HTTP_PROXY`.
     *
     * Default: - none, required if no `integrationSubtype` is defined.
     *
     * @param integrationUri Integration URI. 
     */
    public fun integrationUri(integrationUri: String)

    /**
     * The HTTP method to use when calling the underlying HTTP proxy.
     *
     * Default: - none. required if the integration type is `HttpIntegrationType.HTTP_PROXY`.
     *
     * @param method The HTTP method to use when calling the underlying HTTP proxy. 
     */
    public fun method(method: HttpMethod)

    /**
     * Specifies how to transform HTTP requests before sending them to the backend.
     *
     * Default: undefined requests are sent to the backend unmodified
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html)
     * @param parameterMapping Specifies how to transform HTTP requests before sending them to the
     * backend. 
     */
    public fun parameterMapping(parameterMapping: ParameterMapping)

    /**
     * The version of the payload format.
     *
     * Default: - defaults to latest in the case of HttpIntegrationType.AWS_PROXY`, irrelevant
     * otherwise.
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html)
     * @param payloadFormatVersion The version of the payload format. 
     */
    public fun payloadFormatVersion(payloadFormatVersion: PayloadFormatVersion)

    /**
     * Specifies the TLS configuration for a private integration.
     *
     * Default: undefined private integration traffic will use HTTP protocol
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-tlsconfig.html)
     * @param secureServerName Specifies the TLS configuration for a private integration. 
     */
    public fun secureServerName(secureServerName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.HttpIntegration.Builder =
        software.amazon.awscdk.services.apigatewayv2.HttpIntegration.Builder.create(scope, id)

    /**
     * The ID of the VPC link for a private integration.
     *
     * Supported only for HTTP APIs.
     *
     * Default: - undefined
     *
     * @param connectionId The ID of the VPC link for a private integration. 
     */
    override fun connectionId(connectionId: String) {
      cdkBuilder.connectionId(connectionId)
    }

    /**
     * The type of the network connection to the integration endpoint.
     *
     * Default: HttpConnectionType.INTERNET
     *
     * @param connectionType The type of the network connection to the integration endpoint. 
     */
    override fun connectionType(connectionType: HttpConnectionType) {
      cdkBuilder.connectionType(connectionType.let(HttpConnectionType::unwrap))
    }

    /**
     * The credentials with which to invoke the integration.
     *
     * Default: - no credentials, use resource-based permissions on supported AWS services
     *
     * @param credentials The credentials with which to invoke the integration. 
     */
    override fun credentials(credentials: IntegrationCredentials) {
      cdkBuilder.credentials(credentials.let(IntegrationCredentials::unwrap))
    }

    /**
     * The HTTP API to which this integration should be bound.
     *
     * @param httpApi The HTTP API to which this integration should be bound. 
     */
    override fun httpApi(httpApi: IHttpApi) {
      cdkBuilder.httpApi(httpApi.let(IHttpApi::unwrap))
    }

    /**
     * Integration subtype.
     *
     * Used for AWS Service integrations, specifies the target of the integration.
     *
     * Default: - none, required if no `integrationUri` is defined.
     *
     * @param integrationSubtype Integration subtype. 
     */
    override fun integrationSubtype(integrationSubtype: HttpIntegrationSubtype) {
      cdkBuilder.integrationSubtype(integrationSubtype.let(HttpIntegrationSubtype::unwrap))
    }

    /**
     * Integration type.
     *
     * @param integrationType Integration type. 
     */
    override fun integrationType(integrationType: HttpIntegrationType) {
      cdkBuilder.integrationType(integrationType.let(HttpIntegrationType::unwrap))
    }

    /**
     * Integration URI.
     *
     * This will be the function ARN in the case of `HttpIntegrationType.AWS_PROXY`,
     * or HTTP URL in the case of `HttpIntegrationType.HTTP_PROXY`.
     *
     * Default: - none, required if no `integrationSubtype` is defined.
     *
     * @param integrationUri Integration URI. 
     */
    override fun integrationUri(integrationUri: String) {
      cdkBuilder.integrationUri(integrationUri)
    }

    /**
     * The HTTP method to use when calling the underlying HTTP proxy.
     *
     * Default: - none. required if the integration type is `HttpIntegrationType.HTTP_PROXY`.
     *
     * @param method The HTTP method to use when calling the underlying HTTP proxy. 
     */
    override fun method(method: HttpMethod) {
      cdkBuilder.method(method.let(HttpMethod::unwrap))
    }

    /**
     * Specifies how to transform HTTP requests before sending them to the backend.
     *
     * Default: undefined requests are sent to the backend unmodified
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html)
     * @param parameterMapping Specifies how to transform HTTP requests before sending them to the
     * backend. 
     */
    override fun parameterMapping(parameterMapping: ParameterMapping) {
      cdkBuilder.parameterMapping(parameterMapping.let(ParameterMapping::unwrap))
    }

    /**
     * The version of the payload format.
     *
     * Default: - defaults to latest in the case of HttpIntegrationType.AWS_PROXY`, irrelevant
     * otherwise.
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html)
     * @param payloadFormatVersion The version of the payload format. 
     */
    override fun payloadFormatVersion(payloadFormatVersion: PayloadFormatVersion) {
      cdkBuilder.payloadFormatVersion(payloadFormatVersion.let(PayloadFormatVersion::unwrap))
    }

    /**
     * Specifies the TLS configuration for a private integration.
     *
     * Default: undefined private integration traffic will use HTTP protocol
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-tlsconfig.html)
     * @param secureServerName Specifies the TLS configuration for a private integration. 
     */
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
