@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CachingConfig {
  public fun cachingKeys(): List<String> = unwrap(this).getCachingKeys() ?: emptyList()

  public fun ttl(): Duration

  @CdkDslMarker
  public interface Builder {
    public fun cachingKeys(cachingKeys: List<String>)

    public fun cachingKeys(vararg cachingKeys: String)

    public fun ttl(ttl: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CachingConfig.Builder =
        software.amazon.awscdk.services.appsync.CachingConfig.builder()

    override fun cachingKeys(cachingKeys: List<String>) {
      cdkBuilder.cachingKeys(cachingKeys)
    }

    override fun cachingKeys(vararg cachingKeys: String): Unit = cachingKeys(cachingKeys.toList())

    override fun ttl(ttl: Duration) {
      cdkBuilder.ttl(ttl.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.CachingConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.CachingConfig,
  ) : CdkObject(cdkObject), CachingConfig {
    override fun cachingKeys(): List<String> = unwrap(this).getCachingKeys() ?: emptyList()

    override fun ttl(): Duration = unwrap(this).getTtl().let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CachingConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CachingConfig):
        CachingConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CachingConfig):
        software.amazon.awscdk.services.appsync.CachingConfig = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.appsync.CachingConfig
  }
}
