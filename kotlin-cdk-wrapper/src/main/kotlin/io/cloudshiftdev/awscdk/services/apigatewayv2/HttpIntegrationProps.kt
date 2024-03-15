@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * The integration properties.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * HttpApi httpApi;
 * IntegrationCredentials integrationCredentials;
 * ParameterMapping parameterMapping;
 * PayloadFormatVersion payloadFormatVersion;
 * HttpIntegrationProps httpIntegrationProps = HttpIntegrationProps.builder()
 * .httpApi(httpApi)
 * .integrationType(HttpIntegrationType.HTTP_PROXY)
 * // the properties below are optional
 * .connectionId("connectionId")
 * .connectionType(HttpConnectionType.VPC_LINK)
 * .credentials(integrationCredentials)
 * .integrationSubtype(HttpIntegrationSubtype.EVENTBRIDGE_PUT_EVENTS)
 * .integrationUri("integrationUri")
 * .method(HttpMethod.ANY)
 * .parameterMapping(parameterMapping)
 * .payloadFormatVersion(payloadFormatVersion)
 * .secureServerName("secureServerName")
 * .build();
 * ```
 */
public interface HttpIntegrationProps {
  /**
   * The ID of the VPC link for a private integration.
   *
   * Supported only for HTTP APIs.
   *
   * Default: - undefined
   */
  public fun connectionId(): String? = unwrap(this).getConnectionId()

  /**
   * The type of the network connection to the integration endpoint.
   *
   * Default: HttpConnectionType.INTERNET
   */
  public fun connectionType(): HttpConnectionType? =
      unwrap(this).getConnectionType()?.let(HttpConnectionType::wrap)

  /**
   * The credentials with which to invoke the integration.
   *
   * Default: - no credentials, use resource-based permissions on supported AWS services
   */
  public fun credentials(): IntegrationCredentials? =
      unwrap(this).getCredentials()?.let(IntegrationCredentials::wrap)

  /**
   * The HTTP API to which this integration should be bound.
   */
  public fun httpApi(): IHttpApi

  /**
   * Integration subtype.
   *
   * Used for AWS Service integrations, specifies the target of the integration.
   *
   * Default: - none, required if no `integrationUri` is defined.
   */
  public fun integrationSubtype(): HttpIntegrationSubtype? =
      unwrap(this).getIntegrationSubtype()?.let(HttpIntegrationSubtype::wrap)

  /**
   * Integration type.
   */
  public fun integrationType(): HttpIntegrationType

  /**
   * Integration URI.
   *
   * This will be the function ARN in the case of `HttpIntegrationType.AWS_PROXY`,
   * or HTTP URL in the case of `HttpIntegrationType.HTTP_PROXY`.
   *
   * Default: - none, required if no `integrationSubtype` is defined.
   */
  public fun integrationUri(): String? = unwrap(this).getIntegrationUri()

  /**
   * The HTTP method to use when calling the underlying HTTP proxy.
   *
   * Default: - none. required if the integration type is `HttpIntegrationType.HTTP_PROXY`.
   */
  public fun method(): HttpMethod? = unwrap(this).getMethod()?.let(HttpMethod::wrap)

  /**
   * Specifies how to transform HTTP requests before sending them to the backend.
   *
   * Default: undefined requests are sent to the backend unmodified
   *
   * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html)
   */
  public fun parameterMapping(): ParameterMapping? =
      unwrap(this).getParameterMapping()?.let(ParameterMapping::wrap)

  /**
   * The version of the payload format.
   *
   * Default: - defaults to latest in the case of HttpIntegrationType.AWS_PROXY`, irrelevant
   * otherwise.
   *
   * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html)
   */
  public fun payloadFormatVersion(): PayloadFormatVersion? =
      unwrap(this).getPayloadFormatVersion()?.let(PayloadFormatVersion::wrap)

  /**
   * Specifies the TLS configuration for a private integration.
   *
   * Default: undefined private integration traffic will use HTTP protocol
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-tlsconfig.html)
   */
  public fun secureServerName(): String? = unwrap(this).getSecureServerName()

  /**
   * A builder for [HttpIntegrationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param connectionId The ID of the VPC link for a private integration.
     * Supported only for HTTP APIs.
     */
    public fun connectionId(connectionId: String)

    /**
     * @param connectionType The type of the network connection to the integration endpoint.
     */
    public fun connectionType(connectionType: HttpConnectionType)

    /**
     * @param credentials The credentials with which to invoke the integration.
     */
    public fun credentials(credentials: IntegrationCredentials)

    /**
     * @param httpApi The HTTP API to which this integration should be bound. 
     */
    public fun httpApi(httpApi: IHttpApi)

    /**
     * @param integrationSubtype Integration subtype.
     * Used for AWS Service integrations, specifies the target of the integration.
     */
    public fun integrationSubtype(integrationSubtype: HttpIntegrationSubtype)

    /**
     * @param integrationType Integration type. 
     */
    public fun integrationType(integrationType: HttpIntegrationType)

    /**
     * @param integrationUri Integration URI.
     * This will be the function ARN in the case of `HttpIntegrationType.AWS_PROXY`,
     * or HTTP URL in the case of `HttpIntegrationType.HTTP_PROXY`.
     */
    public fun integrationUri(integrationUri: String)

    /**
     * @param method The HTTP method to use when calling the underlying HTTP proxy.
     */
    public fun method(method: HttpMethod)

    /**
     * @param parameterMapping Specifies how to transform HTTP requests before sending them to the
     * backend.
     */
    public fun parameterMapping(parameterMapping: ParameterMapping)

    /**
     * @param payloadFormatVersion The version of the payload format.
     */
    public fun payloadFormatVersion(payloadFormatVersion: PayloadFormatVersion)

    /**
     * @param secureServerName Specifies the TLS configuration for a private integration.
     */
    public fun secureServerName(secureServerName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.HttpIntegrationProps.Builder =
        software.amazon.awscdk.services.apigatewayv2.HttpIntegrationProps.builder()

    /**
     * @param connectionId The ID of the VPC link for a private integration.
     * Supported only for HTTP APIs.
     */
    override fun connectionId(connectionId: String) {
      cdkBuilder.connectionId(connectionId)
    }

    /**
     * @param connectionType The type of the network connection to the integration endpoint.
     */
    override fun connectionType(connectionType: HttpConnectionType) {
      cdkBuilder.connectionType(connectionType.let(HttpConnectionType::unwrap))
    }

    /**
     * @param credentials The credentials with which to invoke the integration.
     */
    override fun credentials(credentials: IntegrationCredentials) {
      cdkBuilder.credentials(credentials.let(IntegrationCredentials::unwrap))
    }

    /**
     * @param httpApi The HTTP API to which this integration should be bound. 
     */
    override fun httpApi(httpApi: IHttpApi) {
      cdkBuilder.httpApi(httpApi.let(IHttpApi::unwrap))
    }

    /**
     * @param integrationSubtype Integration subtype.
     * Used for AWS Service integrations, specifies the target of the integration.
     */
    override fun integrationSubtype(integrationSubtype: HttpIntegrationSubtype) {
      cdkBuilder.integrationSubtype(integrationSubtype.let(HttpIntegrationSubtype::unwrap))
    }

    /**
     * @param integrationType Integration type. 
     */
    override fun integrationType(integrationType: HttpIntegrationType) {
      cdkBuilder.integrationType(integrationType.let(HttpIntegrationType::unwrap))
    }

    /**
     * @param integrationUri Integration URI.
     * This will be the function ARN in the case of `HttpIntegrationType.AWS_PROXY`,
     * or HTTP URL in the case of `HttpIntegrationType.HTTP_PROXY`.
     */
    override fun integrationUri(integrationUri: String) {
      cdkBuilder.integrationUri(integrationUri)
    }

    /**
     * @param method The HTTP method to use when calling the underlying HTTP proxy.
     */
    override fun method(method: HttpMethod) {
      cdkBuilder.method(method.let(HttpMethod::unwrap))
    }

    /**
     * @param parameterMapping Specifies how to transform HTTP requests before sending them to the
     * backend.
     */
    override fun parameterMapping(parameterMapping: ParameterMapping) {
      cdkBuilder.parameterMapping(parameterMapping.let(ParameterMapping::unwrap))
    }

    /**
     * @param payloadFormatVersion The version of the payload format.
     */
    override fun payloadFormatVersion(payloadFormatVersion: PayloadFormatVersion) {
      cdkBuilder.payloadFormatVersion(payloadFormatVersion.let(PayloadFormatVersion::unwrap))
    }

    /**
     * @param secureServerName Specifies the TLS configuration for a private integration.
     */
    override fun secureServerName(secureServerName: String) {
      cdkBuilder.secureServerName(secureServerName)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.HttpIntegrationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpIntegrationProps,
  ) : CdkObject(cdkObject), HttpIntegrationProps {
    /**
     * The ID of the VPC link for a private integration.
     *
     * Supported only for HTTP APIs.
     *
     * Default: - undefined
     */
    override fun connectionId(): String? = unwrap(this).getConnectionId()

    /**
     * The type of the network connection to the integration endpoint.
     *
     * Default: HttpConnectionType.INTERNET
     */
    override fun connectionType(): HttpConnectionType? =
        unwrap(this).getConnectionType()?.let(HttpConnectionType::wrap)

    /**
     * The credentials with which to invoke the integration.
     *
     * Default: - no credentials, use resource-based permissions on supported AWS services
     */
    override fun credentials(): IntegrationCredentials? =
        unwrap(this).getCredentials()?.let(IntegrationCredentials::wrap)

    /**
     * The HTTP API to which this integration should be bound.
     */
    override fun httpApi(): IHttpApi = unwrap(this).getHttpApi().let(IHttpApi::wrap)

    /**
     * Integration subtype.
     *
     * Used for AWS Service integrations, specifies the target of the integration.
     *
     * Default: - none, required if no `integrationUri` is defined.
     */
    override fun integrationSubtype(): HttpIntegrationSubtype? =
        unwrap(this).getIntegrationSubtype()?.let(HttpIntegrationSubtype::wrap)

    /**
     * Integration type.
     */
    override fun integrationType(): HttpIntegrationType =
        unwrap(this).getIntegrationType().let(HttpIntegrationType::wrap)

    /**
     * Integration URI.
     *
     * This will be the function ARN in the case of `HttpIntegrationType.AWS_PROXY`,
     * or HTTP URL in the case of `HttpIntegrationType.HTTP_PROXY`.
     *
     * Default: - none, required if no `integrationSubtype` is defined.
     */
    override fun integrationUri(): String? = unwrap(this).getIntegrationUri()

    /**
     * The HTTP method to use when calling the underlying HTTP proxy.
     *
     * Default: - none. required if the integration type is `HttpIntegrationType.HTTP_PROXY`.
     */
    override fun method(): HttpMethod? = unwrap(this).getMethod()?.let(HttpMethod::wrap)

    /**
     * Specifies how to transform HTTP requests before sending them to the backend.
     *
     * Default: undefined requests are sent to the backend unmodified
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html)
     */
    override fun parameterMapping(): ParameterMapping? =
        unwrap(this).getParameterMapping()?.let(ParameterMapping::wrap)

    /**
     * The version of the payload format.
     *
     * Default: - defaults to latest in the case of HttpIntegrationType.AWS_PROXY`, irrelevant
     * otherwise.
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html)
     */
    override fun payloadFormatVersion(): PayloadFormatVersion? =
        unwrap(this).getPayloadFormatVersion()?.let(PayloadFormatVersion::wrap)

    /**
     * Specifies the TLS configuration for a private integration.
     *
     * Default: undefined private integration traffic will use HTTP protocol
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-tlsconfig.html)
     */
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
