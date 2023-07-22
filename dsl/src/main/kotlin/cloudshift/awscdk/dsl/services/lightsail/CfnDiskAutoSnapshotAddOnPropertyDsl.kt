@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lightsail.CfnDisk

/**
 * `AutoSnapshotAddOn` is a property of the
 * [AddOn](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-disk-addon.html)
 * property. It describes the automatic snapshot add-on for a disk.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
 * AutoSnapshotAddOnProperty autoSnapshotAddOnProperty = AutoSnapshotAddOnProperty.builder()
 * .snapshotTimeOfDay("snapshotTimeOfDay")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-disk-autosnapshotaddon.html)
 */
@CdkDslMarker
public class CfnDiskAutoSnapshotAddOnPropertyDsl {
  private val cdkBuilder: CfnDisk.AutoSnapshotAddOnProperty.Builder =
      CfnDisk.AutoSnapshotAddOnProperty.builder()

  /**
   * @param snapshotTimeOfDay The daily time when an automatic snapshot will be created.
   * Constraints:
   *
   * * Must be in `HH:00` format, and in an hourly increment.
   * * Specified in Coordinated Universal Time (UTC).
   * * The snapshot will be automatically created between the time specified and up to 45 minutes
   * after.
   */
  public fun snapshotTimeOfDay(snapshotTimeOfDay: String) {
    cdkBuilder.snapshotTimeOfDay(snapshotTimeOfDay)
  }

  public fun build(): CfnDisk.AutoSnapshotAddOnProperty = cdkBuilder.build()
}
