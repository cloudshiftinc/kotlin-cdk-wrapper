@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fsx.CfnFileSystem

@CdkDslMarker
public class CfnFileSystemOpenZFSConfigurationPropertyDsl {
  private val cdkBuilder: CfnFileSystem.OpenZFSConfigurationProperty.Builder =
      CfnFileSystem.OpenZFSConfigurationProperty.builder()

  private val _options: MutableList<String> = mutableListOf()

  public fun automaticBackupRetentionDays(automaticBackupRetentionDays: Number) {
    cdkBuilder.automaticBackupRetentionDays(automaticBackupRetentionDays)
  }

  public fun copyTagsToBackups(copyTagsToBackups: Boolean) {
    cdkBuilder.copyTagsToBackups(copyTagsToBackups)
  }

  public fun copyTagsToBackups(copyTagsToBackups: IResolvable) {
    cdkBuilder.copyTagsToBackups(copyTagsToBackups)
  }

  public fun copyTagsToVolumes(copyTagsToVolumes: Boolean) {
    cdkBuilder.copyTagsToVolumes(copyTagsToVolumes)
  }

  public fun copyTagsToVolumes(copyTagsToVolumes: IResolvable) {
    cdkBuilder.copyTagsToVolumes(copyTagsToVolumes)
  }

  public fun dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime: String) {
    cdkBuilder.dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime)
  }

  public fun deploymentType(deploymentType: String) {
    cdkBuilder.deploymentType(deploymentType)
  }

  public fun diskIopsConfiguration(diskIopsConfiguration: IResolvable) {
    cdkBuilder.diskIopsConfiguration(diskIopsConfiguration)
  }

  public
      fun diskIopsConfiguration(diskIopsConfiguration: CfnFileSystem.DiskIopsConfigurationProperty) {
    cdkBuilder.diskIopsConfiguration(diskIopsConfiguration)
  }

  public fun options(vararg options: String) {
    _options.addAll(listOf(*options))
  }

  public fun options(options: Collection<String>) {
    _options.addAll(options)
  }

  public fun rootVolumeConfiguration(rootVolumeConfiguration: IResolvable) {
    cdkBuilder.rootVolumeConfiguration(rootVolumeConfiguration)
  }

  public
      fun rootVolumeConfiguration(rootVolumeConfiguration: CfnFileSystem.RootVolumeConfigurationProperty) {
    cdkBuilder.rootVolumeConfiguration(rootVolumeConfiguration)
  }

  public fun throughputCapacity(throughputCapacity: Number) {
    cdkBuilder.throughputCapacity(throughputCapacity)
  }

  public fun weeklyMaintenanceStartTime(weeklyMaintenanceStartTime: String) {
    cdkBuilder.weeklyMaintenanceStartTime(weeklyMaintenanceStartTime)
  }

  public fun build(): CfnFileSystem.OpenZFSConfigurationProperty {
    if(_options.isNotEmpty()) cdkBuilder.options(_options)
    return cdkBuilder.build()
  }
}
