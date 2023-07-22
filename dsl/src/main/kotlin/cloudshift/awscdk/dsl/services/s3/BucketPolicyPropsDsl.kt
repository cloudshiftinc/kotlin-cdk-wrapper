@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.s3.BucketPolicyProps
import software.amazon.awscdk.services.s3.IBucket

@CdkDslMarker
public class BucketPolicyPropsDsl {
  private val cdkBuilder: BucketPolicyProps.Builder = BucketPolicyProps.builder()

  /**
   * @param bucket The Amazon S3 bucket that the policy applies to. 
   */
  public fun bucket(bucket: IBucket) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * @param removalPolicy Policy to apply when the policy is removed from this stack.
   */
  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  public fun build(): BucketPolicyProps = cdkBuilder.build()
}
