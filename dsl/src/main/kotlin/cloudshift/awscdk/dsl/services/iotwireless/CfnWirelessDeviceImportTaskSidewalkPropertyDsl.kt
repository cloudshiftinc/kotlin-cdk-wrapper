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

  public fun deviceCreationFile(deviceCreationFile: String) {
    cdkBuilder.deviceCreationFile(deviceCreationFile)
  }

  public fun deviceCreationFileList(vararg deviceCreationFileList: String) {
    _deviceCreationFileList.addAll(listOf(*deviceCreationFileList))
  }

  public fun deviceCreationFileList(deviceCreationFileList: Collection<String>) {
    _deviceCreationFileList.addAll(deviceCreationFileList)
  }

  public fun role(role: String) {
    cdkBuilder.role(role)
  }

  public fun sidewalkManufacturingSn(sidewalkManufacturingSn: String) {
    cdkBuilder.sidewalkManufacturingSn(sidewalkManufacturingSn)
  }

  public fun build(): CfnWirelessDeviceImportTask.SidewalkProperty {
    if(_deviceCreationFileList.isNotEmpty())
        cdkBuilder.deviceCreationFileList(_deviceCreationFileList)
    return cdkBuilder.build()
  }
}
