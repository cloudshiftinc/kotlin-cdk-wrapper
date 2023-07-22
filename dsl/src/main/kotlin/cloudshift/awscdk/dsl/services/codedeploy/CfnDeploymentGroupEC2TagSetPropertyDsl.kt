@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@CdkDslMarker
public class CfnDeploymentGroupEC2TagSetPropertyDsl {
  private val cdkBuilder: CfnDeploymentGroup.EC2TagSetProperty.Builder =
      CfnDeploymentGroup.EC2TagSetProperty.builder()

  private val _ec2TagSetList: MutableList<Any> = mutableListOf()

  /**
   * @param ec2TagSetList The Amazon EC2 tags that are already applied to Amazon EC2 instances that
   * you want to include in the deployment group.
   * CodeDeploy includes all Amazon EC2 instances identified by any of the tags you specify in this
   * deployment group.
   *
   * Duplicates are not allowed.
   */
  public fun ec2TagSetList(vararg ec2TagSetList: Any) {
    _ec2TagSetList.addAll(listOf(*ec2TagSetList))
  }

  /**
   * @param ec2TagSetList The Amazon EC2 tags that are already applied to Amazon EC2 instances that
   * you want to include in the deployment group.
   * CodeDeploy includes all Amazon EC2 instances identified by any of the tags you specify in this
   * deployment group.
   *
   * Duplicates are not allowed.
   */
  public fun ec2TagSetList(ec2TagSetList: Collection<Any>) {
    _ec2TagSetList.addAll(ec2TagSetList)
  }

  /**
   * @param ec2TagSetList The Amazon EC2 tags that are already applied to Amazon EC2 instances that
   * you want to include in the deployment group.
   * CodeDeploy includes all Amazon EC2 instances identified by any of the tags you specify in this
   * deployment group.
   *
   * Duplicates are not allowed.
   */
  public fun ec2TagSetList(ec2TagSetList: IResolvable) {
    cdkBuilder.ec2TagSetList(ec2TagSetList)
  }

  public fun build(): CfnDeploymentGroup.EC2TagSetProperty {
    if(_ec2TagSetList.isNotEmpty()) cdkBuilder.ec2TagSetList(_ec2TagSetList)
    return cdkBuilder.build()
  }
}
