@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Base interface for Item Reader configuration properties.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * Bucket bucket;
 * ItemReaderProps itemReaderProps = ItemReaderProps.builder()
 * .bucket(bucket)
 * .bucketNamePath("bucketNamePath")
 * .maxItems(123)
 * .build();
 * ```
 */
public interface ItemReaderProps {
  /**
   * S3 Bucket containing objects to iterate over or a file with a list to iterate over.
   *
   * Default: - S3 bucket will be determined from
   *
   * [Documentation](bucketNamePath)
   */
  public fun bucket(): IBucket? = unwrap(this).getBucket()?.let(IBucket::wrap)

  /**
   * S3 bucket name containing objects to iterate over or a file with a list to iterate over, as
   * JsonPath.
   *
   * Default: - S3 bucket will be determined from
   *
   * [Documentation](bucket)
   */
  public fun bucketNamePath(): String? = unwrap(this).getBucketNamePath()

  /**
   * Limits the number of items passed to the Distributed Map state.
   *
   * Default: - Distributed Map state will iterate over all items provided by the ItemReader
   */
  public fun maxItems(): Number? = unwrap(this).getMaxItems()

  /**
   * A builder for [ItemReaderProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucket S3 Bucket containing objects to iterate over or a file with a list to iterate
     * over.
     */
    public fun bucket(bucket: IBucket)

    /**
     * @param bucketNamePath S3 bucket name containing objects to iterate over or a file with a list
     * to iterate over, as JsonPath.
     */
    public fun bucketNamePath(bucketNamePath: String)

    /**
     * @param maxItems Limits the number of items passed to the Distributed Map state.
     */
    public fun maxItems(maxItems: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.ItemReaderProps.Builder =
        software.amazon.awscdk.services.stepfunctions.ItemReaderProps.builder()

    /**
     * @param bucket S3 Bucket containing objects to iterate over or a file with a list to iterate
     * over.
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket.Companion::unwrap))
    }

    /**
     * @param bucketNamePath S3 bucket name containing objects to iterate over or a file with a list
     * to iterate over, as JsonPath.
     */
    override fun bucketNamePath(bucketNamePath: String) {
      cdkBuilder.bucketNamePath(bucketNamePath)
    }

    /**
     * @param maxItems Limits the number of items passed to the Distributed Map state.
     */
    override fun maxItems(maxItems: Number) {
      cdkBuilder.maxItems(maxItems)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.ItemReaderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.ItemReaderProps,
  ) : CdkObject(cdkObject),
      ItemReaderProps {
    /**
     * S3 Bucket containing objects to iterate over or a file with a list to iterate over.
     *
     * Default: - S3 bucket will be determined from
     *
     * [Documentation](bucketNamePath)
     */
    override fun bucket(): IBucket? = unwrap(this).getBucket()?.let(IBucket::wrap)

    /**
     * S3 bucket name containing objects to iterate over or a file with a list to iterate over, as
     * JsonPath.
     *
     * Default: - S3 bucket will be determined from
     *
     * [Documentation](bucket)
     */
    override fun bucketNamePath(): String? = unwrap(this).getBucketNamePath()

    /**
     * Limits the number of items passed to the Distributed Map state.
     *
     * Default: - Distributed Map state will iterate over all items provided by the ItemReader
     */
    override fun maxItems(): Number? = unwrap(this).getMaxItems()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ItemReaderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.ItemReaderProps):
        ItemReaderProps = CdkObjectWrappers.wrap(cdkObject) as? ItemReaderProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ItemReaderProps):
        software.amazon.awscdk.services.stepfunctions.ItemReaderProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.ItemReaderProps
  }
}
