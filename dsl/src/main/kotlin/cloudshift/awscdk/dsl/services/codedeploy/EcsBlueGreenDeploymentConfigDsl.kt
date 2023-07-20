@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.codedeploy.EcsBlueGreenDeploymentConfig
import software.amazon.awscdk.services.elasticloadbalancingv2.IListener
import software.amazon.awscdk.services.elasticloadbalancingv2.ITargetGroup

@CdkDslMarker
public class EcsBlueGreenDeploymentConfigDsl {
  private val cdkBuilder: EcsBlueGreenDeploymentConfig.Builder =
      EcsBlueGreenDeploymentConfig.builder()

  public fun blueTargetGroup(blueTargetGroup: ITargetGroup) {
    cdkBuilder.blueTargetGroup(blueTargetGroup)
  }

  public fun deploymentApprovalWaitTime(deploymentApprovalWaitTime: Duration) {
    cdkBuilder.deploymentApprovalWaitTime(deploymentApprovalWaitTime)
  }

  public fun greenTargetGroup(greenTargetGroup: ITargetGroup) {
    cdkBuilder.greenTargetGroup(greenTargetGroup)
  }

  public fun listener(listener: IListener) {
    cdkBuilder.listener(listener)
  }

  public fun terminationWaitTime(terminationWaitTime: Duration) {
    cdkBuilder.terminationWaitTime(terminationWaitTime)
  }

  public fun testListener(testListener: IListener) {
    cdkBuilder.testListener(testListener)
  }

  public fun build(): EcsBlueGreenDeploymentConfig = cdkBuilder.build()
}
