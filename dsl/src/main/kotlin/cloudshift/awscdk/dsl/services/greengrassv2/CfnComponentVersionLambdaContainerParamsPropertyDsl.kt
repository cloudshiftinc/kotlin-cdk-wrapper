@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersion

/**
 * Contains information about a container in which AWS Lambda functions run on AWS IoT Greengrass
 * core devices.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrassv2.*;
 * LambdaContainerParamsProperty lambdaContainerParamsProperty =
 * LambdaContainerParamsProperty.builder()
 * .devices(List.of(LambdaDeviceMountProperty.builder()
 * .addGroupOwner(false)
 * .path("path")
 * .permission("permission")
 * .build()))
 * .memorySizeInKb(123)
 * .mountRoSysfs(false)
 * .volumes(List.of(LambdaVolumeMountProperty.builder()
 * .addGroupOwner(false)
 * .destinationPath("destinationPath")
 * .permission("permission")
 * .sourcePath("sourcePath")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdacontainerparams.html)
 */
@CdkDslMarker
public class CfnComponentVersionLambdaContainerParamsPropertyDsl {
  private val cdkBuilder: CfnComponentVersion.LambdaContainerParamsProperty.Builder =
      CfnComponentVersion.LambdaContainerParamsProperty.builder()

  private val _devices: MutableList<Any> = mutableListOf()

  private val _volumes: MutableList<Any> = mutableListOf()

  /**
   * @param devices The list of system devices that the container can access.
   */
  public fun devices(vararg devices: Any) {
    _devices.addAll(listOf(*devices))
  }

  /**
   * @param devices The list of system devices that the container can access.
   */
  public fun devices(devices: Collection<Any>) {
    _devices.addAll(devices)
  }

  /**
   * @param devices The list of system devices that the container can access.
   */
  public fun devices(devices: IResolvable) {
    cdkBuilder.devices(devices)
  }

  /**
   * @param memorySizeInKb The memory size of the container, expressed in kilobytes.
   * Default: `16384` (16 MB)
   */
  public fun memorySizeInKb(memorySizeInKb: Number) {
    cdkBuilder.memorySizeInKb(memorySizeInKb)
  }

  /**
   * @param mountRoSysfs Whether or not the container can read information from the device's `/sys`
   * folder.
   * Default: `false`
   */
  public fun mountRoSysfs(mountRoSysfs: Boolean) {
    cdkBuilder.mountRoSysfs(mountRoSysfs)
  }

  /**
   * @param mountRoSysfs Whether or not the container can read information from the device's `/sys`
   * folder.
   * Default: `false`
   */
  public fun mountRoSysfs(mountRoSysfs: IResolvable) {
    cdkBuilder.mountRoSysfs(mountRoSysfs)
  }

  /**
   * @param volumes The list of volumes that the container can access.
   */
  public fun volumes(vararg volumes: Any) {
    _volumes.addAll(listOf(*volumes))
  }

  /**
   * @param volumes The list of volumes that the container can access.
   */
  public fun volumes(volumes: Collection<Any>) {
    _volumes.addAll(volumes)
  }

  /**
   * @param volumes The list of volumes that the container can access.
   */
  public fun volumes(volumes: IResolvable) {
    cdkBuilder.volumes(volumes)
  }

  public fun build(): CfnComponentVersion.LambdaContainerParamsProperty {
    if(_devices.isNotEmpty()) cdkBuilder.devices(_devices)
    if(_volumes.isNotEmpty()) cdkBuilder.volumes(_volumes)
    return cdkBuilder.build()
  }
}
