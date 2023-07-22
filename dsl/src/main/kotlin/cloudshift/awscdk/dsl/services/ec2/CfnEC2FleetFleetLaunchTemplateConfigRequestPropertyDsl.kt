@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnEC2Fleet

@CdkDslMarker
public class CfnEC2FleetFleetLaunchTemplateConfigRequestPropertyDsl {
  private val cdkBuilder: CfnEC2Fleet.FleetLaunchTemplateConfigRequestProperty.Builder =
      CfnEC2Fleet.FleetLaunchTemplateConfigRequestProperty.builder()

  private val _overrides: MutableList<Any> = mutableListOf()

  /**
   * @param launchTemplateSpecification The launch template to use.
   * You must specify either the launch template ID or launch template name in the request.
   */
  public fun launchTemplateSpecification(launchTemplateSpecification: IResolvable) {
    cdkBuilder.launchTemplateSpecification(launchTemplateSpecification)
  }

  /**
   * @param launchTemplateSpecification The launch template to use.
   * You must specify either the launch template ID or launch template name in the request.
   */
  public
      fun launchTemplateSpecification(launchTemplateSpecification: CfnEC2Fleet.FleetLaunchTemplateSpecificationRequestProperty) {
    cdkBuilder.launchTemplateSpecification(launchTemplateSpecification)
  }

  /**
   * @param overrides Any parameters that you specify override the same parameters in the launch
   * template.
   * For fleets of type `request` and `maintain` , a maximum of 300 items is allowed across all
   * launch templates.
   */
  public fun overrides(vararg overrides: Any) {
    _overrides.addAll(listOf(*overrides))
  }

  /**
   * @param overrides Any parameters that you specify override the same parameters in the launch
   * template.
   * For fleets of type `request` and `maintain` , a maximum of 300 items is allowed across all
   * launch templates.
   */
  public fun overrides(overrides: Collection<Any>) {
    _overrides.addAll(overrides)
  }

  /**
   * @param overrides Any parameters that you specify override the same parameters in the launch
   * template.
   * For fleets of type `request` and `maintain` , a maximum of 300 items is allowed across all
   * launch templates.
   */
  public fun overrides(overrides: IResolvable) {
    cdkBuilder.overrides(overrides)
  }

  public fun build(): CfnEC2Fleet.FleetLaunchTemplateConfigRequestProperty {
    if(_overrides.isNotEmpty()) cdkBuilder.overrides(_overrides)
    return cdkBuilder.build()
  }
}
