package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Duration
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
      unwrap(this).getMethodOptions()?.mapValues { MethodDeploymentOptions.wrap(it.value)} ?:
      emptyMap()

  public fun stageName(): String? = unwrap(this).getStageName()

  public fun tracingEnabled(): Boolean? = unwrap(this).getTracingEnabled()

  public fun variables(): Map<String, String> = unwrap(this).getVariables() ?: emptyMap()

  public interface Builder {
    public fun accessLogDestination(accessLogDestination: IAccessLogDestination) {
    }

    public fun accessLogFormat(accessLogFormat: AccessLogFormat) {
    }

    public fun cacheClusterEnabled(cacheClusterEnabled: Boolean) {
    }

    public fun cacheClusterSize(cacheClusterSize: String) {
    }

    public fun cacheDataEncrypted(cacheDataEncrypted: Boolean) {
    }

    public fun cacheTtl(cacheTtl: Duration) {
    }

    public fun cachingEnabled(cachingEnabled: Boolean) {
    }

    public fun clientCertificateId(clientCertificateId: String) {
    }

    public fun dataTraceEnabled(dataTraceEnabled: Boolean) {
    }

    public fun description(description: String) {
    }

    public fun documentationVersion(documentationVersion: String) {
    }

    public fun loggingLevel(loggingLevel: MethodLoggingLevel) {
    }

    public fun methodOptions(methodOptions: Map<String, MethodDeploymentOptions>) {
    }

    public fun metricsEnabled(metricsEnabled: Boolean) {
    }

    public fun stageName(stageName: String) {
    }

    public fun throttlingBurstLimit(throttlingBurstLimit: Number) {
    }

    public fun throttlingRateLimit(throttlingRateLimit: Number) {
    }

    public fun tracingEnabled(tracingEnabled: Boolean) {
    }

    public fun variables(variables: Map<String, String>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.StageOptions.Builder =
        software.amazon.awscdk.services.apigateway.StageOptions.builder()

    public override fun accessLogDestination(accessLogDestination: IAccessLogDestination) {
      cdkBuilder.accessLogDestination(accessLogDestination.let(IAccessLogDestination::unwrap))
    }

    public override fun accessLogFormat(accessLogFormat: AccessLogFormat) {
      cdkBuilder.accessLogFormat(accessLogFormat.let(AccessLogFormat::unwrap))
    }

    public override fun cacheClusterEnabled(cacheClusterEnabled: Boolean) {
      cdkBuilder.cacheClusterEnabled(cacheClusterEnabled)
    }

    public override fun cacheClusterSize(cacheClusterSize: String) {
      cdkBuilder.cacheClusterSize(cacheClusterSize)
    }

    public override fun cacheDataEncrypted(cacheDataEncrypted: Boolean) {
      cdkBuilder.cacheDataEncrypted(cacheDataEncrypted)
    }

    public override fun cacheTtl(cacheTtl: Duration) {
      cdkBuilder.cacheTtl(cacheTtl.let(Duration::unwrap))
    }

    public override fun cachingEnabled(cachingEnabled: Boolean) {
      cdkBuilder.cachingEnabled(cachingEnabled)
    }

    public override fun clientCertificateId(clientCertificateId: String) {
      cdkBuilder.clientCertificateId(clientCertificateId)
    }

    public override fun dataTraceEnabled(dataTraceEnabled: Boolean) {
      cdkBuilder.dataTraceEnabled(dataTraceEnabled)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun documentationVersion(documentationVersion: String) {
      cdkBuilder.documentationVersion(documentationVersion)
    }

    public override fun loggingLevel(loggingLevel: MethodLoggingLevel) {
      cdkBuilder.loggingLevel(loggingLevel.let(MethodLoggingLevel::unwrap))
    }

    public override fun methodOptions(methodOptions: Map<String, MethodDeploymentOptions>) {
      cdkBuilder.methodOptions(methodOptions.mapValues { MethodDeploymentOptions.unwrap(it.value)})
    }

    public override fun metricsEnabled(metricsEnabled: Boolean) {
      cdkBuilder.metricsEnabled(metricsEnabled)
    }

    public override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    public override fun throttlingBurstLimit(throttlingBurstLimit: Number) {
      cdkBuilder.throttlingBurstLimit(throttlingBurstLimit)
    }

    public override fun throttlingRateLimit(throttlingRateLimit: Number) {
      cdkBuilder.throttlingRateLimit(throttlingRateLimit)
    }

    public override fun tracingEnabled(tracingEnabled: Boolean) {
      cdkBuilder.tracingEnabled(tracingEnabled)
    }

    public override fun variables(variables: Map<String, String>) {
      cdkBuilder.variables(variables)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.StageOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.StageOptions,
  ) : StageOptions {
    public override fun accessLogDestination(): IAccessLogDestination? =
        unwrap(this).getAccessLogDestination()?.let(IAccessLogDestination::wrap)

    public override fun accessLogFormat(): AccessLogFormat? =
        unwrap(this).getAccessLogFormat()?.let(AccessLogFormat::wrap)

    public override fun cacheClusterEnabled(): Boolean? = unwrap(this).getCacheClusterEnabled()

    public override fun cacheClusterSize(): String? = unwrap(this).getCacheClusterSize()

    public override fun cacheDataEncrypted(): Boolean? = unwrap(this).getCacheDataEncrypted()

    public override fun cacheTtl(): Duration? = unwrap(this).getCacheTtl()?.let(Duration::wrap)

    public override fun cachingEnabled(): Boolean? = unwrap(this).getCachingEnabled()

    public override fun clientCertificateId(): String? = unwrap(this).getClientCertificateId()

    public override fun dataTraceEnabled(): Boolean? = unwrap(this).getDataTraceEnabled()

    public override fun description(): String? = unwrap(this).getDescription()

    public override fun documentationVersion(): String? = unwrap(this).getDocumentationVersion()

    public override fun loggingLevel(): MethodLoggingLevel? =
        unwrap(this).getLoggingLevel()?.let(MethodLoggingLevel::wrap)

    public override fun methodOptions(): Map<String, MethodDeploymentOptions> =
        unwrap(this).getMethodOptions()?.mapValues { MethodDeploymentOptions.wrap(it.value)} ?:
        emptyMap()

    public override fun metricsEnabled(): Boolean? = unwrap(this).getMetricsEnabled()

    public override fun stageName(): String? = unwrap(this).getStageName()

    public override fun throttlingBurstLimit(): Number? = unwrap(this).getThrottlingBurstLimit()

    public override fun throttlingRateLimit(): Number? = unwrap(this).getThrottlingRateLimit()

    public override fun tracingEnabled(): Boolean? = unwrap(this).getTracingEnabled()

    public override fun variables(): Map<String, String> = unwrap(this).getVariables() ?: emptyMap()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): StageOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.StageOptions):
        StageOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StageOptions):
        software.amazon.awscdk.services.apigateway.StageOptions = (wrapped as Wrapper).cdkObject
  }
}
