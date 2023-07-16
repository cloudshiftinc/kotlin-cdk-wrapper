@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@CdkDslMarker
public class CfnDeploymentGroupTargetGroupPairInfoPropertyDsl {
  private val cdkBuilder: CfnDeploymentGroup.TargetGroupPairInfoProperty.Builder =
      CfnDeploymentGroup.TargetGroupPairInfoProperty.builder()

  private val _targetGroups: MutableList<Any> = mutableListOf()

  public fun prodTrafficRoute(prodTrafficRoute: IResolvable) {
    cdkBuilder.prodTrafficRoute(prodTrafficRoute)
  }

  public fun prodTrafficRoute(prodTrafficRoute: CfnDeploymentGroup.TrafficRouteProperty) {
    cdkBuilder.prodTrafficRoute(prodTrafficRoute)
  }

  public fun targetGroups(vararg targetGroups: Any) {
    _targetGroups.addAll(listOf(*targetGroups))
  }

  public fun targetGroups(targetGroups: Collection<Any>) {
    _targetGroups.addAll(targetGroups)
  }

  public fun targetGroups(targetGroups: IResolvable) {
    cdkBuilder.targetGroups(targetGroups)
  }

  public fun testTrafficRoute(testTrafficRoute: IResolvable) {
    cdkBuilder.testTrafficRoute(testTrafficRoute)
  }

  public fun testTrafficRoute(testTrafficRoute: CfnDeploymentGroup.TrafficRouteProperty) {
    cdkBuilder.testTrafficRoute(testTrafficRoute)
  }

  public fun build(): CfnDeploymentGroup.TargetGroupPairInfoProperty {
    if(_targetGroups.isNotEmpty()) cdkBuilder.targetGroups(_targetGroups)
    return cdkBuilder.build()
  }
}
