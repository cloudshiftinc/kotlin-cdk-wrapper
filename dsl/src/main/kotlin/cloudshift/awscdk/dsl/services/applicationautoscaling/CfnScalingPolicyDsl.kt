@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.applicationautoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy
import software.constructs.Construct

@CdkDslMarker
public class CfnScalingPolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnScalingPolicy.Builder = CfnScalingPolicy.Builder.create(scope, id)

  public fun policyName(policyName: String) {
    cdkBuilder.policyName(policyName)
  }

  public fun policyType(policyType: String) {
    cdkBuilder.policyType(policyType)
  }

  public fun resourceId(resourceId: String) {
    cdkBuilder.resourceId(resourceId)
  }

  public fun scalableDimension(scalableDimension: String) {
    cdkBuilder.scalableDimension(scalableDimension)
  }

  public fun scalingTargetId(scalingTargetId: String) {
    cdkBuilder.scalingTargetId(scalingTargetId)
  }

  public fun serviceNamespace(serviceNamespace: String) {
    cdkBuilder.serviceNamespace(serviceNamespace)
  }

  public fun stepScalingPolicyConfiguration(stepScalingPolicyConfiguration: IResolvable) {
    cdkBuilder.stepScalingPolicyConfiguration(stepScalingPolicyConfiguration)
  }

  public
      fun stepScalingPolicyConfiguration(stepScalingPolicyConfiguration: CfnScalingPolicy.StepScalingPolicyConfigurationProperty) {
    cdkBuilder.stepScalingPolicyConfiguration(stepScalingPolicyConfiguration)
  }

  public
      fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: IResolvable) {
    cdkBuilder.targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration)
  }

  public
      fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty) {
    cdkBuilder.targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration)
  }

  public fun build(): CfnScalingPolicy = cdkBuilder.build()
}
