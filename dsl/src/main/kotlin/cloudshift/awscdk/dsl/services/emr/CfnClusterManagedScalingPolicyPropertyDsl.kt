@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnCluster

@CdkDslMarker
public class CfnClusterManagedScalingPolicyPropertyDsl {
  private val cdkBuilder: CfnCluster.ManagedScalingPolicyProperty.Builder =
      CfnCluster.ManagedScalingPolicyProperty.builder()

  /**
   * @param computeLimits The Amazon EC2 unit limits for a managed scaling policy.
   * The managed scaling activity of a cluster is not allowed to go above or below these limits. The
   * limit only applies to the core and task nodes. The master node cannot be scaled after initial
   * configuration.
   */
  public fun computeLimits(computeLimits: IResolvable) {
    cdkBuilder.computeLimits(computeLimits)
  }

  /**
   * @param computeLimits The Amazon EC2 unit limits for a managed scaling policy.
   * The managed scaling activity of a cluster is not allowed to go above or below these limits. The
   * limit only applies to the core and task nodes. The master node cannot be scaled after initial
   * configuration.
   */
  public fun computeLimits(computeLimits: CfnCluster.ComputeLimitsProperty) {
    cdkBuilder.computeLimits(computeLimits)
  }

  public fun build(): CfnCluster.ManagedScalingPolicyProperty = cdkBuilder.build()
}
