package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Duration
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

public interface MethodDeploymentOptions {
  public fun cacheDataEncrypted(): Boolean? = unwrap(this).getCacheDataEncrypted()

  public fun cacheTtl(): Duration? = unwrap(this).getCacheTtl()?.let(Duration::wrap)

  public fun cachingEnabled(): Boolean? = unwrap(this).getCachingEnabled()

  public fun dataTraceEnabled(): Boolean? = unwrap(this).getDataTraceEnabled()

  public fun loggingLevel(): MethodLoggingLevel? =
      unwrap(this).getLoggingLevel()?.let(MethodLoggingLevel::wrap)

  public fun metricsEnabled(): Boolean? = unwrap(this).getMetricsEnabled()

  public fun throttlingBurstLimit(): Number? = unwrap(this).getThrottlingBurstLimit()

  public fun throttlingRateLimit(): Number? = unwrap(this).getThrottlingRateLimit()

  public interface Builder {
    public fun cacheDataEncrypted(cacheDataEncrypted: Boolean) {
    }

    public fun cacheTtl(cacheTtl: Duration) {
    }

    public fun cachingEnabled(cachingEnabled: Boolean) {
    }

    public fun dataTraceEnabled(dataTraceEnabled: Boolean) {
    }

    public fun loggingLevel(loggingLevel: MethodLoggingLevel) {
    }

    public fun metricsEnabled(metricsEnabled: Boolean) {
    }

    public fun throttlingBurstLimit(throttlingBurstLimit: Number) {
    }

    public fun throttlingRateLimit(throttlingRateLimit: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.MethodDeploymentOptions.Builder =
        software.amazon.awscdk.services.apigateway.MethodDeploymentOptions.builder()

    public override fun cacheDataEncrypted(cacheDataEncrypted: Boolean) {
      cdkBuilder.cacheDataEncrypted(cacheDataEncrypted)
    }

    public override fun cacheTtl(cacheTtl: Duration) {
      cdkBuilder.cacheTtl(cacheTtl.let(Duration::unwrap))
    }

    public override fun cachingEnabled(cachingEnabled: Boolean) {
      cdkBuilder.cachingEnabled(cachingEnabled)
    }

    public override fun dataTraceEnabled(dataTraceEnabled: Boolean) {
      cdkBuilder.dataTraceEnabled(dataTraceEnabled)
    }

    public override fun loggingLevel(loggingLevel: MethodLoggingLevel) {
      cdkBuilder.loggingLevel(loggingLevel.let(MethodLoggingLevel::unwrap))
    }

    public override fun metricsEnabled(metricsEnabled: Boolean) {
      cdkBuilder.metricsEnabled(metricsEnabled)
    }

    public override fun throttlingBurstLimit(throttlingBurstLimit: Number) {
      cdkBuilder.throttlingBurstLimit(throttlingBurstLimit)
    }

    public override fun throttlingRateLimit(throttlingRateLimit: Number) {
      cdkBuilder.throttlingRateLimit(throttlingRateLimit)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.MethodDeploymentOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.MethodDeploymentOptions,
  ) : MethodDeploymentOptions {
    public override fun cacheDataEncrypted(): Boolean? = unwrap(this).getCacheDataEncrypted()

    public override fun cacheTtl(): Duration? = unwrap(this).getCacheTtl()?.let(Duration::wrap)

    public override fun cachingEnabled(): Boolean? = unwrap(this).getCachingEnabled()

    public override fun dataTraceEnabled(): Boolean? = unwrap(this).getDataTraceEnabled()

    public override fun loggingLevel(): MethodLoggingLevel? =
        unwrap(this).getLoggingLevel()?.let(MethodLoggingLevel::wrap)

    public override fun metricsEnabled(): Boolean? = unwrap(this).getMetricsEnabled()

    public override fun throttlingBurstLimit(): Number? = unwrap(this).getThrottlingBurstLimit()

    public override fun throttlingRateLimit(): Number? = unwrap(this).getThrottlingRateLimit()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): MethodDeploymentOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.MethodDeploymentOptions):
        MethodDeploymentOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MethodDeploymentOptions):
        software.amazon.awscdk.services.apigateway.MethodDeploymentOptions = (wrapped as
        Wrapper).cdkObject
  }
}
