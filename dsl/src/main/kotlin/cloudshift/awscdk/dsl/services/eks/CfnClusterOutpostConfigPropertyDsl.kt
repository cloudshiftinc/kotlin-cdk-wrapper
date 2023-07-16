@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.eks.CfnCluster

@CdkDslMarker
public class CfnClusterOutpostConfigPropertyDsl {
  private val cdkBuilder: CfnCluster.OutpostConfigProperty.Builder =
      CfnCluster.OutpostConfigProperty.builder()

  private val _outpostArns: MutableList<String> = mutableListOf()

  public fun controlPlaneInstanceType(controlPlaneInstanceType: String) {
    cdkBuilder.controlPlaneInstanceType(controlPlaneInstanceType)
  }

  public fun controlPlanePlacement(controlPlanePlacement: IResolvable) {
    cdkBuilder.controlPlanePlacement(controlPlanePlacement)
  }

  public
      fun controlPlanePlacement(controlPlanePlacement: CfnCluster.ControlPlanePlacementProperty) {
    cdkBuilder.controlPlanePlacement(controlPlanePlacement)
  }

  public fun outpostArns(vararg outpostArns: String) {
    _outpostArns.addAll(listOf(*outpostArns))
  }

  public fun outpostArns(outpostArns: Collection<String>) {
    _outpostArns.addAll(outpostArns)
  }

  public fun build(): CfnCluster.OutpostConfigProperty {
    if(_outpostArns.isNotEmpty()) cdkBuilder.outpostArns(_outpostArns)
    return cdkBuilder.build()
  }
}
