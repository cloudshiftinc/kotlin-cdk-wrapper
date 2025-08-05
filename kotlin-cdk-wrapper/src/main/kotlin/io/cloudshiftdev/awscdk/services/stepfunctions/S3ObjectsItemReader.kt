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
public open class S3ObjectsItemReader(
  cdkObject: software.amazon.awscdk.services.stepfunctions.S3ObjectsItemReader,
) : CdkObject(cdkObject),
    IItemReader {
  public constructor(props: S3ObjectsItemReaderProps) :
      this(software.amazon.awscdk.services.stepfunctions.S3ObjectsItemReader(props.let(S3ObjectsItemReaderProps.Companion::unwrap))
  )

  public constructor(props: S3ObjectsItemReaderProps.Builder.() -> Unit) :
      this(S3ObjectsItemReaderProps(props)
  )

  /**
   * S3 Bucket containing objects to iterate over.
   */
  public override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

  /**
   * S3 bucket name containing objects to iterate over or a file with a list to iterate over, as
   * JsonPath.
   */
  public override fun bucketNamePath(): String? = unwrap(this).getBucketNamePath()

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
   * @param queryLanguage
   */
  public override fun render(): Any = unwrap(this).render()

  /**
   * Renders the ItemReader configuration as JSON object.
   *
   * @return 
   * * JSON object
   * @param queryLanguage
   */
  public override fun render(queryLanguage: QueryLanguage): Any =
      unwrap(this).render(queryLanguage.let(QueryLanguage.Companion::unwrap))

  /**
   * ARN for the `listObjectsV2` method of the S3 API This API method is used to iterate all objects
   * in the S3 bucket/prefix.
   */
  public override fun resource(): String = unwrap(this).getResource()

  /**
   * Validate that ItemReader contains exactly either.
   *
   * [Documentation](bucketNamePath)
   */
  public override fun validateItemReader(): List<String> = unwrap(this).validateItemReader()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.S3ObjectsItemReader].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * S3 Bucket containing objects to iterate over or a file with a list to iterate over.
     *
     * Default: - S3 bucket will be determined from
     *
     * [Documentation](bucketNamePath)
     * @param bucket S3 Bucket containing objects to iterate over or a file with a list to iterate
     * over. 
     */
    public fun bucket(bucket: IBucket)

    /**
     * S3 bucket name containing objects to iterate over or a file with a list to iterate over, as
     * JsonPath.
     *
     * Default: - S3 bucket will be determined from
     *
     * [Documentation](bucket)
     * @param bucketNamePath S3 bucket name containing objects to iterate over or a file with a list
     * to iterate over, as JsonPath. 
     */
    public fun bucketNamePath(bucketNamePath: String)

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
     * Default: - S3 bucket will be determined from
     *
     * [Documentation](bucketNamePath)
     * @param bucket S3 Bucket containing objects to iterate over or a file with a list to iterate
     * over. 
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket.Companion::unwrap))
    }

    /**
     * S3 bucket name containing objects to iterate over or a file with a list to iterate over, as
     * JsonPath.
     *
     * Default: - S3 bucket will be determined from
     *
     * [Documentation](bucket)
     * @param bucketNamePath S3 bucket name containing objects to iterate over or a file with a list
     * to iterate over, as JsonPath. 
     */
    override fun bucketNamePath(bucketNamePath: String) {
      cdkBuilder.bucketNamePath(bucketNamePath)
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
        software.amazon.awscdk.services.stepfunctions.S3ObjectsItemReader = wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.S3ObjectsItemReader
  }
}
