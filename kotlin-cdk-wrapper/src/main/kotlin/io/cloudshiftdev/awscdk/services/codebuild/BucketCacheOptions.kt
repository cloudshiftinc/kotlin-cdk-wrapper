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
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codebuild.*;
 * BucketCacheOptions bucketCacheOptions = BucketCacheOptions.builder()
 * .prefix("prefix")
 * .build();
 * ```
 */
public interface BucketCacheOptions {
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
     * @param prefix The prefix to use to store the cache in the bucket.
     */
    public fun prefix(prefix: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codebuild.BucketCacheOptions.Builder =
        software.amazon.awscdk.services.codebuild.BucketCacheOptions.builder()

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
    override val cdkObject: software.amazon.awscdk.services.codebuild.BucketCacheOptions,
  ) : CdkObject(cdkObject), BucketCacheOptions {
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
        BucketCacheOptions = CdkObjectWrappers.wrap(cdkObject) as BucketCacheOptions

    internal fun unwrap(wrapped: BucketCacheOptions):
        software.amazon.awscdk.services.codebuild.BucketCacheOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.BucketCacheOptions
  }
}
