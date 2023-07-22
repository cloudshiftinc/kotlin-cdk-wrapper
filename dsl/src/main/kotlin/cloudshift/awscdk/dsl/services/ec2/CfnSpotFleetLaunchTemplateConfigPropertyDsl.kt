@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@CdkDslMarker
public class CfnSpotFleetLaunchTemplateConfigPropertyDsl {
  private val cdkBuilder: CfnSpotFleet.LaunchTemplateConfigProperty.Builder =
      CfnSpotFleet.LaunchTemplateConfigProperty.builder()

  private val _overrides: MutableList<Any> = mutableListOf()

  /**
   * @param launchTemplateSpecification The launch template to use.
   * Make sure that the launch template does not contain the `NetworkInterfaceId` parameter because
   * you can't specify a network interface ID in a Spot Fleet.
   */
  public fun launchTemplateSpecification(launchTemplateSpecification: IResolvable) {
    cdkBuilder.launchTemplateSpecification(launchTemplateSpecification)
  }

  /**
   * @param launchTemplateSpecification The launch template to use.
   * Make sure that the launch template does not contain the `NetworkInterfaceId` parameter because
   * you can't specify a network interface ID in a Spot Fleet.
   */
  public
      fun launchTemplateSpecification(launchTemplateSpecification: CfnSpotFleet.FleetLaunchTemplateSpecificationProperty) {
    cdkBuilder.launchTemplateSpecification(launchTemplateSpecification)
  }

  /**
   * @param overrides Any parameters that you specify override the same parameters in the launch
   * template.
   */
  public fun overrides(vararg overrides: Any) {
    _overrides.addAll(listOf(*overrides))
  }

  /**
   * @param overrides Any parameters that you specify override the same parameters in the launch
   * template.
   */
  public fun overrides(overrides: Collection<Any>) {
    _overrides.addAll(overrides)
  }

  /**
   * @param overrides Any parameters that you specify override the same parameters in the launch
   * template.
   */
  public fun overrides(overrides: IResolvable) {
    cdkBuilder.overrides(overrides)
  }

  public fun build(): CfnSpotFleet.LaunchTemplateConfigProperty {
    if(_overrides.isNotEmpty()) cdkBuilder.overrides(_overrides)
    return cdkBuilder.build()
  }
}
