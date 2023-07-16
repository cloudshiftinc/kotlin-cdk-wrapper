@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnInstance

@CdkDslMarker
public class CfnInstanceDiskPropertyDsl {
  private val cdkBuilder: CfnInstance.DiskProperty.Builder = CfnInstance.DiskProperty.builder()

  public fun attachedTo(attachedTo: String) {
    cdkBuilder.attachedTo(attachedTo)
  }

  public fun attachmentState(attachmentState: String) {
    cdkBuilder.attachmentState(attachmentState)
  }

  public fun diskName(diskName: String) {
    cdkBuilder.diskName(diskName)
  }

  public fun iops(iops: Number) {
    cdkBuilder.iops(iops)
  }

  public fun isSystemDisk(isSystemDisk: Boolean) {
    cdkBuilder.isSystemDisk(isSystemDisk)
  }

  public fun isSystemDisk(isSystemDisk: IResolvable) {
    cdkBuilder.isSystemDisk(isSystemDisk)
  }

  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  public fun sizeInGb(sizeInGb: String) {
    cdkBuilder.sizeInGb(sizeInGb)
  }

  public fun build(): CfnInstance.DiskProperty = cdkBuilder.build()
}
