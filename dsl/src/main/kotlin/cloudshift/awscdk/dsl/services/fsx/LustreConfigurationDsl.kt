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

  /**
   * @param autoImportPolicy Available with `Scratch` and `Persistent_1` deployment types.
   * When you create your file system, your existing S3 objects appear as file and directory
   * listings. Use this property to choose how Amazon FSx keeps your file and directory listings up to
   * date as you add or modify objects in your linked S3 bucket. `AutoImportPolicy` can have the
   * following values:
   *
   * For more information, see [Automatically import updates from your S3
   * bucket](https://docs.aws.amazon.com/fsx/latest/LustreGuide/autoimport-data-repo.html) .
   *
   *
   * This parameter is not supported for Lustre file systems using the `Persistent_2` deployment
   * type.
   */
  public fun autoImportPolicy(autoImportPolicy: LustreAutoImportPolicy) {
    cdkBuilder.autoImportPolicy(autoImportPolicy)
  }

  /**
   * @param dataCompressionType Sets the data compression configuration for the file system.
   * For more information, see [Lustre data
   * compression](https://docs.aws.amazon.com/fsx/latest/LustreGuide/data-compression.html) in the
   * *Amazon FSx for Lustre User Guide* .
   */
  public fun dataCompressionType(dataCompressionType: LustreDataCompressionType) {
    cdkBuilder.dataCompressionType(dataCompressionType)
  }

  /**
   * @param deploymentType The type of backing file system deployment used by FSx. 
   */
  public fun deploymentType(deploymentType: LustreDeploymentType) {
    cdkBuilder.deploymentType(deploymentType)
  }

  /**
   * @param exportPath The path in Amazon S3 where the root of your Amazon FSx file system is
   * exported.
   * The path must use the same
   * Amazon S3 bucket as specified in ImportPath. If you only specify a bucket name, such as
   * s3://import-bucket, you
   * get a 1:1 mapping of file system objects to S3 bucket objects. This mapping means that the
   * input data in S3 is
   * overwritten on export. If you provide a custom prefix in the export path, such as
   * s3://import-bucket/[custom-optional-prefix], Amazon FSx exports the contents of your file
   * system to that export
   * prefix in the Amazon S3 bucket.
   */
  public fun exportPath(exportPath: String) {
    cdkBuilder.exportPath(exportPath)
  }

  /**
   * @param importPath The path to the Amazon S3 bucket (including the optional prefix) that you're
   * using as the data repository for your Amazon FSx for Lustre file system.
   * Must be of the format "s3://{bucketName}/optional-prefix" and cannot
   * exceed 900 characters.
   */
  public fun importPath(importPath: String) {
    cdkBuilder.importPath(importPath)
  }

  /**
   * @param importedFileChunkSizeMiB For files imported from a data repository, this value
   * determines the stripe count and maximum amount of data per file (in MiB) stored on a single
   * physical disk.
   * Allowed values are between 1 and 512,000.
   */
  public fun importedFileChunkSizeMiB(importedFileChunkSizeMiB: Number) {
    cdkBuilder.importedFileChunkSizeMiB(importedFileChunkSizeMiB)
  }

  /**
   * @param perUnitStorageThroughput Required for the PERSISTENT_1 deployment type, describes the
   * amount of read and write throughput for each 1 tebibyte of storage, in MB/s/TiB.
   * Valid values are 50, 100, 200.
   */
  public fun perUnitStorageThroughput(perUnitStorageThroughput: Number) {
    cdkBuilder.perUnitStorageThroughput(perUnitStorageThroughput)
  }

  /**
   * @param weeklyMaintenanceStartTime The preferred day and time to perform weekly maintenance.
   * The first digit is the day of the week, starting at 1
   * for Monday, then the following are hours and minutes in the UTC time zone, 24 hour clock. For
   * example: '2:20:30'
   * is Tuesdays at 20:30.
   */
  public
      fun weeklyMaintenanceStartTime(weeklyMaintenanceStartTime: LustreMaintenanceTimeDsl.() -> Unit
      = {}) {
    val builder = LustreMaintenanceTimeDsl()
    builder.apply(weeklyMaintenanceStartTime)
    cdkBuilder.weeklyMaintenanceStartTime(builder.build())
  }

  /**
   * @param weeklyMaintenanceStartTime The preferred day and time to perform weekly maintenance.
   * The first digit is the day of the week, starting at 1
   * for Monday, then the following are hours and minutes in the UTC time zone, 24 hour clock. For
   * example: '2:20:30'
   * is Tuesdays at 20:30.
   */
  public fun weeklyMaintenanceStartTime(weeklyMaintenanceStartTime: LustreMaintenanceTime) {
    cdkBuilder.weeklyMaintenanceStartTime(weeklyMaintenanceStartTime)
  }

  public fun build(): LustreConfiguration = cdkBuilder.build()
}
