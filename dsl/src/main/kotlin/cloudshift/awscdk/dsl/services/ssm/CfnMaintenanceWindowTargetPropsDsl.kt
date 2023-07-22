@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTargetProps

/**
 * Properties for defining a `CfnMaintenanceWindowTarget`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssm.*;
 * CfnMaintenanceWindowTargetProps cfnMaintenanceWindowTargetProps =
 * CfnMaintenanceWindowTargetProps.builder()
 * .resourceType("resourceType")
 * .targets(List.of(TargetsProperty.builder()
 * .key("key")
 * .values(List.of("values"))
 * .build()))
 * .windowId("windowId")
 * // the properties below are optional
 * .description("description")
 * .name("name")
 * .ownerInformation("ownerInformation")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-maintenancewindowtarget.html)
 */
@CdkDslMarker
public class CfnMaintenanceWindowTargetPropsDsl {
  private val cdkBuilder: CfnMaintenanceWindowTargetProps.Builder =
      CfnMaintenanceWindowTargetProps.builder()

  private val _targets: MutableList<Any> = mutableListOf()

  /**
   * @param description A description for the target.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param name The name for the maintenance window target.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param ownerInformation A user-provided value that will be included in any Amazon CloudWatch
   * Events events that are raised while running tasks for these targets in this maintenance window.
   */
  public fun ownerInformation(ownerInformation: String) {
    cdkBuilder.ownerInformation(ownerInformation)
  }

  /**
   * @param resourceType The type of target that is being registered with the maintenance window. 
   */
  public fun resourceType(resourceType: String) {
    cdkBuilder.resourceType(resourceType)
  }

  /**
   * @param targets The targets to register with the maintenance window. 
   * In other words, the instances to run commands on when the maintenance window runs.
   *
   * You must specify targets by using the `WindowTargetIds` parameter.
   */
  public fun targets(vararg targets: Any) {
    _targets.addAll(listOf(*targets))
  }

  /**
   * @param targets The targets to register with the maintenance window. 
   * In other words, the instances to run commands on when the maintenance window runs.
   *
   * You must specify targets by using the `WindowTargetIds` parameter.
   */
  public fun targets(targets: Collection<Any>) {
    _targets.addAll(targets)
  }

  /**
   * @param targets The targets to register with the maintenance window. 
   * In other words, the instances to run commands on when the maintenance window runs.
   *
   * You must specify targets by using the `WindowTargetIds` parameter.
   */
  public fun targets(targets: IResolvable) {
    cdkBuilder.targets(targets)
  }

  /**
   * @param windowId The ID of the maintenance window to register the target with. 
   */
  public fun windowId(windowId: String) {
    cdkBuilder.windowId(windowId)
  }

  public fun build(): CfnMaintenanceWindowTargetProps {
    if(_targets.isNotEmpty()) cdkBuilder.targets(_targets)
    return cdkBuilder.build()
  }
}
