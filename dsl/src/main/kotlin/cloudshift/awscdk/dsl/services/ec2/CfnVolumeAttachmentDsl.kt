@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnVolumeAttachment
import software.constructs.Construct

@CdkDslMarker
public class CfnVolumeAttachmentDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnVolumeAttachment.Builder = CfnVolumeAttachment.Builder.create(scope,
      id)

  public fun device(device: String) {
    cdkBuilder.device(device)
  }

  public fun instanceId(instanceId: String) {
    cdkBuilder.instanceId(instanceId)
  }

  public fun volumeId(volumeId: String) {
    cdkBuilder.volumeId(volumeId)
  }

  public fun build(): CfnVolumeAttachment = cdkBuilder.build()
}
