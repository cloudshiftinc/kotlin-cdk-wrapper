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
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * Bucket bucket;
 * S3ObjectsItemReaderProps s3ObjectsItemReaderProps = S3ObjectsItemReaderProps.builder()
 * .bucket(bucket)
 * // the properties below are optional
 * .maxItems(123)
 * .prefix("prefix")
 * .build();
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
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
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
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.S3ObjectsItemReaderProps,
  ) : CdkObject(cdkObject), S3ObjectsItemReaderProps {
    /**
     * S3 Bucket containing objects to iterate over or a file with a list to iterate over.
     */
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

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
