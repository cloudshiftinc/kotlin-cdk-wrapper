@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Create a new API Gateway HTTP API endpoint.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegration;
 * Function booksDefaultFn;
 * HttpLambdaIntegration booksIntegration = new HttpLambdaIntegration("BooksIntegration",
 * booksDefaultFn);
 * HttpApi httpApi = new HttpApi(this, "HttpApi");
 * httpApi.addRoutes(AddRoutesOptions.builder()
 * .path("/books")
 * .methods(List.of(HttpMethod.GET))
 * .integration(booksIntegration)
 * .build());
 * ```
 */
public open class HttpApi(
  cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpApi,
) : Resource(cdkObject), IHttpApi, IApi {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.apigatewayv2.HttpApi(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: HttpApiProps,
  ) :
      this(software.amazon.awscdk.services.apigatewayv2.HttpApi(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(HttpApiProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: HttpApiProps.Builder.() -> Unit,
  ) : this(scope, id, HttpApiProps(props)
  )

  /**
   * Add multiple routes that uses the same configuration.
   *
   * The routes all go to the same path, but for different
   * methods.
   *
   * @param options 
   */
  public open fun addRoutes(options: AddRoutesOptions): List<HttpRoute> =
      unwrap(this).addRoutes(options.let(AddRoutesOptions.Companion::unwrap)).map(HttpRoute::wrap)

  /**
   * Add multiple routes that uses the same configuration.
   *
   * The routes all go to the same path, but for different
   * methods.
   *
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("92cc4c6d20a007ffcddba9007bbf5eed4df83c484cd7df9fd7da6ebe7f62cb0a")
  public open fun addRoutes(options: AddRoutesOptions.Builder.() -> Unit): List<HttpRoute> =
      addRoutes(AddRoutesOptions(options))

  /**
   * Add a new stage.
   *
   * @param id 
   * @param options 
   */
  public open fun addStage(id: String, options: HttpStageOptions): HttpStage =
      unwrap(this).addStage(id,
      options.let(HttpStageOptions.Companion::unwrap)).let(HttpStage::wrap)

  /**
   * Add a new stage.
   *
   * @param id 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d97cf72ee3ee9ef71dd516906159ca32c6e93f16098f9713cb2118da8fb08ee9")
  public open fun addStage(id: String, options: HttpStageOptions.Builder.() -> Unit): HttpStage =
      addStage(id, HttpStageOptions(options))

  /**
   * Add a new VpcLink.
   *
   * @param options 
   */
  public override fun addVpcLink(options: VpcLinkProps): VpcLink =
      unwrap(this).addVpcLink(options.let(VpcLinkProps.Companion::unwrap)).let(VpcLink::wrap)

  /**
   * Add a new VpcLink.
   *
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b6d123942454a2f6b39cc86261dd700999b1a3c76f0618d08f290fcb74fcc48d")
  public override fun addVpcLink(options: VpcLinkProps.Builder.() -> Unit): VpcLink =
      addVpcLink(VpcLinkProps(options))

  /**
   * Get the default endpoint for this API.
   */
  public override fun apiEndpoint(): String = unwrap(this).getApiEndpoint()

  /**
   * The identifier of this API Gateway API.
   */
  public override fun apiId(): String = unwrap(this).getApiId()

  /**
   * Get the "execute-api" ARN.
   *
   * When 'ANY' is passed to the method, an ARN with the method set to '*' is obtained.
   *
   * @param method
   * @param path
   * @param stage
   */
  public override fun arnForExecuteApi(): String = unwrap(this).arnForExecuteApi()

  /**
   * Get the "execute-api" ARN.
   *
   * When 'ANY' is passed to the method, an ARN with the method set to '*' is obtained.
   *
   * @param method
   * @param path
   * @param stage
   */
  public override fun arnForExecuteApi(method: String): String =
      unwrap(this).arnForExecuteApi(method)

  /**
   * Get the "execute-api" ARN.
   *
   * When 'ANY' is passed to the method, an ARN with the method set to '*' is obtained.
   *
   * @param method
   * @param path
   * @param stage
   */
  public override fun arnForExecuteApi(method: String, path: String): String =
      unwrap(this).arnForExecuteApi(method, path)

  /**
   * Get the "execute-api" ARN.
   *
   * When 'ANY' is passed to the method, an ARN with the method set to '*' is obtained.
   *
   * @param method
   * @param path
   * @param stage
   */
  public override fun arnForExecuteApi(
    method: String,
    path: String,
    stage: String,
  ): String = unwrap(this).arnForExecuteApi(method, path, stage)

  /**
   * Default OIDC scopes attached to all routes in the gateway, unless explicitly configured on the
   * route.
   *
   * The scopes are used with a COGNITO_USER_POOLS authorizer to authorize the method invocation.
   */
  public override fun defaultAuthorizationScopes(): List<String> =
      unwrap(this).getDefaultAuthorizationScopes() ?: emptyList()

  /**
   * Default Authorizer applied to all routes in the gateway.
   */
  public override fun defaultAuthorizer(): IHttpRouteAuthorizer? =
      unwrap(this).getDefaultAuthorizer()?.let(IHttpRouteAuthorizer::wrap)

  /**
   * The default stage of this API.
   */
  public open fun defaultStage(): IHttpStage? =
      unwrap(this).getDefaultStage()?.let(IHttpStage::wrap)

  /**
   * Specifies whether clients can invoke this HTTP API by using the default execute-api endpoint.
   */
  public open fun disableExecuteApiEndpoint(): Boolean? =
      unwrap(this).getDisableExecuteApiEndpoint()

  /**
   * The identifier of the HTTP API.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-api.html#aws-resource-apigatewayv2-api-return-values)
   */
  public open fun httpApiId(): String = unwrap(this).getHttpApiId()

  /**
   * A human friendly name for this HTTP API.
   *
   * Note that this is different from `httpApiId`.
   */
  public open fun httpApiName(): String? = unwrap(this).getHttpApiName()

  /**
   * Return the given named metric for this Api Gateway.
   *
   * @param metricName 
   * @param props
   */
  public override fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  /**
   * Return the given named metric for this Api Gateway.
   *
   * @param metricName 
   * @param props
   */
  public override fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * Return the given named metric for this Api Gateway.
   *
   * @param metricName 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  /**
   * Metric for the number of client-side errors captured in a given period.
   *
   * @param props
   */
  public override fun metricClientError(): Metric =
      unwrap(this).metricClientError().let(Metric::wrap)

  /**
   * Metric for the number of client-side errors captured in a given period.
   *
   * @param props
   */
  public override fun metricClientError(props: MetricOptions): Metric =
      unwrap(this).metricClientError(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * Metric for the number of client-side errors captured in a given period.
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5505ff42fc21cd4fba3599e830eb78dffd8be3f9d219732553d074fecf68055b")
  public override fun metricClientError(props: MetricOptions.Builder.() -> Unit): Metric =
      metricClientError(MetricOptions(props))

  /**
   * Metric for the total number API requests in a given period.
   *
   * @param props
   */
  public override fun metricCount(): Metric = unwrap(this).metricCount().let(Metric::wrap)

  /**
   * Metric for the total number API requests in a given period.
   *
   * @param props
   */
  public override fun metricCount(props: MetricOptions): Metric =
      unwrap(this).metricCount(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * Metric for the total number API requests in a given period.
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f7f80cedd789a268d0830fe44e735c9121f05b22eec93abf1f99d5ef8407e94f")
  public override fun metricCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricCount(MetricOptions(props))

  /**
   * Metric for the amount of data processed in bytes.
   *
   * @param props
   */
  public override fun metricDataProcessed(): Metric =
      unwrap(this).metricDataProcessed().let(Metric::wrap)

  /**
   * Metric for the amount of data processed in bytes.
   *
   * @param props
   */
  public override fun metricDataProcessed(props: MetricOptions): Metric =
      unwrap(this).metricDataProcessed(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * Metric for the amount of data processed in bytes.
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f57c3511280d12729c02269edffb794ffffaf9f66f595c310c4332560248e8e1")
  public override fun metricDataProcessed(props: MetricOptions.Builder.() -> Unit): Metric =
      metricDataProcessed(MetricOptions(props))

  /**
   * Metric for the time between when API Gateway relays a request to the backend and when it
   * receives a response from the backend.
   *
   * @param props
   */
  public override fun metricIntegrationLatency(): Metric =
      unwrap(this).metricIntegrationLatency().let(Metric::wrap)

  /**
   * Metric for the time between when API Gateway relays a request to the backend and when it
   * receives a response from the backend.
   *
   * @param props
   */
  public override fun metricIntegrationLatency(props: MetricOptions): Metric =
      unwrap(this).metricIntegrationLatency(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * Metric for the time between when API Gateway relays a request to the backend and when it
   * receives a response from the backend.
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("159e7ed0c2cdbc75632ca4f139816b0c4f1e8244733708427495a470c92efc2a")
  public override fun metricIntegrationLatency(props: MetricOptions.Builder.() -> Unit): Metric =
      metricIntegrationLatency(MetricOptions(props))

  /**
   * The time between when API Gateway receives a request from a client and when it returns a
   * response to the client.
   *
   * The latency includes the integration latency and other API Gateway overhead.
   *
   * @param props
   */
  public override fun metricLatency(): Metric = unwrap(this).metricLatency().let(Metric::wrap)

  /**
   * The time between when API Gateway receives a request from a client and when it returns a
   * response to the client.
   *
   * The latency includes the integration latency and other API Gateway overhead.
   *
   * @param props
   */
  public override fun metricLatency(props: MetricOptions): Metric =
      unwrap(this).metricLatency(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * The time between when API Gateway receives a request from a client and when it returns a
   * response to the client.
   *
   * The latency includes the integration latency and other API Gateway overhead.
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("044777c9ac260e70c205111e250eb834d7f36a65a405946dde2e1fc0191b88dc")
  public override fun metricLatency(props: MetricOptions.Builder.() -> Unit): Metric =
      metricLatency(MetricOptions(props))

  /**
   * Metric for the number of server-side errors captured in a given period.
   *
   * @param props
   */
  public override fun metricServerError(): Metric =
      unwrap(this).metricServerError().let(Metric::wrap)

  /**
   * Metric for the number of server-side errors captured in a given period.
   *
   * @param props
   */
  public override fun metricServerError(props: MetricOptions): Metric =
      unwrap(this).metricServerError(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * Metric for the number of server-side errors captured in a given period.
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("52dfc1927ffde24e4de29d31f02378fd97ffce8a960d6b4abcf96c1e13e54e75")
  public override fun metricServerError(props: MetricOptions.Builder.() -> Unit): Metric =
      metricServerError(MetricOptions(props))

  /**
   * Get the URL to the default stage of this API.
   *
   * Returns `undefined` if `createDefaultStage` is unset.
   */
  public open fun url(): String? = unwrap(this).getUrl()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigatewayv2.HttpApi].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Name for the HTTP API resource.
     *
     * Default: - id of the HttpApi construct.
     *
     * @param apiName Name for the HTTP API resource. 
     */
    public fun apiName(apiName: String)

    /**
     * Specifies a CORS configuration for an API.
     *
     * Default: - CORS disabled.
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html)
     * @param corsPreflight Specifies a CORS configuration for an API. 
     */
    public fun corsPreflight(corsPreflight: CorsPreflightOptions)

    /**
     * Specifies a CORS configuration for an API.
     *
     * Default: - CORS disabled.
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html)
     * @param corsPreflight Specifies a CORS configuration for an API. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b49460585f110b22767f981852b093174e485a77aca089f8d86dde5a8099b33d")
    public fun corsPreflight(corsPreflight: CorsPreflightOptions.Builder.() -> Unit)

    /**
     * Whether a default stage and deployment should be automatically created.
     *
     * Default: true
     *
     * @param createDefaultStage Whether a default stage and deployment should be automatically
     * created. 
     */
    public fun createDefaultStage(createDefaultStage: Boolean)

    /**
     * Default OIDC scopes attached to all routes in the gateway, unless explicitly configured on
     * the route.
     *
     * The scopes are used with a COGNITO_USER_POOLS authorizer to authorize the method invocation.
     *
     * Default: - no default authorization scopes
     *
     * @param defaultAuthorizationScopes Default OIDC scopes attached to all routes in the gateway,
     * unless explicitly configured on the route. 
     */
    public fun defaultAuthorizationScopes(defaultAuthorizationScopes: List<String>)

    /**
     * Default OIDC scopes attached to all routes in the gateway, unless explicitly configured on
     * the route.
     *
     * The scopes are used with a COGNITO_USER_POOLS authorizer to authorize the method invocation.
     *
     * Default: - no default authorization scopes
     *
     * @param defaultAuthorizationScopes Default OIDC scopes attached to all routes in the gateway,
     * unless explicitly configured on the route. 
     */
    public fun defaultAuthorizationScopes(vararg defaultAuthorizationScopes: String)

    /**
     * Default Authorizer applied to all routes in the gateway.
     *
     * Default: - no default authorizer
     *
     * @param defaultAuthorizer Default Authorizer applied to all routes in the gateway. 
     */
    public fun defaultAuthorizer(defaultAuthorizer: IHttpRouteAuthorizer)

    /**
     * Configure a custom domain with the API mapping resource to the HTTP API.
     *
     * Default: - no default domain mapping configured. meaningless if `createDefaultStage` is
     * `false`.
     *
     * @param defaultDomainMapping Configure a custom domain with the API mapping resource to the
     * HTTP API. 
     */
    public fun defaultDomainMapping(defaultDomainMapping: DomainMappingOptions)

    /**
     * Configure a custom domain with the API mapping resource to the HTTP API.
     *
     * Default: - no default domain mapping configured. meaningless if `createDefaultStage` is
     * `false`.
     *
     * @param defaultDomainMapping Configure a custom domain with the API mapping resource to the
     * HTTP API. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4e313d90125e87c17209fe208803ecae8b7e44459880754b625235c1f04ac4e")
    public fun defaultDomainMapping(defaultDomainMapping: DomainMappingOptions.Builder.() -> Unit)

    /**
     * An integration that will be configured on the catch-all route ($default).
     *
     * Default: - none
     *
     * @param defaultIntegration An integration that will be configured on the catch-all route
     * ($default). 
     */
    public fun defaultIntegration(defaultIntegration: HttpRouteIntegration)

    /**
     * The description of the API.
     *
     * Default: - none
     *
     * @param description The description of the API. 
     */
    public fun description(description: String)

    /**
     * Specifies whether clients can invoke your API using the default endpoint.
     *
     * By default, clients can invoke your API with the default
     * `https://{api_id}.execute-api.{region}.amazonaws.com` endpoint. Enable
     * this if you would like clients to use your custom domain name.
     *
     * Default: false execute-api endpoint enabled.
     *
     * @param disableExecuteApiEndpoint Specifies whether clients can invoke your API using the
     * default endpoint. 
     */
    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.HttpApi.Builder =
        software.amazon.awscdk.services.apigatewayv2.HttpApi.Builder.create(scope, id)

    /**
     * Name for the HTTP API resource.
     *
     * Default: - id of the HttpApi construct.
     *
     * @param apiName Name for the HTTP API resource. 
     */
    override fun apiName(apiName: String) {
      cdkBuilder.apiName(apiName)
    }

    /**
     * Specifies a CORS configuration for an API.
     *
     * Default: - CORS disabled.
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html)
     * @param corsPreflight Specifies a CORS configuration for an API. 
     */
    override fun corsPreflight(corsPreflight: CorsPreflightOptions) {
      cdkBuilder.corsPreflight(corsPreflight.let(CorsPreflightOptions.Companion::unwrap))
    }

    /**
     * Specifies a CORS configuration for an API.
     *
     * Default: - CORS disabled.
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html)
     * @param corsPreflight Specifies a CORS configuration for an API. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b49460585f110b22767f981852b093174e485a77aca089f8d86dde5a8099b33d")
    override fun corsPreflight(corsPreflight: CorsPreflightOptions.Builder.() -> Unit): Unit =
        corsPreflight(CorsPreflightOptions(corsPreflight))

    /**
     * Whether a default stage and deployment should be automatically created.
     *
     * Default: true
     *
     * @param createDefaultStage Whether a default stage and deployment should be automatically
     * created. 
     */
    override fun createDefaultStage(createDefaultStage: Boolean) {
      cdkBuilder.createDefaultStage(createDefaultStage)
    }

    /**
     * Default OIDC scopes attached to all routes in the gateway, unless explicitly configured on
     * the route.
     *
     * The scopes are used with a COGNITO_USER_POOLS authorizer to authorize the method invocation.
     *
     * Default: - no default authorization scopes
     *
     * @param defaultAuthorizationScopes Default OIDC scopes attached to all routes in the gateway,
     * unless explicitly configured on the route. 
     */
    override fun defaultAuthorizationScopes(defaultAuthorizationScopes: List<String>) {
      cdkBuilder.defaultAuthorizationScopes(defaultAuthorizationScopes)
    }

    /**
     * Default OIDC scopes attached to all routes in the gateway, unless explicitly configured on
     * the route.
     *
     * The scopes are used with a COGNITO_USER_POOLS authorizer to authorize the method invocation.
     *
     * Default: - no default authorization scopes
     *
     * @param defaultAuthorizationScopes Default OIDC scopes attached to all routes in the gateway,
     * unless explicitly configured on the route. 
     */
    override fun defaultAuthorizationScopes(vararg defaultAuthorizationScopes: String): Unit =
        defaultAuthorizationScopes(defaultAuthorizationScopes.toList())

    /**
     * Default Authorizer applied to all routes in the gateway.
     *
     * Default: - no default authorizer
     *
     * @param defaultAuthorizer Default Authorizer applied to all routes in the gateway. 
     */
    override fun defaultAuthorizer(defaultAuthorizer: IHttpRouteAuthorizer) {
      cdkBuilder.defaultAuthorizer(defaultAuthorizer.let(IHttpRouteAuthorizer.Companion::unwrap))
    }

    /**
     * Configure a custom domain with the API mapping resource to the HTTP API.
     *
     * Default: - no default domain mapping configured. meaningless if `createDefaultStage` is
     * `false`.
     *
     * @param defaultDomainMapping Configure a custom domain with the API mapping resource to the
     * HTTP API. 
     */
    override fun defaultDomainMapping(defaultDomainMapping: DomainMappingOptions) {
      cdkBuilder.defaultDomainMapping(defaultDomainMapping.let(DomainMappingOptions.Companion::unwrap))
    }

    /**
     * Configure a custom domain with the API mapping resource to the HTTP API.
     *
     * Default: - no default domain mapping configured. meaningless if `createDefaultStage` is
     * `false`.
     *
     * @param defaultDomainMapping Configure a custom domain with the API mapping resource to the
     * HTTP API. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4e313d90125e87c17209fe208803ecae8b7e44459880754b625235c1f04ac4e")
    override
        fun defaultDomainMapping(defaultDomainMapping: DomainMappingOptions.Builder.() -> Unit):
        Unit = defaultDomainMapping(DomainMappingOptions(defaultDomainMapping))

    /**
     * An integration that will be configured on the catch-all route ($default).
     *
     * Default: - none
     *
     * @param defaultIntegration An integration that will be configured on the catch-all route
     * ($default). 
     */
    override fun defaultIntegration(defaultIntegration: HttpRouteIntegration) {
      cdkBuilder.defaultIntegration(defaultIntegration.let(HttpRouteIntegration.Companion::unwrap))
    }

    /**
     * The description of the API.
     *
     * Default: - none
     *
     * @param description The description of the API. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Specifies whether clients can invoke your API using the default endpoint.
     *
     * By default, clients can invoke your API with the default
     * `https://{api_id}.execute-api.{region}.amazonaws.com` endpoint. Enable
     * this if you would like clients to use your custom domain name.
     *
     * Default: false execute-api endpoint enabled.
     *
     * @param disableExecuteApiEndpoint Specifies whether clients can invoke your API using the
     * default endpoint. 
     */
    override fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean) {
      cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.HttpApi = cdkBuilder.build()
  }

  public companion object {
    public fun fromHttpApiAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: HttpApiAttributes,
    ): IHttpApi =
        software.amazon.awscdk.services.apigatewayv2.HttpApi.fromHttpApiAttributes(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, attrs.let(HttpApiAttributes.Companion::unwrap)).let(IHttpApi::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c9b4b99209a3a68f4c8659bb0daf044a2ac392e8ef0ae6869e278a39e0ba5131")
    public fun fromHttpApiAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: HttpApiAttributes.Builder.() -> Unit,
    ): IHttpApi = fromHttpApiAttributes(scope, id, HttpApiAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): HttpApi {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return HttpApi(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpApi): HttpApi =
        HttpApi(cdkObject)

    internal fun unwrap(wrapped: HttpApi): software.amazon.awscdk.services.apigatewayv2.HttpApi =
        wrapped.cdkObject as software.amazon.awscdk.services.apigatewayv2.HttpApi
  }
}
