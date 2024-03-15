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

public open class HttpApi internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpApi,
) : Resource(cdkObject), IHttpApi, IApi {
  public open fun addRoutes(options: AddRoutesOptions): List<HttpRoute> =
      unwrap(this).addRoutes(options.let(AddRoutesOptions::unwrap)).map(HttpRoute::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("92cc4c6d20a007ffcddba9007bbf5eed4df83c484cd7df9fd7da6ebe7f62cb0a")
  public open fun addRoutes(options: AddRoutesOptions.Builder.() -> Unit): List<HttpRoute> =
      addRoutes(AddRoutesOptions(options))

  public open fun addStage(id: String, options: HttpStageOptions): HttpStage =
      unwrap(this).addStage(id, options.let(HttpStageOptions::unwrap)).let(HttpStage::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d97cf72ee3ee9ef71dd516906159ca32c6e93f16098f9713cb2118da8fb08ee9")
  public open fun addStage(id: String, options: HttpStageOptions.Builder.() -> Unit): HttpStage =
      addStage(id, HttpStageOptions(options))

  public override fun addVpcLink(options: VpcLinkProps): VpcLink =
      unwrap(this).addVpcLink(options.let(VpcLinkProps::unwrap)).let(VpcLink::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b6d123942454a2f6b39cc86261dd700999b1a3c76f0618d08f290fcb74fcc48d")
  public override fun addVpcLink(options: VpcLinkProps.Builder.() -> Unit): VpcLink =
      addVpcLink(VpcLinkProps(options))

  public override fun apiEndpoint(): String = unwrap(this).getApiEndpoint()

  public override fun apiId(): String = unwrap(this).getApiId()

  public override fun arnForExecuteApi(): String = unwrap(this).arnForExecuteApi()

  public override fun arnForExecuteApi(method: String): String =
      unwrap(this).arnForExecuteApi(method)

  public override fun arnForExecuteApi(method: String, path: String): String =
      unwrap(this).arnForExecuteApi(method, path)

  public override fun arnForExecuteApi(
    method: String,
    path: String,
    stage: String,
  ): String = unwrap(this).arnForExecuteApi(method, path, stage)

  public override fun defaultAuthorizationScopes(): List<String> =
      unwrap(this).getDefaultAuthorizationScopes() ?: emptyList()

  public override fun defaultAuthorizer(): IHttpRouteAuthorizer? =
      unwrap(this).getDefaultAuthorizer()?.let(IHttpRouteAuthorizer::wrap)

  public open fun defaultStage(): IHttpStage? =
      unwrap(this).getDefaultStage()?.let(IHttpStage::wrap)

  public open fun disableExecuteApiEndpoint(): Boolean? =
      unwrap(this).getDisableExecuteApiEndpoint()

  public open fun httpApiId(): String = unwrap(this).getHttpApiId()

  public open fun httpApiName(): String? = unwrap(this).getHttpApiName()

  public override fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  public override fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  public override fun metricClientError(): Metric =
      unwrap(this).metricClientError().let(Metric::wrap)

  public override fun metricClientError(props: MetricOptions): Metric =
      unwrap(this).metricClientError(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5505ff42fc21cd4fba3599e830eb78dffd8be3f9d219732553d074fecf68055b")
  public override fun metricClientError(props: MetricOptions.Builder.() -> Unit): Metric =
      metricClientError(MetricOptions(props))

  public override fun metricCount(): Metric = unwrap(this).metricCount().let(Metric::wrap)

  public override fun metricCount(props: MetricOptions): Metric =
      unwrap(this).metricCount(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f7f80cedd789a268d0830fe44e735c9121f05b22eec93abf1f99d5ef8407e94f")
  public override fun metricCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricCount(MetricOptions(props))

  public override fun metricDataProcessed(): Metric =
      unwrap(this).metricDataProcessed().let(Metric::wrap)

  public override fun metricDataProcessed(props: MetricOptions): Metric =
      unwrap(this).metricDataProcessed(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f57c3511280d12729c02269edffb794ffffaf9f66f595c310c4332560248e8e1")
  public override fun metricDataProcessed(props: MetricOptions.Builder.() -> Unit): Metric =
      metricDataProcessed(MetricOptions(props))

  public override fun metricIntegrationLatency(): Metric =
      unwrap(this).metricIntegrationLatency().let(Metric::wrap)

  public override fun metricIntegrationLatency(props: MetricOptions): Metric =
      unwrap(this).metricIntegrationLatency(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("159e7ed0c2cdbc75632ca4f139816b0c4f1e8244733708427495a470c92efc2a")
  public override fun metricIntegrationLatency(props: MetricOptions.Builder.() -> Unit): Metric =
      metricIntegrationLatency(MetricOptions(props))

  public override fun metricLatency(): Metric = unwrap(this).metricLatency().let(Metric::wrap)

  public override fun metricLatency(props: MetricOptions): Metric =
      unwrap(this).metricLatency(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("044777c9ac260e70c205111e250eb834d7f36a65a405946dde2e1fc0191b88dc")
  public override fun metricLatency(props: MetricOptions.Builder.() -> Unit): Metric =
      metricLatency(MetricOptions(props))

  public override fun metricServerError(): Metric =
      unwrap(this).metricServerError().let(Metric::wrap)

  public override fun metricServerError(props: MetricOptions): Metric =
      unwrap(this).metricServerError(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("52dfc1927ffde24e4de29d31f02378fd97ffce8a960d6b4abcf96c1e13e54e75")
  public override fun metricServerError(props: MetricOptions.Builder.() -> Unit): Metric =
      metricServerError(MetricOptions(props))

  public open fun url(): String? = unwrap(this).getUrl()

  @CdkDslMarker
  public interface Builder {
    public fun apiName(apiName: String)

    public fun corsPreflight(corsPreflight: CorsPreflightOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b49460585f110b22767f981852b093174e485a77aca089f8d86dde5a8099b33d")
    public fun corsPreflight(corsPreflight: CorsPreflightOptions.Builder.() -> Unit)

    public fun createDefaultStage(createDefaultStage: Boolean)

    public fun defaultAuthorizationScopes(defaultAuthorizationScopes: List<String>)

    public fun defaultAuthorizationScopes(vararg defaultAuthorizationScopes: String)

    public fun defaultAuthorizer(defaultAuthorizer: IHttpRouteAuthorizer)

    public fun defaultDomainMapping(defaultDomainMapping: DomainMappingOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4e313d90125e87c17209fe208803ecae8b7e44459880754b625235c1f04ac4e")
    public fun defaultDomainMapping(defaultDomainMapping: DomainMappingOptions.Builder.() -> Unit)

    public fun defaultIntegration(defaultIntegration: HttpRouteIntegration)

    public fun description(description: String)

    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.HttpApi.Builder =
        software.amazon.awscdk.services.apigatewayv2.HttpApi.Builder.create(scope, id)

    override fun apiName(apiName: String) {
      cdkBuilder.apiName(apiName)
    }

    override fun corsPreflight(corsPreflight: CorsPreflightOptions) {
      cdkBuilder.corsPreflight(corsPreflight.let(CorsPreflightOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b49460585f110b22767f981852b093174e485a77aca089f8d86dde5a8099b33d")
    override fun corsPreflight(corsPreflight: CorsPreflightOptions.Builder.() -> Unit): Unit =
        corsPreflight(CorsPreflightOptions(corsPreflight))

    override fun createDefaultStage(createDefaultStage: Boolean) {
      cdkBuilder.createDefaultStage(createDefaultStage)
    }

    override fun defaultAuthorizationScopes(defaultAuthorizationScopes: List<String>) {
      cdkBuilder.defaultAuthorizationScopes(defaultAuthorizationScopes)
    }

    override fun defaultAuthorizationScopes(vararg defaultAuthorizationScopes: String): Unit =
        defaultAuthorizationScopes(defaultAuthorizationScopes.toList())

    override fun defaultAuthorizer(defaultAuthorizer: IHttpRouteAuthorizer) {
      cdkBuilder.defaultAuthorizer(defaultAuthorizer.let(IHttpRouteAuthorizer::unwrap))
    }

    override fun defaultDomainMapping(defaultDomainMapping: DomainMappingOptions) {
      cdkBuilder.defaultDomainMapping(defaultDomainMapping.let(DomainMappingOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4e313d90125e87c17209fe208803ecae8b7e44459880754b625235c1f04ac4e")
    override
        fun defaultDomainMapping(defaultDomainMapping: DomainMappingOptions.Builder.() -> Unit):
        Unit = defaultDomainMapping(DomainMappingOptions(defaultDomainMapping))

    override fun defaultIntegration(defaultIntegration: HttpRouteIntegration) {
      cdkBuilder.defaultIntegration(defaultIntegration.let(HttpRouteIntegration::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

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
        software.amazon.awscdk.services.apigatewayv2.HttpApi.fromHttpApiAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(HttpApiAttributes::unwrap)).let(IHttpApi::wrap)

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
        wrapped.cdkObject
  }
}
