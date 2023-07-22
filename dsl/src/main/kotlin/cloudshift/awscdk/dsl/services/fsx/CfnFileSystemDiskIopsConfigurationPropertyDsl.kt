@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.fsx.CfnFileSystem

@CdkDslMarker
public class CfnFileSystemDiskIopsConfigurationPropertyDsl {
  private val cdkBuilder: CfnFileSystem.DiskIopsConfigurationProperty.Builder =
      CfnFileSystem.DiskIopsConfigurationProperty.builder()

  /**
   * @param iops The total number of SSD IOPS provisioned for the file system.
   */
  public fun iops(iops: Number) {
    cdkBuilder.iops(iops)
  }

  /**
   * @param mode Specifies whether the file system is using the `AUTOMATIC` setting of SSD IOPS of 3
   * IOPS per GB of storage capacity, , or if it using a `USER_PROVISIONED` value.
   */
  public fun mode(mode: String) {
    cdkBuilder.mode(mode)
  }

  public fun build(): CfnFileSystem.DiskIopsConfigurationProperty = cdkBuilder.build()
}
