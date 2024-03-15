@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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

  @CdkDslMarker
  public interface Builder {
    public fun cacheDataEncrypted(cacheDataEncrypted: Boolean)

    public fun cacheTtl(cacheTtl: Duration)

    public fun cachingEnabled(cachingEnabled: Boolean)

    public fun dataTraceEnabled(dataTraceEnabled: Boolean)

    public fun loggingLevel(loggingLevel: MethodLoggingLevel)

    public fun metricsEnabled(metricsEnabled: Boolean)

    public fun throttlingBurstLimit(throttlingBurstLimit: Number)

    public fun throttlingRateLimit(throttlingRateLimit: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.MethodDeploymentOptions.Builder =
        software.amazon.awscdk.services.apigateway.MethodDeploymentOptions.builder()

    override fun cacheDataEncrypted(cacheDataEncrypted: Boolean) {
      cdkBuilder.cacheDataEncrypted(cacheDataEncrypted)
    }

    override fun cacheTtl(cacheTtl: Duration) {
      cdkBuilder.cacheTtl(cacheTtl.let(Duration::unwrap))
    }

    override fun cachingEnabled(cachingEnabled: Boolean) {
      cdkBuilder.cachingEnabled(cachingEnabled)
    }

    override fun dataTraceEnabled(dataTraceEnabled: Boolean) {
      cdkBuilder.dataTraceEnabled(dataTraceEnabled)
    }

    override fun loggingLevel(loggingLevel: MethodLoggingLevel) {
      cdkBuilder.loggingLevel(loggingLevel.let(MethodLoggingLevel::unwrap))
    }

    override fun metricsEnabled(metricsEnabled: Boolean) {
      cdkBuilder.metricsEnabled(metricsEnabled)
    }

    override fun throttlingBurstLimit(throttlingBurstLimit: Number) {
      cdkBuilder.throttlingBurstLimit(throttlingBurstLimit)
    }

    override fun throttlingRateLimit(throttlingRateLimit: Number) {
      cdkBuilder.throttlingRateLimit(throttlingRateLimit)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.MethodDeploymentOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.MethodDeploymentOptions,
  ) : CdkObject(cdkObject), MethodDeploymentOptions {
    override fun cacheDataEncrypted(): Boolean? = unwrap(this).getCacheDataEncrypted()

    override fun cacheTtl(): Duration? = unwrap(this).getCacheTtl()?.let(Duration::wrap)

    override fun cachingEnabled(): Boolean? = unwrap(this).getCachingEnabled()

    override fun dataTraceEnabled(): Boolean? = unwrap(this).getDataTraceEnabled()

    override fun loggingLevel(): MethodLoggingLevel? =
        unwrap(this).getLoggingLevel()?.let(MethodLoggingLevel::wrap)

    override fun metricsEnabled(): Boolean? = unwrap(this).getMetricsEnabled()

    override fun throttlingBurstLimit(): Number? = unwrap(this).getThrottlingBurstLimit()

    override fun throttlingRateLimit(): Number? = unwrap(this).getThrottlingRateLimit()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MethodDeploymentOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.MethodDeploymentOptions):
        MethodDeploymentOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MethodDeploymentOptions):
        software.amazon.awscdk.services.apigateway.MethodDeploymentOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.MethodDeploymentOptions
  }
}
