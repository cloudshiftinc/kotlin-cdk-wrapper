package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Resource
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
  public open fun addMethodResponse(methodResponse: MethodResponse) {
    unwrap(this).addMethodResponse(methodResponse.let(MethodResponse::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4c5386f240fe245db26d7f4367346a01b4a5f088b23575a5f89c204f688fd3d5")
  public open fun addMethodResponse(methodResponse: MethodResponse.Builder.() -> Unit): Unit =
      addMethodResponse(MethodResponse(methodResponse))

  public open fun api(): IRestApi = unwrap(this).getApi().let(IRestApi::wrap)

  public open fun grantExecute(grantee: IGrantable): Grant =
      unwrap(this).grantExecute(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public open fun httpMethod(): String = unwrap(this).getHttpMethod()

  public open fun methodArn(): String = unwrap(this).getMethodArn()

  public open fun methodId(): String = unwrap(this).getMethodId()

  public open fun metric(metricName: String, stage: IStage): Metric =
      unwrap(this).metric(metricName, stage.let(IStage::unwrap)).let(Metric::wrap)

  public open fun metric(
    metricName: String,
    stage: IStage,
    props: MetricOptions,
  ): Metric = unwrap(this).metric(metricName, stage.let(IStage::unwrap),
      props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6763e0eb2705964799492b62e27d3f6650b725fd7f16e51cf3be9bf57c574eef")
  public open fun metric(
    metricName: String,
    stage: IStage,
    props: MetricOptions.Builder.() -> Unit,
  ): Metric = metric(metricName, stage, MetricOptions(props))

  public open fun metricCacheHitCount(stage: IStage): Metric =
      unwrap(this).metricCacheHitCount(stage.let(IStage::unwrap)).let(Metric::wrap)

  public open fun metricCacheHitCount(stage: IStage, props: MetricOptions): Metric =
      unwrap(this).metricCacheHitCount(stage.let(IStage::unwrap),
      props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7dd76db43e132e83d733ec7371f7399df95f2fcdbb78e225b349c406c61dbd69")
  public open fun metricCacheHitCount(stage: IStage, props: MetricOptions.Builder.() -> Unit):
      Metric = metricCacheHitCount(stage, MetricOptions(props))

  public open fun metricCacheMissCount(stage: IStage): Metric =
      unwrap(this).metricCacheMissCount(stage.let(IStage::unwrap)).let(Metric::wrap)

  public open fun metricCacheMissCount(stage: IStage, props: MetricOptions): Metric =
      unwrap(this).metricCacheMissCount(stage.let(IStage::unwrap),
      props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8a73be8dfdea33007cd6983616489eb908fa40c90649ebf1fe26cd1e2dc2fa6d")
  public open fun metricCacheMissCount(stage: IStage, props: MetricOptions.Builder.() -> Unit):
      Metric = metricCacheMissCount(stage, MetricOptions(props))

  public open fun metricClientError(stage: IStage): Metric =
      unwrap(this).metricClientError(stage.let(IStage::unwrap)).let(Metric::wrap)

  public open fun metricClientError(stage: IStage, props: MetricOptions): Metric =
      unwrap(this).metricClientError(stage.let(IStage::unwrap),
      props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("502c61e8cf1d3f78337213f10a44eda9de332e8a8f213e12be34f0b2dd9a01c4")
  public open fun metricClientError(stage: IStage, props: MetricOptions.Builder.() -> Unit): Metric
      = metricClientError(stage, MetricOptions(props))

  public open fun metricCount(stage: IStage): Metric =
      unwrap(this).metricCount(stage.let(IStage::unwrap)).let(Metric::wrap)

  public open fun metricCount(stage: IStage, props: MetricOptions): Metric =
      unwrap(this).metricCount(stage.let(IStage::unwrap),
      props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c93601db847113b11e8f678a53ab3c0aa1c22a165f00721316f739cb43a012b7")
  public open fun metricCount(stage: IStage, props: MetricOptions.Builder.() -> Unit): Metric =
      metricCount(stage, MetricOptions(props))

  public open fun metricIntegrationLatency(stage: IStage): Metric =
      unwrap(this).metricIntegrationLatency(stage.let(IStage::unwrap)).let(Metric::wrap)

  public open fun metricIntegrationLatency(stage: IStage, props: MetricOptions): Metric =
      unwrap(this).metricIntegrationLatency(stage.let(IStage::unwrap),
      props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ab52823498c1789ffc759ffaee3753f998e60ffd5a3e40535c55309fa5332360")
  public open fun metricIntegrationLatency(stage: IStage, props: MetricOptions.Builder.() -> Unit):
      Metric = metricIntegrationLatency(stage, MetricOptions(props))

  public open fun metricLatency(stage: IStage): Metric =
      unwrap(this).metricLatency(stage.let(IStage::unwrap)).let(Metric::wrap)

  public open fun metricLatency(stage: IStage, props: MetricOptions): Metric =
      unwrap(this).metricLatency(stage.let(IStage::unwrap),
      props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ac252749a4e62151411d00eecd15a16ec26e7bf42b9af810f8c643a7a955c441")
  public open fun metricLatency(stage: IStage, props: MetricOptions.Builder.() -> Unit): Metric =
      metricLatency(stage, MetricOptions(props))

  public open fun metricServerError(stage: IStage): Metric =
      unwrap(this).metricServerError(stage.let(IStage::unwrap)).let(Metric::wrap)

  public open fun metricServerError(stage: IStage, props: MetricOptions): Metric =
      unwrap(this).metricServerError(stage.let(IStage::unwrap),
      props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d9ebf497735595d8d02e6272c60e08591b94f61765f7bc09a818c5908d2a17a5")
  public open fun metricServerError(stage: IStage, props: MetricOptions.Builder.() -> Unit): Metric
      = metricServerError(stage, MetricOptions(props))

  public open fun resource(): IResource = unwrap(this).getResource().let(IResource::wrap)

  public open fun testMethodArn(): String = unwrap(this).getTestMethodArn()

  public interface Builder {
    public fun httpMethod(httpMethod: String)

    public fun integration(integration: Integration)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f66080773ba678f249462c9094aab0db209f70d689a9476bcac67e649a2ba1c")
    public fun integration(integration: Integration.Builder.() -> Unit)

    public fun options(options: MethodOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7743eba1717d042d0367b30e30b6f9ed36a8bb70142e740ad3641358301f2100")
    public fun options(options: MethodOptions.Builder.() -> Unit)

    public fun resource(resource: IResource)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.Method.Builder =
        software.amazon.awscdk.services.apigateway.Method.Builder.create(scope, id)

    override fun httpMethod(httpMethod: String) {
      cdkBuilder.httpMethod(httpMethod)
    }

    override fun integration(integration: Integration) {
      cdkBuilder.integration(integration.let(Integration::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f66080773ba678f249462c9094aab0db209f70d689a9476bcac67e649a2ba1c")
    override fun integration(integration: Integration.Builder.() -> Unit): Unit =
        integration(Integration(integration))

    override fun options(options: MethodOptions) {
      cdkBuilder.options(options.let(MethodOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7743eba1717d042d0367b30e30b6f9ed36a8bb70142e740ad3641358301f2100")
    override fun options(options: MethodOptions.Builder.() -> Unit): Unit =
        options(MethodOptions(options))

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
