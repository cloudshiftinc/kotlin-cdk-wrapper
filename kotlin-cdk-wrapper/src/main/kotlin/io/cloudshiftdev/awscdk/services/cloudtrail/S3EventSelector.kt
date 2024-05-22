@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudtrail

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit

/**
 * Selecting an S3 bucket and an optional prefix to be logged for data events.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudtrail.*;
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * Bucket bucket;
 * S3EventSelector s3EventSelector = S3EventSelector.builder()
 * .bucket(bucket)
 * // the properties below are optional
 * .objectPrefix("objectPrefix")
 * .build();
 * ```
 */
public interface S3EventSelector {
  /**
   * S3 bucket.
   */
  public fun bucket(): IBucket

  /**
   * Data events for objects whose key matches this prefix will be logged.
   *
   * Default: - all objects
   */
  public fun objectPrefix(): String? = unwrap(this).getObjectPrefix()

  /**
   * A builder for [S3EventSelector]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucket S3 bucket. 
     */
    public fun bucket(bucket: IBucket)

    /**
     * @param objectPrefix Data events for objects whose key matches this prefix will be logged.
     */
    public fun objectPrefix(objectPrefix: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudtrail.S3EventSelector.Builder =
        software.amazon.awscdk.services.cloudtrail.S3EventSelector.builder()

    /**
     * @param bucket S3 bucket. 
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket.Companion::unwrap))
    }

    /**
     * @param objectPrefix Data events for objects whose key matches this prefix will be logged.
     */
    override fun objectPrefix(objectPrefix: String) {
      cdkBuilder.objectPrefix(objectPrefix)
    }

    public fun build(): software.amazon.awscdk.services.cloudtrail.S3EventSelector =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudtrail.S3EventSelector,
  ) : CdkObject(cdkObject), S3EventSelector {
    /**
     * S3 bucket.
     */
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    /**
     * Data events for objects whose key matches this prefix will be logged.
     *
     * Default: - all objects
     */
    override fun objectPrefix(): String? = unwrap(this).getObjectPrefix()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3EventSelector {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.S3EventSelector):
        S3EventSelector = CdkObjectWrappers.wrap(cdkObject) as? S3EventSelector ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3EventSelector):
        software.amazon.awscdk.services.cloudtrail.S3EventSelector = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudtrail.S3EventSelector
  }
}
