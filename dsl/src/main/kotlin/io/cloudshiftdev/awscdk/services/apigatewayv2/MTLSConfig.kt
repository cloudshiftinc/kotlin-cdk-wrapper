package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit

public interface MTLSConfig {
  public fun bucket(): IBucket

  public fun key(): String

  public fun version(): String? = unwrap(this).getVersion()

  public interface Builder {
    public fun bucket(bucket: IBucket)

    public fun key(key: String)

    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.MTLSConfig.Builder =
        software.amazon.awscdk.services.apigatewayv2.MTLSConfig.builder()

    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.MTLSConfig = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigatewayv2.MTLSConfig,
  ) : MTLSConfig {
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    override fun key(): String = unwrap(this).getKey()

    override fun version(): String? = unwrap(this).getVersion()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): MTLSConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.MTLSConfig):
        MTLSConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MTLSConfig):
        software.amazon.awscdk.services.apigatewayv2.MTLSConfig = (wrapped as Wrapper).cdkObject
  }
}
