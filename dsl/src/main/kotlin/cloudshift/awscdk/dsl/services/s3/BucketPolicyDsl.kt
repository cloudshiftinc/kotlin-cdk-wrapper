@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.s3.BucketPolicy
import software.amazon.awscdk.services.s3.IBucket
import software.constructs.Construct

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
