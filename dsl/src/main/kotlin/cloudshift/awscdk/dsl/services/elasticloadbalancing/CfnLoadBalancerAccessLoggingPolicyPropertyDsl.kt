@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancing

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer

@CdkDslMarker
public class CfnLoadBalancerAccessLoggingPolicyPropertyDsl {
  private val cdkBuilder: CfnLoadBalancer.AccessLoggingPolicyProperty.Builder =
      CfnLoadBalancer.AccessLoggingPolicyProperty.builder()

  public fun emitInterval(emitInterval: Number) {
    cdkBuilder.emitInterval(emitInterval)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun s3BucketName(s3BucketName: String) {
    cdkBuilder.s3BucketName(s3BucketName)
  }

  public fun s3BucketPrefix(s3BucketPrefix: String) {
    cdkBuilder.s3BucketPrefix(s3BucketPrefix)
  }

  public fun build(): CfnLoadBalancer.AccessLoggingPolicyProperty = cdkBuilder.build()
}
