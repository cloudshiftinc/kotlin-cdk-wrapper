@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * CachingConfig for AppSync resolvers.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * CachingConfig cachingConfig = CachingConfig.builder()
 * .ttl(Duration.minutes(30))
 * // the properties below are optional
 * .cachingKeys(List.of("cachingKeys"))
 * .build();
 * ```
 */
public interface CachingConfig {
  /**
   * The caching keys for a resolver that has caching enabled.
   *
   * Valid values are entries from the $context.arguments, $context.source, and $context.identity
   * maps.
   *
   * Default: - No caching keys
   */
  public fun cachingKeys(): List<String> = unwrap(this).getCachingKeys() ?: emptyList()

  /**
   * The TTL in seconds for a resolver that has caching enabled.
   *
   * Valid values are between 1 and 3600 seconds.
   */
  public fun ttl(): Duration

  /**
   * A builder for [CachingConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cachingKeys The caching keys for a resolver that has caching enabled.
     * Valid values are entries from the $context.arguments, $context.source, and $context.identity
     * maps.
     */
    public fun cachingKeys(cachingKeys: List<String>)

    /**
     * @param cachingKeys The caching keys for a resolver that has caching enabled.
     * Valid values are entries from the $context.arguments, $context.source, and $context.identity
     * maps.
     */
    public fun cachingKeys(vararg cachingKeys: String)

    /**
     * @param ttl The TTL in seconds for a resolver that has caching enabled. 
     * Valid values are between 1 and 3600 seconds.
     */
    public fun ttl(ttl: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CachingConfig.Builder =
        software.amazon.awscdk.services.appsync.CachingConfig.builder()

    /**
     * @param cachingKeys The caching keys for a resolver that has caching enabled.
     * Valid values are entries from the $context.arguments, $context.source, and $context.identity
     * maps.
     */
    override fun cachingKeys(cachingKeys: List<String>) {
      cdkBuilder.cachingKeys(cachingKeys)
    }

    /**
     * @param cachingKeys The caching keys for a resolver that has caching enabled.
     * Valid values are entries from the $context.arguments, $context.source, and $context.identity
     * maps.
     */
    override fun cachingKeys(vararg cachingKeys: String): Unit = cachingKeys(cachingKeys.toList())

    /**
     * @param ttl The TTL in seconds for a resolver that has caching enabled. 
     * Valid values are between 1 and 3600 seconds.
     */
    override fun ttl(ttl: Duration) {
      cdkBuilder.ttl(ttl.let(Duration.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.CachingConfig = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.CachingConfig,
  ) : CdkObject(cdkObject), CachingConfig {
    /**
     * The caching keys for a resolver that has caching enabled.
     *
     * Valid values are entries from the $context.arguments, $context.source, and $context.identity
     * maps.
     *
     * Default: - No caching keys
     */
    override fun cachingKeys(): List<String> = unwrap(this).getCachingKeys() ?: emptyList()

    /**
     * The TTL in seconds for a resolver that has caching enabled.
     *
     * Valid values are between 1 and 3600 seconds.
     */
    override fun ttl(): Duration = unwrap(this).getTtl().let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CachingConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CachingConfig):
        CachingConfig = CdkObjectWrappers.wrap(cdkObject) as? CachingConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CachingConfig):
        software.amazon.awscdk.services.appsync.CachingConfig = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.appsync.CachingConfig
  }
}
