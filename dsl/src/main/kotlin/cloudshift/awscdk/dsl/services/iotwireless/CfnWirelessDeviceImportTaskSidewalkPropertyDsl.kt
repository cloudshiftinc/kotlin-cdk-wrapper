@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTask

@CdkDslMarker
public class CfnWirelessDeviceImportTaskSidewalkPropertyDsl {
  private val cdkBuilder: CfnWirelessDeviceImportTask.SidewalkProperty.Builder =
      CfnWirelessDeviceImportTask.SidewalkProperty.builder()

  private val _deviceCreationFileList: MutableList<String> = mutableListOf()

  /**
   * @param deviceCreationFile The CSV file contained in an S3 bucket that's used for adding devices
   * to an import task.
   */
  public fun deviceCreationFile(deviceCreationFile: String) {
    cdkBuilder.deviceCreationFile(deviceCreationFile)
  }

  /**
   * @param deviceCreationFileList List of Sidewalk devices that are added to the import task.
   */
  public fun deviceCreationFileList(vararg deviceCreationFileList: String) {
    _deviceCreationFileList.addAll(listOf(*deviceCreationFileList))
  }

  /**
   * @param deviceCreationFileList List of Sidewalk devices that are added to the import task.
   */
  public fun deviceCreationFileList(deviceCreationFileList: Collection<String>) {
    _deviceCreationFileList.addAll(deviceCreationFileList)
  }

  /**
   * @param role The IAM role that allows AWS IoT Wireless to access the CSV file in the S3 bucket.
   */
  public fun role(role: String) {
    cdkBuilder.role(role)
  }

  /**
   * @param sidewalkManufacturingSn The Sidewalk manufacturing serial number (SMSN) of the Sidewalk
   * device.
   */
  public fun sidewalkManufacturingSn(sidewalkManufacturingSn: String) {
    cdkBuilder.sidewalkManufacturingSn(sidewalkManufacturingSn)
  }

  public fun build(): CfnWirelessDeviceImportTask.SidewalkProperty {
    if(_deviceCreationFileList.isNotEmpty())
        cdkBuilder.deviceCreationFileList(_deviceCreationFileList)
    return cdkBuilder.build()
  }
}
