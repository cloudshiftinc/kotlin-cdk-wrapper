package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.Duration
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CachingConfig {
  public fun cachingKeys(): List<String> = unwrap(this).getCachingKeys() ?: emptyList()

  public fun ttl(): Duration

  public interface Builder {
    public fun cachingKeys(cachingKeys: List<String>) {
    }

    public fun ttl(ttl: Duration) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CachingConfig.Builder =
        software.amazon.awscdk.services.appsync.CachingConfig.builder()

    public override fun cachingKeys(cachingKeys: List<String>) {
      cdkBuilder.cachingKeys(cachingKeys)
    }

    public override fun ttl(ttl: Duration) {
      cdkBuilder.ttl(ttl.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.CachingConfig = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appsync.CachingConfig,
  ) : CachingConfig {
    public override fun cachingKeys(): List<String> = unwrap(this).getCachingKeys() ?: emptyList()

    public override fun ttl(): Duration = unwrap(this).getTtl().let(Duration::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CachingConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CachingConfig):
        CachingConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CachingConfig):
        software.amazon.awscdk.services.appsync.CachingConfig = (wrapped as Wrapper).cdkObject
  }
}
