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
 * Item Reader configuration for iterating over items in a JSON array stored in a S3 file.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * // create a bucket
 * Bucket bucket = new Bucket(this, "Bucket");
 * DistributedMap distributedMap = DistributedMap.Builder.create(this, "Distributed Map State")
 * .itemReader(S3JsonItemReader.Builder.create()
 * .bucket(bucket)
 * .key("my-key.json")
 * .build())
 * .resultWriter(ResultWriter.Builder.create()
 * .bucket(bucket)
 * .prefix("my-prefix")
 * .build())
 * .build();
 * distributedMap.itemProcessor(new Pass(this, "Pass State"));
 * ```
 */
public open class S3JsonItemReader internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.stepfunctions.S3JsonItemReader,
) : CdkObject(cdkObject), IItemReader {
  /**
   * S3 Bucket containing a file with a list to iterate over.
   */
  public override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

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
   *
   * @return 
   * * JSON object
   */
  public override fun render(): Any = unwrap(this).render()

  /**
   * ARN for the `getObject` method of the S3 API This API method is used to iterate all objects in
   * the S3 bucket/prefix.
   */
  public override fun resource(): String = unwrap(this).getResource()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.S3JsonItemReader].
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
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.S3JsonItemReader.Builder =
        software.amazon.awscdk.services.stepfunctions.S3JsonItemReader.Builder.create()

    /**
     * S3 Bucket containing objects to iterate over or a file with a list to iterate over.
     *
     * @param bucket S3 Bucket containing objects to iterate over or a file with a list to iterate
     * over. 
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
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

    public fun build(): software.amazon.awscdk.services.stepfunctions.S3JsonItemReader =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3JsonItemReader {
      val builderImpl = BuilderImpl()
      return S3JsonItemReader(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.S3JsonItemReader):
        S3JsonItemReader = S3JsonItemReader(cdkObject)

    internal fun unwrap(wrapped: S3JsonItemReader):
        software.amazon.awscdk.services.stepfunctions.S3JsonItemReader = wrapped.cdkObject
  }
}
