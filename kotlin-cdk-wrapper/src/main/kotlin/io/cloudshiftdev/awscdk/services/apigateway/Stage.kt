@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Stage internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.Stage,
) : StageBase(cdkObject) {
  public override fun restApi(): IRestApi = unwrap(this).getRestApi().let(IRestApi::wrap)

  public override fun stageName(): String = unwrap(this).getStageName()

  @CdkDslMarker
  public interface Builder {
    public fun accessLogDestination(accessLogDestination: IAccessLogDestination)

    public fun accessLogFormat(accessLogFormat: AccessLogFormat)

    public fun cacheClusterEnabled(cacheClusterEnabled: Boolean)

    public fun cacheClusterSize(cacheClusterSize: String)

    public fun cacheDataEncrypted(cacheDataEncrypted: Boolean)

    public fun cacheTtl(cacheTtl: Duration)

    public fun cachingEnabled(cachingEnabled: Boolean)

    public fun clientCertificateId(clientCertificateId: String)

    public fun dataTraceEnabled(dataTraceEnabled: Boolean)

    public fun deployment(deployment: Deployment)

    public fun description(description: String)

    public fun documentationVersion(documentationVersion: String)

    public fun loggingLevel(loggingLevel: MethodLoggingLevel)

    public fun methodOptions(methodOptions: Map<String, MethodDeploymentOptions>)

    public fun metricsEnabled(metricsEnabled: Boolean)

    public fun stageName(stageName: String)

    public fun throttlingBurstLimit(throttlingBurstLimit: Number)

    public fun throttlingRateLimit(throttlingRateLimit: Number)

    public fun tracingEnabled(tracingEnabled: Boolean)

    public fun variables(variables: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.Stage.Builder =
        software.amazon.awscdk.services.apigateway.Stage.Builder.create(scope, id)

    override fun accessLogDestination(accessLogDestination: IAccessLogDestination) {
      cdkBuilder.accessLogDestination(accessLogDestination.let(IAccessLogDestination::unwrap))
    }

    override fun accessLogFormat(accessLogFormat: AccessLogFormat) {
      cdkBuilder.accessLogFormat(accessLogFormat.let(AccessLogFormat::unwrap))
    }

    override fun cacheClusterEnabled(cacheClusterEnabled: Boolean) {
      cdkBuilder.cacheClusterEnabled(cacheClusterEnabled)
    }

    override fun cacheClusterSize(cacheClusterSize: String) {
      cdkBuilder.cacheClusterSize(cacheClusterSize)
    }

    override fun cacheDataEncrypted(cacheDataEncrypted: Boolean) {
      cdkBuilder.cacheDataEncrypted(cacheDataEncrypted)
    }

    override fun cacheTtl(cacheTtl: Duration) {
      cdkBuilder.cacheTtl(cacheTtl.let(Duration::unwrap))
    }

    override fun cachingEnabled(cachingEnabled: Boolean) {
      cdkBuilder.cachingEnabled(cachingEnabled)
    }

    override fun clientCertificateId(clientCertificateId: String) {
      cdkBuilder.clientCertificateId(clientCertificateId)
    }

    override fun dataTraceEnabled(dataTraceEnabled: Boolean) {
      cdkBuilder.dataTraceEnabled(dataTraceEnabled)
    }

    override fun deployment(deployment: Deployment) {
      cdkBuilder.deployment(deployment.let(Deployment::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun documentationVersion(documentationVersion: String) {
      cdkBuilder.documentationVersion(documentationVersion)
    }

    override fun loggingLevel(loggingLevel: MethodLoggingLevel) {
      cdkBuilder.loggingLevel(loggingLevel.let(MethodLoggingLevel::unwrap))
    }

    override fun methodOptions(methodOptions: Map<String, MethodDeploymentOptions>) {
      cdkBuilder.methodOptions(methodOptions.mapValues{MethodDeploymentOptions.unwrap(it.value)})
    }

    override fun metricsEnabled(metricsEnabled: Boolean) {
      cdkBuilder.metricsEnabled(metricsEnabled)
    }

    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    override fun throttlingBurstLimit(throttlingBurstLimit: Number) {
      cdkBuilder.throttlingBurstLimit(throttlingBurstLimit)
    }

    override fun throttlingRateLimit(throttlingRateLimit: Number) {
      cdkBuilder.throttlingRateLimit(throttlingRateLimit)
    }

    override fun tracingEnabled(tracingEnabled: Boolean) {
      cdkBuilder.tracingEnabled(tracingEnabled)
    }

    override fun variables(variables: Map<String, String>) {
      cdkBuilder.variables(variables)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.Stage = cdkBuilder.build()
  }

  public companion object {
    public fun fromStageAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: StageAttributes,
    ): IStage =
        software.amazon.awscdk.services.apigateway.Stage.fromStageAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(StageAttributes::unwrap)).let(IStage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("26f85f62b6b121d2eb080deabbc661cdeca521904896bc79d1304ec45a54aa08")
    public fun fromStageAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: StageAttributes.Builder.() -> Unit,
    ): IStage = fromStageAttributes(scope, id, StageAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Stage {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Stage(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.Stage): Stage =
        Stage(cdkObject)

    internal fun unwrap(wrapped: Stage): software.amazon.awscdk.services.apigateway.Stage =
        wrapped.cdkObject
  }
}