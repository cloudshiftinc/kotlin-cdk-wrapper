@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Example:
 *
 * ```
 * Bucket sourceBucket;
 * Bucket myCachingBucket;
 * Project.Builder.create(this, "ProjectA")
 * .source(Source.s3(S3SourceProps.builder()
 * .bucket(sourceBucket)
 * .path("path/to/source-a.zip")
 * .build()))
 * // configure the same bucket and path prefix
 * .cache(Cache.bucket(myCachingBucket, BucketCacheOptions.builder()
 * .prefix("cache")
 * // use the same cache namespace
 * .cacheNamespace("cache-namespace")
 * .build()))
 * .buildSpec(BuildSpec.fromObject(Map.of(
 * "version", "0.2",
 * "phases", Map.of(
 * "build", Map.of(
 * "commands", List.of("..."))),
 * // specify the same cache key and paths
 * "cache", Map.of(
 * "key", "unique-key",
 * "paths", List.of("/root/cachedir/ **&#47;*")))))
 * .build();
 * Project.Builder.create(this, "ProjectB")
 * .source(Source.s3(S3SourceProps.builder()
 * .bucket(sourceBucket)
 * .path("path/to/source-b.zip")
 * .build()))
 * // configure the same bucket and path prefix
 * .cache(Cache.bucket(myCachingBucket, BucketCacheOptions.builder()
 * .prefix("cache")
 * // use the same cache namespace
 * .cacheNamespace("cache-namespace")
 * .build()))
 * .buildSpec(BuildSpec.fromObject(Map.of(
 * "version", "0.2",
 * "phases", Map.of(
 * "build", Map.of(
 * "commands", List.of("..."))),
 * // specify the same cache key and paths
 * "cache", Map.of(
 * "key", "unique-key",
 * "paths", List.of("/root/cachedir/ **&#47;*")))))
 * .build();
 * ```
 */
public interface BucketCacheOptions {
  /**
   * Defines the scope of the cache.
   *
   * You can use this namespace to share a cache across multiple projects.
   *
   * Default: undefined - No cache namespace, which means that the cache is not shared across
   * multiple projects.
   *
   * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/caching-s3.html#caching-s3-sharing)
   */
  public fun cacheNamespace(): String? = unwrap(this).getCacheNamespace()

  /**
   * The prefix to use to store the cache in the bucket.
   */
  public fun prefix(): String? = unwrap(this).getPrefix()

  /**
   * A builder for [BucketCacheOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cacheNamespace Defines the scope of the cache.
     * You can use this namespace to share a cache across multiple projects.
     */
    public fun cacheNamespace(cacheNamespace: String)

    /**
     * @param prefix The prefix to use to store the cache in the bucket.
     */
    public fun prefix(prefix: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.BucketCacheOptions.Builder =
        software.amazon.awscdk.services.codebuild.BucketCacheOptions.builder()

    /**
     * @param cacheNamespace Defines the scope of the cache.
     * You can use this namespace to share a cache across multiple projects.
     */
    override fun cacheNamespace(cacheNamespace: String) {
      cdkBuilder.cacheNamespace(cacheNamespace)
    }

    /**
     * @param prefix The prefix to use to store the cache in the bucket.
     */
    override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.BucketCacheOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codebuild.BucketCacheOptions,
  ) : CdkObject(cdkObject),
      BucketCacheOptions {
    /**
     * Defines the scope of the cache.
     *
     * You can use this namespace to share a cache across multiple projects.
     *
     * Default: undefined - No cache namespace, which means that the cache is not shared across
     * multiple projects.
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/caching-s3.html#caching-s3-sharing)
     */
    override fun cacheNamespace(): String? = unwrap(this).getCacheNamespace()

    /**
     * The prefix to use to store the cache in the bucket.
     */
    override fun prefix(): String? = unwrap(this).getPrefix()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BucketCacheOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.BucketCacheOptions):
        BucketCacheOptions = CdkObjectWrappers.wrap(cdkObject) as? BucketCacheOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BucketCacheOptions):
        software.amazon.awscdk.services.codebuild.BucketCacheOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.BucketCacheOptions
  }
}
