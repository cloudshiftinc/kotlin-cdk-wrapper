@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@CdkDslMarker
public class CfnSpotFleetClassicLoadBalancersConfigPropertyDsl {
  private val cdkBuilder: CfnSpotFleet.ClassicLoadBalancersConfigProperty.Builder =
      CfnSpotFleet.ClassicLoadBalancersConfigProperty.builder()

  private val _classicLoadBalancers: MutableList<Any> = mutableListOf()

  /**
   * @param classicLoadBalancers One or more Classic Load Balancers. 
   */
  public fun classicLoadBalancers(vararg classicLoadBalancers: Any) {
    _classicLoadBalancers.addAll(listOf(*classicLoadBalancers))
  }

  /**
   * @param classicLoadBalancers One or more Classic Load Balancers. 
   */
  public fun classicLoadBalancers(classicLoadBalancers: Collection<Any>) {
    _classicLoadBalancers.addAll(classicLoadBalancers)
  }

  /**
   * @param classicLoadBalancers One or more Classic Load Balancers. 
   */
  public fun classicLoadBalancers(classicLoadBalancers: IResolvable) {
    cdkBuilder.classicLoadBalancers(classicLoadBalancers)
  }

  public fun build(): CfnSpotFleet.ClassicLoadBalancersConfigProperty {
    if(_classicLoadBalancers.isNotEmpty()) cdkBuilder.classicLoadBalancers(_classicLoadBalancers)
    return cdkBuilder.build()
  }
}
