@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Config returned back as a result of the bind.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * IntegrationCredentials integrationCredentials;
 * ParameterMapping parameterMapping;
 * PayloadFormatVersion payloadFormatVersion;
 * HttpRouteIntegrationConfig httpRouteIntegrationConfig = HttpRouteIntegrationConfig.builder()
 * .payloadFormatVersion(payloadFormatVersion)
 * .type(HttpIntegrationType.HTTP_PROXY)
 * // the properties below are optional
 * .connectionId("connectionId")
 * .connectionType(HttpConnectionType.VPC_LINK)
 * .credentials(integrationCredentials)
 * .method(HttpMethod.ANY)
 * .parameterMapping(parameterMapping)
 * .secureServerName("secureServerName")
 * .subtype(HttpIntegrationSubtype.EVENTBRIDGE_PUT_EVENTS)
 * .uri("uri")
 * .build();
 * ```
 */
public interface HttpRouteIntegrationConfig {
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
   * The HTTP method that must be used to invoke the underlying proxy.
   *
   * Required for `HttpIntegrationType.HTTP_PROXY`
   *
   * Default: - undefined
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
   * Payload format version in the case of lambda proxy integration.
   *
   * Default: - undefined
   *
   * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html)
   */
  public fun payloadFormatVersion(): PayloadFormatVersion

  /**
   * Specifies the server name to verified by HTTPS when calling the backend integration.
   *
   * Default: undefined private integration traffic will use HTTP protocol
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-tlsconfig.html)
   */
  public fun secureServerName(): String? = unwrap(this).getSecureServerName()

  /**
   * Integration subtype.
   *
   * Default: - none, required if no `integrationUri` is defined.
   */
  public fun subtype(): HttpIntegrationSubtype? =
      unwrap(this).getSubtype()?.let(HttpIntegrationSubtype::wrap)

  /**
   * Integration type.
   */
  public fun type(): HttpIntegrationType

  /**
   * Integration URI.
   *
   * Default: - none, required if no `integrationSubtype` is defined.
   */
  public fun uri(): String? = unwrap(this).getUri()

  /**
   * A builder for [HttpRouteIntegrationConfig]
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
     * @param method The HTTP method that must be used to invoke the underlying proxy.
     * Required for `HttpIntegrationType.HTTP_PROXY`
     */
    public fun method(method: HttpMethod)

    /**
     * @param parameterMapping Specifies how to transform HTTP requests before sending them to the
     * backend.
     */
    public fun parameterMapping(parameterMapping: ParameterMapping)

    /**
     * @param payloadFormatVersion Payload format version in the case of lambda proxy integration. 
     */
    public fun payloadFormatVersion(payloadFormatVersion: PayloadFormatVersion)

    /**
     * @param secureServerName Specifies the server name to verified by HTTPS when calling the
     * backend integration.
     */
    public fun secureServerName(secureServerName: String)

    /**
     * @param subtype Integration subtype.
     */
    public fun subtype(subtype: HttpIntegrationSubtype)

    /**
     * @param type Integration type. 
     */
    public fun type(type: HttpIntegrationType)

    /**
     * @param uri Integration URI.
     */
    public fun uri(uri: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationConfig.Builder =
        software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationConfig.builder()

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
     * @param method The HTTP method that must be used to invoke the underlying proxy.
     * Required for `HttpIntegrationType.HTTP_PROXY`
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
     * @param payloadFormatVersion Payload format version in the case of lambda proxy integration. 
     */
    override fun payloadFormatVersion(payloadFormatVersion: PayloadFormatVersion) {
      cdkBuilder.payloadFormatVersion(payloadFormatVersion.let(PayloadFormatVersion::unwrap))
    }

    /**
     * @param secureServerName Specifies the server name to verified by HTTPS when calling the
     * backend integration.
     */
    override fun secureServerName(secureServerName: String) {
      cdkBuilder.secureServerName(secureServerName)
    }

    /**
     * @param subtype Integration subtype.
     */
    override fun subtype(subtype: HttpIntegrationSubtype) {
      cdkBuilder.subtype(subtype.let(HttpIntegrationSubtype::unwrap))
    }

    /**
     * @param type Integration type. 
     */
    override fun type(type: HttpIntegrationType) {
      cdkBuilder.type(type.let(HttpIntegrationType::unwrap))
    }

    /**
     * @param uri Integration URI.
     */
    override fun uri(uri: String) {
      cdkBuilder.uri(uri)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationConfig,
  ) : CdkObject(cdkObject), HttpRouteIntegrationConfig {
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
     * The HTTP method that must be used to invoke the underlying proxy.
     *
     * Required for `HttpIntegrationType.HTTP_PROXY`
     *
     * Default: - undefined
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
     * Payload format version in the case of lambda proxy integration.
     *
     * Default: - undefined
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html)
     */
    override fun payloadFormatVersion(): PayloadFormatVersion =
        unwrap(this).getPayloadFormatVersion().let(PayloadFormatVersion::wrap)

    /**
     * Specifies the server name to verified by HTTPS when calling the backend integration.
     *
     * Default: undefined private integration traffic will use HTTP protocol
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-tlsconfig.html)
     */
    override fun secureServerName(): String? = unwrap(this).getSecureServerName()

    /**
     * Integration subtype.
     *
     * Default: - none, required if no `integrationUri` is defined.
     */
    override fun subtype(): HttpIntegrationSubtype? =
        unwrap(this).getSubtype()?.let(HttpIntegrationSubtype::wrap)

    /**
     * Integration type.
     */
    override fun type(): HttpIntegrationType = unwrap(this).getType().let(HttpIntegrationType::wrap)

    /**
     * Integration URI.
     *
     * Default: - none, required if no `integrationSubtype` is defined.
     */
    override fun uri(): String? = unwrap(this).getUri()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpRouteIntegrationConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationConfig):
        HttpRouteIntegrationConfig = CdkObjectWrappers.wrap(cdkObject) as?
        HttpRouteIntegrationConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpRouteIntegrationConfig):
        software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationConfig = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationConfig
  }
}
