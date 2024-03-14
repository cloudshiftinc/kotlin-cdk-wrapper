package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.Duration
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

  public interface Builder {
    public fun cacheEnabled(cacheEnabled: Boolean) {
    }

    public fun cacheSize(cacheSize: Number) {
    }

    public fun httpPort(httpPort: Number) {
    }

    public fun logLevel(logLevel: ParamsAndSecretsLogLevel) {
    }

    public fun maxConnections(maxConnections: Number) {
    }

    public fun parameterStoreTimeout(parameterStoreTimeout: Duration) {
    }

    public fun parameterStoreTtl(parameterStoreTtl: Duration) {
    }

    public fun secretsManagerTimeout(secretsManagerTimeout: Duration) {
    }

    public fun secretsManagerTtl(secretsManagerTtl: Duration) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.ParamsAndSecretsOptions.Builder =
        software.amazon.awscdk.services.lambda.ParamsAndSecretsOptions.builder()

    public override fun cacheEnabled(cacheEnabled: Boolean) {
      cdkBuilder.cacheEnabled(cacheEnabled)
    }

    public override fun cacheSize(cacheSize: Number) {
      cdkBuilder.cacheSize(cacheSize)
    }

    public override fun httpPort(httpPort: Number) {
      cdkBuilder.httpPort(httpPort)
    }

    public override fun logLevel(logLevel: ParamsAndSecretsLogLevel) {
      cdkBuilder.logLevel(logLevel.let(ParamsAndSecretsLogLevel::unwrap))
    }

    public override fun maxConnections(maxConnections: Number) {
      cdkBuilder.maxConnections(maxConnections)
    }

    public override fun parameterStoreTimeout(parameterStoreTimeout: Duration) {
      cdkBuilder.parameterStoreTimeout(parameterStoreTimeout.let(Duration::unwrap))
    }

    public override fun parameterStoreTtl(parameterStoreTtl: Duration) {
      cdkBuilder.parameterStoreTtl(parameterStoreTtl.let(Duration::unwrap))
    }

    public override fun secretsManagerTimeout(secretsManagerTimeout: Duration) {
      cdkBuilder.secretsManagerTimeout(secretsManagerTimeout.let(Duration::unwrap))
    }

    public override fun secretsManagerTtl(secretsManagerTtl: Duration) {
      cdkBuilder.secretsManagerTtl(secretsManagerTtl.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.ParamsAndSecretsOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.ParamsAndSecretsOptions,
  ) : ParamsAndSecretsOptions {
    public override fun cacheEnabled(): Boolean? = unwrap(this).getCacheEnabled()

    public override fun cacheSize(): Number? = unwrap(this).getCacheSize()

    public override fun httpPort(): Number? = unwrap(this).getHttpPort()

    public override fun logLevel(): ParamsAndSecretsLogLevel? =
        unwrap(this).getLogLevel()?.let(ParamsAndSecretsLogLevel::wrap)

    public override fun maxConnections(): Number? = unwrap(this).getMaxConnections()

    public override fun parameterStoreTimeout(): Duration? =
        unwrap(this).getParameterStoreTimeout()?.let(Duration::wrap)

    public override fun parameterStoreTtl(): Duration? =
        unwrap(this).getParameterStoreTtl()?.let(Duration::wrap)

    public override fun secretsManagerTimeout(): Duration? =
        unwrap(this).getSecretsManagerTimeout()?.let(Duration::wrap)

    public override fun secretsManagerTtl(): Duration? =
        unwrap(this).getSecretsManagerTtl()?.let(Duration::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ParamsAndSecretsOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.ParamsAndSecretsOptions):
        ParamsAndSecretsOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ParamsAndSecretsOptions):
        software.amazon.awscdk.services.lambda.ParamsAndSecretsOptions = (wrapped as
        Wrapper).cdkObject
  }
}
