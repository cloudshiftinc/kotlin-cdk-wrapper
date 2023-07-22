@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@CdkDslMarker
public class CfnDeploymentGroupOnPremisesTagSetListObjectPropertyDsl {
  private val cdkBuilder: CfnDeploymentGroup.OnPremisesTagSetListObjectProperty.Builder =
      CfnDeploymentGroup.OnPremisesTagSetListObjectProperty.builder()

  private val _onPremisesTagGroup: MutableList<Any> = mutableListOf()

  /**
   * @param onPremisesTagGroup Information about groups of on-premises instance tags.
   */
  public fun onPremisesTagGroup(vararg onPremisesTagGroup: Any) {
    _onPremisesTagGroup.addAll(listOf(*onPremisesTagGroup))
  }

  /**
   * @param onPremisesTagGroup Information about groups of on-premises instance tags.
   */
  public fun onPremisesTagGroup(onPremisesTagGroup: Collection<Any>) {
    _onPremisesTagGroup.addAll(onPremisesTagGroup)
  }

  /**
   * @param onPremisesTagGroup Information about groups of on-premises instance tags.
   */
  public fun onPremisesTagGroup(onPremisesTagGroup: IResolvable) {
    cdkBuilder.onPremisesTagGroup(onPremisesTagGroup)
  }

  public fun build(): CfnDeploymentGroup.OnPremisesTagSetListObjectProperty {
    if(_onPremisesTagGroup.isNotEmpty()) cdkBuilder.onPremisesTagGroup(_onPremisesTagGroup)
    return cdkBuilder.build()
  }
}
