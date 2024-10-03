@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Specifies a metrics configuration for the CloudWatch request metrics from an Amazon S3 bucket.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * Object tagFilters;
 * BucketMetrics bucketMetrics = BucketMetrics.builder()
 * .id("id")
 * // the properties below are optional
 * .prefix("prefix")
 * .tagFilters(Map.of(
 * "tagFiltersKey", tagFilters))
 * .build();
 * ```
 */
public interface BucketMetrics {
  /**
   * The ID used to identify the metrics configuration.
   */
  public fun id(): String

  /**
   * The prefix that an object must have to be included in the metrics results.
   */
  public fun prefix(): String? = unwrap(this).getPrefix()

  /**
   * Specifies a list of tag filters to use as a metrics configuration filter.
   *
   * The metrics configuration includes only objects that meet the filter's criteria.
   */
  public fun tagFilters(): Map<String, Any> = unwrap(this).getTagFilters() ?: emptyMap()

  /**
   * A builder for [BucketMetrics]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param id The ID used to identify the metrics configuration. 
     */
    public fun id(id: String)

    /**
     * @param prefix The prefix that an object must have to be included in the metrics results.
     */
    public fun prefix(prefix: String)

    /**
     * @param tagFilters Specifies a list of tag filters to use as a metrics configuration filter.
     * The metrics configuration includes only objects that meet the filter's criteria.
     */
    public fun tagFilters(tagFilters: Map<String, Any>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.BucketMetrics.Builder =
        software.amazon.awscdk.services.s3.BucketMetrics.builder()

    /**
     * @param id The ID used to identify the metrics configuration. 
     */
    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    /**
     * @param prefix The prefix that an object must have to be included in the metrics results.
     */
    override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    /**
     * @param tagFilters Specifies a list of tag filters to use as a metrics configuration filter.
     * The metrics configuration includes only objects that meet the filter's criteria.
     */
    override fun tagFilters(tagFilters: Map<String, Any>) {
      cdkBuilder.tagFilters(tagFilters.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    public fun build(): software.amazon.awscdk.services.s3.BucketMetrics = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.s3.BucketMetrics,
  ) : CdkObject(cdkObject),
      BucketMetrics {
    /**
     * The ID used to identify the metrics configuration.
     */
    override fun id(): String = unwrap(this).getId()

    /**
     * The prefix that an object must have to be included in the metrics results.
     */
    override fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * Specifies a list of tag filters to use as a metrics configuration filter.
     *
     * The metrics configuration includes only objects that meet the filter's criteria.
     */
    override fun tagFilters(): Map<String, Any> = unwrap(this).getTagFilters() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BucketMetrics {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.BucketMetrics): BucketMetrics =
        CdkObjectWrappers.wrap(cdkObject) as? BucketMetrics ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: BucketMetrics): software.amazon.awscdk.services.s3.BucketMetrics =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.s3.BucketMetrics
  }
}
