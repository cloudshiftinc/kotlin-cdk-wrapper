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
 * Properties for configuring an Item Reader that iterates over items in a CSV file in S3.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * Bucket bucket;
 * CsvHeaders csvHeaders;
 * S3CsvItemReaderProps s3CsvItemReaderProps = S3CsvItemReaderProps.builder()
 * .bucket(bucket)
 * .key("key")
 * // the properties below are optional
 * .csvHeaders(csvHeaders)
 * .maxItems(123)
 * .build();
 * ```
 */
public interface S3CsvItemReaderProps : S3FileItemReaderProps {
  /**
   * CSV file header configuration.
   *
   * Default: - CsvHeaders with CsvHeadersLocation.FIRST_ROW
   */
  public fun csvHeaders(): CsvHeaders? = unwrap(this).getCsvHeaders()?.let(CsvHeaders::wrap)

  /**
   * A builder for [S3CsvItemReaderProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucket S3 Bucket containing objects to iterate over or a file with a list to iterate
     * over. 
     */
    public fun bucket(bucket: IBucket)

    /**
     * @param csvHeaders CSV file header configuration.
     */
    public fun csvHeaders(csvHeaders: CsvHeaders)

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
        software.amazon.awscdk.services.stepfunctions.S3CsvItemReaderProps.Builder =
        software.amazon.awscdk.services.stepfunctions.S3CsvItemReaderProps.builder()

    /**
     * @param bucket S3 Bucket containing objects to iterate over or a file with a list to iterate
     * over. 
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    /**
     * @param csvHeaders CSV file header configuration.
     */
    override fun csvHeaders(csvHeaders: CsvHeaders) {
      cdkBuilder.csvHeaders(csvHeaders.let(CsvHeaders::unwrap))
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

    public fun build(): software.amazon.awscdk.services.stepfunctions.S3CsvItemReaderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.S3CsvItemReaderProps,
  ) : CdkObject(cdkObject), S3CsvItemReaderProps {
    /**
     * S3 Bucket containing objects to iterate over or a file with a list to iterate over.
     */
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    /**
     * CSV file header configuration.
     *
     * Default: - CsvHeaders with CsvHeadersLocation.FIRST_ROW
     */
    override fun csvHeaders(): CsvHeaders? = unwrap(this).getCsvHeaders()?.let(CsvHeaders::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): S3CsvItemReaderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.S3CsvItemReaderProps):
        S3CsvItemReaderProps = CdkObjectWrappers.wrap(cdkObject) as S3CsvItemReaderProps

    internal fun unwrap(wrapped: S3CsvItemReaderProps):
        software.amazon.awscdk.services.stepfunctions.S3CsvItemReaderProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.S3CsvItemReaderProps
  }
}
