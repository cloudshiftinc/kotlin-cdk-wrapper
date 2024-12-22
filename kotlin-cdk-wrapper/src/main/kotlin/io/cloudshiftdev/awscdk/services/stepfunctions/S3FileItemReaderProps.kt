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
 * Base interface for Item Reader configuration properties the iterate over entries in a S3 file.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * / **
 * * Tree view of bucket:
 * *  my-bucket
 * *  |
 * *  +--input.json
 * *  |
 * *  ...
 * *
 * * File content of input.json:
 * *  [
 * *    "item1",
 * *    "item2"
 * *  ]
 * *&#47;
 * Bucket bucket = Bucket.Builder.create(this, "Bucket")
 * .bucketName("my-bucket")
 * .build();
 * DistributedMap distributedMap = DistributedMap.Builder.create(this, "DistributedMap")
 * .itemReader(S3JsonItemReader.Builder.create()
 * .bucket(bucket)
 * .key("input.json")
 * .build())
 * .build();
 * distributedMap.itemProcessor(new Pass(this, "Pass"));
 * ```
 */
public interface S3FileItemReaderProps : ItemReaderProps {
  /**
   * Key of file stored in S3 bucket containing an array to iterate over.
   */
  public fun key(): String

  /**
   * A builder for [S3FileItemReaderProps]
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
     * @param key Key of file stored in S3 bucket containing an array to iterate over. 
     */
    public fun key(key: String)

    /**
     * @param maxItems Limits the number of items passed to the Distributed Map state.
     */
    public fun maxItems(maxItems: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.S3FileItemReaderProps.Builder =
        software.amazon.awscdk.services.stepfunctions.S3FileItemReaderProps.builder()

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
     * @param key Key of file stored in S3 bucket containing an array to iterate over. 
     */
    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    /**
     * @param maxItems Limits the number of items passed to the Distributed Map state.
     */
    override fun maxItems(maxItems: Number) {
      cdkBuilder.maxItems(maxItems)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.S3FileItemReaderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.stepfunctions.S3FileItemReaderProps,
  ) : CdkObject(cdkObject),
      S3FileItemReaderProps {
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
     * Key of file stored in S3 bucket containing an array to iterate over.
     */
    override fun key(): String = unwrap(this).getKey()

    /**
     * Limits the number of items passed to the Distributed Map state.
     *
     * Default: - Distributed Map state will iterate over all items provided by the ItemReader
     */
    override fun maxItems(): Number? = unwrap(this).getMaxItems()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3FileItemReaderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.S3FileItemReaderProps):
        S3FileItemReaderProps = CdkObjectWrappers.wrap(cdkObject) as? S3FileItemReaderProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3FileItemReaderProps):
        software.amazon.awscdk.services.stepfunctions.S3FileItemReaderProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.S3FileItemReaderProps
  }
}
