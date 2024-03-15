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

public open class BucketPolicy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.s3.BucketPolicy,
) : Resource(cdkObject) {
  public override fun applyRemovalPolicy(removalPolicy: RemovalPolicy) {
    unwrap(this).applyRemovalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
  }

  public open fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

  public open fun document(): PolicyDocument = unwrap(this).getDocument().let(PolicyDocument::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun bucket(bucket: IBucket)

    public fun removalPolicy(removalPolicy: RemovalPolicy)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.BucketPolicy.Builder =
        software.amazon.awscdk.services.s3.BucketPolicy.Builder.create(scope, id)

    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

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
