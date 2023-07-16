@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnCluster

@CdkDslMarker
public class CfnClusterManagedScalingPolicyPropertyDsl {
  private val cdkBuilder: CfnCluster.ManagedScalingPolicyProperty.Builder =
      CfnCluster.ManagedScalingPolicyProperty.builder()

  public fun computeLimits(computeLimits: IResolvable) {
    cdkBuilder.computeLimits(computeLimits)
  }

  public fun computeLimits(computeLimits: CfnCluster.ComputeLimitsProperty) {
    cdkBuilder.computeLimits(computeLimits)
  }

  public fun build(): CfnCluster.ManagedScalingPolicyProperty = cdkBuilder.build()
}
