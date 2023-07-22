@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@CdkDslMarker
public class CfnDeploymentGroupEC2TagSetListObjectPropertyDsl {
  private val cdkBuilder: CfnDeploymentGroup.EC2TagSetListObjectProperty.Builder =
      CfnDeploymentGroup.EC2TagSetListObjectProperty.builder()

  private val _ec2TagGroup: MutableList<Any> = mutableListOf()

  /**
   * @param ec2TagGroup A list that contains other lists of Amazon EC2 instance tag groups.
   * For an instance to be included in the deployment group, it must be identified by all of the tag
   * groups in the list.
   */
  public fun ec2TagGroup(vararg ec2TagGroup: Any) {
    _ec2TagGroup.addAll(listOf(*ec2TagGroup))
  }

  /**
   * @param ec2TagGroup A list that contains other lists of Amazon EC2 instance tag groups.
   * For an instance to be included in the deployment group, it must be identified by all of the tag
   * groups in the list.
   */
  public fun ec2TagGroup(ec2TagGroup: Collection<Any>) {
    _ec2TagGroup.addAll(ec2TagGroup)
  }

  /**
   * @param ec2TagGroup A list that contains other lists of Amazon EC2 instance tag groups.
   * For an instance to be included in the deployment group, it must be identified by all of the tag
   * groups in the list.
   */
  public fun ec2TagGroup(ec2TagGroup: IResolvable) {
    cdkBuilder.ec2TagGroup(ec2TagGroup)
  }

  public fun build(): CfnDeploymentGroup.EC2TagSetListObjectProperty {
    if(_ec2TagGroup.isNotEmpty()) cdkBuilder.ec2TagGroup(_ec2TagGroup)
    return cdkBuilder.build()
  }
}
