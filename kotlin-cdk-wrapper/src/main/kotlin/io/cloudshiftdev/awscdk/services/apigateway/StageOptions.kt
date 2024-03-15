@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface StageOptions : MethodDeploymentOptions {
  public fun accessLogDestination(): IAccessLogDestination? =
      unwrap(this).getAccessLogDestination()?.let(IAccessLogDestination::wrap)

  public fun accessLogFormat(): AccessLogFormat? =
      unwrap(this).getAccessLogFormat()?.let(AccessLogFormat::wrap)

  public fun cacheClusterEnabled(): Boolean? = unwrap(this).getCacheClusterEnabled()

  public fun cacheClusterSize(): String? = unwrap(this).getCacheClusterSize()

  public fun clientCertificateId(): String? = unwrap(this).getClientCertificateId()

  public fun description(): String? = unwrap(this).getDescription()

  public fun documentationVersion(): String? = unwrap(this).getDocumentationVersion()

  public fun methodOptions(): Map<String, MethodDeploymentOptions> =
      unwrap(this).getMethodOptions()?.mapValues{MethodDeploymentOptions.wrap(it.value)} ?:
      emptyMap()

  public fun stageName(): String? = unwrap(this).getStageName()

  public fun tracingEnabled(): Boolean? = unwrap(this).getTracingEnabled()

  public fun variables(): Map<String, String> = unwrap(this).getVariables() ?: emptyMap()

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

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.StageOptions.Builder =
        software.amazon.awscdk.services.apigateway.StageOptions.builder()

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

    public fun build(): software.amazon.awscdk.services.apigateway.StageOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.StageOptions,
  ) : CdkObject(cdkObject), StageOptions {
    override fun accessLogDestination(): IAccessLogDestination? =
        unwrap(this).getAccessLogDestination()?.let(IAccessLogDestination::wrap)

    override fun accessLogFormat(): AccessLogFormat? =
        unwrap(this).getAccessLogFormat()?.let(AccessLogFormat::wrap)

    override fun cacheClusterEnabled(): Boolean? = unwrap(this).getCacheClusterEnabled()

    override fun cacheClusterSize(): String? = unwrap(this).getCacheClusterSize()

    override fun cacheDataEncrypted(): Boolean? = unwrap(this).getCacheDataEncrypted()

    override fun cacheTtl(): Duration? = unwrap(this).getCacheTtl()?.let(Duration::wrap)

    override fun cachingEnabled(): Boolean? = unwrap(this).getCachingEnabled()

    override fun clientCertificateId(): String? = unwrap(this).getClientCertificateId()

    override fun dataTraceEnabled(): Boolean? = unwrap(this).getDataTraceEnabled()

    override fun description(): String? = unwrap(this).getDescription()

    override fun documentationVersion(): String? = unwrap(this).getDocumentationVersion()

    override fun loggingLevel(): MethodLoggingLevel? =
        unwrap(this).getLoggingLevel()?.let(MethodLoggingLevel::wrap)

    override fun methodOptions(): Map<String, MethodDeploymentOptions> =
        unwrap(this).getMethodOptions()?.mapValues{MethodDeploymentOptions.wrap(it.value)} ?:
        emptyMap()

    override fun metricsEnabled(): Boolean? = unwrap(this).getMetricsEnabled()

    override fun stageName(): String? = unwrap(this).getStageName()

    override fun throttlingBurstLimit(): Number? = unwrap(this).getThrottlingBurstLimit()

    override fun throttlingRateLimit(): Number? = unwrap(this).getThrottlingRateLimit()

    override fun tracingEnabled(): Boolean? = unwrap(this).getTracingEnabled()

    override fun variables(): Map<String, String> = unwrap(this).getVariables() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StageOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.StageOptions):
        StageOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StageOptions):
        software.amazon.awscdk.services.apigateway.StageOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigateway.StageOptions
  }
}
