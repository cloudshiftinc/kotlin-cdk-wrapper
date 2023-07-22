@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@CdkDslMarker
public class CfnDeploymentGroupOnPremisesTagSetPropertyDsl {
  private val cdkBuilder: CfnDeploymentGroup.OnPremisesTagSetProperty.Builder =
      CfnDeploymentGroup.OnPremisesTagSetProperty.builder()

  private val _onPremisesTagSetList: MutableList<Any> = mutableListOf()

  /**
   * @param onPremisesTagSetList A list that contains other lists of on-premises instance tag
   * groups.
   * For an instance to be included in the deployment group, it must be identified by all of the tag
   * groups in the list.
   *
   * Duplicates are not allowed.
   */
  public fun onPremisesTagSetList(vararg onPremisesTagSetList: Any) {
    _onPremisesTagSetList.addAll(listOf(*onPremisesTagSetList))
  }

  /**
   * @param onPremisesTagSetList A list that contains other lists of on-premises instance tag
   * groups.
   * For an instance to be included in the deployment group, it must be identified by all of the tag
   * groups in the list.
   *
   * Duplicates are not allowed.
   */
  public fun onPremisesTagSetList(onPremisesTagSetList: Collection<Any>) {
    _onPremisesTagSetList.addAll(onPremisesTagSetList)
  }

  /**
   * @param onPremisesTagSetList A list that contains other lists of on-premises instance tag
   * groups.
   * For an instance to be included in the deployment group, it must be identified by all of the tag
   * groups in the list.
   *
   * Duplicates are not allowed.
   */
  public fun onPremisesTagSetList(onPremisesTagSetList: IResolvable) {
    cdkBuilder.onPremisesTagSetList(onPremisesTagSetList)
  }

  public fun build(): CfnDeploymentGroup.OnPremisesTagSetProperty {
    if(_onPremisesTagSetList.isNotEmpty()) cdkBuilder.onPremisesTagSetList(_onPremisesTagSetList)
    return cdkBuilder.build()
  }
}
