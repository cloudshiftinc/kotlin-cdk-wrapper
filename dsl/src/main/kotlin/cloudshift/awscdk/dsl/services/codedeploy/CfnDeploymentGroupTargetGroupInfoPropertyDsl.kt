@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@CdkDslMarker
public class CfnDeploymentGroupTargetGroupInfoPropertyDsl {
  private val cdkBuilder: CfnDeploymentGroup.TargetGroupInfoProperty.Builder =
      CfnDeploymentGroup.TargetGroupInfoProperty.builder()

  /**
   * @param name For blue/green deployments, the name of the target group that instances in the
   * original environment are deregistered from, and instances in the replacement environment
   * registered with.
   * For in-place deployments, the name of the target group that instances are deregistered from, so
   * they are not serving traffic during a deployment, and then re-registered with after the deployment
   * completes. No duplicates allowed.
   *
   *
   * AWS CloudFormation supports blue/green deployments on AWS Lambda compute platforms only.
   *
   *
   * This value cannot exceed 32 characters, so you should use the `Name` property of the target
   * group, or the `TargetGroupName` attribute with the `Fn::GetAtt` intrinsic function, as shown in
   * the following example. Don't use the group's Amazon Resource Name (ARN) or `TargetGroupFullName`
   * attribute.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnDeploymentGroup.TargetGroupInfoProperty = cdkBuilder.build()
}
