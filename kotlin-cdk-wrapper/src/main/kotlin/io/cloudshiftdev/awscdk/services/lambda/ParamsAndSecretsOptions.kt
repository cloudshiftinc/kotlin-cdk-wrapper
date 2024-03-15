@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

public interface ParamsAndSecretsOptions {
  public fun cacheEnabled(): Boolean? = unwrap(this).getCacheEnabled()

  public fun cacheSize(): Number? = unwrap(this).getCacheSize()

  public fun httpPort(): Number? = unwrap(this).getHttpPort()

  public fun logLevel(): ParamsAndSecretsLogLevel? =
      unwrap(this).getLogLevel()?.let(ParamsAndSecretsLogLevel::wrap)

  public fun maxConnections(): Number? = unwrap(this).getMaxConnections()

  public fun parameterStoreTimeout(): Duration? =
      unwrap(this).getParameterStoreTimeout()?.let(Duration::wrap)

  public fun parameterStoreTtl(): Duration? =
      unwrap(this).getParameterStoreTtl()?.let(Duration::wrap)

  public fun secretsManagerTimeout(): Duration? =
      unwrap(this).getSecretsManagerTimeout()?.let(Duration::wrap)

  public fun secretsManagerTtl(): Duration? =
      unwrap(this).getSecretsManagerTtl()?.let(Duration::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun cacheEnabled(cacheEnabled: Boolean)

    public fun cacheSize(cacheSize: Number)

    public fun httpPort(httpPort: Number)

    public fun logLevel(logLevel: ParamsAndSecretsLogLevel)

    public fun maxConnections(maxConnections: Number)

    public fun parameterStoreTimeout(parameterStoreTimeout: Duration)

    public fun parameterStoreTtl(parameterStoreTtl: Duration)

    public fun secretsManagerTimeout(secretsManagerTimeout: Duration)

    public fun secretsManagerTtl(secretsManagerTtl: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.ParamsAndSecretsOptions.Builder =
        software.amazon.awscdk.services.lambda.ParamsAndSecretsOptions.builder()

    override fun cacheEnabled(cacheEnabled: Boolean) {
      cdkBuilder.cacheEnabled(cacheEnabled)
    }

    override fun cacheSize(cacheSize: Number) {
      cdkBuilder.cacheSize(cacheSize)
    }

    override fun httpPort(httpPort: Number) {
      cdkBuilder.httpPort(httpPort)
    }

    override fun logLevel(logLevel: ParamsAndSecretsLogLevel) {
      cdkBuilder.logLevel(logLevel.let(ParamsAndSecretsLogLevel::unwrap))
    }

    override fun maxConnections(maxConnections: Number) {
      cdkBuilder.maxConnections(maxConnections)
    }

    override fun parameterStoreTimeout(parameterStoreTimeout: Duration) {
      cdkBuilder.parameterStoreTimeout(parameterStoreTimeout.let(Duration::unwrap))
    }

    override fun parameterStoreTtl(parameterStoreTtl: Duration) {
      cdkBuilder.parameterStoreTtl(parameterStoreTtl.let(Duration::unwrap))
    }

    override fun secretsManagerTimeout(secretsManagerTimeout: Duration) {
      cdkBuilder.secretsManagerTimeout(secretsManagerTimeout.let(Duration::unwrap))
    }

    override fun secretsManagerTtl(secretsManagerTtl: Duration) {
      cdkBuilder.secretsManagerTtl(secretsManagerTtl.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.ParamsAndSecretsOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.ParamsAndSecretsOptions,
  ) : CdkObject(cdkObject), ParamsAndSecretsOptions {
    override fun cacheEnabled(): Boolean? = unwrap(this).getCacheEnabled()

    override fun cacheSize(): Number? = unwrap(this).getCacheSize()

    override fun httpPort(): Number? = unwrap(this).getHttpPort()

    override fun logLevel(): ParamsAndSecretsLogLevel? =
        unwrap(this).getLogLevel()?.let(ParamsAndSecretsLogLevel::wrap)

    override fun maxConnections(): Number? = unwrap(this).getMaxConnections()

    override fun parameterStoreTimeout(): Duration? =
        unwrap(this).getParameterStoreTimeout()?.let(Duration::wrap)

    override fun parameterStoreTtl(): Duration? =
        unwrap(this).getParameterStoreTtl()?.let(Duration::wrap)

    override fun secretsManagerTimeout(): Duration? =
        unwrap(this).getSecretsManagerTimeout()?.let(Duration::wrap)

    override fun secretsManagerTtl(): Duration? =
        unwrap(this).getSecretsManagerTtl()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ParamsAndSecretsOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.ParamsAndSecretsOptions):
        ParamsAndSecretsOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ParamsAndSecretsOptions):
        software.amazon.awscdk.services.lambda.ParamsAndSecretsOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.ParamsAndSecretsOptions
  }
}
