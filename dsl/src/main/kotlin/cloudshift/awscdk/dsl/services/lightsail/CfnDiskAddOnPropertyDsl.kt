@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnDisk

@CdkDslMarker
public class CfnDiskAddOnPropertyDsl {
  private val cdkBuilder: CfnDisk.AddOnProperty.Builder = CfnDisk.AddOnProperty.builder()

  /**
   * @param addOnType The add-on type (for example, `AutoSnapshot` ). 
   *
   * `AutoSnapshot` is the only add-on that can be enabled for a disk.
   */
  public fun addOnType(addOnType: String) {
    cdkBuilder.addOnType(addOnType)
  }

  /**
   * @param autoSnapshotAddOnRequest The parameters for the automatic snapshot add-on, such as the
   * daily time when an automatic snapshot will be created.
   */
  public fun autoSnapshotAddOnRequest(autoSnapshotAddOnRequest: IResolvable) {
    cdkBuilder.autoSnapshotAddOnRequest(autoSnapshotAddOnRequest)
  }

  /**
   * @param autoSnapshotAddOnRequest The parameters for the automatic snapshot add-on, such as the
   * daily time when an automatic snapshot will be created.
   */
  public fun autoSnapshotAddOnRequest(autoSnapshotAddOnRequest: CfnDisk.AutoSnapshotAddOnProperty) {
    cdkBuilder.autoSnapshotAddOnRequest(autoSnapshotAddOnRequest)
  }

  /**
   * @param status The status of the add-on.
   * Valid Values: `Enabled` | `Disabled`
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnDisk.AddOnProperty = cdkBuilder.build()
}
