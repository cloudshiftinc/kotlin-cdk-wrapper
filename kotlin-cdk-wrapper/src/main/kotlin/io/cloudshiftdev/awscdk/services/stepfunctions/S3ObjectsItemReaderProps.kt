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
 * Properties for configuring an Item Reader that iterates over objects in an S3 bucket.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * / **
 * * Tree view of bucket:
 * *  my-bucket
 * *  |
 * *  +--item1
 * *  |
 * *  +--otherItem
 * *  |
 * *  +--item2
 * *  |
 * *  ...
 * *&#47;
 * Bucket bucket = Bucket.Builder.create(this, "Bucket")
 * .bucketName("my-bucket")
 * .build();
 * DistributedMap distributedMap = DistributedMap.Builder.create(this, "DistributedMap")
 * .itemReader(S3ObjectsItemReader.Builder.create()
 * .bucket(bucket)
 * .prefix("item")
 * .build())
 * .build();
 * distributedMap.itemProcessor(new Pass(this, "Pass"));
 * ```
 */
public interface S3ObjectsItemReaderProps : ItemReaderProps {
  /**
   * S3 prefix used to limit objects to iterate over.
   *
   * Default: - No prefix
   */
  public fun prefix(): String? = unwrap(this).getPrefix()

  /**
   * A builder for [S3ObjectsItemReaderProps]
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

    /**
     * @param prefix S3 prefix used to limit objects to iterate over.
     */
    public fun prefix(prefix: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.S3ObjectsItemReaderProps.Builder =
        software.amazon.awscdk.services.stepfunctions.S3ObjectsItemReaderProps.builder()

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

    /**
     * @param prefix S3 prefix used to limit objects to iterate over.
     */
    override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.S3ObjectsItemReaderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.S3ObjectsItemReaderProps,
  ) : CdkObject(cdkObject),
      S3ObjectsItemReaderProps {
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

    /**
     * S3 prefix used to limit objects to iterate over.
     *
     * Default: - No prefix
     */
    override fun prefix(): String? = unwrap(this).getPrefix()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3ObjectsItemReaderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.S3ObjectsItemReaderProps):
        S3ObjectsItemReaderProps = CdkObjectWrappers.wrap(cdkObject) as? S3ObjectsItemReaderProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3ObjectsItemReaderProps):
        software.amazon.awscdk.services.stepfunctions.S3ObjectsItemReaderProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.S3ObjectsItemReaderProps
  }
}
