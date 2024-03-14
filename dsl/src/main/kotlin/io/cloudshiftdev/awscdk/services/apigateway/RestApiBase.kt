package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class RestApiBase
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.apigateway.RestApiBase,
) : Resource(cdkObject), IRestApi {
    /**
     * Add an ApiKey to the deploymentStage.
     *
     * @param id
     * @param options
     */
    public open fun addApiKey(id: String): IApiKey = unwrap(this).addApiKey(id).let(IApiKey::wrap)

    /**
     * Add an ApiKey to the deploymentStage.
     *
     * @param id
     * @param options
     */
    public open fun addApiKey(id: String, options: ApiKeyOptions): IApiKey =
        unwrap(this).addApiKey(id, options.let(ApiKeyOptions::unwrap)).let(IApiKey::wrap)

    /**
     * Add an ApiKey to the deploymentStage.
     *
     * @param id
     * @param options
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f7ef06bb21f3062b3d57e1e4464d4d9bce5c5321ad41fa8f19d3cd5e9443547")
    public open fun addApiKey(id: String, options: ApiKeyOptions.Builder.() -> Unit): IApiKey =
        addApiKey(id, ApiKeyOptions(options))

    /**
     * Defines an API Gateway domain name and maps it to this API.
     *
     * @param id The construct id.
     * @param options custom domain options.
     */
    public open fun addDomainName(id: String, options: DomainNameOptions): DomainName =
        unwrap(this).addDomainName(id, options.let(DomainNameOptions::unwrap)).let(DomainName::wrap)

    /**
     * Defines an API Gateway domain name and maps it to this API.
     *
     * @param id The construct id.
     * @param options custom domain options.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("355b6095efa03cb78b744535cc778055b59eeb7900f72c9ec619dede81a091ad")
    public open fun addDomainName(
        id: String,
        options: DomainNameOptions.Builder.() -> Unit
    ): DomainName = addDomainName(id, DomainNameOptions(options))

    /**
     * Adds a new gateway response.
     *
     * @param id
     * @param options
     */
    public open fun addGatewayResponse(
        id: String,
        options: GatewayResponseOptions
    ): GatewayResponse =
        unwrap(this)
            .addGatewayResponse(id, options.let(GatewayResponseOptions::unwrap))
            .let(GatewayResponse::wrap)

    /**
     * Adds a new gateway response.
     *
     * @param id
     * @param options
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0f2cf1c468a1892bb108538ca2249b039d05c47be2b7f79d025fafc156a9d51c")
    public open fun addGatewayResponse(
        id: String,
        options: GatewayResponseOptions.Builder.() -> Unit
    ): GatewayResponse = addGatewayResponse(id, GatewayResponseOptions(options))

    /**
     * Adds a usage plan.
     *
     * @param id
     * @param props
     */
    public open fun addUsagePlan(id: String): UsagePlan =
        unwrap(this).addUsagePlan(id).let(UsagePlan::wrap)

    /**
     * Adds a usage plan.
     *
     * @param id
     * @param props
     */
    public open fun addUsagePlan(id: String, props: UsagePlanProps): UsagePlan =
        unwrap(this).addUsagePlan(id, props.let(UsagePlanProps::unwrap)).let(UsagePlan::wrap)

    /**
     * Adds a usage plan.
     *
     * @param id
     * @param props
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("382855e9be8cf585fe729726d1adccd689c578505ee3049c6fba5230cbf789d4")
    public open fun addUsagePlan(id: String, props: UsagePlanProps.Builder.() -> Unit): UsagePlan =
        addUsagePlan(id, UsagePlanProps(props))

    /**
     * Gets the "execute-api" ARN.
     *
     * @param method
     * @param path
     * @param stage
     */
    public override fun arnForExecuteApi(): String = unwrap(this).arnForExecuteApi()

    /**
     * Gets the "execute-api" ARN.
     *
     * @param method
     * @param path
     * @param stage
     */
    public override fun arnForExecuteApi(method: String): String =
        unwrap(this).arnForExecuteApi(method)

    /**
     * Gets the "execute-api" ARN.
     *
     * @param method
     * @param path
     * @param stage
     */
    public override fun arnForExecuteApi(method: String, path: String): String =
        unwrap(this).arnForExecuteApi(method, path)

    /**
     * Gets the "execute-api" ARN.
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
     * API Gateway stage that points to the latest deployment (if defined).
     *
     * If `deploy` is disabled, you will need to explicitly assign this value in order to set up
     * integrations.
     */
    public override fun deploymentStage(): Stage =
        unwrap(this).getDeploymentStage().let(Stage::wrap)

    /**
     * API Gateway stage that points to the latest deployment (if defined).
     *
     * If `deploy` is disabled, you will need to explicitly assign this value in order to set up
     * integrations.
     */
    public override fun deploymentStage(`value`: Stage) {
        unwrap(this).setDeploymentStage(`value`.let(Stage::unwrap))
    }

    /**
     * The first domain name mapped to this API, if defined through the `domainName` configuration
     * prop, or added via `addDomainName`.
     */
    public open fun domainName(): DomainName? = unwrap(this).getDomainName()?.let(DomainName::wrap)

    /**
     * API Gateway deployment that represents the latest changes of the API.
     *
     * This resource will be automatically updated every time the REST API model changes. This will
     * be undefined if `deploy` is false.
     */
    public override fun latestDeployment(): Deployment? =
        unwrap(this).getLatestDeployment()?.let(Deployment::wrap)

    /**
     * Returns the given named metric for this API.
     *
     * @param metricName
     * @param props
     */
    public open fun metric(metricName: String): Metric =
        unwrap(this).metric(metricName).let(Metric::wrap)

    /**
     * Returns the given named metric for this API.
     *
     * @param metricName
     * @param props
     */
    public open fun metric(metricName: String, props: MetricOptions): Metric =
        unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Returns the given named metric for this API.
     *
     * @param metricName
     * @param props
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
    public open fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
        metric(metricName, MetricOptions(props))

    /**
     * Metric for the number of requests served from the API cache in a given period.
     *
     * Default: sum over 5 minutes
     *
     * @param props
     */
    public open fun metricCacheHitCount(): Metric =
        unwrap(this).metricCacheHitCount().let(Metric::wrap)

    /**
     * Metric for the number of requests served from the API cache in a given period.
     *
     * Default: sum over 5 minutes
     *
     * @param props
     */
    public open fun metricCacheHitCount(props: MetricOptions): Metric =
        unwrap(this).metricCacheHitCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Metric for the number of requests served from the API cache in a given period.
     *
     * Default: sum over 5 minutes
     *
     * @param props
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4bad4fa6db6decd2bc6eaa2b85596980df958d75997f43cb09e3eef9290bc242")
    public open fun metricCacheHitCount(props: MetricOptions.Builder.() -> Unit): Metric =
        metricCacheHitCount(MetricOptions(props))

    /**
     * Metric for the number of requests served from the backend in a given period, when API caching
     * is enabled.
     *
     * Default: sum over 5 minutes
     *
     * @param props
     */
    public open fun metricCacheMissCount(): Metric =
        unwrap(this).metricCacheMissCount().let(Metric::wrap)

    /**
     * Metric for the number of requests served from the backend in a given period, when API caching
     * is enabled.
     *
     * Default: sum over 5 minutes
     *
     * @param props
     */
    public open fun metricCacheMissCount(props: MetricOptions): Metric =
        unwrap(this).metricCacheMissCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Metric for the number of requests served from the backend in a given period, when API caching
     * is enabled.
     *
     * Default: sum over 5 minutes
     *
     * @param props
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f0871c24c33198a19f6d36e7aa5dbadbb6f0f9f13f8d2d26d1683658718d5e75")
    public open fun metricCacheMissCount(props: MetricOptions.Builder.() -> Unit): Metric =
        metricCacheMissCount(MetricOptions(props))

    /**
     * Metric for the number of client-side errors captured in a given period.
     *
     * Default: sum over 5 minutes
     *
     * @param props
     */
    public open fun metricClientError(): Metric = unwrap(this).metricClientError().let(Metric::wrap)

    /**
     * Metric for the number of client-side errors captured in a given period.
     *
     * Default: sum over 5 minutes
     *
     * @param props
     */
    public open fun metricClientError(props: MetricOptions): Metric =
        unwrap(this).metricClientError(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Metric for the number of client-side errors captured in a given period.
     *
     * Default: sum over 5 minutes
     *
     * @param props
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5505ff42fc21cd4fba3599e830eb78dffd8be3f9d219732553d074fecf68055b")
    public open fun metricClientError(props: MetricOptions.Builder.() -> Unit): Metric =
        metricClientError(MetricOptions(props))

    /**
     * Metric for the total number API requests in a given period.
     *
     * Default: sample count over 5 minutes
     *
     * @param props
     */
    public open fun metricCount(): Metric = unwrap(this).metricCount().let(Metric::wrap)

    /**
     * Metric for the total number API requests in a given period.
     *
     * Default: sample count over 5 minutes
     *
     * @param props
     */
    public open fun metricCount(props: MetricOptions): Metric =
        unwrap(this).metricCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Metric for the total number API requests in a given period.
     *
     * Default: sample count over 5 minutes
     *
     * @param props
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7f80cedd789a268d0830fe44e735c9121f05b22eec93abf1f99d5ef8407e94f")
    public open fun metricCount(props: MetricOptions.Builder.() -> Unit): Metric =
        metricCount(MetricOptions(props))

    /**
     * Metric for the time between when API Gateway relays a request to the backend and when it
     * receives a response from the backend.
     *
     * Default: average over 5 minutes.
     *
     * @param props
     */
    public open fun metricIntegrationLatency(): Metric =
        unwrap(this).metricIntegrationLatency().let(Metric::wrap)

    /**
     * Metric for the time between when API Gateway relays a request to the backend and when it
     * receives a response from the backend.
     *
     * Default: average over 5 minutes.
     *
     * @param props
     */
    public open fun metricIntegrationLatency(props: MetricOptions): Metric =
        unwrap(this).metricIntegrationLatency(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Metric for the time between when API Gateway relays a request to the backend and when it
     * receives a response from the backend.
     *
     * Default: average over 5 minutes.
     *
     * @param props
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("159e7ed0c2cdbc75632ca4f139816b0c4f1e8244733708427495a470c92efc2a")
    public open fun metricIntegrationLatency(props: MetricOptions.Builder.() -> Unit): Metric =
        metricIntegrationLatency(MetricOptions(props))

    /**
     * The time between when API Gateway receives a request from a client and when it returns a
     * response to the client.
     *
     * The latency includes the integration latency and other API Gateway overhead.
     *
     * Default: average over 5 minutes.
     *
     * @param props
     */
    public open fun metricLatency(): Metric = unwrap(this).metricLatency().let(Metric::wrap)

    /**
     * The time between when API Gateway receives a request from a client and when it returns a
     * response to the client.
     *
     * The latency includes the integration latency and other API Gateway overhead.
     *
     * Default: average over 5 minutes.
     *
     * @param props
     */
    public open fun metricLatency(props: MetricOptions): Metric =
        unwrap(this).metricLatency(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * The time between when API Gateway receives a request from a client and when it returns a
     * response to the client.
     *
     * The latency includes the integration latency and other API Gateway overhead.
     *
     * Default: average over 5 minutes.
     *
     * @param props
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("044777c9ac260e70c205111e250eb834d7f36a65a405946dde2e1fc0191b88dc")
    public open fun metricLatency(props: MetricOptions.Builder.() -> Unit): Metric =
        metricLatency(MetricOptions(props))

    /**
     * Metric for the number of server-side errors captured in a given period.
     *
     * Default: sum over 5 minutes
     *
     * @param props
     */
    public open fun metricServerError(): Metric = unwrap(this).metricServerError().let(Metric::wrap)

    /**
     * Metric for the number of server-side errors captured in a given period.
     *
     * Default: sum over 5 minutes
     *
     * @param props
     */
    public open fun metricServerError(props: MetricOptions): Metric =
        unwrap(this).metricServerError(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Metric for the number of server-side errors captured in a given period.
     *
     * Default: sum over 5 minutes
     *
     * @param props
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52dfc1927ffde24e4de29d31f02378fd97ffce8a960d6b4abcf96c1e13e54e75")
    public open fun metricServerError(props: MetricOptions.Builder.() -> Unit): Metric =
        metricServerError(MetricOptions(props))

    /** The ID of this API Gateway RestApi. */
    public override fun restApiId(): String = unwrap(this).getRestApiId()

    /**
     * A human friendly name for this Rest API.
     *
     * Note that this is different from `restApiId`.
     */
    public override fun restApiName(): String = unwrap(this).getRestApiName()

    /** The resource ID of the root resource. */
    public override fun restApiRootResourceId(): String = unwrap(this).getRestApiRootResourceId()

    /**
     * Represents the root resource of this API endpoint ('/').
     *
     * Resources and Methods are added to this resource.
     */
    public override fun root(): IResource = unwrap(this).getRoot().let(IResource::wrap)

    /** The deployed root URL of this REST API. */
    public open fun url(): String = unwrap(this).getUrl()

    /**
     * Returns the URL for an HTTP path.
     *
     * Fails if `deploymentStage` is not set either by `deploy` or explicitly.
     *
     * @param path
     */
    public open fun urlForPath(): String = unwrap(this).urlForPath()

    /**
     * Returns the URL for an HTTP path.
     *
     * Fails if `deploymentStage` is not set either by `deploy` or explicitly.
     *
     * @param path
     */
    public open fun urlForPath(path: String): String = unwrap(this).urlForPath(path)

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.apigateway.RestApiBase,
    ) : RestApiBase(cdkObject)

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.apigateway.RestApiBase
        ): RestApiBase = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: RestApiBase
        ): software.amazon.awscdk.services.apigateway.RestApiBase = (wrapped as Wrapper).cdkObject
    }
}
