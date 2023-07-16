@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.opsworks.CfnVolumeProps

@CdkDslMarker
public class CfnVolumePropsDsl {
  private val cdkBuilder: CfnVolumeProps.Builder = CfnVolumeProps.builder()

  public fun ec2VolumeId(ec2VolumeId: String) {
    cdkBuilder.ec2VolumeId(ec2VolumeId)
  }

  public fun mountPoint(mountPoint: String) {
    cdkBuilder.mountPoint(mountPoint)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun stackId(stackId: String) {
    cdkBuilder.stackId(stackId)
  }

  public fun build(): CfnVolumeProps = cdkBuilder.build()
}
