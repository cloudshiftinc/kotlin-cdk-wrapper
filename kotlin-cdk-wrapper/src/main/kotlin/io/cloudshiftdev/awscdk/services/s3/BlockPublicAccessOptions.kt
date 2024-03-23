@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

/**
 * Example:
 *
 * ```
 * Bucket bucket = Bucket.Builder.create(this, "MyBlockedBucket")
 * .blockPublicAccess(BlockPublicAccess.Builder.create().blockPublicPolicy(true).build())
 * .build();
 * ```
 */
public interface BlockPublicAccessOptions {
  /**
   * Whether to block public ACLs.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-options)
   */
  public fun blockPublicAcls(): Boolean? = unwrap(this).getBlockPublicAcls()

  /**
   * Whether to block public policy.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-options)
   */
  public fun blockPublicPolicy(): Boolean? = unwrap(this).getBlockPublicPolicy()

  /**
   * Whether to ignore public ACLs.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-options)
   */
  public fun ignorePublicAcls(): Boolean? = unwrap(this).getIgnorePublicAcls()

  /**
   * Whether to restrict public access.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-options)
   */
  public fun restrictPublicBuckets(): Boolean? = unwrap(this).getRestrictPublicBuckets()

  /**
   * A builder for [BlockPublicAccessOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param blockPublicAcls Whether to block public ACLs.
     */
    public fun blockPublicAcls(blockPublicAcls: Boolean)

    /**
     * @param blockPublicPolicy Whether to block public policy.
     */
    public fun blockPublicPolicy(blockPublicPolicy: Boolean)

    /**
     * @param ignorePublicAcls Whether to ignore public ACLs.
     */
    public fun ignorePublicAcls(ignorePublicAcls: Boolean)

    /**
     * @param restrictPublicBuckets Whether to restrict public access.
     */
    public fun restrictPublicBuckets(restrictPublicBuckets: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.BlockPublicAccessOptions.Builder =
        software.amazon.awscdk.services.s3.BlockPublicAccessOptions.builder()

    /**
     * @param blockPublicAcls Whether to block public ACLs.
     */
    override fun blockPublicAcls(blockPublicAcls: Boolean) {
      cdkBuilder.blockPublicAcls(blockPublicAcls)
    }

    /**
     * @param blockPublicPolicy Whether to block public policy.
     */
    override fun blockPublicPolicy(blockPublicPolicy: Boolean) {
      cdkBuilder.blockPublicPolicy(blockPublicPolicy)
    }

    /**
     * @param ignorePublicAcls Whether to ignore public ACLs.
     */
    override fun ignorePublicAcls(ignorePublicAcls: Boolean) {
      cdkBuilder.ignorePublicAcls(ignorePublicAcls)
    }

    /**
     * @param restrictPublicBuckets Whether to restrict public access.
     */
    override fun restrictPublicBuckets(restrictPublicBuckets: Boolean) {
      cdkBuilder.restrictPublicBuckets(restrictPublicBuckets)
    }

    public fun build(): software.amazon.awscdk.services.s3.BlockPublicAccessOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.s3.BlockPublicAccessOptions,
  ) : CdkObject(cdkObject), BlockPublicAccessOptions {
    /**
     * Whether to block public ACLs.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-options)
     */
    override fun blockPublicAcls(): Boolean? = unwrap(this).getBlockPublicAcls()

    /**
     * Whether to block public policy.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-options)
     */
    override fun blockPublicPolicy(): Boolean? = unwrap(this).getBlockPublicPolicy()

    /**
     * Whether to ignore public ACLs.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-options)
     */
    override fun ignorePublicAcls(): Boolean? = unwrap(this).getIgnorePublicAcls()

    /**
     * Whether to restrict public access.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-options)
     */
    override fun restrictPublicBuckets(): Boolean? = unwrap(this).getRestrictPublicBuckets()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BlockPublicAccessOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.BlockPublicAccessOptions):
        BlockPublicAccessOptions = CdkObjectWrappers.wrap(cdkObject) as? BlockPublicAccessOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BlockPublicAccessOptions):
        software.amazon.awscdk.services.s3.BlockPublicAccessOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3.BlockPublicAccessOptions
  }
}
