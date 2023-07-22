@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersion

@CdkDslMarker
public class CfnComponentVersionLambdaVolumeMountPropertyDsl {
  private val cdkBuilder: CfnComponentVersion.LambdaVolumeMountProperty.Builder =
      CfnComponentVersion.LambdaVolumeMountProperty.builder()

  /**
   * @param addGroupOwner Whether or not to add the AWS IoT Greengrass user group as an owner of the
   * volume.
   * Default: `false`
   */
  public fun addGroupOwner(addGroupOwner: Boolean) {
    cdkBuilder.addGroupOwner(addGroupOwner)
  }

  /**
   * @param addGroupOwner Whether or not to add the AWS IoT Greengrass user group as an owner of the
   * volume.
   * Default: `false`
   */
  public fun addGroupOwner(addGroupOwner: IResolvable) {
    cdkBuilder.addGroupOwner(addGroupOwner)
  }

  /**
   * @param destinationPath The path to the logical volume in the file system.
   */
  public fun destinationPath(destinationPath: String) {
    cdkBuilder.destinationPath(destinationPath)
  }

  /**
   * @param permission The permission to access the volume: read/only ( `ro` ) or read/write ( `rw`
   * ).
   * Default: `ro`
   */
  public fun permission(permission: String) {
    cdkBuilder.permission(permission)
  }

  /**
   * @param sourcePath The path to the physical volume in the file system.
   */
  public fun sourcePath(sourcePath: String) {
    cdkBuilder.sourcePath(sourcePath)
  }

  public fun build(): CfnComponentVersion.LambdaVolumeMountProperty = cdkBuilder.build()
}
