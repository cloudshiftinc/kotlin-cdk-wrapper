@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.opsworks.CfnVolume
import software.constructs.Construct

@CdkDslMarker
public class CfnVolumeDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnVolume.Builder = CfnVolume.Builder.create(scope, id)

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

  public fun build(): CfnVolume = cdkBuilder.build()
}
