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
 * Item Reader configuration for iterating over objects in an S3 bucket.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * Bucket bucket;
 * S3ObjectsItemReader s3ObjectsItemReader = S3ObjectsItemReader.Builder.create()
 * .bucket(bucket)
 * // the properties below are optional
 * .maxItems(123)
 * .prefix("prefix")
 * .build();
 * ```
 */
public open class S3ObjectsItemReader internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.stepfunctions.S3ObjectsItemReader,
) : CdkObject(cdkObject), IItemReader {
  /**
   * S3 Bucket containing objects to iterate over.
   */
  public override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

  /**
   * Limits the number of items passed to the Distributed Map state.
   *
   * Default: - Distributed Map state will iterate over all items provided by the ItemReader
   */
  public override fun maxItems(): Number? = unwrap(this).getMaxItems()

  /**
   * S3 prefix used to limit objects to iterate over.
   *
   * Default: - No prefix
   */
  public open fun prefix(): String? = unwrap(this).getPrefix()

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
   * ARN for the `listObjectsV2` method of the S3 API This API method is used to iterate all objects
   * in the S3 bucket/prefix.
   */
  public override fun resource(): String = unwrap(this).getResource()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.S3ObjectsItemReader].
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
     * Limits the number of items passed to the Distributed Map state.
     *
     * Default: - Distributed Map state will iterate over all items provided by the ItemReader
     *
     * @param maxItems Limits the number of items passed to the Distributed Map state. 
     */
    public fun maxItems(maxItems: Number)

    /**
     * S3 prefix used to limit objects to iterate over.
     *
     * Default: - No prefix
     *
     * @param prefix S3 prefix used to limit objects to iterate over. 
     */
    public fun prefix(prefix: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.S3ObjectsItemReader.Builder =
        software.amazon.awscdk.services.stepfunctions.S3ObjectsItemReader.Builder.create()

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
     * Limits the number of items passed to the Distributed Map state.
     *
     * Default: - Distributed Map state will iterate over all items provided by the ItemReader
     *
     * @param maxItems Limits the number of items passed to the Distributed Map state. 
     */
    override fun maxItems(maxItems: Number) {
      cdkBuilder.maxItems(maxItems)
    }

    /**
     * S3 prefix used to limit objects to iterate over.
     *
     * Default: - No prefix
     *
     * @param prefix S3 prefix used to limit objects to iterate over. 
     */
    override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.S3ObjectsItemReader =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): S3ObjectsItemReader {
      val builderImpl = BuilderImpl()
      return S3ObjectsItemReader(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.S3ObjectsItemReader):
        S3ObjectsItemReader = S3ObjectsItemReader(cdkObject)

    internal fun unwrap(wrapped: S3ObjectsItemReader):
        software.amazon.awscdk.services.stepfunctions.S3ObjectsItemReader = wrapped.cdkObject
  }
}
