@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The bucket policy for an Amazon S3 bucket.
 *
 * Policies define the operations that are allowed on this resource.
 *
 * You almost never need to define this construct directly.
 *
 * All AWS resources that support resource policies have a method called
 * `addToResourcePolicy()`, which will automatically create a new resource
 * policy if one doesn't exist yet, otherwise it will add to the existing
 * policy.
 *
 * Prefer to use `addToResourcePolicy()` instead.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.s3.*;
 * Bucket bucket;
 * BucketPolicy bucketPolicy = BucketPolicy.Builder.create(this, "MyBucketPolicy")
 * .bucket(bucket)
 * // the properties below are optional
 * .removalPolicy(RemovalPolicy.DESTROY)
 * .build();
 * ```
 */
public open class BucketPolicy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.s3.BucketPolicy,
) : Resource(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: BucketPolicyProps,
  ) :
      this(software.amazon.awscdk.services.s3.BucketPolicy(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(BucketPolicyProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: BucketPolicyProps.Builder.() -> Unit,
  ) : this(scope, id, BucketPolicyProps(props)
  )

  /**
   * Sets the removal policy for the BucketPolicy.
   *
   * @param removalPolicy the RemovalPolicy to set. 
   */
  public override fun applyRemovalPolicy(removalPolicy: RemovalPolicy) {
    unwrap(this).applyRemovalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
  }

  /**
   * The Bucket this Policy applies to.
   */
  public open fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

  /**
   * A policy document containing permissions to add to the specified bucket.
   *
   * For more information, see Access Policy Language Overview in the Amazon
   * Simple Storage Service Developer Guide.
   */
  public open fun document(): PolicyDocument = unwrap(this).getDocument().let(PolicyDocument::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.s3.BucketPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon S3 bucket that the policy applies to.
     *
     * @param bucket The Amazon S3 bucket that the policy applies to. 
     */
    public fun bucket(bucket: IBucket)

    /**
     * Policy to apply when the policy is removed from this stack.
     *
     * Default: - RemovalPolicy.DESTROY.
     *
     * @param removalPolicy Policy to apply when the policy is removed from this stack. 
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.BucketPolicy.Builder =
        software.amazon.awscdk.services.s3.BucketPolicy.Builder.create(scope, id)

    /**
     * The Amazon S3 bucket that the policy applies to.
     *
     * @param bucket The Amazon S3 bucket that the policy applies to. 
     */
    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    /**
     * Policy to apply when the policy is removed from this stack.
     *
     * Default: - RemovalPolicy.DESTROY.
     *
     * @param removalPolicy Policy to apply when the policy is removed from this stack. 
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.s3.BucketPolicy = cdkBuilder.build()
  }

  public companion object {
    public fun fromCfnBucketPolicy(cfnBucketPolicy: CfnBucketPolicy): BucketPolicy =
        software.amazon.awscdk.services.s3.BucketPolicy.fromCfnBucketPolicy(cfnBucketPolicy.let(CfnBucketPolicy::unwrap)).let(BucketPolicy::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): BucketPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return BucketPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.BucketPolicy): BucketPolicy =
        BucketPolicy(cdkObject)

    internal fun unwrap(wrapped: BucketPolicy): software.amazon.awscdk.services.s3.BucketPolicy =
        wrapped.cdkObject
  }
}
