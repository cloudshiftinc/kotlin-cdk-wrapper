@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fsx.CfnFileSystem

@CdkDslMarker
public class CfnFileSystemLustreConfigurationPropertyDsl {
  private val cdkBuilder: CfnFileSystem.LustreConfigurationProperty.Builder =
      CfnFileSystem.LustreConfigurationProperty.builder()

  public fun autoImportPolicy(autoImportPolicy: String) {
    cdkBuilder.autoImportPolicy(autoImportPolicy)
  }

  public fun automaticBackupRetentionDays(automaticBackupRetentionDays: Number) {
    cdkBuilder.automaticBackupRetentionDays(automaticBackupRetentionDays)
  }

  public fun copyTagsToBackups(copyTagsToBackups: Boolean) {
    cdkBuilder.copyTagsToBackups(copyTagsToBackups)
  }

  public fun copyTagsToBackups(copyTagsToBackups: IResolvable) {
    cdkBuilder.copyTagsToBackups(copyTagsToBackups)
  }

  public fun dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime: String) {
    cdkBuilder.dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime)
  }

  public fun dataCompressionType(dataCompressionType: String) {
    cdkBuilder.dataCompressionType(dataCompressionType)
  }

  public fun deploymentType(deploymentType: String) {
    cdkBuilder.deploymentType(deploymentType)
  }

  public fun driveCacheType(driveCacheType: String) {
    cdkBuilder.driveCacheType(driveCacheType)
  }

  public fun exportPath(exportPath: String) {
    cdkBuilder.exportPath(exportPath)
  }

  public fun importPath(importPath: String) {
    cdkBuilder.importPath(importPath)
  }

  public fun importedFileChunkSize(importedFileChunkSize: Number) {
    cdkBuilder.importedFileChunkSize(importedFileChunkSize)
  }

  public fun perUnitStorageThroughput(perUnitStorageThroughput: Number) {
    cdkBuilder.perUnitStorageThroughput(perUnitStorageThroughput)
  }

  public fun weeklyMaintenanceStartTime(weeklyMaintenanceStartTime: String) {
    cdkBuilder.weeklyMaintenanceStartTime(weeklyMaintenanceStartTime)
  }

  public fun build(): CfnFileSystem.LustreConfigurationProperty = cdkBuilder.build()
}
