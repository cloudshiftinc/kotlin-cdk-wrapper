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

  public fun ec2TagSetList(vararg ec2TagSetList: Any) {
    _ec2TagSetList.addAll(listOf(*ec2TagSetList))
  }

  public fun ec2TagSetList(ec2TagSetList: Collection<Any>) {
    _ec2TagSetList.addAll(ec2TagSetList)
  }

  public fun ec2TagSetList(ec2TagSetList: IResolvable) {
    cdkBuilder.ec2TagSetList(ec2TagSetList)
  }

  public fun build(): CfnDeploymentGroup.EC2TagSetProperty {
    if(_ec2TagSetList.isNotEmpty()) cdkBuilder.ec2TagSetList(_ec2TagSetList)
    return cdkBuilder.build()
  }
}
