package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

public interface BucketPolicyProps {
  /**
   * The Amazon S3 bucket that the policy applies to.
   */
  public fun bucket(): IBucket

  /**
   * Policy to apply when the policy is removed from this stack.
   *
   * Default: - RemovalPolicy.DESTROY.
   */
  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  /**
   * A builder for [BucketPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucket The Amazon S3 bucket that the policy applies to. 
     */
    public fun bucket(bucket: IBucket)

    /**
     * @param removalPolicy Policy to apply when the policy is removed from this stack.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.BucketPolicyProps.Builder =
        software.amazon.awscdk.services.s3.BucketPolicyProps.builder()

    /**
     * @param bucket The Amazon S3 bucket that the policy applies to. 
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    /**
     * @param removalPolicy Policy to apply when the policy is removed from this stack.
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.s3.BucketPolicyProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.BucketPolicyProps,
  ) : CdkObject(cdkObject), BucketPolicyProps {
    /**
     * The Amazon S3 bucket that the policy applies to.
     */
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    /**
     * Policy to apply when the policy is removed from this stack.
     *
     * Default: - RemovalPolicy.DESTROY.
     */
    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BucketPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.BucketPolicyProps):
        BucketPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BucketPolicyProps):
        software.amazon.awscdk.services.s3.BucketPolicyProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.s3.BucketPolicyProps
  }
}
