@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.s3.BucketPolicyProps
import software.amazon.awscdk.services.s3.IBucket

@CdkDslMarker
public class BucketPolicyPropsDsl {
  private val cdkBuilder: BucketPolicyProps.Builder = BucketPolicyProps.builder()

  public fun bucket(bucket: IBucket) {
    cdkBuilder.bucket(bucket)
  }

  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  public fun build(): BucketPolicyProps = cdkBuilder.build()
}
