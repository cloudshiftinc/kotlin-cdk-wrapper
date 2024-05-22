@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Item Reader configuration for iterating over items in a CSV file stored in S3.
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
 * S3CsvItemReader s3CsvItemReader = S3CsvItemReader.Builder.create()
 * .bucket(bucket)
 * .key("key")
 * // the properties below are optional
 * .csvHeaders(csvHeaders)
 * .maxItems(123)
 * .build();
 * ```
 */
public open class S3CsvItemReader(
  cdkObject: software.amazon.awscdk.services.stepfunctions.S3CsvItemReader,
) : CdkObject(cdkObject), IItemReader {
  public constructor(props: S3CsvItemReaderProps) :
      this(software.amazon.awscdk.services.stepfunctions.S3CsvItemReader(props.let(S3CsvItemReaderProps.Companion::unwrap))
  )

  public constructor(props: S3CsvItemReaderProps.Builder.() -> Unit) :
      this(S3CsvItemReaderProps(props)
  )

  /**
   * S3 Bucket containing a file with a list to iterate over.
   */
  public override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

  /**
   * CSV headers configuration.
   */
  public open fun csvHeaders(): CsvHeaders = unwrap(this).getCsvHeaders().let(CsvHeaders::wrap)

  /**
   * S3 key of a file with a list to iterate over.
   */
  public open fun key(): String = unwrap(this).getKey()

  /**
   * Limits the number of items passed to the Distributed Map state.
   *
   * Default: - No maxItems
   */
  public override fun maxItems(): Number? = unwrap(this).getMaxItems()

  /**
   * Compile policy statements to provide relevent permissions to the state machine.
   */
  public override fun providePolicyStatements(): List<PolicyStatement> =
      unwrap(this).providePolicyStatements().map(PolicyStatement::wrap)

  /**
   * Renders the ItemReader configuration as JSON object.
   */
  public override fun render(): Any = unwrap(this).render()

  /**
   * ARN for the `getObject` method of the S3 API This API method is used to iterate all objects in
   * the S3 bucket/prefix.
   */
  public override fun resource(): String = unwrap(this).getResource()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.S3CsvItemReader].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * S3 Bucket containing objects to iterate over or a file with a list to iterate over.
     *
     * @param bucket S3 Bucket containing objects to iterate over or a file with a list to iterate
     * over. 
     */
    public fun bucket(bucket: IBucket)

    /**
     * CSV file header configuration.
     *
     * Default: - CsvHeaders with CsvHeadersLocation.FIRST_ROW
     *
     * @param csvHeaders CSV file header configuration. 
     */
    public fun csvHeaders(csvHeaders: CsvHeaders)

    /**
     * Key of file stored in S3 bucket containing an array to iterate over.
     *
     * @param key Key of file stored in S3 bucket containing an array to iterate over. 
     */
    public fun key(key: String)

    /**
     * Limits the number of items passed to the Distributed Map state.
     *
     * Default: - Distributed Map state will iterate over all items provided by the ItemReader
     *
     * @param maxItems Limits the number of items passed to the Distributed Map state. 
     */
    public fun maxItems(maxItems: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.S3CsvItemReader.Builder =
        software.amazon.awscdk.services.stepfunctions.S3CsvItemReader.Builder.create()

    /**
     * S3 Bucket containing objects to iterate over or a file with a list to iterate over.
     *
     * @param bucket S3 Bucket containing objects to iterate over or a file with a list to iterate
     * over. 
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket.Companion::unwrap))
    }

    /**
     * CSV file header configuration.
     *
     * Default: - CsvHeaders with CsvHeadersLocation.FIRST_ROW
     *
     * @param csvHeaders CSV file header configuration. 
     */
    override fun csvHeaders(csvHeaders: CsvHeaders) {
      cdkBuilder.csvHeaders(csvHeaders.let(CsvHeaders.Companion::unwrap))
    }

    /**
     * Key of file stored in S3 bucket containing an array to iterate over.
     *
     * @param key Key of file stored in S3 bucket containing an array to iterate over. 
     */
    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    /**
     * Limits the number of items passed to the Distributed Map state.
     *
     * Default: - Distributed Map state will iterate over all items provided by the ItemReader
     *
     * @param maxItems Limits the number of items passed to the Distributed Map state. 
     */
    override fun maxItems(maxItems: Number) {
      cdkBuilder.maxItems(maxItems)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.S3CsvItemReader =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3CsvItemReader {
      val builderImpl = BuilderImpl()
      return S3CsvItemReader(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.S3CsvItemReader):
        S3CsvItemReader = S3CsvItemReader(cdkObject)

    internal fun unwrap(wrapped: S3CsvItemReader):
        software.amazon.awscdk.services.stepfunctions.S3CsvItemReader = wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.S3CsvItemReader
  }
}
