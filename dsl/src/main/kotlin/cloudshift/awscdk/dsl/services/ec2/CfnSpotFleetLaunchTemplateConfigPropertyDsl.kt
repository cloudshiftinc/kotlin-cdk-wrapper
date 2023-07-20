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

  public fun launchTemplateSpecification(launchTemplateSpecification: IResolvable) {
    cdkBuilder.launchTemplateSpecification(launchTemplateSpecification)
  }

  public
      fun launchTemplateSpecification(launchTemplateSpecification: CfnSpotFleet.FleetLaunchTemplateSpecificationProperty) {
    cdkBuilder.launchTemplateSpecification(launchTemplateSpecification)
  }

  public fun overrides(vararg overrides: Any) {
    _overrides.addAll(listOf(*overrides))
  }

  public fun overrides(overrides: Collection<Any>) {
    _overrides.addAll(overrides)
  }

  public fun overrides(overrides: IResolvable) {
    cdkBuilder.overrides(overrides)
  }

  public fun build(): CfnSpotFleet.LaunchTemplateConfigProperty {
    if(_overrides.isNotEmpty()) cdkBuilder.overrides(_overrides)
    return cdkBuilder.build()
  }
}
