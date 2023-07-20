@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTargetProps

@CdkDslMarker
public class CfnMaintenanceWindowTargetPropsDsl {
  private val cdkBuilder: CfnMaintenanceWindowTargetProps.Builder =
      CfnMaintenanceWindowTargetProps.builder()

  private val _targets: MutableList<Any> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun ownerInformation(ownerInformation: String) {
    cdkBuilder.ownerInformation(ownerInformation)
  }

  public fun resourceType(resourceType: String) {
    cdkBuilder.resourceType(resourceType)
  }

  public fun targets(vararg targets: Any) {
    _targets.addAll(listOf(*targets))
  }

  public fun targets(targets: Collection<Any>) {
    _targets.addAll(targets)
  }

  public fun targets(targets: IResolvable) {
    cdkBuilder.targets(targets)
  }

  public fun windowId(windowId: String) {
    cdkBuilder.windowId(windowId)
  }

  public fun build(): CfnMaintenanceWindowTargetProps {
    if(_targets.isNotEmpty()) cdkBuilder.targets(_targets)
    return cdkBuilder.build()
  }
}
