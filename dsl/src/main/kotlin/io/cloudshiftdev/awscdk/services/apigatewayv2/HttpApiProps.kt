package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface HttpApiProps {
  /**
   * Name for the HTTP API resource.
   *
   * Default: - id of the HttpApi construct.
   */
  public fun apiName(): String? = unwrap(this).getApiName()

  /**
   * Specifies a CORS configuration for an API.
   *
   * Default: - CORS disabled.
   *
   * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html)
   */
  public fun corsPreflight(): CorsPreflightOptions? =
      unwrap(this).getCorsPreflight()?.let(CorsPreflightOptions::wrap)

  /**
   * Whether a default stage and deployment should be automatically created.
   *
   * Default: true
   */
  public fun createDefaultStage(): Boolean? = unwrap(this).getCreateDefaultStage()

  /**
   * Default OIDC scopes attached to all routes in the gateway, unless explicitly configured on the
   * route.
   *
   * The scopes are used with a COGNITO_USER_POOLS authorizer to authorize the method invocation.
   *
   * Default: - no default authorization scopes
   */
  public fun defaultAuthorizationScopes(): List<String> =
      unwrap(this).getDefaultAuthorizationScopes() ?: emptyList()

  /**
   * Default Authorizer applied to all routes in the gateway.
   *
   * Default: - no default authorizer
   */
  public fun defaultAuthorizer(): IHttpRouteAuthorizer? =
      unwrap(this).getDefaultAuthorizer()?.let(IHttpRouteAuthorizer::wrap)

  /**
   * Configure a custom domain with the API mapping resource to the HTTP API.
   *
   * Default: - no default domain mapping configured. meaningless if `createDefaultStage` is
   * `false`.
   */
  public fun defaultDomainMapping(): DomainMappingOptions? =
      unwrap(this).getDefaultDomainMapping()?.let(DomainMappingOptions::wrap)

  /**
   * An integration that will be configured on the catch-all route ($default).
   *
   * Default: - none
   */
  public fun defaultIntegration(): HttpRouteIntegration? =
      unwrap(this).getDefaultIntegration()?.let(HttpRouteIntegration::wrap)

  /**
   * The description of the API.
   *
   * Default: - none
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Specifies whether clients can invoke your API using the default endpoint.
   *
   * By default, clients can invoke your API with the default
   * `https://{api_id}.execute-api.{region}.amazonaws.com` endpoint. Enable
   * this if you would like clients to use your custom domain name.
   *
   * Default: false execute-api endpoint enabled.
   */
  public fun disableExecuteApiEndpoint(): Boolean? = unwrap(this).getDisableExecuteApiEndpoint()

  /**
   * A builder for [HttpApiProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiName Name for the HTTP API resource.
     */
    public fun apiName(apiName: String)

    /**
     * @param corsPreflight Specifies a CORS configuration for an API.
     */
    public fun corsPreflight(corsPreflight: CorsPreflightOptions)

    /**
     * @param corsPreflight Specifies a CORS configuration for an API.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b66409cd8d01fd0f2616915cc1ce989364df831ffc90497343cfecf7670564b0")
    public fun corsPreflight(corsPreflight: CorsPreflightOptions.Builder.() -> Unit)

    /**
     * @param createDefaultStage Whether a default stage and deployment should be automatically
     * created.
     */
    public fun createDefaultStage(createDefaultStage: Boolean)

    /**
     * @param defaultAuthorizationScopes Default OIDC scopes attached to all routes in the gateway,
     * unless explicitly configured on the route.
     * The scopes are used with a COGNITO_USER_POOLS authorizer to authorize the method invocation.
     */
    public fun defaultAuthorizationScopes(defaultAuthorizationScopes: List<String>)

    /**
     * @param defaultAuthorizationScopes Default OIDC scopes attached to all routes in the gateway,
     * unless explicitly configured on the route.
     * The scopes are used with a COGNITO_USER_POOLS authorizer to authorize the method invocation.
     */
    public fun defaultAuthorizationScopes(vararg defaultAuthorizationScopes: String)

    /**
     * @param defaultAuthorizer Default Authorizer applied to all routes in the gateway.
     */
    public fun defaultAuthorizer(defaultAuthorizer: IHttpRouteAuthorizer)

    /**
     * @param defaultDomainMapping Configure a custom domain with the API mapping resource to the
     * HTTP API.
     */
    public fun defaultDomainMapping(defaultDomainMapping: DomainMappingOptions)

    /**
     * @param defaultDomainMapping Configure a custom domain with the API mapping resource to the
     * HTTP API.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b857e97490b01547d9f712466f7663df3a7c1a793a918682297c6451345bbb9a")
    public fun defaultDomainMapping(defaultDomainMapping: DomainMappingOptions.Builder.() -> Unit)

    /**
     * @param defaultIntegration An integration that will be configured on the catch-all route
     * ($default).
     */
    public fun defaultIntegration(defaultIntegration: HttpRouteIntegration)

    /**
     * @param description The description of the API.
     */
    public fun description(description: String)

    /**
     * @param disableExecuteApiEndpoint Specifies whether clients can invoke your API using the
     * default endpoint.
     * By default, clients can invoke your API with the default
     * `https://{api_id}.execute-api.{region}.amazonaws.com` endpoint. Enable
     * this if you would like clients to use your custom domain name.
     */
    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.HttpApiProps.Builder =
        software.amazon.awscdk.services.apigatewayv2.HttpApiProps.builder()

    /**
     * @param apiName Name for the HTTP API resource.
     */
    override fun apiName(apiName: String) {
      cdkBuilder.apiName(apiName)
    }

    /**
     * @param corsPreflight Specifies a CORS configuration for an API.
     */
    override fun corsPreflight(corsPreflight: CorsPreflightOptions) {
      cdkBuilder.corsPreflight(corsPreflight.let(CorsPreflightOptions::unwrap))
    }

    /**
     * @param corsPreflight Specifies a CORS configuration for an API.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b66409cd8d01fd0f2616915cc1ce989364df831ffc90497343cfecf7670564b0")
    override fun corsPreflight(corsPreflight: CorsPreflightOptions.Builder.() -> Unit): Unit =
        corsPreflight(CorsPreflightOptions(corsPreflight))

    /**
     * @param createDefaultStage Whether a default stage and deployment should be automatically
     * created.
     */
    override fun createDefaultStage(createDefaultStage: Boolean) {
      cdkBuilder.createDefaultStage(createDefaultStage)
    }

    /**
     * @param defaultAuthorizationScopes Default OIDC scopes attached to all routes in the gateway,
     * unless explicitly configured on the route.
     * The scopes are used with a COGNITO_USER_POOLS authorizer to authorize the method invocation.
     */
    override fun defaultAuthorizationScopes(defaultAuthorizationScopes: List<String>) {
      cdkBuilder.defaultAuthorizationScopes(defaultAuthorizationScopes)
    }

    /**
     * @param defaultAuthorizationScopes Default OIDC scopes attached to all routes in the gateway,
     * unless explicitly configured on the route.
     * The scopes are used with a COGNITO_USER_POOLS authorizer to authorize the method invocation.
     */
    override fun defaultAuthorizationScopes(vararg defaultAuthorizationScopes: String): Unit =
        defaultAuthorizationScopes(defaultAuthorizationScopes.toList())

    /**
     * @param defaultAuthorizer Default Authorizer applied to all routes in the gateway.
     */
    override fun defaultAuthorizer(defaultAuthorizer: IHttpRouteAuthorizer) {
      cdkBuilder.defaultAuthorizer(defaultAuthorizer.let(IHttpRouteAuthorizer::unwrap))
    }

    /**
     * @param defaultDomainMapping Configure a custom domain with the API mapping resource to the
     * HTTP API.
     */
    override fun defaultDomainMapping(defaultDomainMapping: DomainMappingOptions) {
      cdkBuilder.defaultDomainMapping(defaultDomainMapping.let(DomainMappingOptions::unwrap))
    }

    /**
     * @param defaultDomainMapping Configure a custom domain with the API mapping resource to the
     * HTTP API.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b857e97490b01547d9f712466f7663df3a7c1a793a918682297c6451345bbb9a")
    override
        fun defaultDomainMapping(defaultDomainMapping: DomainMappingOptions.Builder.() -> Unit):
        Unit = defaultDomainMapping(DomainMappingOptions(defaultDomainMapping))

    /**
     * @param defaultIntegration An integration that will be configured on the catch-all route
     * ($default).
     */
    override fun defaultIntegration(defaultIntegration: HttpRouteIntegration) {
      cdkBuilder.defaultIntegration(defaultIntegration.let(HttpRouteIntegration::unwrap))
    }

    /**
     * @param description The description of the API.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param disableExecuteApiEndpoint Specifies whether clients can invoke your API using the
     * default endpoint.
     * By default, clients can invoke your API with the default
     * `https://{api_id}.execute-api.{region}.amazonaws.com` endpoint. Enable
     * this if you would like clients to use your custom domain name.
     */
    override fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean) {
      cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.HttpApiProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpApiProps,
  ) : CdkObject(cdkObject), HttpApiProps {
    /**
     * Name for the HTTP API resource.
     *
     * Default: - id of the HttpApi construct.
     */
    override fun apiName(): String? = unwrap(this).getApiName()

    /**
     * Specifies a CORS configuration for an API.
     *
     * Default: - CORS disabled.
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html)
     */
    override fun corsPreflight(): CorsPreflightOptions? =
        unwrap(this).getCorsPreflight()?.let(CorsPreflightOptions::wrap)

    /**
     * Whether a default stage and deployment should be automatically created.
     *
     * Default: true
     */
    override fun createDefaultStage(): Boolean? = unwrap(this).getCreateDefaultStage()

    /**
     * Default OIDC scopes attached to all routes in the gateway, unless explicitly configured on
     * the route.
     *
     * The scopes are used with a COGNITO_USER_POOLS authorizer to authorize the method invocation.
     *
     * Default: - no default authorization scopes
     */
    override fun defaultAuthorizationScopes(): List<String> =
        unwrap(this).getDefaultAuthorizationScopes() ?: emptyList()

    /**
     * Default Authorizer applied to all routes in the gateway.
     *
     * Default: - no default authorizer
     */
    override fun defaultAuthorizer(): IHttpRouteAuthorizer? =
        unwrap(this).getDefaultAuthorizer()?.let(IHttpRouteAuthorizer::wrap)

    /**
     * Configure a custom domain with the API mapping resource to the HTTP API.
     *
     * Default: - no default domain mapping configured. meaningless if `createDefaultStage` is
     * `false`.
     */
    override fun defaultDomainMapping(): DomainMappingOptions? =
        unwrap(this).getDefaultDomainMapping()?.let(DomainMappingOptions::wrap)

    /**
     * An integration that will be configured on the catch-all route ($default).
     *
     * Default: - none
     */
    override fun defaultIntegration(): HttpRouteIntegration? =
        unwrap(this).getDefaultIntegration()?.let(HttpRouteIntegration::wrap)

    /**
     * The description of the API.
     *
     * Default: - none
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Specifies whether clients can invoke your API using the default endpoint.
     *
     * By default, clients can invoke your API with the default
     * `https://{api_id}.execute-api.{region}.amazonaws.com` endpoint. Enable
     * this if you would like clients to use your custom domain name.
     *
     * Default: false execute-api endpoint enabled.
     */
    override fun disableExecuteApiEndpoint(): Boolean? = unwrap(this).getDisableExecuteApiEndpoint()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpApiProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpApiProps):
        HttpApiProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpApiProps):
        software.amazon.awscdk.services.apigatewayv2.HttpApiProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigatewayv2.HttpApiProps
  }
}
