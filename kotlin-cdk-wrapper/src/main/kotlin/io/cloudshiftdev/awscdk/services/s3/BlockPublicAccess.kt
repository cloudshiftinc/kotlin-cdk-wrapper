@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

/**
 * Example:
 *
 * ```
 * Bucket bucket = Bucket.Builder.create(this, "MyBlockedBucket")
 * .blockPublicAccess(BlockPublicAccess.BLOCK_ALL)
 * .build();
 * ```
 */
public open class BlockPublicAccess(
  cdkObject: software.amazon.awscdk.services.s3.BlockPublicAccess,
) : CdkObject(cdkObject) {
  public constructor(options: BlockPublicAccessOptions) :
      this(software.amazon.awscdk.services.s3.BlockPublicAccess(options.let(BlockPublicAccessOptions::unwrap))
  )

  public constructor(options: BlockPublicAccessOptions.Builder.() -> Unit) :
      this(BlockPublicAccessOptions(options)
  )

  /**
   *
   */
  public open fun blockPublicAcls(): Boolean? = unwrap(this).getBlockPublicAcls()

  /**
   *
   */
  public open fun blockPublicAcls(`value`: Boolean) {
    unwrap(this).setBlockPublicAcls(`value`)
  }

  /**
   *
   */
  public open fun blockPublicPolicy(): Boolean? = unwrap(this).getBlockPublicPolicy()

  /**
   *
   */
  public open fun blockPublicPolicy(`value`: Boolean) {
    unwrap(this).setBlockPublicPolicy(`value`)
  }

  /**
   *
   */
  public open fun ignorePublicAcls(): Boolean? = unwrap(this).getIgnorePublicAcls()

  /**
   *
   */
  public open fun ignorePublicAcls(`value`: Boolean) {
    unwrap(this).setIgnorePublicAcls(`value`)
  }

  /**
   *
   */
  public open fun restrictPublicBuckets(): Boolean? = unwrap(this).getRestrictPublicBuckets()

  /**
   *
   */
  public open fun restrictPublicBuckets(`value`: Boolean) {
    unwrap(this).setRestrictPublicBuckets(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.s3.BlockPublicAccess].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Whether to block public ACLs.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-options)
     * @param blockPublicAcls Whether to block public ACLs. 
     */
    public fun blockPublicAcls(blockPublicAcls: Boolean)

    /**
     * Whether to block public policy.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-options)
     * @param blockPublicPolicy Whether to block public policy. 
     */
    public fun blockPublicPolicy(blockPublicPolicy: Boolean)

    /**
     * Whether to ignore public ACLs.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-options)
     * @param ignorePublicAcls Whether to ignore public ACLs. 
     */
    public fun ignorePublicAcls(ignorePublicAcls: Boolean)

    /**
     * Whether to restrict public access.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-options)
     * @param restrictPublicBuckets Whether to restrict public access. 
     */
    public fun restrictPublicBuckets(restrictPublicBuckets: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.BlockPublicAccess.Builder =
        software.amazon.awscdk.services.s3.BlockPublicAccess.Builder.create()

    /**
     * Whether to block public ACLs.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-options)
     * @param blockPublicAcls Whether to block public ACLs. 
     */
    override fun blockPublicAcls(blockPublicAcls: Boolean) {
      cdkBuilder.blockPublicAcls(blockPublicAcls)
    }

    /**
     * Whether to block public policy.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-options)
     * @param blockPublicPolicy Whether to block public policy. 
     */
    override fun blockPublicPolicy(blockPublicPolicy: Boolean) {
      cdkBuilder.blockPublicPolicy(blockPublicPolicy)
    }

    /**
     * Whether to ignore public ACLs.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-options)
     * @param ignorePublicAcls Whether to ignore public ACLs. 
     */
    override fun ignorePublicAcls(ignorePublicAcls: Boolean) {
      cdkBuilder.ignorePublicAcls(ignorePublicAcls)
    }

    /**
     * Whether to restrict public access.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-options)
     * @param restrictPublicBuckets Whether to restrict public access. 
     */
    override fun restrictPublicBuckets(restrictPublicBuckets: Boolean) {
      cdkBuilder.restrictPublicBuckets(restrictPublicBuckets)
    }

    public fun build(): software.amazon.awscdk.services.s3.BlockPublicAccess = cdkBuilder.build()
  }

  public companion object {
    public val BLOCK_ACLS: BlockPublicAccess =
        BlockPublicAccess.wrap(software.amazon.awscdk.services.s3.BlockPublicAccess.BLOCK_ACLS)

    public val BLOCK_ALL: BlockPublicAccess =
        BlockPublicAccess.wrap(software.amazon.awscdk.services.s3.BlockPublicAccess.BLOCK_ALL)

    public operator fun invoke(block: Builder.() -> Unit = {}): BlockPublicAccess {
      val builderImpl = BuilderImpl()
      return BlockPublicAccess(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.BlockPublicAccess):
        BlockPublicAccess = BlockPublicAccess(cdkObject)

    internal fun unwrap(wrapped: BlockPublicAccess):
        software.amazon.awscdk.services.s3.BlockPublicAccess = wrapped.cdkObject as
        software.amazon.awscdk.services.s3.BlockPublicAccess
  }
}
