@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.s3.BucketPolicyProps
import software.amazon.awscdk.services.s3.IBucket

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.s3.*;
 * Bucket bucket;
 * BucketPolicyProps bucketPolicyProps = BucketPolicyProps.builder()
 * .bucket(bucket)
 * // the properties below are optional
 * .removalPolicy(RemovalPolicy.DESTROY)
 * .build();
 * ```
 */
@CdkDslMarker
public class BucketPolicyPropsDsl {
    private val cdkBuilder: BucketPolicyProps.Builder = BucketPolicyProps.builder()

    /** @param bucket The Amazon S3 bucket that the policy applies to. */
    public fun bucket(bucket: IBucket) {
        cdkBuilder.bucket(bucket)
    }

    /** @param removalPolicy Policy to apply when the policy is removed from this stack. */
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    public fun build(): BucketPolicyProps = cdkBuilder.build()
}
