@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.opsworks.CfnVolumeProps

@CdkDslMarker
public class CfnVolumePropsDsl {
  private val cdkBuilder: CfnVolumeProps.Builder = CfnVolumeProps.builder()

  /**
   * @param ec2VolumeId The Amazon EC2 volume ID. 
   */
  public fun ec2VolumeId(ec2VolumeId: String) {
    cdkBuilder.ec2VolumeId(ec2VolumeId)
  }

  /**
   * @param mountPoint The volume mount point.
   * For example, "/mnt/disk1".
   */
  public fun mountPoint(mountPoint: String) {
    cdkBuilder.mountPoint(mountPoint)
  }

  /**
   * @param name The volume name.
   * Volume names are a maximum of 128 characters.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param stackId The stack ID. 
   */
  public fun stackId(stackId: String) {
    cdkBuilder.stackId(stackId)
  }

  public fun build(): CfnVolumeProps = cdkBuilder.build()
}
