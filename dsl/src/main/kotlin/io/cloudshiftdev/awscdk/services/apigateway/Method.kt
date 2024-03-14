package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Method internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigateway.Method,
) : Resource(cdkObject) {
  /**
   * Add a method response to this method.
   *
   * You should only add one method reponse for every status code. The API allows it
   * for historical reasons, but will add a warning if this happens. If you do, your Method
   * will nondeterministically use one of the responses, and ignore the rest.
   *
   * @param methodResponse 
   */
  public open fun addMethodResponse(methodResponse: MethodResponse) {
    unwrap(this).addMethodResponse(methodResponse.let(MethodResponse::unwrap))
  }

  /**
   * Add a method response to this method.
   *
   * You should only add one method reponse for every status code. The API allows it
   * for historical reasons, but will add a warning if this happens. If you do, your Method
   * will nondeterministically use one of the responses, and ignore the rest.
   *
   * @param methodResponse 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4c5386f240fe245db26d7f4367346a01b4a5f088b23575a5f89c204f688fd3d5")
  public open fun addMethodResponse(methodResponse: MethodResponse.Builder.() -> Unit): Unit =
      addMethodResponse(MethodResponse(methodResponse))

  /**
   * The API Gateway RestApi associated with this method.
   */
  public open fun api(): IRestApi = unwrap(this).getApi().let(IRestApi::wrap)

  /**
   * Grants an IAM principal permission to invoke this method.
   *
   * @param grantee the principal. 
   */
  public open fun grantExecute(grantee: IGrantable): Grant =
      unwrap(this).grantExecute(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   *
   */
  public open fun httpMethod(): String = unwrap(this).getHttpMethod()

  /**
   * Returns an execute-api ARN for this method:.
   *
   * arn:aws:execute-api:{region}:{account}:{restApiId}/{stage}/{method}/{path}
   *
   * NOTE: {stage} will refer to the `restApi.deploymentStage`, which will
   * automatically set if auto-deploy is enabled, or can be explicitly assigned.
   * When not configured, {stage} will be set to '*', as a shorthand for 'all stages'.
   */
  public open fun methodArn(): String = unwrap(this).getMethodArn()

  /**
   *
   */
  public open fun methodId(): String = unwrap(this).getMethodId()

  /**
   * Returns the given named metric for this API method.
   *
   * @param metricName 
   * @param stage 
   * @param props
   */
  public open fun metric(metricName: String, stage: IStage): Metric =
      unwrap(this).metric(metricName, stage.let(IStage::unwrap)).let(Metric::wrap)

  /**
   * Returns the given named metric for this API method.
   *
   * @param metricName 
   * @param stage 
   * @param props
   */
  public open fun metric(
    metricName: String,
    stage: IStage,
    props: MetricOptions,
  ): Metric = unwrap(this).metric(metricName, stage.let(IStage::unwrap),
      props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Returns the given named metric for this API method.
   *
   * @param metricName 
   * @param stage 
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6763e0eb2705964799492b62e27d3f6650b725fd7f16e51cf3be9bf57c574eef")
  public open fun metric(
    metricName: String,
    stage: IStage,
    props: MetricOptions.Builder.() -> Unit,
  ): Metric = metric(metricName, stage, MetricOptions(props))

  /**
   * Metric for the number of requests served from the API cache in a given period.
   *
   * Default: - sum over 5 minutes
   *
   * @param stage 
   * @param props
   */
  public open fun metricCacheHitCount(stage: IStage): Metric =
      unwrap(this).metricCacheHitCount(stage.let(IStage::unwrap)).let(Metric::wrap)

  /**
   * Metric for the number of requests served from the API cache in a given period.
   *
   * Default: - sum over 5 minutes
   *
   * @param stage 
   * @param props
   */
  public open fun metricCacheHitCount(stage: IStage, props: MetricOptions): Metric =
      unwrap(this).metricCacheHitCount(stage.let(IStage::unwrap),
      props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the number of requests served from the API cache in a given period.
   *
   * Default: - sum over 5 minutes
   *
   * @param stage 
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7dd76db43e132e83d733ec7371f7399df95f2fcdbb78e225b349c406c61dbd69")
  public open fun metricCacheHitCount(stage: IStage, props: MetricOptions.Builder.() -> Unit):
      Metric = metricCacheHitCount(stage, MetricOptions(props))

  /**
   * Metric for the number of requests served from the backend in a given period, when API caching
   * is enabled.
   *
   * Default: - sum over 5 minutes
   *
   * @param stage 
   * @param props
   */
  public open fun metricCacheMissCount(stage: IStage): Metric =
      unwrap(this).metricCacheMissCount(stage.let(IStage::unwrap)).let(Metric::wrap)

  /**
   * Metric for the number of requests served from the backend in a given period, when API caching
   * is enabled.
   *
   * Default: - sum over 5 minutes
   *
   * @param stage 
   * @param props
   */
  public open fun metricCacheMissCount(stage: IStage, props: MetricOptions): Metric =
      unwrap(this).metricCacheMissCount(stage.let(IStage::unwrap),
      props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the number of requests served from the backend in a given period, when API caching
   * is enabled.
   *
   * Default: - sum over 5 minutes
   *
   * @param stage 
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8a73be8dfdea33007cd6983616489eb908fa40c90649ebf1fe26cd1e2dc2fa6d")
  public open fun metricCacheMissCount(stage: IStage, props: MetricOptions.Builder.() -> Unit):
      Metric = metricCacheMissCount(stage, MetricOptions(props))

  /**
   * Metric for the number of client-side errors captured in a given period.
   *
   * Default: - sum over 5 minutes
   *
   * @param stage 
   * @param props
   */
  public open fun metricClientError(stage: IStage): Metric =
      unwrap(this).metricClientError(stage.let(IStage::unwrap)).let(Metric::wrap)

  /**
   * Metric for the number of client-side errors captured in a given period.
   *
   * Default: - sum over 5 minutes
   *
   * @param stage 
   * @param props
   */
  public open fun metricClientError(stage: IStage, props: MetricOptions): Metric =
      unwrap(this).metricClientError(stage.let(IStage::unwrap),
      props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the number of client-side errors captured in a given period.
   *
   * Default: - sum over 5 minutes
   *
   * @param stage 
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("502c61e8cf1d3f78337213f10a44eda9de332e8a8f213e12be34f0b2dd9a01c4")
  public open fun metricClientError(stage: IStage, props: MetricOptions.Builder.() -> Unit): Metric
      = metricClientError(stage, MetricOptions(props))

  /**
   * Metric for the total number API requests in a given period.
   *
   * Default: - sample count over 5 minutes
   *
   * @param stage 
   * @param props
   */
  public open fun metricCount(stage: IStage): Metric =
      unwrap(this).metricCount(stage.let(IStage::unwrap)).let(Metric::wrap)

  /**
   * Metric for the total number API requests in a given period.
   *
   * Default: - sample count over 5 minutes
   *
   * @param stage 
   * @param props
   */
  public open fun metricCount(stage: IStage, props: MetricOptions): Metric =
      unwrap(this).metricCount(stage.let(IStage::unwrap),
      props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the total number API requests in a given period.
   *
   * Default: - sample count over 5 minutes
   *
   * @param stage 
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c93601db847113b11e8f678a53ab3c0aa1c22a165f00721316f739cb43a012b7")
  public open fun metricCount(stage: IStage, props: MetricOptions.Builder.() -> Unit): Metric =
      metricCount(stage, MetricOptions(props))

  /**
   * Metric for the time between when API Gateway relays a request to the backend and when it
   * receives a response from the backend.
   *
   * Default: - average over 5 minutes.
   *
   * @param stage 
   * @param props
   */
  public open fun metricIntegrationLatency(stage: IStage): Metric =
      unwrap(this).metricIntegrationLatency(stage.let(IStage::unwrap)).let(Metric::wrap)

  /**
   * Metric for the time between when API Gateway relays a request to the backend and when it
   * receives a response from the backend.
   *
   * Default: - average over 5 minutes.
   *
   * @param stage 
   * @param props
   */
  public open fun metricIntegrationLatency(stage: IStage, props: MetricOptions): Metric =
      unwrap(this).metricIntegrationLatency(stage.let(IStage::unwrap),
      props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the time between when API Gateway relays a request to the backend and when it
   * receives a response from the backend.
   *
   * Default: - average over 5 minutes.
   *
   * @param stage 
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ab52823498c1789ffc759ffaee3753f998e60ffd5a3e40535c55309fa5332360")
  public open fun metricIntegrationLatency(stage: IStage, props: MetricOptions.Builder.() -> Unit):
      Metric = metricIntegrationLatency(stage, MetricOptions(props))

  /**
   * The time between when API Gateway receives a request from a client and when it returns a
   * response to the client.
   *
   * The latency includes the integration latency and other API Gateway overhead.
   *
   * Default: - average over 5 minutes.
   *
   * @param stage 
   * @param props
   */
  public open fun metricLatency(stage: IStage): Metric =
      unwrap(this).metricLatency(stage.let(IStage::unwrap)).let(Metric::wrap)

  /**
   * The time between when API Gateway receives a request from a client and when it returns a
   * response to the client.
   *
   * The latency includes the integration latency and other API Gateway overhead.
   *
   * Default: - average over 5 minutes.
   *
   * @param stage 
   * @param props
   */
  public open fun metricLatency(stage: IStage, props: MetricOptions): Metric =
      unwrap(this).metricLatency(stage.let(IStage::unwrap),
      props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * The time between when API Gateway receives a request from a client and when it returns a
   * response to the client.
   *
   * The latency includes the integration latency and other API Gateway overhead.
   *
   * Default: - average over 5 minutes.
   *
   * @param stage 
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ac252749a4e62151411d00eecd15a16ec26e7bf42b9af810f8c643a7a955c441")
  public open fun metricLatency(stage: IStage, props: MetricOptions.Builder.() -> Unit): Metric =
      metricLatency(stage, MetricOptions(props))

  /**
   * Metric for the number of server-side errors captured in a given period.
   *
   * Default: - sum over 5 minutes
   *
   * @param stage 
   * @param props
   */
  public open fun metricServerError(stage: IStage): Metric =
      unwrap(this).metricServerError(stage.let(IStage::unwrap)).let(Metric::wrap)

  /**
   * Metric for the number of server-side errors captured in a given period.
   *
   * Default: - sum over 5 minutes
   *
   * @param stage 
   * @param props
   */
  public open fun metricServerError(stage: IStage, props: MetricOptions): Metric =
      unwrap(this).metricServerError(stage.let(IStage::unwrap),
      props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the number of server-side errors captured in a given period.
   *
   * Default: - sum over 5 minutes
   *
   * @param stage 
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d9ebf497735595d8d02e6272c60e08591b94f61765f7bc09a818c5908d2a17a5")
  public open fun metricServerError(stage: IStage, props: MetricOptions.Builder.() -> Unit): Metric
      = metricServerError(stage, MetricOptions(props))

  /**
   *
   */
  public open fun resource(): IResource = unwrap(this).getResource().let(IResource::wrap)

  /**
   * Returns an execute-api ARN for this method's "test-invoke-stage" stage.
   *
   * This stage is used by the AWS Console UI when testing the method.
   */
  public open fun testMethodArn(): String = unwrap(this).getTestMethodArn()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.Method].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The HTTP method ("GET", "POST", "PUT", ...) that clients use to call this method.
     *
     * @param httpMethod The HTTP method ("GET", "POST", "PUT", ...) that clients use to call this
     * method. 
     */
    public fun httpMethod(httpMethod: String)

    /**
     * The backend system that the method calls when it receives a request.
     *
     * Default: - a new `MockIntegration`.
     *
     * @param integration The backend system that the method calls when it receives a request. 
     */
    public fun integration(integration: Integration)

    /**
     * The backend system that the method calls when it receives a request.
     *
     * Default: - a new `MockIntegration`.
     *
     * @param integration The backend system that the method calls when it receives a request. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f66080773ba678f249462c9094aab0db209f70d689a9476bcac67e649a2ba1c")
    public fun integration(integration: Integration.Builder.() -> Unit)

    /**
     * Method options.
     *
     * Default: - No options.
     *
     * @param options Method options. 
     */
    public fun options(options: MethodOptions)

    /**
     * Method options.
     *
     * Default: - No options.
     *
     * @param options Method options. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7743eba1717d042d0367b30e30b6f9ed36a8bb70142e740ad3641358301f2100")
    public fun options(options: MethodOptions.Builder.() -> Unit)

    /**
     * The resource this method is associated with.
     *
     * For root resource methods,
     * specify the `RestApi` object.
     *
     * @param resource The resource this method is associated with. 
     */
    public fun resource(resource: IResource)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.Method.Builder =
        software.amazon.awscdk.services.apigateway.Method.Builder.create(scope, id)

    /**
     * The HTTP method ("GET", "POST", "PUT", ...) that clients use to call this method.
     *
     * @param httpMethod The HTTP method ("GET", "POST", "PUT", ...) that clients use to call this
     * method. 
     */
    override fun httpMethod(httpMethod: String) {
      cdkBuilder.httpMethod(httpMethod)
    }

    /**
     * The backend system that the method calls when it receives a request.
     *
     * Default: - a new `MockIntegration`.
     *
     * @param integration The backend system that the method calls when it receives a request. 
     */
    override fun integration(integration: Integration) {
      cdkBuilder.integration(integration.let(Integration::unwrap))
    }

    /**
     * The backend system that the method calls when it receives a request.
     *
     * Default: - a new `MockIntegration`.
     *
     * @param integration The backend system that the method calls when it receives a request. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f66080773ba678f249462c9094aab0db209f70d689a9476bcac67e649a2ba1c")
    override fun integration(integration: Integration.Builder.() -> Unit): Unit =
        integration(Integration(integration))

    /**
     * Method options.
     *
     * Default: - No options.
     *
     * @param options Method options. 
     */
    override fun options(options: MethodOptions) {
      cdkBuilder.options(options.let(MethodOptions::unwrap))
    }

    /**
     * Method options.
     *
     * Default: - No options.
     *
     * @param options Method options. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7743eba1717d042d0367b30e30b6f9ed36a8bb70142e740ad3641358301f2100")
    override fun options(options: MethodOptions.Builder.() -> Unit): Unit =
        options(MethodOptions(options))

    /**
     * The resource this method is associated with.
     *
     * For root resource methods,
     * specify the `RestApi` object.
     *
     * @param resource The resource this method is associated with. 
     */
    override fun resource(resource: IResource) {
      cdkBuilder.resource(resource.let(IResource::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.Method = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Method {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Method(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.Method): Method =
        Method(cdkObject)

    internal fun unwrap(wrapped: Method): software.amazon.awscdk.services.apigateway.Method =
        wrapped.cdkObject
  }
}
