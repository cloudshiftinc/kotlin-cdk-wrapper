@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.s3.BucketPolicy
import software.amazon.awscdk.services.s3.IBucket
import software.constructs.Construct

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
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.s3.*;
 * Bucket bucket;
 * BucketPolicy bucketPolicy = BucketPolicy.Builder.create(this, "MyBucketPolicy")
 * .bucket(bucket)
 * // the properties below are optional
 * .removalPolicy(RemovalPolicy.DESTROY)
 * .build();
 * ```
 */
@CdkDslMarker
public class BucketPolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: BucketPolicy.Builder = BucketPolicy.Builder.create(scope, id)

  /**
   * The Amazon S3 bucket that the policy applies to.
   *
   * @param bucket The Amazon S3 bucket that the policy applies to. 
   */
  public fun bucket(bucket: IBucket) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * Policy to apply when the policy is removed from this stack.
   *
   * Default: - RemovalPolicy.DESTROY.
   *
   * @param removalPolicy Policy to apply when the policy is removed from this stack. 
   */
  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  public fun build(): BucketPolicy = cdkBuilder.build()
}
