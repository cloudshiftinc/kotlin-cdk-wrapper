@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront.origins

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudfront.IOrigin
import io.cloudshiftdev.awscdk.services.cloudfront.OriginBase
import io.cloudshiftdev.awscdk.services.cloudfront.OriginProps
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A S3 Bucket Origin.
 *
 * Example:
 *
 * ```
 * Bucket myBucket = new Bucket(this, "myBucket");
 * Distribution.Builder.create(this, "myDist")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(OriginGroup.Builder.create()
 * .primaryOrigin(S3BucketOrigin.withOriginAccessControl(myBucket))
 * .fallbackOrigin(new HttpOrigin("www.example.com"))
 * // optional, defaults to: 500, 502, 503 and 504
 * .fallbackStatusCodes(List.of(404))
 * .build())
 * .build())
 * .build();
 * ```
 */
public abstract class S3BucketOrigin(
  cdkObject: software.amazon.awscdk.services.cloudfront.origins.S3BucketOrigin,
) : OriginBase(cdkObject) {
  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.origins.S3BucketOrigin,
  ) : S3BucketOrigin(cdkObject)

  public companion object {
    public fun withBucketDefaults(bucket: IBucket): IOrigin =
        software.amazon.awscdk.services.cloudfront.origins.S3BucketOrigin.withBucketDefaults(bucket.let(IBucket.Companion::unwrap)).let(IOrigin::wrap)

    public fun withBucketDefaults(bucket: IBucket, props: OriginProps): IOrigin =
        software.amazon.awscdk.services.cloudfront.origins.S3BucketOrigin.withBucketDefaults(bucket.let(IBucket.Companion::unwrap),
        props.let(OriginProps.Companion::unwrap)).let(IOrigin::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b489afad66fb370818436b4024e90285303e4eb64d4340a999c500a94e18a879")
    public fun withBucketDefaults(bucket: IBucket, props: OriginProps.Builder.() -> Unit): IOrigin =
        withBucketDefaults(bucket, OriginProps(props))

    public fun withOriginAccessControl(bucket: IBucket): IOrigin =
        software.amazon.awscdk.services.cloudfront.origins.S3BucketOrigin.withOriginAccessControl(bucket.let(IBucket.Companion::unwrap)).let(IOrigin::wrap)

    public fun withOriginAccessControl(bucket: IBucket, props: S3BucketOriginWithOACProps): IOrigin
        =
        software.amazon.awscdk.services.cloudfront.origins.S3BucketOrigin.withOriginAccessControl(bucket.let(IBucket.Companion::unwrap),
        props.let(S3BucketOriginWithOACProps.Companion::unwrap)).let(IOrigin::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9343acfa827680438d0e6030d792edb13be1688c6b0c1dc5a139767c9a38a0f8")
    public fun withOriginAccessControl(bucket: IBucket,
        props: S3BucketOriginWithOACProps.Builder.() -> Unit): IOrigin =
        withOriginAccessControl(bucket, S3BucketOriginWithOACProps(props))

    public fun withOriginAccessIdentity(bucket: IBucket): IOrigin =
        software.amazon.awscdk.services.cloudfront.origins.S3BucketOrigin.withOriginAccessIdentity(bucket.let(IBucket.Companion::unwrap)).let(IOrigin::wrap)

    public fun withOriginAccessIdentity(bucket: IBucket, props: S3BucketOriginWithOAIProps): IOrigin
        =
        software.amazon.awscdk.services.cloudfront.origins.S3BucketOrigin.withOriginAccessIdentity(bucket.let(IBucket.Companion::unwrap),
        props.let(S3BucketOriginWithOAIProps.Companion::unwrap)).let(IOrigin::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab4042eec439125b22f0172657f28093b7161d64990e6a16b0553397d7bae8a0")
    public fun withOriginAccessIdentity(bucket: IBucket,
        props: S3BucketOriginWithOAIProps.Builder.() -> Unit): IOrigin =
        withOriginAccessIdentity(bucket, S3BucketOriginWithOAIProps(props))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.origins.S3BucketOrigin):
        S3BucketOrigin = CdkObjectWrappers.wrap(cdkObject) as? S3BucketOrigin ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3BucketOrigin):
        software.amazon.awscdk.services.cloudfront.origins.S3BucketOrigin = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.origins.S3BucketOrigin
  }
}
