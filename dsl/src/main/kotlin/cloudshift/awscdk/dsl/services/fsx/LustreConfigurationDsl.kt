@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.fsx.LustreAutoImportPolicy
import software.amazon.awscdk.services.fsx.LustreConfiguration
import software.amazon.awscdk.services.fsx.LustreDataCompressionType
import software.amazon.awscdk.services.fsx.LustreDeploymentType
import software.amazon.awscdk.services.fsx.LustreMaintenanceTime

@CdkDslMarker
public class LustreConfigurationDsl {
  private val cdkBuilder: LustreConfiguration.Builder = LustreConfiguration.builder()

  public fun autoImportPolicy(autoImportPolicy: LustreAutoImportPolicy) {
    cdkBuilder.autoImportPolicy(autoImportPolicy)
  }

  public fun dataCompressionType(dataCompressionType: LustreDataCompressionType) {
    cdkBuilder.dataCompressionType(dataCompressionType)
  }

  public fun deploymentType(deploymentType: LustreDeploymentType) {
    cdkBuilder.deploymentType(deploymentType)
  }

  public fun exportPath(exportPath: String) {
    cdkBuilder.exportPath(exportPath)
  }

  public fun importPath(importPath: String) {
    cdkBuilder.importPath(importPath)
  }

  public fun importedFileChunkSizeMiB(importedFileChunkSizeMiB: Number) {
    cdkBuilder.importedFileChunkSizeMiB(importedFileChunkSizeMiB)
  }

  public fun perUnitStorageThroughput(perUnitStorageThroughput: Number) {
    cdkBuilder.perUnitStorageThroughput(perUnitStorageThroughput)
  }

  public fun weeklyMaintenanceStartTime(block: LustreMaintenanceTimeDsl.() -> Unit = {}) {
    val builder = LustreMaintenanceTimeDsl()
    builder.apply(block)
    cdkBuilder.weeklyMaintenanceStartTime(builder.build())
  }

  public fun weeklyMaintenanceStartTime(weeklyMaintenanceStartTime: LustreMaintenanceTime) {
    cdkBuilder.weeklyMaintenanceStartTime(weeklyMaintenanceStartTime)
  }

  public fun build(): LustreConfiguration = cdkBuilder.build()
}
